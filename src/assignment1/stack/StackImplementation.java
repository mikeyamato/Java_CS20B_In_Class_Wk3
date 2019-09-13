package assignment1.stack;

// how to make this class implement the interface.
// don't use abstract even if there's no complain.
// generic class can only implement generic interface.
public class StackImplementation<T> implements StackInterface<T>{

  // no specific type for the array, that's why T is used
  // at the start of pushing to an array, the location is index -1, not zero because there's nothing added
  // initial value of entire array spaces is `null`
  protected T[] elements;
  protected int size;
  protected int topIndex;  // can use `protected int topIndex = -1` and not create it in the constructor

  // create a constructor (use name of class)
  public StackImplementation(int size){
    // casting into array of generic types
    elements = (T[]) new Object[size];
    this.size = size;
    this.topIndex = -1;  // constructing it here instead of in the above "protected" statement
  }

  @Override
  // `el` for element
  // in the interface it was `type` but here it's `el`. there's no need to update this in the interface
  public void push(T el) throws StackOverflowException {
    // add element `type` of type T on top of my stack
    // check if full. if yes, don't push. otherwise push.
    // below is a simplified way of pushing w/o any checks
    if(!this.isFull()) {
      topIndex++;
      elements[topIndex] = el;
    } else {
      throw new StackOverflowException("The stack is full!");
    }
    // elements[++topIndex] = el;  // this is a one liner code of the above
  }

  @Override
  public void pop() throws StackUnderflowException {
    if(!isEmpty()){
      // opposite order from push()
      elements[topIndex] = null;
      topIndex--;
    } else {
      throw new StackUnderflowException ("The stack is empty");
    }
  }

  @Override
  public T top() throws StackUnderflowException{
    if(!isEmpty()){
      return elements[topIndex];
    } else {
      throw new StackUnderflowException("The stack is empty");
    }
  }

  @Override
  public boolean isEmpty() {
    return (topIndex == -1);
  }

  @Override
  public boolean isFull() {
    return (topIndex == this.size - 1);
  }

}
