// import java.util.Stack;
// public class BasicOfStack {
//     public static void pushAtBottom(Stack<String> st, String ele){
//         if(st.size() == 0){
//             st.push(ele);
//             return;
//         }
//         String top = st.pop();
//         pushAtBottom(st, ele);
//         st.push(top);
//     }
//     public static void reverse(Stack<String> st){
//         if(st.size() <=1) return;
//         String top = st.pop();
//         reverse(st);
//         pushAtBottom(st, top);
//     }
//     public static void main(String[] args) {
//         Stack<String>st = new Stack<>();
        // System.out.println(st.isEmpty());
        // System.out.println(st.size()==0);
        // st.pop(); // underflow
        // st.push("Ayush");
        // st.push("Yuvika");
        // st.push("Ayuvi");
        // st.push("Dheeraj");
        // st.push("Raj");
        // System.out.println(st);
        // pushAtBottom(st, "ayudhee");
        // System.out.println(st);
        // reverse(st);
        // System.out.println(st);
        // System.out.println(st.size());
        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st);
        // Stack<String>st1 = new Stack<>();
        // while(st.size() != 0){
        //     st1.push(st.pop());
        // }
        // System.out.println(st1);
        // while(st1.size() != 0){
        //     st.push(st1.pop());
        // }
        // System.out.println(st);
        // traversing the Stack
        // Stack<String>st2 = new Stack<>();
        // while(st.size() > 0){
        //     String top = st.pop();
        //     System.out.println(top);
        //     st2.push(top);
        // }
        // while(st2.size() > 0){
        //     st.push(st2.pop());
        // }
        // System.out.println(st);
        // Get element
        // Stack<String> st2 = new Stack<>();
        // int idx = 3;
        // while(st.size() > idx+1){
        //     st2.push(st.pop());
        // }
        // System.out.println(st.peek());
        // while(st2.size() > 0){
        //     st.push(st2.pop());
        // }
        // System.out.println(st);
        // Add element at any index
        // Stack<String> st2 = new Stack<>();
        // int idx = 3;
        // while(st.size() > idx){
        //     st2.push(st.pop());
        // }
        // st.push("Ayuveer");
        // while(st2.size() > 0){
        //     st.push(st2.pop());
        // }
        // System.out.println(st);
        // remove element at any index
        // Stack<String>st2 = new Stack<>();
        // int idx = 3;
        // while(st.size() > idx+1){
        //     st2.push(st.pop());
        // }
        // st.pop();
        // while(st2.size() > 0){
        //     st.push(st2.pop());
        // }
        // System.out.println(st);
        // reverse element using 3 stack
        // Stack<String>st1 = new Stack<>();
        // Stack<String>st2 = new Stack<>();
        // while(st.size() > 0){
        //     st1.push(st.pop());
        // }
        // while(st1.size() > 0){
        //     st2.push(st1.pop());
        // }
        // while(st2.size() > 0){
        //     st.push(st2.pop());
        // }
        // System.out.println(st);
//     }
// }


// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//     }
// }
// class myStack{
//     Node head;
//     int len;
//     int peek() throws Exception{
//         if(head == null){
//             throw new Exception("Ayush doesn't forget, Stack is empty");
//         }
//         return head.data;
//     }
//     int pop(){
//         if(head == null){
//             System.out.println("Stack is Empty!");
//             return -1;
//         }
//         int x = head.data;
//         head = head.next;
//         len --;
//         return x;
//     }
//     void push(int ele){
//         Node temp = new Node(ele);
//         if(len == 0) head = temp;
//         else{
//         temp.next = head;
//         head = temp;
//         }
//         len ++;
//     }
//     int size(){
//         return len;
//     }
//     void display(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }
// public class BasicOfStack{
//     public static void main(String[] args) throws Exception {
//         myStack st = new myStack();
//         st.peek();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.push(50);
//         st.display();
//         System.out.println(st.peek());
//         st.pop();
//         st.display();
//     }
// }

// Parentheses checker
// import java.util.Scanner;
// import java.util.Stack;
// public class BasicOfStack{
//         public static boolean sameStyle(char a, char b){
//                 if(a=='(' && b==')') return true;
//                 if(a=='{' && b=='}') return true;
//                 if(a=='[' && b==']') return true;
//                 else return false;
//         }
//         public static boolean isblanced(String s){
//                 int n = s.length();
//                 if(n % 2 != 0) return false;
//         Stack<Character> st = new Stack<>();
//         for(int i=0; i<s.length(); i++){
//                 char c = s.charAt(i);
//                 if(c == '(' || c == '{' || c == '['){
//                         st.push(c);
//                 }else{
//                         if(st.size() == 0) return false;
//                         char top = st.peek();
//                         if(sameStyle(top, c)) st.pop();
//                         else return false;
//                 }
//         }
//         return (st.size() == 0);
// }
//     public static void main(String[] args) {
//         System.out.println("Enter the string  : ");
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         boolean result = isblanced(s);
//         System.out.println(result);
//     }
// }
        

// Remove consecutive characters
// import java.util.Scanner;
// import java.util.Stack;
// public class BasicOfStack{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         Stack<Character> st = new Stack<>();
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(st.size() == 0){
//                 st.push(ch);
//             }else{
//                 if(st.peek() == ch){
//                    ch ++;
//                 }else{
//                    st.push(ch);
//                 }
//             }
//         }
//         System.out.println(st);
//     }     
// }

// import java.util.Stack;
// public class BasicOfStack{
//         public int calPoints(String[] arr){
//            int n = arr.length;
//            Stack<Integer> st = new Stack<>();
//            for(int i=0; i<n; i++){
//                 String s = arr[i];
//                 if(s.equals("C")) st.pop();
//                 else if(s.equals("D")) st.push(st.peek() * 2);
//                 else if(s.equals("+")){
//                     int top = st.pop();
//                     int secondTop = st.peek();
//                     int sum = top + secondTop;
//                     st.push(top);
//                     st.push(sum);
//                 }else{
//                     st.push(Integer.parseInt(s));
//                 }
//            }
//            int sum = 0;
//            while(st.size() > 0){
//                 sum += st.pop();
//            }
//            return sum;
//         }
//     public static void main(String[] args) {
//     }
// }

// public class BasicOfStack{
//     public static void main(String[] args) {
//         int[] arr = {1,8,3,5,2,1,6,4};
//         int[] res = new int[arr.length];
//         for(int i=0; i<arr.length; i++){
//                 res[i] = -1;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[j]> arr[i]){
//                     res[i] = arr[j];
//                     break;
//                 }
//             }
//         }
//         for(int i=0; i<arr.length; i++){
//                 System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//         for(int j=0; j<arr.length; j++){
//                 System.out.print(res[j]+" ");
//         }
//     }
// }

// Stock span problem
// import java.util.Stack;
// import java.util.ArrayList;
// public class BasicOfStack{
//     public static ArrayList<Integer> calculateSpan(int[] arr){
//         int n = arr.length;
//         int[] span = new int[n];
//         span[0] = 1;
//         Stack<Integer> st = new Stack<>();
//         st.push(0);
//         for(int i=1; i<n; i++){
//             while(st.size()>0 && arr[st.peek()]<=arr[i]) st.pop();
//             if(st.size()==0) span[i] = i-(-1);
//             else span[i] = i - st.peek();
//             st.push(i);
//         }
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i=0; i<n; i++){
//             ans.add(span[i]);
//         }
//         return ans;
//     }
// }

// Spock span problem
// import java.util.Stack;
// import java.util.ArrayList;
// class pair{
//     int val;
//     int idx;
//     pair(int val, int idx){
//         this.val = val;
//         this.idx = idx;
//     }
// }
// public class BasicOfStack{
//     public static ArrayList<Integer> calculateSpan(int[] arr){
//         int n = arr.length;
//         int[] span = new int[n];
//         span[0] = 1;
//         Stack<pair> st = new Stack<>();
//         st.push(new pair(arr[0],0));
//         for(int i=1; i<n; i++){
//             while(st.size()>0 && st.peek().val<=arr[i]) st.pop();
//             if(st.size()==0) span[i] = i-(-1);
//             else span[i] = i - st.peek().idx;
//             st.push(new pair(arr[i],i));
//         }
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i=0; i<n; i++){
//             ans.add(span[i]);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//     }
// }

// import java.util.Stack;
// public class BasicOfStack{
//     public static int[] nextGreaterElement(int[] arr){
//         int n = arr.length;
//         int[] nge = new int[n];
//         nge[n-1] = 0;
//         Stack<Integer> st = new Stack<>();
//         st.push(arr[n-1]);
//         for(int i=n-2; i>=0; i--){
//             while(st.size()>0 && arr[i]>=st.peek()){
//                 st.pop();
//             }
//             if(st.size()==0){
//                 nge[i] = 0;
//             }else{
//                 nge[i] = st.peek();
//             }
//             st.push(arr[i]);
//         }
//         return nge;
//     }
//     public static void main(String[] args) {
//       int arr[] = {1,8,3,5,2,1,6,4};
//       for(int i=0; i<arr.length; i++){
//         System.out.print(arr[i]+" ");
//       }
//       System.out.println();
//         int res[] = nextGreaterElement(arr);
//         for(int i=0; i<arr.length; i++){
//             System.out.print(res[i]+" ");
//         }
//     }
// }

// celebrity problem
// import java.util.Stack;
// public class BasicOfStack{
//     public static int celebrity(int arr[][]){
//         int n = arr.length;
//         Stack<Integer> st = new Stack<>();
//         for(int i=0; i<n; i++){
//                 st.push(i);
//         }
//         while(st.size() > 1){
//             int a = st.pop();
//             int b = st.pop();
//             boolean aFlag = true, bFlag = true;
//             if(arr[a][b] == 1){  // a to celeb nahi hua
//                 aFlag = false;
//             }else{  // arr[a][b] == 0 => b celeb nahi hua
//                 bFlag = false;
//             }
//             if(arr[b][a] == 1){  // b to celeb nahi hua
//                 bFlag = false;
//             }
//             else{  // arr[b][a] == 0 => a celeb nahi hua
//                 aFlag = false;
//             }
//             if(aFlag) st.push(a);
//             if(bFlag) st.push(b);
//         }
//         if(st.size()==0) return -1;
//         int celeb = st.pop();
//         for(int j=0; j<n; j++){
//             if(j==celeb) continue;
//             if(arr[celeb][j]==1) return -1;
//         }
//         for(int i=0; i<n; i++){
//             if(i==celeb) continue;
//             if(arr[i][celeb]==0) return -1;
//         }
//         return celeb;
//     }
//     public static void main(String[] args) {
//     }
// }