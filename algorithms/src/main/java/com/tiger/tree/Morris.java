package com.tiger.tree;

/**
 * Morris traversal空间换时间 o(n)
 */
public class Morris {
    public void traversal(TreeNode root){
        TreeNode cur = root;
        TreeNode pre = null;
        while(cur != null){
            if(cur.left == null){
                cur = cur.right;
            }else{
                pre = cur.left;
                while(pre.right != null && pre.right != cur){
                    pre = pre.right;
                }
                if(pre.right == null){
                    pre.right = cur;
                    cur = cur.left;
                }else{
                    pre.right = null;
                    cur = cur.right;
                }
            }
        }
    }
}
