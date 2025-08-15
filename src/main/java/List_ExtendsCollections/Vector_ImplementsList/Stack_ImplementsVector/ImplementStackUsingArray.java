package List_ExtendsCollections.Vector_ImplementsList.Stack_ImplementsVector;

public class ImplementStackUsingArray {

    int size;
    int arr[];
    int top;

    ImplementStackUsingArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int element) {
        if (!isFull()) {
            top++;
            arr[top] = element;
            System.out.println("Pushed Element : " + element);
        } else {
            System.out.println("Stack is full now");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Poped element : " + arr[returnedTop]);
            return arr[returnedTop];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek() {
        if (!this.isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }


    public static void main(String[] args) {
        ImplementStackUsingArray stack = new ImplementStackUsingArray(10);
        stack.pop();

        System.out.println("____________");

        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        System.out.println("___________");
        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
    }


}
