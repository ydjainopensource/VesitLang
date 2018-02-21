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
        System.out.println("in mst");

        Set<Edge> edges = new TreeSet<>(new WeightComparator());
        edges.addAll(getGraph().getEdgeList());
        Set<Node> visited = new HashSet<>();
        Set<Node> node = new TreeSet<>(Comparator.comparing(BaseGraphObject::getId));
        node.addAll(getGraph().getNodeList());

        loadAttributes();

        for (Node n : node){
            n.removeAllAttributes();
//            n.addAttribute(new Attribute("style","filled"));
        }

        Node toNode = null,fromNode =null;
        Edge e=null;

        for (Edge currentEdge: edges) {
            e = currentEdge;

            toNode = currentEdge.getToNode();
            fromNode = currentEdge.getFromNode();

            if(!(visited.contains(fromNode)
                && visited.contains(toNode))){

                visited.add(toNode);
                visited.add(fromNode);

                System.out.println(fromNode +"\t" + toNode);

                currentEdge.addAttributes(currentEdgeAttributes);

                fromNode.removeAllAttributes();
                toNode.removeAllAttributes();

                fromNode.addAttributes(currentNodeAttributes);
                toNode.addAttributes(currentNodeAttributes);

//                assert !(toNode.equals(fromNode));

                VesitLang.genImageAndPdf(getGraph(),kruskalConfig);

                currentEdge.removeAttributes(currentEdgeAttributes);
                currentEdge.addAttributes(visitedEdgeAttributes);

                fromNode.removeAllAttributes();
                toNode.removeAllAttributes();

                fromNode.addAttributes(visitedNodeAttributes);
                toNode.addAttributes(visitedNodeAttributes);


            }
        }

        toNode.removeAttributes(currentNodeAttributes);
        fromNode.removeAttributes(currentNodeAttributes);
        toNode.addAttributes(visitedNodeAttributes);
        fromNode.addAttributes(visitedNodeAttributes);
        e.removeAttributes(currentEdgeAttributes);
        e.removeAttributes(visitedEdgeAttributes);

        VesitLang.genImageAndPdf(getGraph(),kruskalConfig);

        for(Edge edge :edges) edge.removeAttributes(visitedEdgeAttributes);



    }

    private void loadAttributes() {
        loadCurrentEdgeAttributes();
        LoadVisitedEdgeAttributes();
        loadCurrentNodeAttributes();
        loadVisitedNodeAttributes();
    }

    private void loadCurrentEdgeAttributes() {
        currentEdgeAttributes.add(new Attribute("penwidth", kruskalConfig.getCurrentEdgeWidth()));
        currentEdgeAttributes.add(new Attribute("color", kruskalConfig.getCurrentEdgeColor()));
    }

    private void LoadVisitedEdgeAttributes() {
        visitedEdgeAttributes.add(new Attribute("color", kruskalConfig.getVisitedEdgeColor()));
        visitedEdgeAttributes.add(new Attribute("penwidth", kruskalConfig.getVisitedEdgeWidth()));
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
}



class WeightComparator implements Comparator<Edge>{
    @Override
    public int compare(Edge edge, Edge t1) {
        return edge.getWeight() > t1.getWeight() ? 1 :edge.getWeight() > t1.getWeight()? 0 : -1 ;
    }
}