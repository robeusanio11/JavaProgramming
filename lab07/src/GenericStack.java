public class GenericStack<E> extends java.util.ArrayList<E> {

  public int getSize() {
    return this.size();
  }

  public E peek() {
    return this.get(getSize() - 1);
  }

  public void push(E o) {
    this.add(o);
  }

  public E pop() {
    E o = this.get(getSize() - 1);
    this.remove(getSize() - 1);
    return o;
  }

  public boolean isEmpty() {
    return this.isEmpty();
  }

  @Override
  public String toString() {
    return "stack: " + super.toString();
  }
}