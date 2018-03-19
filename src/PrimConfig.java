
/**
 * Class to represent configuration used for Prim.
 * Created by Yash Jain
 */
public class PrimConfig implements ActionConfig {

    private String currentEdgeColor = "blue";
    private String currentEdgeWidth = "3";
    private String visitedEdgeWidth = "2";
    private String visitedEdgeColor = "khaki";
    private String visitedNodeColor = "grey60";
    private String currentNodeColor = "red";
    private String currentNodeShape = "Mdiamond";
    private String visitedNodeShape = "doubleoctagon";
    private String dpi = "100";
    private String outImageDir = "imagesPrim/";
    private String pptName = "bfs.pdf";
    private int iterNumber = 0;



    public String getVisitedNodeColor() {
        return visitedNodeColor;
    }

    public void setVisitedNodeColor(String visitedNodeColor) {
        this.visitedNodeColor = visitedNodeColor;
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

    public String getCurrentEdgeColor() {
        return currentEdgeColor;
    }

    public void setCurrentEdgeColor(String currentEdgeColor) {
        this.currentEdgeColor = currentEdgeColor;
    }

    public String getCurrentEdgeWidth() {
        return currentEdgeWidth;
    }

    public void setCurrentEdgeWidth(String currentEdgeWidth) {
        this.currentEdgeWidth = currentEdgeWidth;
    }

    public String getVisitedEdgeWidth() {
        return visitedEdgeWidth;
    }

    public void setVisitedEdgeWidth(String visitedEdgeWidth) {
        this.visitedEdgeWidth = visitedEdgeWidth;
    }

    public String getVisitedEdgeColor() {
        return visitedEdgeColor;
    }

    public void setVisitedEdgeColor(String visitedEdgeColor) {
        this.visitedEdgeColor = visitedEdgeColor;
    }

    @Override
    public String toString() {
        return "PrimConfig{" +
                "currentEdgeColor='" + currentEdgeColor + '\'' +
                ", currentEdgeWidth='" + currentEdgeWidth + '\'' +
                ", visitedEdgeWidth='" + visitedEdgeWidth + '\'' +
                ", visitedEdgeColor='" + visitedEdgeColor + '\'' +
                ", visitedNodeColor='" + visitedNodeColor + '\'' +
                ", currentNodeColor='" + currentNodeColor + '\'' +
                ", currentNodeShape='" + currentNodeShape + '\'' +
                ", visitedNodeShape='" + visitedNodeShape + '\'' +
                ", dpi='" + dpi + '\'' +
                ", outImageDir='" + outImageDir + '\'' +
                ", pptName='" + pptName + '\'' +
                ", iterNumber=" + iterNumber +
                '}';
    }
}
