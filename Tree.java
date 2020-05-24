package AbhiSir;

import javax.swing.tree.TreeNode;

public class Tree {
//BFS -
//->level order traversal
//DFS -
//->Inorder,preorder,postorder

//                   1
//            2              3
//
//  4           5        6      7

//          8       9

//stack -
//print - 4 8 9 5 2 6 7 3 1
//l->node->r - 4 2 5 1 6 3 7
//node->l->r -
//l->r->node -
    static class TreeNode{
         int val;
         TreeNode left;
         TreeNode right;
         //TreeNode parent;
         public TreeNode(int val){
             this.val=val;
         }
    }
    public void inorder(TreeNode root) {
        if(root==null)
            return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public void preOrder(TreeNode root) {
        if(root==null)
            return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }


    public void postOrder(TreeNode root) {
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Tree t = new Tree();
        t.inorder(root);
    }
}