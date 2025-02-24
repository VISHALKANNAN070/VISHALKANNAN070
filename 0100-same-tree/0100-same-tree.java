class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p, q);
    }

    private boolean check(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;
        if(a==null || b==null) return false;
        else
            return (a.val == b.val) && check(a.left, b.left) && check(a.right, b.right);
    }
}