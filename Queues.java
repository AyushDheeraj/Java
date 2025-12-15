// import java.util.Queue;
// import java.util.LinkedList;
// import java.util.ArrayDeque;
// import java.util.Stack;
// public class Queues{
//     private static void AddAtIndex(Queue<Integer> q, int idx, int val){
//         if(idx<0 || idx>q.size()){
//             System.out.println("Invalid index!");
//             return;
//         }
//         int n = q.size();
//         for(int i=1; i<=idx; i++){
//             q.add(q.remove());
//         }
//         q.add(val);
//         for(int i=1; i<=n-idx; i++){
//             q.add(q.remove());
//         }
//     }
//     private static int get(Queue<Integer> q, int idx){
//         int n = q.size();
//         for(int i=1; i<=idx; i++){
//             q.add(q.remove());
//         }
//         int x = q.peek();
//         for(int i=1; i<n-idx; i++){
//             q.add(q.remove());
//         }
//         return x;
//     }
//     private static int remove(Queue<Integer> q, int idx){
//         int n = q.size();
//         for(int i=0; i<=idx; i++){
//             q.add(q.remove());
//         }
//         int x = q.remove();
//         for(int i=1; i<=n-idx-1; i++){
//             q.add(q.remove());
//         }
//         return x;
//     }
//     private static void reverse(Queue<Integer> q){
//         Stack<Integer> st = new Stack<>();
//         while(q.size()!=0){
//             st.push(q.remove());
//         }
//         while(st.size()!=0){
//             System.out.print(st.peek()+" ");
//             q.add(st.pop());
//         }
//         System.out.println();
//     }
//     private static void reverseFirstKElement(Queue<Integer> q, int idx){
//         Stack<Integer> st = new Stack<>();
//         int n = q.size();
//         for(int i=1; i<=idx; i++){
//             st.push(q.remove());
//         }
//         while(st.size()!=0){
//             q.add(st.pop());
//         }
//         for(int i=1; i<n-idx+1; i++){
//             q.add(q.remove());
//         }
//     }
//     private static void display(Queue<Integer> q){
//         for(int i=0; i<q.size(); i++){
//             System.out.print(q.peek()+" ");
//             q.add(q.poll());
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         // Queue<Integer> q = new LinkedList<>();
//         Queue<Integer> q = new ArrayDeque<>();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         q.add(50);
//         System.out.println(q);
//         display(q);
//         reverseFirstKElement(q, 4);
//         display(q);
//         // reverse(q);
//         // AddAtIndex(q,3,99);
//         // display(q);
//         // int ans = get(q,2);
//         // System.out.println(ans);
//         // remove(q, 3);
//         // display(q);
//         // System.out.println(q.peek());
//         // System.out.println(q.poll());
//         // System.out.println(q);
//         // System.out.println(q.size());
//         // q.remove(50);
//         // System.out.println(q);
//     }
// }

// implementation of queue through linkedList
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//     }
// }
// class MyQueue{
//     Node head;
//     Node tail;
//     int size;
//     int remove(){
//         if(size==0){
//             System.out.println("Queue is Empty! ");
//             return -1;
//         }
//         int front = head.data;
//         head = head.next;
//         size --;
//         return front;
//     }
//     int peek(){
//         if(size==0){
//             System.out.println("Queue is Empty!");
//             return -1;
//         }
//         return head.data;
//     }
//     void add(int data){
//         Node temp = new Node(data);
//         if(size==0) head = tail = temp;
//         else{
//         tail.next = temp;
//         tail = temp;
//         }
//         size ++;
//     }
//     void display(){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }
// public class Queues{
//     public static void main(String[] args) {
//         MyQueue mq = new MyQueue();
//         mq.add(11);
//         mq.add(12);
//         mq.add(13);
//         mq.add(14);
//         mq.add(15);
//         mq.display();
//         System.out.println(mq.peek());
//         System.out.println(mq.remove());
//         mq.display();
//     }
// }

// Implementation of queue through Array
// class CircularQueue{
//      int[] arr;
//      int f;
//      int r;
//      int size;
//      CircularQueue(int capacity){
//           arr = new int[capacity];
//      }
//      void add(int data){
//           if(size==arr.length){
//                System.out.println("Queue is Full!");
//                return;
//           }
//           arr[r++] = data;
//           if(r==arr.length) r=0;
//           size++;
//      }
//      int remove(){
//           if(size==0){
//                System.out.println("Queue is Empty!");
//                return -1;
//           }
//           int fontData = arr[f];
//           f++;
//           if(f==arr.length) f=0;
//           size --;
//           return fontData;
//      }
//      int peek(){
//           if(size==0){
//                System.out.println("Queue is Empty");
//                return -1;
//           }
//           return arr[f];
//      }
//      void display(){
//           if(size==0) return;
//           if(f>=r){
//                for(int i=f; i<arr.length; i++){
//                     System.out.print(arr[i]+" ");
//                }
//                for(int i=0; i<r; i++){
//                     System.out.print(arr[i]+" ");
//                }
//           }else{
//                for(int i=f; i<r; i++){
//                     System.out.print(arr[i]+" ");
//                }
//           }
//           System.out.println();
//      }
// }
// public class Queues{
//      public static void main(String[] args) {
//           CircularQueue q = new CircularQueue(4);
//           q.add(10);
//           q.add(20);
//           q.add(30);
//           q.add(40);
//           q.display();
//           q.remove();
//           System.out.println(q.remove());
//           q.display();
//           q.add(50);
//           q.add(60);
//           q.display();
//           int[] a = q.arr;
//           for(int ele : a) System.out.print(ele+" ");
//      }
// }

// import java.util.Queue;
// import java.util.ArrayList;
// public static int[] firstNegativeInEveryWindowOfSizeK(int arr[], int k){
//     List<Integer> ans = new ArrayList<>();
//     int n = arr.length;
//     Queue<Integer> q = new LinkedList<>();
//     for(int i=0; i<n; i++){
//         if(arr[i]>0) q.add(i);
//     }
//     for(int i=0; i<n-k+1; i++){
//         while(q.size()>0 && q.peek()<i)q.remove();
//         if(q.size()>0 && q.peek()<=i+k-1) ans.add(arr[q.peek()]);
//         else ans.add(0);
//     }
//     return List<Integer> ans;
// }
// public class Queues{
//     public static void main(String[] args) {
//     }
// }