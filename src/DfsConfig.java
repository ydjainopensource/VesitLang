public class DfsConfig {
    private static String stackNodeColor = "aquamarine";
    private static String stackNodeShape = "hexagon";
    private static String visitedNodeColor = "grey60";
    private static String visitedNodeShape = "doubleoctagon";
    private static String dpi = "100";
    private static String outImageDir = "imagesDfs/";
    private static String pptName = "dfs.pdf";

    public static String getStackNodeColor() {
        return stackNodeColor;
    }

    public static void setStackNodeColor(String stackNodeColor) {
        DfsConfig.stackNodeColor = stackNodeColor;
    }

    public static String getStackNodeShape() {
        return stackNodeShape;
    }

    public static void setStackNodeShape(String stackNodeShape) {
        DfsConfig.stackNodeShape = stackNodeShape;
    }

    public static String getVisitedNodeColor() {
        return visitedNodeColor;
    }

    public static void setVisitedNodeColor(String visitedNodeColor) {
        DfsConfig.visitedNodeColor = visitedNodeColor;
    }

    public static String getVisitedNodeShape() {
        return visitedNodeShape;
    }

    public static void setVisitedNodeShape(String visitedNodeShape) {
        DfsConfig.visitedNodeShape = visitedNodeShape;
    }

    public static String getDpi() {
        return dpi;
    }

    public static void setDpi(String dpi) {
        DfsConfig.dpi = dpi;
    }

    public static String getOutImageDir() {
        return outImageDir;
    }

    public static void setOutImageDir(String outImageDir) {
        DfsConfig.outImageDir = outImageDir;
    }

    public static String getPptName() {
        return pptName;
    }

    public static void setPptName(String pptName) {
        DfsConfig.pptName = pptName;
    }

    public static void resetDfsConfig(){
        stackNodeColor = "aquamarine";
        stackNodeShape = "hexagon";
        visitedNodeColor = "grey60";
        visitedNodeShape = "doubleoctagon";
        dpi = "100";
        outImageDir = "imagesDfs/";
        pptName = "dfs.pdf";
    }
}
