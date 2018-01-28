
/**
 * The Edge class like Graphviz's edge.
 * Created by frank on 2014/11/20.
 */
public class Edge extends BaseGraphObject implements Comparable {
    private Node fromNode;
    private Node toNode;

    @Override
    public int compareTo(Object o) {
        int result = 0;
        if(o instanceof Edge)
        {
            Edge that = (Edge) o;

            if( this.getFromNode().compareTo(that.getFromNode()) ==0)
                return getToNode().compareTo(that.getToNode());
            else
                this.getFromNode().compareTo(that.getFromNode());
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if(o instanceof Edge)
        {
            Edge that = (Edge) o;
            result = that.getFromNode().equals(this.getFromNode())&&
                    that.getToNode().equals(this.getFromNode());
        }
        return  result;
    }

    @Override
    public String toString() {
        return getToNode() +"\t" + getFromNode();
    }

    /**
     * Edge constructor with edge id.
     * @param id Edge Id.
     * @param fromNode From Node.
     * @param toNode To Node.
     */
    public Edge(String id,Node fromNode,Node toNode){
        super(id);
        this.fromNode = fromNode;
        this.toNode = toNode;
    }

    /**
     * Edge constructor without edge id. Default id is blank.
     * @param fromNode
     * @param toNode
     */
    public Edge(Node fromNode,Node toNode){
        super("");
        this.fromNode = fromNode;
        this.toNode = toNode;
    }

    /**
     * From node getter.
     * @return from Node
     */
    public Node getFromNode(){
        return this.fromNode;
    }

    /**
     * To node getter.
     * @return to node.
     */
    public Node getToNode(){
        return this.toNode;
    }

    @Override
    public String genDotString() {
        StringBuilder dotString = new StringBuilder();
        dotString.append("["+this.genAttributeDotString()+"]");
        return dotString.toString();
    }
}
