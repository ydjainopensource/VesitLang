import java.io.File;
import java.util.*;

public class BFS {

    private Queue<Node> q = new LinkedList<>();
    private Set<Node> visited = new HashSet<>();
    private Graphviz gv = new Graphviz();
    private BfsConfig bfsConfig = new BfsConfig();

    public void loadBfsConfig(BfsConfig config){
        bfsConfig = config;
        File f = new File(bfsConfig.getOutImageDir());
        if(!f.exists()){
            f.mkdirs();
        }
    }

    public void bfs(Graph graph, Node start) {
        int iterNumber = 0;

        for (Node node: graph.getNodeList() ) {
            node.removeAllAttributes();
        }

        q.add(start);
        visited.add(start);
        genImageAndPpt(graph);

        while (!q.isEmpty()) {

            Node top = q.peek();
            System.err.println(q);
            top.removeAllAttributes();
            top.addAttribute(new Attribute("shape", bfsConfig.getCurrentNodeShape()));
            top.addAttribute(new Attribute("style", "filled"));
            top.addAttribute(new Attribute("color", bfsConfig.getCurrentNodeColor()));

            genImageAndPpt(graph);

            addToQueue(graph, top);

//            System.err.println(q);

            top.removeAllAttributes();
//            top.removeAttribute("color");
//            top.removeAttribute("shape");
            top.addAttribute(new Attribute("shape",bfsConfig.getVisitedNodeShape()));
            top.addAttribute(new Attribute("color",bfsConfig.getVisitedNodeColor()));

            q.remove();
            genImageAndPpt(graph);

        }
    }

    private void addToQueue(Graph graph, Node top) {
        for (Edge e : graph.getEdgeList()) {

            Node fromNode = e.getFromNode();

            if (top.equals(fromNode)) {
                Node toNode = e.getToNode();
                if (!visited.contains(toNode)) {

                    visited.add(toNode);
                    q.add(toNode);
                    toNode.removeAllAttributes();
                    toNode.addAttribute(new Attribute("shape", bfsConfig.getQueuedNodeShape()));
                    toNode.addAttribute(new Attribute("style", "filled"));
                    toNode.addAttribute(new Attribute("color", bfsConfig.getQueuedNodeColor()));
                    System.err.println("adding "+ toNode);
                    genImageAndPpt(graph);

                }
            }
        }
    }


//    public static int getIterNumber() {
//        return iterNumber;
//    }

    public void genImageAndPpt(Graph graph) {
        try{
            byte[] graphByteArray = gv.getGraphByteArray(graph, "png", bfsConfig.getDpi());
            File outFile = new File(bfsConfig.getOutImageDir() + "" + bfsConfig.getIterNumber() + ".png");
            VesitLang.writeGraphToFile(graphByteArray, outFile);
            bfsConfig.setIterNumber(bfsConfig.getIterNumber()+1);
            VesitLang.generatePdf(bfsConfig.getIterNumber(),bfsConfig.getOutImageDir(),bfsConfig.getPptName());
        }catch (Exception ec){
            System.err.println(ec.toString());
            System.err.println("Error while generating PPT");
            System.err.println("Aborting");
        }
    }
}
