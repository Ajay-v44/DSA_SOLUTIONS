package LinkedList;

public class LikedListOps {
    Node head = null;

    //    Insert At Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //    Insert At End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //    Insert At A Particular Position
    public void insertAtParticularPosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (position==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        int index = 0;
        Node temp = head;
        while (temp.next != null) {
            if (index == (position - 1))
                break;
            temp = temp.next;
            index++;
        }
        if(temp.next==null){
            System.out.println("out of bound");
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //    Print Linked List
    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            if (temp.next == null)
                System.out.printf("%d \n",temp.data);
            else
                System.out.printf(" %d => ", temp.data);
            temp = temp.next;

        }
    }


//    Delete Element
    public void deleteNode(int position) throws NullPointerException{
        if(head==null){
            System.out.println("LinkedList Is Empty");
            return;
        }
        if(position==0){
            head=head.next;
            return;
        }
        Node temp=head;
        int index=0;
        while (temp!=null&&index<position-1){
            temp=temp.next;
            index++;
        }
        if(temp==null||temp.next==null){
            System.out.println("Out Of Bound");
            return;
        }
        temp.next=temp.next.next;

    }

//    Search Node
    public void searchNode(int data){
        if(head==null) {
            System.out.println("The LikedList Is Empty");
            return;
        }
        if(head.data==data) {
            System.out.println("Data Found At  Head");
            return;
        }
        Node temp=head.next;
        while (temp!=null){
            if(temp.data==data){
                System.out.println("Data Found");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Not Found In Linked List");
    }
}
