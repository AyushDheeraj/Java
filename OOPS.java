// import java.util.*;
// public class OOPS {
//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 StringBuilder sb = new StringBuilder(sc.nextLine());
//                 System.out.println(sb);
//     }
// }

// //  class Student{  // khud ka data type bana liya hai = class
// //         String name;
// //         int rno;
// //         double cgpa;
// //     }
// public class OOPS {
//      public static class Student{  // khud ka data type bana liya hai = class
//         String name;
//         int rno;
//         double cgpa;
//         void solution(){
//             System.out.println(name+" "+rno+" "+cgpa);
//         }
//         void print(){
//             System.out.println(name+" "+rno+" "+cgpa);
//         }
//     }
//     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Student s1 = new Student();  // declaration = object
        // System.out.println("Enter your name ");
        // s1.name = sc.nextLine();
        // System.out.println("Enter your roll no : ");
        // s1.rno = sc.nextInt();
        // System.out.println("Enter your cgpa");
        // s1.cgpa = sc.nextDouble();
//         Student s2 = new Student();  // declaration
//         s2.name = "Ayush";
//         s2.rno = 50;
//         s2.cgpa = 8.9;
//         System.out.println(s1.name +" "+s1.rno+" "+s1.cgpa);
//         System.out.println(s2.name+" "+s2.rno+" "+s2.cgpa);
//         s1.cgpa = 9.9;
//         System.out.println(s1.cgpa);
//         s1.solution();
//         s2.print();
//     }
// }

// public class OOPS{
//     public static class Car {
//         int seats;
//         String name;
//         double length;
//         String type;
//         int torque;
//         void print(){
//             // System.out.println(seats+" "+name+" "+length+" "+type+" "+torque);
//         }
//     }
//     private static void change(Car x ){ // oops are pass by reference
//         x.seats = 4;
//         System.out.println(x.seats);
//     } 
//     public static void main(String[] args) {
//         Car c = new Car();
//         c.seats = 5;
//         c.length = 3.99;
//         c.name = "Kia Sonet";
//         c.torque = 178;
//         c.type = "SUV";
//         System.out.println(c.seats);
//         change(c);
//         System.out.println(c.seats);
//         // c.print();
//     }
// }

// polymorphism = yek name multiple kaam
// public class OOPS {
//     public static class Dog{
//         void speak(){
//             System.out.println("Bark");
//         }
//     }
//     public static class Cat{
//         void speak(){
//             System.out.println("Mew mew");
//         }
//     }
//     public static class Lion{
//         void speak(){
//             System.out.println("Roar");
//         }
//     }
//     public static class Pikachu{
//         void speak(){
//             System.out.println("Pika pika");
//         }
//     }
//     public static class Human{
//         void speak(){
//             System.out.println("Hello");
//         }
//     }
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         Cat c = new Cat();
//         Lion l = new Lion();
//         Pikachu p = new Pikachu();
//         Human h = new Human();
//         d.speak();
//         c.speak();
//         l.speak();
//         p.speak();
//         h.speak();
//     }
// }

// private property
// class Student{
//         String name; // null
//          private int rno = 42; // 0
//         double cgpa; // 0.0
//         // void print(){  // getter
//         //     System.out.println(name+" "+cgpa+" "+rno);
//         // }
//         int getRno(){   //getter
//             return rno;
//         }
//         void setRno(int x){       // setter
//             rno = x;
//         }
//         void print2(){
//             System.out.println(name+" "+rno+" "+cgpa+" ");
//         }
//         private void print(){
//             System.out.println(name+" "+rno+" "+cgpa+" ");
//         }
//         public void p(){
//             print();
//         }
//     }
// public class OOPS{
//     // public static class Student{
//     //     String name; // null
//     //      private int rno; // 0
//     //     double cgpa; // 0.0
//     // }
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         System.out.println(s1.name);
//         // s1.print();
//         System.out.println(s1.getRno());
//         // s1.rno = 50; //giving error
//         // s1.setRno(50);
//         // s1.print2();
//         // s1.p();
//         // s1.name = "Ayush";
//         // s1.cgpa = 9.7;
//         // s1.p();
//         Student s2 = new Student();
//         s2.p();
//     }
// }

// Constructors
// public class OOPS{
//         public static class Car{
//             int seats;  // 0
//             String name; // null
//             double length; // 0.0
//              Car(){  // default constractor

//         }
//         // Car(int x, String s, double d){  // parameterise constructor
//         //         seats = x;
//         //         name = s;
//         //         length = d;
//         // }
//         Car(int seats, String name, double length){  // parameterise constructor
//                 this.seats = seats;
//                 this.name = name;
//                 this.length = length;
//         }
//         void print(){
//                 int seats = 90;
//                 System.out.println(this.seats+" "+name+" "+length);
//         }
//         }
//         public static void main(String[] args){
//         Car c1 = new Car(5,"kin Sonet",3.7);
//         c1.print();
//         Car c2 = new Car(4,"Lord Alto",3.75);
//         c2.print();
//         Car c3 = new Car();
//         c3.name = "Honda Amaze";
//         System.out.println(c3.name);
//         Car c4 = c3; // c4 is shallow copy of c3 (can control)
//         c4.name = "Ayuvi";
//         System.out.println(c3.name);
//         final int x = 89;  // x can't be changed
//         System.out.println(x);
//     }
// }

// // import java.util.Arrays;
// // public class OOPS{
// //         public static class StudentData{
// //                 String name;
// //                 int rno;
// //                 int[] marks;
// //                 // StudentData(int s){  // constractor
// //                 //         marks = new int[s];
// //                 // }
// //                 // StudentData(int[] s){
// //                 //         marks = s;
// //                 // }
// //                 StudentData(int[] s ){
// //                         marks = Arrays.copyOf(s, s.length);   // deep copy
// //                 }
// //         }
// //         public static void main(String[] args) {
// //                 int[] arr = {12,13,14,15};
// //                 StudentData st = new StudentData(arr);
// //                 System.out.println(arr[0]);
// //                 st.marks[0] = 40;
// //                 System.out.println(arr[0]);
// //                 // StudentData s1 = new StudentData(4);
// //                 // StudentData s2 = new StudentData(2);
// //                 // s1.marks[0] = 89;
// //                 // s1.marks[1] = 93;
// //                 // s1.marks[2] = 99;
// //                 // s1.marks[3] = 97;
// //                 // s2.marks[1] = 88;
// //         }
// // }

// class Cricketer{
// //     static String country = "NZ";  // sharable variable and can be change by any variable
//         final String country = "India";  // sharable variable and can't change by any variable
//         int run;
//         String name;
//         double avg;  
//         void print(){
//             System.out.println(run+" "+name+" "+avg);
//         }
//         static void greet(){
//             System.out.println("I only belive on GOD");
//         }
// }
// public class OOPS{   
// public static void main(String[] args) {
//     Cricketer.greet();
// //     System.out.println(Cricketer.country);
//     Cricketer c1 = new Cricketer();
//     System.out.println(c1.country);
//     Cricketer c2 = new Cricketer();
//     // System.out.println(c2.country); 
// //     c1.country = "England";  // error
//     System.out.println(c2.country);    
//     // fun();
//     c1.print();
//     c2.print();
//     c2.greet();
//     // Cricketer.greet();
// }
//     private void fun(){  // give error because it is not shareable
//         System.out.println("Hello");
//     }   
// }

//  class complexNumber{
//         double x;
//         double y;
//         complexNumber(){};
//         complexNumber(double x, double y){
//                 this.x = x;
//                 this.y = y;
//         }
//         void print(){
//                 if (y>=0)  System.out.println(x + " + "+y+"i");
//                 else System.out.println(x+" - "+(-y)+"i");
//         }
//         void add(complexNumber z){
//                 x += z.x;
//                 y += z.y;
//         }
//         void substract(complexNumber z){
//                 x -= z.x;
//                 y -= z.y;
//         }
//         void multiple(complexNumber z){
//                 double tempX = x;
//                 double tempY = y;
//                 x = tempX*z.x - tempY*z.y;
//                 y = tempX*z.y + tempY*z.x;
//         }
//         void divide(complexNumber z){
//                 double tempX = x;
//                 double tempY = y;
//                 x = (tempX*z.x - tempY*z.y) / ((tempX* tempX)+(tempY* tempY));
//                 y = (tempX*z.y + tempY*z.x) / ((tempX* tempX)+(tempY* tempY));
//         }
//  }
// public class OOPS{
//         public static void main(String[] args) {
//                 complexNumber z1 = new complexNumber(3,-1);
//                 complexNumber z2 = new complexNumber(2,-2);
//                 z1.print();
//                 z2.print();
//                 // z1.add(z2);
//                 // z1.print();
//                 // z1.substract(z2);
//                 // z1.print();
//                 // z2.multiple(z1);
//                 // z2.print();
//                 z2.divide(z1);
//                 z2.print();
//         }
// }

// class fraction{
//         int num;
//         int den;
//         fraction(int num, int den){
//                 this.num = num;
//                 this.den = den;
//         }
//         void print(){
//                 simplify();
//                 System.out.println(num +"/"+ den);
//         }
//         void add(fraction f){
//                 int N = num;
//                 int D = den;
//                 num = N * f.den + D * f.num;
//                 den = D * f.den;
//                 simplify();
//         }
//         void substract(fraction f){
//                 int N = num;
//                 int D = den;
//                 num = N * f.den - D * f.num;
//                 den = D * f.den;
//                 simplify();
//         }
//         void multiple(fraction f){
//                 int N = num;
//                 int D = den;
//                 num = N * f.num;
//                 den = D * f.den;
//                 simplify();
//         }
//         void divide(fraction f){
//                 int N = num;
//                 int D = den;
//                 num = N * f.den;
//                 den = D * f.num;
//                 simplify();
//         }
//         void simplify(){
//                 boolean isNegative = (num * den < 0) ? true : false;
//                 num = Math.abs(num);
//                 den = Math.abs(den);
//                 int gcd = hcf(num, den);
//                 num = num / gcd;
//                 den = den / gcd;
//                 if (isNegative) num = -num;
//         }
//         int hcf(int a, int b){
//                 if(a==0) return b;
//                 return hcf(b%a, a);
//         }
// }
// public class OOPS{
//         public static void main(String[] args) {
//                 fraction f1 = new fraction(7,3);
//                 f1.print();
//                 fraction f2 = new fraction(-50,-100);
//                 f2.print();
//                 f1.add(f2);
//                 f1.print();
//                 // f1.substract(f2);
//                 // f1.print();
//                 // f1.multiple(f2);
//                 // f1.print();
//                 // f1.divide(f2);
//                 // f1.print();
//         }
// }

// inheritaance
// class pokemon{
//         int power;
//         String type;
//         pokemon(){};
//         pokemon(String type, int power){
//                 this.power = power;
//                 this.type = type;
//         }
//         void print(){
//                 System.out.println(this.power+" "+this.type);
//         }
// }
// class StrongPokemon extends pokemon{
//         int speed;
// }
// class LegendaryPokemon extends pokemon{
//         String ability;
// }
// class GodPokemon extends LegendaryPokemon{
//         char tag;
// }
// public class OOPS{
//         public static void main(String[] args) {
//                 LegendaryPokemon mewtwo = new LegendaryPokemon();
//                 mewtwo.ability = "Pressure";
//                 GodPokemon dialga = new GodPokemon();
//                 dialga.ability = "Pressure";
//         }
// }

// ArrayList
// class ArrayList{  //user define data stracture 
//         int[] arr;
//         int idx;
//         int size;
//         ArrayList(int capacity){  // constractor
//                 arr = new int[capacity];
//         }
//         void add(int ele){
//                 if(idx == arr.length){   // array is full
//                         capacityIncrease();
//                 }
//                 arr[idx++] = ele;
//                 size ++;
//         }
//         void removeFromEnd(){
//                 idx --;
//                 size --;
//         }
//         void remove(int index){
//                 for (int i = index; i < size - 1; i++) {
//                         arr[i] = arr[i + 1];
//                 }
//                 size--;
//         }
//         void add(int index, int val){
//                 for(int i=size-1; i >= index; i--){
//                         arr[i+1] = arr[i];
//                 }
//                 arr[index] = val; // 4. Insert new element
//                 size ++; // 5. Increase size
//         }
//         void capacityIncrease(){
//                  int[] arr2 = new int[arr.length * 2];
//                         for(int i=0; i<arr.length; i++){  // copy paste
//                                 arr2[i] = arr[i];
//                         }
//                         arr = arr2;
//         }
//         int capacity(){
//                 return arr.length;
//         }
//         int get(int index){
//                 return arr[index];
//         }
//         void set(int index, int val){
//                 arr[index] = val;
//         }
//         void display(){
//                 for(int i=0; i<size; i++){
//                         System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//         }
// }
// public class OOPS{
//         public static void main(String[] args) {
//                 ArrayList arr = new ArrayList(2);
//                 System.out.println(arr.capacity());
//                 arr.add(10);
//                 arr.add(20);
//                 arr.add(30);
//                 arr.add(40);
//                 arr.add(50);
//                 arr.add(60);
//                 arr.add(70);
//                 arr.add(80);
//                 arr.add(90);
//                 arr.add(100);
//                 System.out.println(arr.size);
//                 arr.display();
//                 arr.remove(4);
//                 arr.display();
//                 arr.add(6, 202);
//                 arr.display();
//                 System.out.println(arr.get(3));
//         }
// }

// import java.util.ArrayList;
// import java.util.Collections;
// public class OOPS{
//         public static void main(String[] args) {
//                 ArrayList<Integer> list1 = new ArrayList<Integer>();
//                 ArrayList<String> list2 = new ArrayList<String>();
//                 ArrayList<Boolean> list3 = new ArrayList<Boolean>();
//                 // Add element
//                 list1.add(11);
//                 list1.add(12);
//                 list1.add(13);
//                 list1.add(14);
//                 list1.add(15);
//                 System.out.println(list1);
//                 // to get an element
//                 int element = list1.get(2);
//                 System.out.println(element);
//                 // Add element in between
//                 list1.add(1,32);
//                 System.out.println(list1);
//                 // set element
//                 list1.set(0,99);
//                 System.out.println(list1);
//                 // delete element
//                 list1.remove(3);
//                 System.out.println(list1);
//                 // size of list
//                 int size = list1.size();
//                 System.out.println(size);
//                 // Loops of lists
//                 for(int i=0; i<list1.size(); i++){
//                         System.out.print(list1.get(i)+" ");
//                 }
//                 System.out.println();
//                 // sorting the list 
//                 Collections.sort(list1);
//                 System.out.println(list1);
//                 }
// }

// import java.util.ArrayList;
// import java.util.Stack;
// public class OOPS{
//     public ArrayList<Integer> nextGreaterElement(ArrayList<Integer> arr){
//         int n = arr.size();
//         int[] nge = new int[n];
//         nge[n-1] = 0;
//         Stack<Integer> st = new Stack<>();
//         st.push(arr.get(n-1));
//         for(int i=n-2; i>=0; i--){
//             while(st.size()>0 && arr.get(i) >= st.peek()){
//                 st.pop();
//             }
//             if(st.size()==0){
//                 nge[i] = 0;
//             }else{
//                 nge[i] = st.peek();
//             }
//             st.push(arr.get(i));
//         }
//         ArrayList<Integer> ans = new ArrayList<>(n);
//         for(int i=0; i<n; i++){
//             ans.add(nge[i]);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(1);
//         arr.add(8);
//         arr.add(3);
//         arr.add(5);
//         arr.add(2);
//         arr.add(1);
//         arr.add(6);
//         arr.add(4);
//         System.out.println(arr);
//         OOPS obj = new OOPS();
//         ArrayList<Integer> res = obj.nextGreaterElement(arr);
//         System.out.println(res);
//     }
// }