package assignment1.app;

import assignment1.stack.StackImplementation;
import assignment1.stack.StackInterface;
import assignment1.stack.StackOverflowException;
import assignment1.stack.StackUnderflowException;

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
  }
}
