/**
 * Interface for BFS DFS Kruskal and Prim to allow image and pdf generation
 */

public interface ActionConfig {
    public String getOutImageDir();
    public int getIterNumber();
    public void setIterNumber(int i);
    public String getPptName();
    public String getDpi();
}
