import com.sun.istack.internal.NotNull;

import java.io.File;
import java.util.*;

public class DFS {

    private Set<Node> visited = new HashSet<>();
    private DfsStack<Node> stack = new DfsStack<>();
    private Graphviz gv = new Graphviz();

    private static DfsConfig dfsConfig = new DfsConfig();

    public static void loadDfsConfig(DfsConfig dc) {
        dfsConfig = dc;
        File f = new File(dc.getOutImageDir());
        if(!f.exists()){
            f.mkdirs();
        }
    }

    public void dfs(Graph graph, Node start) {

        for (Node node : graph.getNodeList()) {
            node.removeAllAttributes();
        }

        dfsw(graph, start);
    }

    public void genImageAndPpt(Graph graph) {
        try {
            byte[] graphByteArray = gv.getGraphByteArray(graph, "png", dfsConfig.getDpi());
            File outFile = new File(dfsConfig.getOutImageDir() + "" + dfsConfig.getIterNumber() + ".png");
            VesitLang.writeGraphToFile(graphByteArray, outFile);
            dfsConfig.setIterNumber(dfsConfig.getIterNumber() + 1);
            VesitLang.generatePdf(dfsConfig.getIterNumber(), dfsConfig.getOutImageDir(), dfsConfig.getPptName());
        } catch (Exception ec) {
            ec.printStackTrace();
            System.err.println(ec.toString());
            System.err.println("Error while generating PPT");
            System.err.println("Aborting");
        }
    }


    public void dfsw(Graph graph, Node start) {

        stack.push(start);
        start.addAttribute(new Attribute("shape", dfsConfig.getStackNodeShape()));
        start.addAttribute(new Attribute("style", "filled"));
        start.addAttribute(new Attribute("color", dfsConfig.getStackNodeColor()));

        genImageAndPpt(graph);

        for (Edge e : graph.getEdgeList()) {
            Node toNode = e.getToNode();
            if (start.getId().equals(e.getFromNode().getId())) {
                if (!visited.contains(toNode)) {
                    visited.add(toNode);
                    dfsw(graph, toNode);
                }
            }
        }

        start.removeAllAttributes();
        start.addAttribute(new Attribute("shape", dfsConfig.getVisitedNodeShape()));
        start.addAttribute(new Attribute("style", "filled"));
        start.addAttribute(new Attribute("color", dfsConfig.getVisitedNodeColor()));
        genImageAndPpt(graph);
        stack.pop();
    }
}
