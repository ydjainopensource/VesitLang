import java.util.Arrays;
import java.util.Stack;

public class DfsStack<T> extends Stack {
    @Override
    public String toString() {
        return "DfsStack{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
