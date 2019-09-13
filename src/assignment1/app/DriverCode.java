package assignment1.app;

import assignment1.stack.*;

public class DriverCode {
  public static void main (String[] args) throws StackOverflowException, StackUnderflowException {
    // create an instance of our implementation
    // need to define size of array
    // test every so often (debug). started off with size 10, but see if size 1 works.
    StackInterface<String> stack = new StackImplementation<String>(10);
    stack.push("A");
    System.out.println(stack.top());
    stack.push("B");
    System.out.println(stack.top());
    stack.pop();
    System.out.println(stack.top());

    StackInterface<Integer> stackArrayList = new StackImplementationArrayList<Integer>();
    stackArrayList.push(1);
    System.out.println(stackArrayList.top());
    stackArrayList.push(2);
    System.out.println(stackArrayList.top());
    stackArrayList.pop();
    System.out.println(stackArrayList.top());
  }
}
