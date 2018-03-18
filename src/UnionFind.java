import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Union find data structure
class UnionFind {

    private HashMap<Node, Set<Node>> map;

    public UnionFind(Graph g){
        map = new HashMap<>(g.getNodeList().size());
        Set<Node> nodes = g.getNodeList();
        for (Node node:
             nodes) {
            map.put(node, new HashSet<>());
        }

        for(Edge e : g.getEdgeList()){
            Node fromNode = e.getFromNode();
            Node toNode = e.getToNode();
            map.get(fromNode).add(toNode);
            map.get(toNode).add(fromNode);
        }

    }

    public boolean connected(Node p, Node q) {
        return map.get(p).equals(map.get(q));
    }

    public void union(Node p, Node q) {
        map.get(p).addAll(map.get(q));
        map.put(q,map.get(p));
    }

}