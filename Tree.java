package AbhiSir;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

//Binary
//n-ary tree
public class Tree {
//BFS -
//->level order traversal
//DFS -
//->Inorder,preorder,postorder

//level =3
//                   1 ->null
//            2              3 ->null
//
//  4           5        6      7 -> null

//          8       5

    
    //level order
    //queue -    8 9 null
    //output - 1 2 3 4 5 6 7 8 9
    /*while(q.size()>1){
        TreeNode t = q.poll();
        if(t ==null)
        q.add(t);
        else{
        if(left/right ! null)
        q.add(left/right);
        sout(t.val);
        }
    }
    
    q.add(new Pair(0,1));
    Pair p = q.poll();
    int x =p.x;
    int y =p.y;
     visited[x][y] == 0
     
    class Pair{
        int x;int y;
        public Pair(int x,int y){
            this.x =x;
            this.y =y;
        }
    }
    * */
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
    public void levelOrderTraversal(TreeNode root) {
        if(root==null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(queue.size()>1){
            TreeNode node  = queue.poll();
            if(node ==null){
                //remove from first and add null at last
                queue.add(node);
            }else{
                //check left & right for null and push
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);

                //print
                System.out.println(node.val);
            }
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
// -> l,r,u,d
//[-1   0  -1 -1
// -1  -1  -1 -1
//  0  -1   0 -1] - BFS
//visited - 0,0 null
//queue = 0,1 , 1,0 null 
//
//
//        [-1 0 -1 -1
//         0 -1 -1 -1
//         0 -1  0 -1
//        ] 
