import java.io.File;

public class BfsConfig implements ActionConfig {
    private String visitedNodeColor = "grey60";
    private String queuedNodeColor = "aquamarine";
    private String currentNodeColor = "red";
    private String currentNodeShape = "Mdiamond";
    private String queuedNodeShape = "doublecircle";
    private String visitedNodeShape = "doubleoctagon";
    private String dpi = "100";
    private String outImageDir = "imagesBfs/";
    private String pptName = "bfs.pdf";
    private int iterNumber =0;

    public String getVisitedNodeColor() {
        return visitedNodeColor;
    }

    public void setVisitedNodeColor(String visitedNodeColor) {
        this.visitedNodeColor = visitedNodeColor;
    }

    public String getQueuedNodeColor() {
        return queuedNodeColor;
    }

    public void setQueuedNodeColor(String queuedNodeColor) {
        this.queuedNodeColor = queuedNodeColor;
    }

    public String getCurrentNodeColor() {
        return currentNodeColor;
    }

    public void setCurrentNodeColor(String currentNodeColor) {
        this.currentNodeColor = currentNodeColor;
    }

    public String getCurrentNodeShape() {
        return currentNodeShape;
    }

    public void setCurrentNodeShape(String currentNodeShape) {
        this.currentNodeShape = currentNodeShape;
    }

    public String getQueuedNodeShape() {
        return queuedNodeShape;
    }

    public void setQueuedNodeShape(String queuedNodeShape) {
        this.queuedNodeShape = queuedNodeShape;
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

    public int getIterNumber() {
        return iterNumber;
    }

    public void setIterNumber(int iterNumber) {
        this.iterNumber = iterNumber;
    }

    public void resetBfsConfig() {
        queuedNodeShape = "doublecircle";
        visitedNodeShape = "doubleoctagon";
        dpi = "100";
        outImageDir = "imagesBfs/";
        pptName = "bfs.pdf";
        queuedNodeColor = "aquamarine";
        visitedNodeColor = "grey60";
        currentNodeColor = "red";
        currentNodeShape = "Mdiamond";
        iterNumber=0;
        File f = new File(outImageDir);
        if(!f.exists())
            f.mkdirs();

    }
}
