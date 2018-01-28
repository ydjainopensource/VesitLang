public class DfsConfig {
    private String stackNodeColor = "aquamarine";
    private String stackNodeShape = "hexagon";
    private String visitedNodeColor = "grey60";
    private String visitedNodeShape = "doubleoctagon";
    private String dpi = "100";
    private String outImageDir = "imagesDfs/";
    private String pptName = "dfs.pdf";


    public String getStackNodeColor() {
        return stackNodeColor;
    }

    public void setStackNodeColor(String stackNodeColor) {
        this.stackNodeColor = stackNodeColor;
    }

    public String getStackNodeShape() {
        return stackNodeShape;
    }

    public void setStackNodeShape(String stackNodeShape) {
        this.stackNodeShape = stackNodeShape;
    }

    public String getVisitedNodeColor() {
        return visitedNodeColor;
    }

    public void setVisitedNodeColor(String visitedNodeColor) {
        this.visitedNodeColor = visitedNodeColor;
    }

    public String getVisitedNodeShape() {
        return visitedNodeShape;
    }

    public void setVisitedNodeShape(String visitedNodeShape) {
        this.visitedNodeShape = visitedNodeShape;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getOutImageDir() {
        return outImageDir;
    }

    public void setOutImageDir(String outImageDir) {
        this.outImageDir = outImageDir;
    }

    public String getPptName() {
        return pptName;
    }

    public void setPptName(String pptName) {
        this.pptName = pptName;
    }

    public void resetDfsConfig(){
        stackNodeColor = "aquamarine";
        stackNodeShape = "hexagon";
        visitedNodeColor = "grey60";
        visitedNodeShape = "doubleoctagon";
        dpi = "100";
        outImageDir = "imagesDfs/";
        pptName = "dfs.pdf";
    }
}
