class Solution {
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != null;        
    }
    
    private Integer maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Integer leftDepth = maxDepth(root.left);
        Integer rightDepth = maxDepth(root.right);
        
        if (leftDepth == null || rightDepth == null) {
            return null;
        }
        
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return null;
        }
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
