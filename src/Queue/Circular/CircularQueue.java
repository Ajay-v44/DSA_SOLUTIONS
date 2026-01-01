package Queue.Circular;

public class CircularQueue {
    private int size;
    private int rear;
    private int front;
    private int[] arr;
    private int maxSize;

    public CircularQueue(int maxSize) {
       this.arr=new int[maxSize];
       this.rear=-1;
       this.front=0;
       this.size=0;
       this.maxSize=maxSize;
    }

    public void enQueue(int ele){
        if(size==maxSize){
            System.out.println("Queue is full .");
            return;
        }
        rear=(rear+1)%maxSize;
        arr[rear]=ele;
        size++;
    }

    public  int deQueue(){
        if(size==0){
            System.out.println("Queue Is Empty");
            return -1;
        }
        front=(front+1)%maxSize;
        size--;
        return arr[front];
    }

    public void display(){
        if(size==0){
            System.out.println("Queue Is Empty");
            return ;
        }
        for (int i = 0; i <size ; i++) {
            System.out.printf("%d\t",arr[(front+i)%maxSize]);
        }
        System.out.println();
    }
}
