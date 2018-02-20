
/**
 * The Base Graph Object not found Exception.
 * Created by frank on 2014/11/27.
 * Modified by Yash
 */

public class BaseGraphObjectNotFoundException extends Exception {
    public BaseGraphObjectNotFoundException(String message){
        super("BaseGraphObjectNotFoundException: "+message);
    }
}
