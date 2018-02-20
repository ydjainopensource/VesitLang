
/**
 * Created by frank on 2015/2/10.
 * Modified by Yash
 */
public class GraphException extends GraphvizApiException {
    public GraphException(String message) {
        super("GraphException: "+message);
    }
}
