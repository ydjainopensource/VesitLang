import java.io.File;
import java.util.*;

public class Prim {

    // prim config to store node clors values etc.
//    private PrimConfig primConfig = new PrimConfig();
    private PrimConfig primConfig;

    // grpah object to store the internal representation of graphs
    private Graph graph;

    // set which stores currentEdgeAttributes (color, style, shape)
    Set<Attribute> currentEdgeAttributes = new HashSet<>();

    // set which stores visitedEdgeAttributes (color, style, shape)
    Set<Attribute> visitedEdgeAttributes = new HashSet<>();

    // set which stores currentNodeAttributes (color, style, shape)
    Set<Attribute> currentNodeAttributes = new HashSet<>();

    // set which stores visitedNodeAttributes (color, style, shape)
    Set<Attribute> visitedNodeAttributes = new HashSet<>();


    /**
     * Load config from given PrimConfig object
     * @param primConfig config to load from
     */
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

    /**
     * mst is the actual function which runs Prims algo.
     */
    void mst(){

        System.out.println("In prims");
        loadAttributes();

        PriorityQueue<Edge> edges = new PriorityQueue<>(new WeightComparator());
//        edges.addAll(getGraph().getEdgeList());

        Set<Node> node = new TreeSet<>(Comparator.comparing(BaseGraphObject::getId));
        node.addAll(getGraph().getNodeList());

//        getGraph().setEdgeList(edges);
//        getGraph().setNodeList(node);

        for (Node n : node){ n.removeAllAttributes();}

        Set<Node> visited = new TreeSet<>(Comparator.comparing(BaseGraphObject::getId));

        Iterator<Node> nodeIterator = node.iterator();
        Node currentNode = nodeIterator.next();
        for(Edge e : getGraph().getEdgeList()){
            if(e.getToNode().equals(currentNode) || e.getFromNode().equals(currentNode))
                edges.add(e);
        }

        while (edges.size()!=0){

            Edge tempEdge = edges.poll();
            Edge currentEdge =null;
            for( Edge e : getGraph().getEdgeList()){
                if(e.equals(tempEdge))
                    currentEdge = e;
            }

            Node fromNode = currentEdge.getFromNode();
            Node toNode = currentEdge.getToNode();
            if(!visited.contains(fromNode) || !visited.contains(toNode)){
                for (Edge e : getGraph().getEdgeList()){
                    if(!visited.contains(fromNode)){
                        if( (e.getFromNode().equals(fromNode) && !visited.contains(e.getToNode()))
                                || (e.getToNode().equals(fromNode) && !visited.contains(e.getFromNode())))
                             edges.add(e);
                    }
                    if(!visited.contains(toNode)){
                        if((e.getFromNode().equals(toNode) && !visited.contains(e.getToNode()))
                                || (e.getToNode().equals(toNode) && !visited.contains(e.getFromNode())))
                            edges.add(e);
                    }
                }

                visited.add(fromNode);
                visited.add(toNode);

                fromNode.removeAllAttributes();
                toNode.removeAllAttributes();
//                currentEdge.removeAttribute("color");
//                currentEdge.removeAttribute("penwidth");

                fromNode.addAttributes(currentNodeAttributes);
                toNode.addAttributes(currentNodeAttributes);
                currentEdge.addAttribute(new Attribute("penwidth", primConfig.getCurrentEdgeWidth()));
                currentEdge.addAttribute(new Attribute("color", primConfig.getCurrentEdgeColor()));


                VesitLang.genImageAndPdf(getGraph(),primConfig);

                fromNode.removeAllAttributes();
                toNode.removeAllAttributes();
                currentEdge.removeAttribute("color");
                currentEdge.removeAttribute("penwidth");

                fromNode.addAttributes(visitedNodeAttributes);
                toNode.addAttributes(visitedNodeAttributes);
                currentEdge.addAttributes(visitedEdgeAttributes);
                currentEdge.addAttribute(new Attribute("penwidth", primConfig.getVisitedEdgeWidth()));
                currentEdge.addAttribute(new Attribute("color",primConfig.getVisitedEdgeColor()));            }
        }

        VesitLang.genImageAndPdf(getGraph(),primConfig);
        for (Node n : graph.getNodeList()) n.removeAllAttributes();
        for (Edge edge: graph.getEdgeList()) {
            edge.removeAttributes(visitedEdgeAttributes);
            edge.removeAttributes(currentEdgeAttributes);
        }
    }


    /**
     * load attribtes for visited, current edges and nodes.
     */

    private void loadAttributes() {
        loadCurrentEdgeAttributes();
        LoadVisitedEdgeAttributes();
        loadCurrentNodeAttributes();
        loadVisitedNodeAttributes();
    }

    /**
     * load current edge attributes from primconfig
     */
    private void loadCurrentEdgeAttributes() {
        currentEdgeAttributes.add(new Attribute("penwidth", primConfig.getCurrentEdgeWidth()));
        currentEdgeAttributes.add(new Attribute("color", primConfig.getCurrentEdgeColor()));
    }

    /**
     * load visited edge attributes from primconfig
     */
    private void LoadVisitedEdgeAttributes() {
        visitedEdgeAttributes.add(new Attribute("penwidth", primConfig.getVisitedEdgeWidth()));
        visitedEdgeAttributes.add(new Attribute("color",primConfig.getVisitedEdgeColor()));
    }

    /**
     * load visited node attributes from primconfig
     */
    private void loadVisitedNodeAttributes() {
        visitedNodeAttributes.add(new Attribute("shape",primConfig.getVisitedNodeShape()));
        visitedNodeAttributes.add(new Attribute("color",primConfig.getVisitedNodeColor()));
        visitedNodeAttributes.add(new Attribute("style","filled"));
    }

    /**
     * load current node attributes from primconfig
     */
    private void loadCurrentNodeAttributes() {
        currentNodeAttributes.add(new Attribute("style","filled"));
        currentNodeAttributes.add(new Attribute("color",primConfig.getCurrentNodeColor()));
        currentNodeAttributes.add(new Attribute("shape",primConfig.getCurrentNodeShape()));
    }
}
