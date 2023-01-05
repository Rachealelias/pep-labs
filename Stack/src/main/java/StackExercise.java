import java.util.Deque;
import java.util.ArrayDeque;
/**
 * Stacks are LIFO - last in, first out, like a stack of plates or books, or the puzzle game "Towers of Hanoi".
 * They are used in algorithms where it is needed to keep track of the ordering in which the elements were inserted.
 *
 * ArrayDeque fills the role of *both* queues and stacks. You could think of a Deque as a deck of cards (pronounced the
 * same) where you could remove cards from either the top or bottom. You can use ArrayDeque
 * to perform stack operations. You can read about ArrayDeque in the official Javadocs here:
 * https://docs.oracle.com/javase/7/docs/api/java/util/ArrayDeque.html
 * And you can read about the stack class here (deque exhibits the same behavior as Stack and contains the same
 * methods): https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
 */
public class StackExercise {
   
    public Deque<String> createNewStack(){
        Deque<String> stk = new ArrayDeque<String>();
        return stk;
    }

    /**
     * @param stack A Deque of Strings.
     * @return the number of elements in the deque.
     */
    public int getSize(Deque<String> stack){
        return stack.size();
    }

    
    public void addToTopOfStack(Deque<String> stack, String item){
        stack.addFirst(item);
    }

    
    public String removeFromTopOfStack(Deque<String> stack){
        return stack.pop();
    }
    
    public String getTopOfStackWithoutRemoving(Deque<String> stack){
        return stack.peek();
    }
}
