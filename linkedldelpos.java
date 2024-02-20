public class linkedldelpos {
    Node head,tail;
    int size;

    public linkedldelpos(){
        head= tail = null;
        size=0;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void create(int data){
        Node n = new Node(data);
        if(head==null){
            tail = head = n;
        }
        else{
            tail.next= n;
            tail = n;
        }
    }
    public void print(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while (head!=null) {
                System.out.println(head.data);
                head = head.next;                
            }
        }
    }
    public void delpos(int pos){
        if(head==null)
            System.out.println("list is empty");
        else{
            if(pos>size)
                System.out.println("deletion not possible");
            else{
                Node temp = head;
                if(pos==1){
                    head = head.next;
                }
                else{
                    for(int i=1;i<pos-1;i++)
                        temp = temp.next;
                    temp.next = temp.next.next;
                }
            }
        }
    }
    public static void main(String args[]){
        linkedldelpos l = new linkedldelpos();
        l.create(1);
         l.create(2);
        // l.create(3);
        // l.create(4);
        l.print(l.head);
        System.out.println();
        l.delpos(2);
        l.print(l.head);
    }
}
