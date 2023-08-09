package org.learn.tree;

public class IdeticalTree {

    TreeNode treeNode1;
    TreeNode treeNode2;


    private static boolean isIdentical(TreeNode tree1, TreeNode tree2){

        if(tree1 == null && tree2 == null){
            return true;
        }

        if(tree1 !=null && tree2 != null){
            return (tree1.data == tree2.data &&
                    isIdentical(tree1.left, tree2.left) &&
                    isIdentical(tree1.right, tree2.right));
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);

        IdeticalTree ideticalTree = new IdeticalTree();

        ideticalTree.treeNode1 = treeNode;
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;

        TreeNode tree = new TreeNode(1);
        TreeNode tree1 = new TreeNode(2);
        TreeNode tree2 = new TreeNode(3);
        TreeNode tree3 = new TreeNode(4);
        TreeNode tree4 = new TreeNode(5);
       // TreeNode tree5 = new TreeNode(15);

        ideticalTree.treeNode2 = tree;
        tree.left = tree1;
        tree.right = tree2;
        tree1.left = tree3;
        tree1.right = tree4;
        //tree2.left = tree5;

        System.out.println(isIdentical(ideticalTree.treeNode1, ideticalTree.treeNode2));
    }
}
