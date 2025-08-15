package Queue_ExtendsCollections;

public class QueueImp {

    int capacity;
    int queueArr[];
    int front;
    int rear;
    int currentSize;

    public QueueImp (int sizeOfQueue) {
        this.capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        queueArr = new int[this.capacity];
    }

//    This Method is used to add element in the qu

    public void enQueue (int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
        }
        else {
            rear++;
            if (rear == capacity-1) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println("data" + "added in the Queue");
        }
    }

//    This Method is used to remove the element from the front of the queue.

    public void deQueue () {
        if (isEmpty()) {
            System.out.println("Queue is Empty, can not delete an element");
        }
        else {
            front++;
            if (front == capacity-1) {
                System.out.println(queueArr[front-1] + " removed from the queue");
                front = 0;
            }
            else {
                System.out.println(queueArr[front-1] + " removed from the queue");
            }
            currentSize--;
        }
    }

    public boolean isFull() {
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }

    public boolean isEmpty () {
        if (currentSize == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        QueueImp obj = new QueueImp(20);
    }


}
