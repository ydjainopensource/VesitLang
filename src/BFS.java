import java.io.File;
import java.util.*;

public class BFS {

    private static Queue<Node> q = new LinkedList<>();
    private static Set<Node> visited = new HashSet<>();
    private static Graphviz gv = new Graphviz();
    
    private static String queuedNodeColor = "aquamarine";
    private static String visitedNodeColor = "grey60";
    private static String currentNodeColor = "red";
    
    private static String currentNodeShape = "Mdiamond";
    private static String queuedNodeShape = "doublecircle";
    private static String visitedNodeShape = "doubleoctagon";
    
    private static String dpi = "100";
    private static String outImageDir = "imagesBfs/";
    private static String pptName = "bfs.pdf";
    private static int iterNumber = 0;

    public static void loadBfsConfig(BfsConfig bfsConfig){
        setQueuedNodeColor(BfsConfig.getQueuedNodeColor());
        setQueuedNodeShape(BfsConfig.getQueuedNodeShape());
        setVisitedNodeColor(BfsConfig.getVisitedNodeColor());
        setVisitedNodeShape(BfsConfig.getVisitedNodeShape());
        setCurrentNodeColor(BfsConfig.getCurrentNodeColor());
        setCurrentNodeShape(BfsConfig.getCurrentNodeShape());
        setDpi(BfsConfig.getDpi());
        setOutImageDir(BfsConfig.getOutImageDir());
        setPptName(BfsConfig.getPptName());

    }

    public static String getQueuedNodeColor() {
        return queuedNodeColor;
    }

    public static void setQueuedNodeColor(String queuedNodeColor) {
        BFS.queuedNodeColor = queuedNodeColor;
    }

    public static String getQueuedNodeShape() {
        return queuedNodeShape;
    }

    public static void setQueuedNodeShape(String queuedNodeShape) {
        BFS.queuedNodeShape = queuedNodeShape;
    }

    public static String getVisitedNodeColor() {
        return visitedNodeColor;
    }

    public static void setVisitedNodeColor(String visitedNodeColor) {
        BFS.visitedNodeColor = visitedNodeColor;
    }

    public static String getCurrentNodeColor() {
        return currentNodeColor;
    }

    public static void setCurrentNodeColor(String currentNodeColor) {
        BFS.currentNodeColor = currentNodeColor;
    }

    public static String getCurrentNodeShape() {
        return currentNodeShape;
    }

    public static void setCurrentNodeShape(String currentNodeShape) {
        BFS.currentNodeShape = currentNodeShape;
    }


    public static String getVisitedNodeShape() {
        return visitedNodeShape;
    }

    public static void setVisitedNodeShape(String visitedNodeShape) {
        BFS.visitedNodeShape = visitedNodeShape;
    }

    public static String getDpi() {
        return dpi;
    }

    public static void setDpi(String dpi) {
        BFS.dpi = dpi;
    }

    public static String getOutImageDir() {
        return outImageDir;
    }

    public static void setOutImageDir(String outImageDir) {
        BFS.outImageDir = outImageDir;
    }

    public static String getPptName() {
        return pptName;
    }

    public static void setPptName(String pptName) {
        BFS.pptName = pptName;
    }

    public static void bfs(Graph graph, Node start) {
        int iterNumber = 0;

        for (Node node: graph.getNodeList() ) {
            node.removeAllAttributes();
        }

        q.add(start);
        visited.add(start);
        genImageAndPpt(graph);

        while (!q.isEmpty()) {

            Node top = q.peek();

            top.addAttribute(new Attribute("shape", getCurrentNodeShape()));
            top.addAttribute(new Attribute("style", "filled"));
            top.addAttribute(new Attribute("color", getCurrentNodeColor()));

            addToQueue(graph, top);

//            System.err.println(q);

            top.removeAttribute("color");
            top.removeAttribute("shape");
            top.addAttribute(new Attribute("shape",getVisitedNodeShape()));
            top.addAttribute(new Attribute("color",getVisitedNodeColor()));

            q.remove();
            genImageAndPpt(graph);
        }
    }

    private static void addToQueue(Graph graph, Node top) {
        for (Edge e : graph.getEdgeList()) {

            Node fromNode = e.getFromNode();

            if (top.equals(fromNode)) {
                Node toNode = e.getToNode();
                if (!visited.contains(toNode)) {

                    visited.add(toNode);
                    q.add(toNode);

                    toNode.addAttribute(new Attribute("shape", getQueuedNodeShape()));
                    toNode.addAttribute(new Attribute("style", "filled"));
                    toNode.addAttribute(new Attribute("color", getQueuedNodeColor()));
//                    System.err.println("adding "+ toNode);
                    genImageAndPpt(graph);

                }
            }
        }
    }


    public static int getIterNumber() {
        return iterNumber;
    }

    public static void genImageAndPpt(Graph graph) {
        try{
            byte[] graphByteArray = gv.getGraphByteArray(graph, "png", getDpi());
            File outFile = new File(outImageDir + "" + getIterNumber() + ".png");
            VesitLang.writeGraphToFile(graphByteArray, outFile);
            iterNumber++;
            VesitLang.generatePdf(getIterNumber(),getOutImageDir(),getPptName());
        }catch (Exception ec){
            System.err.println(ec.toString());
            System.err.println("Error while generating PPT");
            System.err.println("Aborting");
        }
    }








}
