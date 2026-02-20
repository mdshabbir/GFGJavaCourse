package LinkdeLIst;

public class OddEvenLL extends LinkedLIstRevision {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Node head = new Node(arr[0]);
        head = createLinkedList(head,arr);
        head = OddEven(head);
        print(head);

    }
    public static Node OddEven(Node head) {
        Node temp = head;
        Node dummyNode1 = new Node(-1);
        Node dummyNode2 = new Node(0);
        Node curr1 = dummyNode1;
        Node curr2 = dummyNode2;
        int count = 1;
        while (temp != null){
            if(count % 2 == 0){
                Node oddNode = temp;
                curr1.next = oddNode;
                curr1 = curr1.next;
                temp = temp.next;
                count++;
            }
            else {
                Node evenNode = temp;
                curr2.next = evenNode;
                curr2 = curr2.next;
                temp = temp.next;
                count++;
            }
            if(temp == null) {
                System.out.println(curr1.data + " " + dummyNode2.data);
                curr2.next = dummyNode1.next;
            }

        }
        return  dummyNode1.next;
    }
}
