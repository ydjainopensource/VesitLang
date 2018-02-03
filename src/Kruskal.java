import java.io.File;
import java.util.*;

public class Kruskal {
    private Graph graph;
    Set<Attribute> currentEdgeAttributes = new HashSet<>();
    Set<Attribute> visitedEdgeAttributes = new HashSet<>();

    Set<Attribute> currentNodeAttributes = new HashSet<>();
    Set<Attribute> visitedNodeAttributes = new HashSet<>();

    KruskalConfig kruskalConfig = new KruskalConfig();

    public KruskalConfig getKruskalConfig() {
        return kruskalConfig;
    }

    public void loadKruskalConfig(KruskalConfig kruskalConfig) {
        this.kruskalConfig = kruskalConfig;
        File f = new File(this.kruskalConfig.getOutImageDir());
        if(!f.exists()){
            f.mkdirs();
        }
    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    void mst(){
        System.err.println("in mst");

        Set<Edge> edges = new TreeSet<>(new WeightComparator());
        edges.addAll(getGraph().getEdgeList());
        Set<Node> visited = new HashSet<>();
        Set<Node> node = new TreeSet<>(Comparator.comparing(BaseGraphObject::getId));
        node.addAll(getGraph().getNodeList());

        for (Node n : node){ n.removeAllAttributes();}

        loadAttributes();



        for (Edge currentEdge: edges) {

            Node toNode = currentEdge.getToNode();
            Node fromNode = currentEdge.getFromNode();

            if(!(visited.contains(fromNode)
                && visited.contains(toNode))){

                visited.add(toNode);
                visited.add(fromNode);

                System.err.println(fromNode +"\t" + toNode);

                currentEdge.addAttributes(currentEdgeAttributes);
                
                fromNode.removeAllAttributes();
                toNode.removeAllAttributes();

                fromNode.addAttributes(currentNodeAttributes);
                toNode.addAttributes(currentNodeAttributes);

//                assert !(toNode.equals(fromNode));
                
                genImageAndPpt(getGraph());

                currentEdge.removeAttributes(currentEdgeAttributes);
                currentEdge.addAttributes(visitedEdgeAttributes);

                fromNode.removeAllAttributes();
                toNode.removeAllAttributes();

                fromNode.addAttributes(visitedNodeAttributes);
                toNode.addAttributes(visitedNodeAttributes);


            }

        }

        for (Node n : node){ n.removeAllAttributes();}
        for (Edge e : edges){e.removeAttributes(visitedEdgeAttributes);};


    }

    private void loadAttributes() {
        loadCurrentEdgeAttributes();
        LoadVisitedEdgeAttributes();
        loadCurrentNodeAttributes();
        loadVisitedNodeAttributes();
    }

    private void loadCurrentEdgeAttributes() {
        currentEdgeAttributes.add(new Attribute("penwidth", "5"));
        currentEdgeAttributes.add(new Attribute("color", "red"));
    }

    private void LoadVisitedEdgeAttributes() {
        visitedEdgeAttributes.add(new Attribute("color","blue"));
    }

    private void loadVisitedNodeAttributes() {
        visitedNodeAttributes.add(new Attribute("shape",kruskalConfig.getVisitedNodeShape()));
        visitedNodeAttributes.add(new Attribute("color",kruskalConfig.getVisitedNodeColor()));
        visitedNodeAttributes.add(new Attribute("style","filled"));
    }

    private void loadCurrentNodeAttributes() {
        currentNodeAttributes.add(new Attribute("style","filled"));
        currentNodeAttributes.add(new Attribute("color",kruskalConfig.getCurrentNodeColor()));
        currentNodeAttributes.add(new Attribute("shape",kruskalConfig.getCurrentNodeShape()));
    }


    public void genImageAndPpt(Graph graph) {
        try{
            Graphviz gv = new Graphviz();
            byte[] graphByteArray = gv.getGraphByteArray(graph, "png", kruskalConfig.getDpi());
            File outFile = new File(kruskalConfig.getOutImageDir() + "" + kruskalConfig.getIterNumber() + ".png");
            VesitLang.writeGraphToFile(graphByteArray, outFile);
            kruskalConfig.setIterNumber(kruskalConfig.getIterNumber()+1);
            VesitLang.generatePdf(kruskalConfig.getIterNumber(),kruskalConfig.getOutImageDir(),kruskalConfig.getPptName());
        }catch (Exception ec){
            System.err.println(ec.toString());
            System.err.println("Error while generating PPT");
            System.err.println("Aborting");
        }
    }
}



class WeightComparator implements Comparator<Edge>{
    @Override
    public int compare(Edge edge, Edge t1) {
        return edge.getWeight() > t1.getWeight() ? 1 :edge.getWeight() > t1.getWeight()? 0 : -1 ;
    }
}