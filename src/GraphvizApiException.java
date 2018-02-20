
/**
 * GraphvizApi Base Exception.
 * Created by frank on 2014/11/27.
 * Modified by Yash
 */
public class GraphvizApiException extends RuntimeException{
    public GraphvizApiException(String message){
        super("GraphvizApiException: "+message);
    }
}
