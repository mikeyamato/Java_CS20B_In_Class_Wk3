package assignment1.stack;

// can delete `public` without issue
public interface StackInterface <T> {
   void push(T type) throws StackOverflowException;  // `type` can be named anything. it's just a generic keyword. look at this like `void push(String monkey)`
   void pop() throws StackUnderflowException;
   T top() throws StackUnderflowException;
   boolean isEmpty();
   boolean isFull();
}
