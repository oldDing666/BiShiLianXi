package JZOffer_v1;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/25 10:07 上午
 */
public class T_26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null && B == null)
            return true;
        if (A == null || B == null)
            return false;
        if (A.val == B.val)
            return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
        else
            return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean dfs(TreeNode A, TreeNode B) {
        if (A == null && B == null)
            return true;
        if (A == null && B != null)
            return false;
        if (A != null && B == null)
            return true;
        if (A.val == B.val) {
            return dfs(A.left, B.left) && dfs(A.right, B.right);
        }
        return false;
    }
}
