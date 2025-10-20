package Stack.LinkedList;

public class Stack {
    Node head=null;
    int top=-1;
    int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
    }


    private boolean isEmpty(){
        return top==-1;
    }
    public  void push(int data){
        if (top==maxSize-1){
            System.out.println("Stack OverFlow");
            return;
        }
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
        top++;
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("Stack UnderFlow");
            return;
        }
        if(head.next==null)
            head=null;
        else
            head=head.next;
        top--;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack UnderFlow");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

