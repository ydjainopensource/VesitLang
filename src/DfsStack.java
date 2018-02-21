import java.util.Arrays;
import java.util.Stack;

/**
 * Class to be used as stack for running DFS
 * @param <T> the generic representing type of a stack element
 */
public class DfsStack<T> extends Stack {
    @Override
    public String toString() {
        return "DfsStack{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
