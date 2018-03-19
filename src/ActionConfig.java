/**
 * Interface for BFS DFS Kruskal and Prim to allow image and pdf generation
 */

public interface ActionConfig {
    String getOutImageDir();
    int getIterNumber();
    void setIterNumber(int i);
    String getPptName();
    String getDpi();
}
