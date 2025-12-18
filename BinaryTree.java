import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
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
    public static boolean hasPathSum(Node root, int targetSum){
        if(root==null){
            if(targetSum == 0) return true;
            else return false;
        }
        return hasPathSum(root.left, targetSum-root.data) || hasPathSum(root.right, targetSum-root.data);
    }
    public static void labelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.data+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }
    public static void levelOrderLineWise(Node root){
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root, 0));
        while(q.size()>0){
            Pair front = q.remove();
            // Node node = front.node;
            // int level = front.level;
            if(front.level != currLevel){
                currLevel ++;
                System.out.println();
            }
            System.out.print(front.node.data+" ");
            if(front.node.left!=null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right, front.level+1));
        }
        System.out.println();
    }
    public static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans){
        if(root==null) return;
        arr.add(root.data);
        if(root.left==null && root.right==null){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
        }
        dfs(root.left, arr, ans);
        dfs(root.right, arr, ans);
        arr.remove(arr.size()-1); // Backtracking
    }
    public static ArrayList<ArrayList<Integer>> paths(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr, ans);
        return ans;
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
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        // display(a);
        // System.out.println();
        // labelOrder(a);
        // System.out.println();
        // levelOrderLineWise(a);
        ArrayList<ArrayList<Integer>> res = paths(a);
        System.out.println(res);
        // System.out.println(hasPathSum(a, 100));
        // System.out.println(isSymmetric(a));
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

