package Trees;
 
class BinaryTree{
    Node root;  // root node
    class Node{ int data; Node left, right; }// node properties
    Node createNode(int val) {  // node creation
        Node n = new Node(); n.data = val; return n;
    }
    void insert(int val){ 
        // if tree is empty, exit
        if( root == null ) { root = createNode(val); return; }
        Node n = root, p = root;
        // until we find null
        while ( n != null ){
            p = n; // current n is new parent
            // if value already exists, exit
            if(val == n.data) return; 
            // search for null
            if(val < n.data) n = n.left;
            else if(val > n.data) n=n.right; 
        }
        if(val < p.data) p.left = createNode(val);
        else p.right = createNode(val);
    } 
    int maxDepth(Node n){ // find the maximum depth of a tree
        if(n == null) return 0;
        return Integer.max(maxDepth(n.left), maxDepth(n.right))+1;
    }
    Node minNode(Node n){
        if(n == null || n.left == null) return n;
        return minNode(n.left);
    }
    void ord(int ind, Node n){

        if(n == null) return;

        if(ind == 0)
        {
             System.out.print(n.data + " ");
        }
        else { 
            ord(ind-1, n.left); 
            ord(ind-1, n.right);
         } 
    }
    void levelOrder(Node n){ // breadth first search
        int h = maxDepth(n);
        for(int i=0;i<=h;i++){ 
         ord( i, n );
        }
    }
    void inorder(Node n){
        if(n == null) return;
        inorder(n.left);
        System.out.print(n.data + " ");
        inorder(n.right);
    }
}
public class Main {
    public static void main(String args[] ) {
        /*
                  57
                 /  \
                52   90
                  \
                   55
                     \
                      56  
        */
        BinaryTree bt = new BinaryTree();
        bt.insert(57); bt.insert(90); bt.insert(52);
        bt.insert(55); bt.insert(56);
        System.out.println("Maximum Depth: " + bt.maxDepth(bt.root));
        System.out.print("Inorder: ");
        bt.inorder(bt.root);
        System.out.print("\nLevel Order Traversal : ");
        bt.levelOrder(bt.root);
    } 
}