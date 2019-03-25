package com.tiger.tree;

public class preOrder {
    public void traversal(TreeNode root){
        if(root.left != null){
            traversal(root.left);
        }
        if(root.right != null){
            traversal(root.right);
        }
    }
}
