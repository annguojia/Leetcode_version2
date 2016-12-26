package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ann on 11/30/15.
 */
public class PreorderTraverse {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) {
            this.val = x;
        }
    }
    public List<Integer> preorderTraverse(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(res, root);
        return res;
//        List<Integer> res = new ArrayList<Integer>();
//        if(root == null) {
//            return res;
//        }
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        stack.push(root);
//        while(!stack.isEmpty()) {
//            TreeNode cur = stack.pop();
//            res.add(cur.val);
//            if (cur.right != null) {
//                stack.push(cur.right);
//            }
//            if (cur.left != null) {
//                stack.push(cur.left);
//            }
//        }
//        return res;



    }
    public void helper(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        helper(res, root.left);
        helper(res, root.right);
    }
}
