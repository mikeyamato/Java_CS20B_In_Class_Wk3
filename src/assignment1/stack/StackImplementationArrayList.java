package assignment1.stack;

// by using ArrayList which is part of Java's library we have access to it's helper methods.
// so instead of using what we used in StackImplementation
import java.util.ArrayList;

public class StackImplementationArrayList<T> implements StackInterface<T>{

  protected ArrayList<T> elements;
//  protected int size;
  protected int topIndex;

  public StackImplementationArrayList(){
    this.elements = new ArrayList<T>();
//    this.size = size;
    this.topIndex = -1;
  }

  @Override
  public void push(T el) {
//    elements[++topIndex] = el;
    ++topIndex;
    elements.add(el);
  }

  @Override
  public void pop() throws StackUnderflowException {
    if(!this.isEmpty()){
//      elements[topIndex] = null;
      elements.remove(topIndex);
      topIndex--;
    } else {
      throw new StackUnderflowException ("The stack is empty");
    }
  }

  @Override
  public T top() throws StackUnderflowException{
    if(!this.isEmpty()){
//      return elements[topIndex];
      return elements.get(topIndex);
    } else {
      throw new StackUnderflowException("The stack is empty");
    }
  }

  @Override
  public boolean isEmpty() {
    return (topIndex == -1);
  }

  @Override
  // will never be full
  public boolean isFull() {
    return false;
  }

}
