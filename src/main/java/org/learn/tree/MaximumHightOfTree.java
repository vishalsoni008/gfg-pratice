package org.learn.tree;

public class MaximumHightOfTree {
    private TreeNode root;

    private int maxHeight(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }
        else {
            int left;
            int right;

            left = maxHeight(treeNode.left);
            right = maxHeight(treeNode.right);

            if(left<right){
                return right+1;
            }
            else {
                return left+1;
            }
        }
    }
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);

        MaximumHightOfTree maximumHightOfTree = new MaximumHightOfTree();

        maximumHightOfTree.root = treeNode;
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;

        System.out.println(maximumHightOfTree.maxHeight(maximumHightOfTree.root));


    }

}
