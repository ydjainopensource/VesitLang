import com.sun.istack.internal.NotNull;

import java.io.File;
import java.util.*;

public class DFS {

    private static Set<Node> visited = new HashSet<>();
    private static DfsStack<Node> stack = new DfsStack<>();
    private static Graphviz gv = new Graphviz();
    private static String stackNodeColor = "aquamarine";
    private static String stackNodeShape = "hexagon";
    private static String visitedNodeColor = "grey60";
    private static String visitedNodeShape = "doubleoctagon";
    private static String dpi = "100";
    private static String outImageDir = "imagesDfs/";
    private static String pptName = "dfs.pdf";
    private static int iterNumber = 0;

    public static void setIterNumber(int iterNumber) {
        DFS.iterNumber = iterNumber;
    }

    public static void loadDfsConfig(DfsConfig dc){
        setStackNodeColor(DfsConfig.getStackNodeColor());
        setStackNodeShape(DfsConfig.getStackNodeShape());
        setVisitedNodeColor(DfsConfig.getVisitedNodeColor());
        setVisitedNodeShape(DfsConfig.getVisitedNodeShape());
        setDpi(DfsConfig.getDpi());
        setOutImageDir(DfsConfig.getOutImageDir());
        setPptName(DfsConfig.getPptName());

    }


    public static String getStackNodeColor() {
        return stackNodeColor;
    }

    public static void setStackNodeColor(String stackNodeColor) {
        DFS.stackNodeColor = stackNodeColor;
    }

    public static String getStackNodeShape() {
        return stackNodeShape;
    }

    public static void setStackNodeShape(String stackNodeShape) {
        DFS.stackNodeShape = stackNodeShape;
    }

    public static String getVisitedNodeColor() {
        return visitedNodeColor;
    }

    public static void setVisitedNodeColor(String visitedNodeColor) {
        DFS.visitedNodeColor = visitedNodeColor;
    }

    public static String getVisitedNodeShape() {
        return visitedNodeShape;
    }

    public static void setVisitedNodeShape(String visitedNodeShape) {
        DFS.visitedNodeShape = visitedNodeShape;
    }

    public static String getDpi() {
        return dpi;
    }

    public static void setDpi(String dpi) {
        DFS.dpi = dpi;
    }

    public static String getOutImageDir() {
        return outImageDir;
    }

    public static void setOutImageDir(String outImageDir) {
        DFS.outImageDir = outImageDir;
    }

    public static String getPptName() {
        return pptName;
    }

    public static void setPptName(String pptName) {
        DFS.pptName = pptName;
    }

    public static void dfs(@NotNull Graph graph,Node start) {

        for (Node node: graph.getNodeList() ) {
            node.removeAllAttributes();
        }

        dfsw(graph,start);
    }

    public static int getIterNumber() {
        return iterNumber;
    }

    public static void genImageAndPpt(Graph graph) {
        try{
            byte[] graphByteArray = gv.getGraphByteArray(graph, "png", getDpi());
            File outFile = new File(getOutImageDir() + "" + getIterNumber() + ".png");
            VesitLang.writeGraphToFile(graphByteArray, outFile);
            setIterNumber(getIterNumber()+1);
            VesitLang.generatePdf(getIterNumber(),getOutImageDir(),getPptName());
        }catch (Exception ec){
            System.err.println(ec.toString());
            System.err.println("Error while generating PPT");
            System.err.println("Aborting");
        }
    }



    public static void dfsw(Graph graph, Node start){

        stack.push(start);
        start.addAttribute(new Attribute("shape", getStackNodeShape()));
        start.addAttribute(new Attribute("style", "filled"));
        start.addAttribute(new Attribute("color", getStackNodeColor()));

        genImageAndPpt(graph);

        for (Edge e : graph.getEdgeList()) {
            Node toNode = e.getToNode();
            if (start.getId().equals(e.getFromNode().getId())) {
                if (!visited.contains(toNode)) {
                    visited.add(toNode);
                    dfsw(graph,toNode);
                }
            }
        }

        start.removeAllAttributes();
        start.addAttribute(new Attribute("shape", getVisitedNodeShape()));
        start.addAttribute(new Attribute("style", "filled"));
        start.addAttribute(new Attribute("color", getVisitedNodeColor()));
        genImageAndPpt(graph);
        stack.pop();
    }
}
