package classActivity2A;

public class SinglyListEx {

    private ListNode head;

    private static class ListNode{
        private int data; // this represents the content of the list

        private ListNode next; // this is the pointer to the next node

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void displayList(){
        ListNode current = head;


        while(current != null){
            System.out.print(current.data + " ---> ");

            current = current.next;
        }
        System.out.println("null");
    }

    // class activity 2A1 - get the total length of the singly linked list
    public int displayLength(){
        if(head == null){
            return 0;
        }

        // first assign 0 to count
        // 20 ---> 10 ---> 15 ---> 5 ---> null
        int countList = 0;

        ListNode current = head;

        while(current != null){
            countList++;
            current = current.next;
        }
        return countList;
    }


    // class activity 2A2 - insert node at the beginning of a singly linked list
    public void insertNodeFirst(int value){
        ListNode newNodeValue = new ListNode(value);
        newNodeValue.next = head;
        head = newNodeValue;
    }

    // class activity 2A3 - insert node at the end of a singly linked list
    public void insertNodeAtLast(int value){
        ListNode newNodeValue = new ListNode(value);

        if(head == null){
            head = newNodeValue;
            return;
        }

        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }

        current.next = newNodeValue;
    }






    public static void main(String[] args) {
        SinglyListEx ll = new SinglyListEx();

//        ll.head = new ListNode(20);
//        ListNode second = new ListNode(10);
//        ListNode third = new ListNode(15);
//        ListNode fourth = new ListNode(5);

//        ll.head.next = second;
//        second.next = third;
//        third.next = fourth;


//        ll.insertNodeFirst(100);
//        ll.insertNodeFirst(200);
//        ll.insertNodeFirst(300);
//        ll.insertNodeFirst(400);


        ll.insertNodeAtLast(100);
        ll.insertNodeAtLast(200);
        ll.insertNodeAtLast(300);


        ll.displayList();

       // System.out.println("Total length is : " + ll.displayLength());
    }
}
