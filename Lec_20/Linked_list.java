package Lec_20;

public class Linked_list {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    Node root;
    public void display(){
        Node temp=root;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public int Size(){
        Node temp=root;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public int getFirst() throws Exception {
        if(Size()==0){
            throw new Exception("Linked list is empty");
        }
        return root.data;
    }
    public int getLast() throws Exception {
        if(Size()==0){
            throw new Exception("Linked list is empty");
        }
        Node temp=root;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp.data;
    }
    public int getIdx(int idx){
        Node temp=root;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public void addLast(int val){
        Node nn=new Node(val);
        if(Size()==0){
            root=nn;
        }
        else{
            Node temp=root;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
        }
    }
    public void addFirst(int val){

        Node nn=new Node(val);
//        if(Size()==0){
//            root=nn;
//        }
        nn.next=root;
        this.root=nn;
    }
    public int removeFirst(){
        Node temp=root;
        root=root.next;
        return temp.data;
    }
    public int removeLast(){
        Node temp=root;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node remove=temp.next;
        temp.next=null;
        return remove.data;
    }
    public int removeAt(int idx){
        if(idx==0){
            removeFirst();
        }
        if(idx==Size()-1){
            removeLast();
        }
        Node temp=root;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        Node remove=temp.next;
        temp.next=temp.next.next;
        return remove.data;
    }
}
