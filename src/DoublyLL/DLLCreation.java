//package DoublyLL;
//
//public class DLLCreation {
//    public static void main(String[] args) {
//        int [] arr = {12,23,54,25,43,53,25,45};
//
//        Node head = convertDLL(arr);
////        printDLL(head);
////        head = deletfirsDLL(head);
////        head = deletlastDLL(head);
////        head = deletKthDLL(head,8);
////         head = deleteNode(head,45);
//         head = insertHead(head);
//        printDLL(head);
//    }
//    private static Node insertatTail(Node head){
//
//        return head;
//    }
//    private static Node insertHead(Node head){
//        Node prev = head;
//        Node n1 = new  Node(60);
//        n1.back=null;
//        n1.next = prev;
//        prev.back = n1;
//        head = n1;
//        return head;
//    }
//    private  static  Node convertDLL(int[] arr){
//        Node head = new Node(arr[0]);
//        Node prev = head;
//        for(int i=1; i<arr.length; i++){
//            Node  temp = new Node(arr[i],null,prev);
//            prev.next = temp;
//            prev = temp;
//        }
//        return  head;
//    }
//    private static void printDLL(Node head){
//        while(head !=null){
//            System.out.println(head.data);
//            head=head.next;
//        }
//
//    }
//    private static int Count(Node head){
//        int count =1;
//        Node temp = head;
//        while (temp.next !=null){
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }
//    private  static Node deleteNode(Node head,int val){
//        Node prev = head;
//        Node temp = prev.next;
//        Node forward = temp.next;
//        int count = 1;
//        int length = Count(head);
//        System.out.println(length);
//        if(prev == null || prev.next==null){
//            return  null;
//        } else if (prev.data==val) {
//            return head = deletfirsDLL(head);
//
//        }
////        else if(k==1){
////            return head = deletfirsDLL(head);
////        }
////        else if(k==length){
////            return  head = deletlastDLL(head);
////        }
//        while (temp.next !=null){
//            count++;
//            if(temp.data == val){
//                break;
//            }
//            prev = prev.next;
//            temp = temp.next;
//            forward = forward.next;
//        }
//        prev.next = forward;
//        forward.back = prev;
//        return  head;
//    }
//    private  static  Node deletKthDLL(Node head,int k){
//        Node prev = head;
//        Node temp = prev.next;
//        Node forward = temp.next;
//        int count = 1;
//        int length = Count(head);
//        System.out.println(length);
//        if(prev == null || prev.next==null){
//            return  null;
//        }
//        else if(k==1){
//            return head = deletfirsDLL(head);
//        }
//        else if(k==length){
//            return  head = deletlastDLL(head);
//        }
//        while (temp.next !=null && k!=length){
//            count++;
//            if(k==count){
//                break;
//            }
//            prev = prev.next;
//            temp = temp.next;
//            forward = forward.next;
//        }
//        prev.next = forward;
//        forward.back = prev;
//        return  head;
//    }
//    private static Node deletfirsDLL(Node head){
//        Node prev = head;
//        Node temp = prev.next;
//        prev.next = null;
//        temp.back = null;
//
//
//        return temp;
//    }
//    private  static Node deletlastDLL(Node head){
//        Node prev = head;
//        Node temp = prev.next;
//        while (temp.next != null){
//            temp = temp.next;
//            prev = prev.next;
//        }
//        temp.back =null;
//        prev.next = null;
//        return head;
//    }
//}
//class  Node {
//    int data;
//    Node next;
//    Node back;
//    Node perv;
//    Node(int data ,Node next1 , Node back1 ){
//        this.data=data;
//        this.next = next1;
//        this.back = back1;
//
//    }
//    Node (int data){
//        this.data=data;
//        this.next=null;
//        this.back=null;
//    }
//}