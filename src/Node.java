
/**
 * The Node class like Graphviz's node.
 * Created by frank on 2014/11/17.
 */
public class Node extends BaseGraphObject implements Comparable {
    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }

    @Override
    public int compareTo(Object o) {
        int result = 0;
        if(o instanceof BaseGraphObject)
        {
            Node that = (Node) o;

            return getId().compareTo(((Node) o).getId());
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.getId();
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if(o instanceof Node)
        {
            Node that = (Node) o;
            result = this.getId().equals(that.getId());
        }
        return  result;
    }

    /**
     * Constructor.
     * @param id
     */
    public Node(String id) {
        super(id);
    }

    @Override
    public String genDotString() {
        StringBuilder dotString = new StringBuilder();
        dotString.append("["+this.genAttributeDotString()+"]");
        return dotString.toString();
    }
}
