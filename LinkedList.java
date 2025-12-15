// class Node{
//     int data;
//     Node next;
//     Node(){

//     }
//     Node(int data){
//         this.data = data;
//     }
// }
// public class LinkedList{
//     static void display(Node head){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//     }
//     static void display(Node head){
//     for(Node temp=head; temp!=null; temp=temp.next){
//         System.out.print(temp.data+" ");
//     }
// }
// static void displayRecursive(Node head){
//     Node temp = head;
//     if( temp == null) return;
//     System.out.print(temp.data+" ");
//     displayRecursive(temp.next);
// }
// public static int get(Node head, int idx){
//     Node temp = head;
//     for(int i=1; i<=idx; i++){
//         temp = temp.next;
//     }
//     return temp.data;
// }
//     public static void main(String args[]){
//         Node y = new Node();
//         y.data = 99;
//         Node a = new Node(10);
//         Node b = new Node(11);
//         Node c = new Node(12);
//         Node d = new Node(13);
//         Node e = new Node(14);
//         y.next = a;
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         // System.out.println(a.data);
//         // System.out.println(a.next.data);
//         // System.out.println(a.next.next.data);
//         // System.out.println(a.next.next.next.data);
//         // System.out.println(a.next.next.next.next.data);
//         display(y);
//         displayRecursive(y);
//         System.out.println(get(y, 4));
//     }
// }

// class Node{  // userr define data type
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//     }
// }
// class Chain{  // user defined data structure
//     Node head;
//     Node tail;
//     int size;
//     void addAtTail(int data){
//         Node temp = new Node(data);
//         if(head==null) head = tail = temp;
//         else{
//         tail.next = temp;
//         tail = temp;
//         }
//         size ++;
//     }
//     void addAtHead(int data){
//         Node temp = new Node(data);
//         if(head==null) head = tail = temp;
//         else{
//         temp.next = head;
//         head = temp;
//         }
//         size ++;
//     }
//     void addAtIndex(int data, int idx){
//         if(idx < 0 || idx > size){
//             System.out.println("Invalid index");
//             return;
//         }
//         if(idx == 0) addAtHead(data);
//         else if(idx == size) addAtTail(data);
//         else{
//         Node temp = head;
//         for(int i=1; i<idx-1; i++){
//             temp = temp.next;
//         }
//         // yek node ke doo next nahi ho sakte par doo node ka next yek node ko point(connect) kar sakte hai
//         Node t = new Node(data);
//         t.next = temp.next; 
//         temp.next = t;
//         size ++;
//     }
//     }
//     boolean search(int data){
//         if(head==null) return false;
//         Node temp = head;
//         while(temp!=null){
//             if(temp.data == data) return true;
//             temp = temp.next;
//         }
//         return false;
//     }
//     int searchByIndex(int data){
//         if(head==null) return -1;
//         Node temp = head;
//         int idx = 0;
//         while(temp!=null){
//             if(temp.data == data) return idx;
//             temp = temp.next;
//             idx ++;
//         }
//         return -1;
//     }
//     int get(int idx){
//         Node temp = head;
//         for(int i=1; i<=idx; i++){
//             temp = temp.next;
//         }
//         return temp.data;
//     }
//     void deleteAtHead(){
//         if(head==null){
//             System.out.println("List is Empty");
//             return;
//         }
//         head = head.next;
//         if(head==null) tail = null;
//         size --;
//     }
//     void delete(int idx){
//         if(idx<0 || idx>=size){
//             System.out.println("Invalid index");
//             return;
//         }
//         if(idx == 0){
//             deleteAtHead();
//             return;
//         }
//         Node temp = head;
//         for(int i=1; i<=idx-1; i++){
//             temp = temp.next;
//         }
//         temp.next = temp.next.next;  // detete
//         if(idx == size-1) tail = temp; // we are deleting tail
//         size --;
//     }
//     void display(){
//         if(head==null) return;
//         else{
//             Node temp = head;
//             while(temp != null){
//                 System.out.print(temp.data+" ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//     }
//     int getElementFromLast1(int idx){
//         Node temp = head;
//         int length = 0;
//         while(temp!=null){
//             temp = temp.next;
//             length ++;
//         }
//         temp = head;
//         for(int i=1; i<length-idx+1; i++){
//             temp = temp.next;
//         }
//         return temp.data;
//     }
//     int getElementFromLast2(int idx){
//         Node fast = head;
//         Node slow = head;
//         for(int i=0; i<idx; i++){
//             fast = fast.next;
//         }
//         while(fast!=null){
//             if(fast==null) return -1;
//             fast = fast.next;
//             slow = slow.next;
//         }
//         return slow.data;
//     }
//     void deleteElementFromLast(int idx){
//         Node fast = head;
//         Node slow = head;
//         for(int i=1; i<=idx; i++){
//             fast = fast.next;
//         }
//         if(fast==null){
//             head = head.next;
//             return;
//         }
//         while(fast.next!=null){
//             fast = fast.next;
//             slow = slow.next;
//         }
//         slow.next = slow.next.next;
//     }
// }
// public class LinkedList{
//     public static void main(String[] args) {
//         Chain c = new Chain();
//         c.addAtTail(10);
//         c.addAtTail(11);
//         c.addAtTail(12);
//         c.addAtTail(13);
//         c.addAtTail(14);
//         c.display();
//         c.addAtHead(123);
//         c.display();
//         c.deleteAtHead();
//         c.addAtIndex(20,4);
//         c.display();
//         System.out.println(c.get(4));
//         c.delete(3);
//         c.display();
//         c.deleteElementFromLast(5);
//         c.display();
//         System.out.println(c.getElementFromLast1(3));
//         System.out.println(c.getElementFromLast2(4));
//         // System.out.println(c.size);
//         // System.out.println(c.search(92));
//         // System.out.println(c.searchByIndex(12));
//     }
// }