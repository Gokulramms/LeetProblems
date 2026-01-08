/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        dfs(root, new StringBuilder(), result);
        return result;
    }

    private void dfs(TreeNode head, StringBuilder path, List<String> result) {
        if (head == null) return;

        int len = path.length(); 
        if (len == 0) {
            path.append(head.val);
        } else {
            path.append("->").append(head.val);
        }

        if (head.left == null && head.right == null) {
            result.add(path.toString());
        } else {
            dfs(head.left, path, result);
            dfs(head.right, path, result);
        }

        path.setLength(len); // backtrack always (even after leaf)
    }
}
