    class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
    class BST{
        TreeNode root;  
        BST(){
            root = null;
        }
    
    void insert(int value){
        root = insertRec(root,value);
    }
    TreeNode insertRec(TreeNode root , int value){
        if(root==null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.value){
            root.left = insertRec(root.left , value);
        }
        else if(value>root.value){
            root.right = insertRec(root.right,value);
        }
        return root;
    } 
    void preorder(){
        inorderRec(root);
    }
    void preorderRec(TreeNode root){
        if(root!=null){
            System.out.println(root.value +"");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(TreeNode root){
        if(root!=null){
            preorderRec(root.left);
            System.out.println(root.value +"");
            preorderRec(root.right);
        }
    }
    void postorder(){
        inorderRec(root);
    }
    void postorderRec(TreeNode root){
        if(root!=null){
            preorderRec(root.left);
            preorderRec(root.right);
            System.out.println(root.value +"");
        }
    }

    

}
    public class BinarySearchTree77_78 {
    public static void main(String[] args) {
    BST t1 = new BST();  
    TreeNode root = t1.insertRec(null,10);   
    }
}