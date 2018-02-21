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
        VesitLang.genImageAndPdf(graph,bfsConfig);

        while (!q.isEmpty()) {

            Node top = q.peek();
            System.out.println(q);
            top.removeAllAttributes();
            top.addAttribute(new Attribute("shape", bfsConfig.getCurrentNodeShape()));
            top.addAttribute(new Attribute("style", "filled"));
            top.addAttribute(new Attribute("color", bfsConfig.getCurrentNodeColor()));

            VesitLang.genImageAndPdf(graph,bfsConfig);

            addToQueue(graph, top);

//            System.err.println(q);

            top.removeAllAttributes();
//            top.removeAttribute("color");
//            top.removeAttribute("shape");
            top.addAttribute(new Attribute("shape",bfsConfig.getVisitedNodeShape()));
            top.addAttribute(new Attribute("style","filled"));
            top.addAttribute(new Attribute("color",bfsConfig.getVisitedNodeColor()));

            q.remove();
            VesitLang.genImageAndPdf(graph,bfsConfig);

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
                    System.out.println("adding "+ toNode);
                    VesitLang.genImageAndPdf(graph,bfsConfig);

                }
            }
        }
    }
}
