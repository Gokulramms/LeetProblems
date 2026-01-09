class Solution {

    // Helper class to store:
    // 1. depth of subtree
    // 2. node which is the answer for that subtree
    class Pair {
        int depth;
        TreeNode node;

        Pair(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    private Pair dfs(TreeNode root) {
        // Base case: empty tree
        if (root == null) {
            return new Pair(0, null);
        }

        // Recurse left and right
        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        // If left subtree is deeper
        if (left.depth > right.depth) {
            return new Pair(left.depth + 1, left.node);
        }

        // If right subtree is deeper
        if (right.depth > left.depth) {
            return new Pair(right.depth + 1, right.node);
        }

        // If both depths are equal
        // current node is the smallest subtree containing all deepest nodes
        return new Pair(left.depth + 1, root);
    }
}
