package Tree;

public class Binary_Tree_Coloring_Game {
    int xLeft=0, xRight=0;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        dfs(root, x);
        int xParent = n-xLeft-xRight-1;

        if(xLeft + xRight + 1 < xParent) return true;
        if(xLeft + xParent + 1 < xRight) return true;
        if(xRight + xParent + 1 < xLeft) return true;

        return false;
    }

    int dfs(TreeNode root, int x){
        if(root == null) return 0;
        int left = dfs(root.left, x);
        int right = dfs(root.right, x);
        if(x == root.val){
            xLeft = left;
            xRight = right;
        }
        return left+right+1;
    }
}
