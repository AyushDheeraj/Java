class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class BinaryTree {
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
    public static int product(Node root){
        if(root==null) return 1;
        return root.data*product(root.left)*product(root.right);
    }
    public static int maxVal(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,(Math.max(maxVal(root.left),maxVal(root.right))));
    }
    public static int minVal(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(minVal(root.left),minVal(root.right)));
    }
    public static int level(Node root){
        if(root==null) return 0; 
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void mirror(Node root){
        if(root==null) return;
        // mirror(root.left);
        // mirror(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
    public static boolean isIdentical(Node y, Node u){
        if(y==null && u==null) return true;
        if(y==null || u==null) return false;
        if(y.data != u.data) return false;
        return isIdentical(y.left, u.left) && isIdentical(y.right, u.right);
    }
    public static boolean isSymmetric(Node root){
        mirror(root.left);
        return isIdentical(root.left, root.right);
    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        display(root.left);
        // System.out.print(root.data+" ");
        display(root.right);
        // System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(20);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(50);
        Node g = new Node(40);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        display(a);
        System.out.println(isSymmetric(a));
        // System.out.println();
        // System.out.println(size(a));
        // System.out.println(sum(a));
        // System.out.println(product(a));
        // System.out.println(maxVal(a));
        // System.out.println(minVal(a));
        // System.out.println(level(a));
        // mirror(a);
        // display(a);
        // Node A = new Node(10);
        // Node B = new Node(20);
        // Node C = new Node(30);
        // Node D = new Node(40);
        // Node E = new Node(50);
        // Node F = new Node(60);
        // Node G = new Node(70);
        // A.left = B;
        // A.right = C;
        // B.left = D;
        // B.right = E;
        // C.left = F;
        // C.right = G;
        // System.out.println(isIdentical(a, A));
    }
}

