package treeBST;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//701
public class MyBST {
    public TreeNode mRoot;
    public MyBST(){

    }
    public TreeNode insert(TreeNode root, int value){
        TreeNode newNode=new TreeNode(value);

        //TH1: root==null
        if (root==null){
            root= newNode;
            return root;
        }
        else {
            TreeNode temp =root;
            while (true){
                if (value>temp.val){
                    if (temp.right==null){
                        temp.right=newNode;
                        break;
                    }else {
                        temp =temp.right;
                    }
                }
                else{
                    if (temp.left==null){
                        temp.left=newNode;
                        break;
                    }
                    else {
                        temp= temp.left;
                    }
                }
            }
        }
        return newNode;
    }
    public static TreeNode insertIntoBST(TreeNode rootNode, int value){
        TreeNode newNode = new TreeNode(value);
        if(rootNode==null){
            return newNode;
        }
        if (value< newNode.val){
            if (rootNode.left==null){
                rootNode.left= newNode;
            }else {
                insertIntoBST(rootNode.left,value);
            }
        }
        else {
            if (rootNode.right ==null){
                rootNode.right= newNode;
            }
            else {
                insertIntoBST(rootNode.right,value);
            }
        }
        return rootNode;
    }
// tim node trai cung ben phai
    public static TreeNode findLeftModeNode(TreeNode root){
        if (root ==null) return null;
        TreeNode leftMostNode =root.left;
        while (leftMostNode.left !=null){
            leftMostNode= leftMostNode.left;
        }
        return leftMostNode;
    }

    public static TreeNode deleteNode(TreeNode root,int key){
        if (root==null){
            return null;
        }
        // b1 di tim buoc xoa
        if (key< root.val){
            root.left= deleteNode(root.left, key);
        } else if (key> root.val) {
            root.right=deleteNode(root.right, key);
        }
        else {
            // xoa node root
            if (root.left==null && root.right == null){
                return null;
            }
            if (root.left !=null&& root.right ==null){
                return root.left;
            }
            if(root.right !=null && root.left==null){
                return root.right;
            }
            // th3 ton tai 2 node
            // tim node trai cung cua cay con ben pahi
            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.val =leftModeNode.val;
            deleteNode(root.right, leftModeNode.val);

        }
        return root;
    }

    public static TreeNode serchBST(TreeNode root, int key){
        if (root==null){
            return null;
        }
        if(key<root.val){
            return serchBST(root.left,key);
        } else if (key>root.val) {
            return serchBST(root.right,key);
        }
        else {
            return root;
        }
    }
    // exam 144, 94, 145
    // N-L-R
    public static void PreOder(TreeNode currentNode){
        if (currentNode==null) return;
        System.out.println(currentNode.val+" ");
        // duyet trai// left
        PreOder(currentNode.left);
        PreOder(currentNode.right);
    }
    List<Integer> duyetOrder =new ArrayList<>();
    public List<Integer> preoderTraversal(TreeNode root){
        return duyetOrder;
    }
    public static int maxDepth(TreeNode root){
        if (root==null) return 0;
        int chieuCaoCayBenTrai = maxDepth(root.left);
        int chieuCaoCayBenPhai =maxDepth(root.right);
        int result = Math.max(chieuCaoCayBenPhai,chieuCaoCayBenTrai);
        return result;
    }
    // cong tong tu currentNode =key
    public boolean isLeaf(TreeNode node ){
        return node.left==null&&node.right == null;
    }
    public boolean duyet(TreeNode curNode, int curSum, int targetSum){
        // b1: dieu kien dung
        if (curNode==null) return false;
        curSum+=curNode.val;
        if (isLeaf(curNode)){
            return curSum==targetSum;
        }
        // duyet sang 2 cay con
        boolean resultLeft =duyet(curNode.left,curSum,targetSum);
        boolean resultRight= duyet(curNode.right,curSum,targetSum);
        return resultRight||resultLeft;
    }
    public boolean hasPathSum(TreeNode root, int targetSum){
        return  duyet(root, 0, targetSum);
    }
}
