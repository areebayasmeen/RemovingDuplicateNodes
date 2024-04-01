public class Removing_duplicates {
    Node head;
    void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node previous=head;
        Node cur = head.next;
        while (cur!=null) {
            previous=previous.next;
            cur=cur.next;
        }
        cur=newNode;
        previous.next=cur;

    }

    void display(){
        if(head == null){            System.out.println("List is empty");
            return;
        }
        Node cur = head;
        while (cur!=null){
            System.out.print(cur.data+ "->");
            cur = cur.next;

        }
    }
    void delete(int value) {
        while (head != null && head.data == value) {

         head = head.next;
        }
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            if (head == null) {
                return;
            }

            if (cur.data == value) {
                prev.next = cur.next;
                cur = cur.next;
            }
else{
            prev = cur;
            cur = cur.next;}
        }
    }
}
