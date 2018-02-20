import java.io.File;
import java.util.*;

public class Prim {

    private PrimConfig primConfig = new PrimConfig();
    private Graph graph;

    Set<Attribute> currentEdgeAttributes = new HashSet<>();
    Set<Attribute> visitedEdgeAttributes = new HashSet<>();

    Set<Attribute> currentNodeAttributes = new HashSet<>();
    Set<Attribute> visitedNodeAttributes = new HashSet<>();

    public void loadPrimConfig(PrimConfig primConfig) {
        this.primConfig = primConfig;
        File f = new File(primConfig.getOutImageDir());
        if(!f.exists())
            f.mkdirs();
    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    void mst(){

        loadAttributes();

        Set<Edge> edges = new TreeSet<>(new WeightComparator());
        edges.addAll(getGraph().getEdgeList());

        Set<Node> node = new TreeSet<>(Comparator.comparing(BaseGraphObject::getId));
        node.addAll(getGraph().getNodeList());

        getGraph().setEdgeList(edges);
        getGraph().setNodeList(node);

        for (Node n : node){ n.removeAllAttributes();}

        Set<Node> visited = new TreeSet<>(Comparator.comparing(BaseGraphObject::getId));

        Iterator<Node> nodeIterator = node.iterator();
        Node currentNode = nodeIterator.next();
        Node previousNode = new Node("");

        boolean changed = false;

        while(node.size() != visited.size()){
            changed =false;

            System.err.println("previousNode " + previousNode + " currentNode " + currentNode);
//            genImageAndPpt(getGraph());

//            Set<Edge> nodeEdges = new TreeSet<>(new WeightComparator());

            Edge minEdge =null;
            for (Edge e : edges)
                if(e.getFromNode().equals(currentNode) && !visited.contains(e.getToNode()))
                    if(minEdge == null || minEdge.getWeight() > e.getWeight())
                        minEdge =e;

            if(minEdge !=null) {
//                genImageAndPpt(getGraph());
                minEdge.addAttributes(currentEdgeAttributes);
                currentNode.addAttributes(currentNodeAttributes);
                Node toNode = minEdge.getToNode();

//                toNode.addAttributes(currentNodeAttributes);
                toNode.removeAttributes(currentNodeAttributes);

                currentNode.removeAttributes(currentNodeAttributes);

                toNode.addAttributes(visitedNodeAttributes);
                currentNode.addAttributes(visitedNodeAttributes);

                VesitLang.genImageAndPpt(getGraph(),primConfig);

                minEdge.removeAttributes(currentEdgeAttributes);
                minEdge.addAttributes(visitedEdgeAttributes);

                changed = true;

                visited.add(currentNode);
                visited.add(previousNode);
                previousNode = currentNode;
                currentNode = toNode;
            }
            if(!changed)
                try{
                    visited.add(currentNode);
                    currentNode.removeAttributes(currentNodeAttributes);
                    currentNode.addAttributes(visitedNodeAttributes);

                    VesitLang.genImageAndPpt(getGraph(),primConfig);

                    for (Node node1 : node)
                    {
                        if(!visited.contains(node1)) {
                            currentNode.removeAttributes(currentNodeAttributes);
                            currentNode.addAttributes(visitedNodeAttributes);
                            visited.add(currentNode);
                            currentNode = node1;
                            System.err.println("l114 "+ node1);
                            currentNode.addAttributes(currentNodeAttributes);
                            VesitLang.genImageAndPpt(getGraph(),primConfig);
                        }
                    }


                }catch (Exception e){
                    break;
                }
        }
        currentNode.removeAttributes(currentNodeAttributes);
        currentNode.addAttributes(visitedNodeAttributes);
        VesitLang.genImageAndPpt(getGraph(),primConfig);

        for (Node n : graph.getNodeList()) n.removeAllAttributes();
        for (Edge edge: graph.getEdgeList()) edge.removeAttributes(visitedEdgeAttributes);

    }



    private void loadAttributes() {
        loadCurrentEdgeAttributes();
        LoadVisitedEdgeAttributes();
        loadCurrentNodeAttributes();
        loadVisitedNodeAttributes();
    }

    private void loadCurrentEdgeAttributes() {
        currentEdgeAttributes.add(new Attribute("penwidth", primConfig.getCurrentEdgeWidth()));
        currentEdgeAttributes.add(new Attribute("color", primConfig.getCurrentEdgeColor()));
    }

    private void LoadVisitedEdgeAttributes() {
        visitedEdgeAttributes.add(new Attribute("penwidth", primConfig.getVisitedEdgeWidth()));
        visitedEdgeAttributes.add(new Attribute("color",primConfig.getVisitedNodeColor()));
    }

    private void loadVisitedNodeAttributes() {
        visitedNodeAttributes.add(new Attribute("shape",primConfig.getVisitedNodeShape()));
        visitedNodeAttributes.add(new Attribute("color",primConfig.getVisitedNodeColor()));
        visitedNodeAttributes.add(new Attribute("style","filled"));
    }

    private void loadCurrentNodeAttributes() {
        currentNodeAttributes.add(new Attribute("style","filled"));
        currentNodeAttributes.add(new Attribute("color",primConfig.getCurrentNodeColor()));
        currentNodeAttributes.add(new Attribute("shape",primConfig.getCurrentNodeShape()));
    }
}
