public class BfsConfig {
    private static String queuedNodeColor = "aquamarine";
    private static String visitedNodeColor = "grey60";
    private static String currentNodeColor = "red";
    private static String currentNodeShape = "Mdiamond";

    public static String getQueuedNodeColor() {
        return queuedNodeColor;
    }

    public static void setQueuedNodeColor(String queuedNodeColor) {
        BfsConfig.queuedNodeColor = queuedNodeColor;
    }

    public static String getVisitedNodeColor() {
        return visitedNodeColor;
    }

    public static void setVisitedNodeColor(String visitedNodeColor) {
        BfsConfig.visitedNodeColor = visitedNodeColor;
    }

    public static String getCurrentNodeColor() {
        return currentNodeColor;
    }

    public static void setCurrentNodeColor(String currentNodeColor) {
        BfsConfig.currentNodeColor = currentNodeColor;
    }

    public static String getCurrentNodeShape() {
        return currentNodeShape;
    }

    public static void setCurrentNodeShape(String currentNodeShape) {
        BfsConfig.currentNodeShape = currentNodeShape;
    }

    public static String getQueuedNodeShape() {
        return queuedNodeShape;
    }

    public static void setQueuedNodeShape(String queuedNodeShape) {
        BfsConfig.queuedNodeShape = queuedNodeShape;
    }

    public static String getVisitedNodeShape() {
        return visitedNodeShape;
    }

    public static void setVisitedNodeShape(String visitedNodeShape) {
        BfsConfig.visitedNodeShape = visitedNodeShape;
    }

    public static String getDpi() {
        return dpi;
    }

    public static void setDpi(String dpi) {
        BfsConfig.dpi = dpi;
    }

    public static String getOutImageDir() {
        return outImageDir;
    }

    public static void setOutImageDir(String outImageDir) {
        BfsConfig.outImageDir = outImageDir;
    }

    public static String getPptName() {
        return pptName;
    }

    public static void setPptName(String pptName) {
        BfsConfig.pptName = pptName;
    }

    private static String queuedNodeShape = "doublecircle";
    private static String visitedNodeShape = "doubleoctagon";
    private static String dpi = "100";
    private static String outImageDir = "imagesBfs/";
    private static String pptName = "bfs.pdf";

    public static void resetBfsConfig() {
        queuedNodeShape = "doublecircle";
        visitedNodeShape = "doubleoctagon";
        dpi = "100";
        outImageDir = "imagesBfs/";
        pptName = "bfs.pdf";
        queuedNodeColor = "aquamarine";
        visitedNodeColor = "grey60";
        currentNodeColor = "red";
        currentNodeShape = "Mdiamond";
    }
}
