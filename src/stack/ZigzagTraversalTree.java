package stack;

import java.util.ArrayList;
import java.util.*;
import java.util.Queue;

/**
 * Created by ann on 11/30/15.
 */
public class ZigzagTraversalTree {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            this.val = x;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode > queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean odd = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> path = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (odd)
                    path.add(temp.val);
                else
                    path.add(0, temp.val);
                odd = !odd;

                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }

        }
        return res;


    }
}
