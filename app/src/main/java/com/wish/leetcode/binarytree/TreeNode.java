package com.wish.leetcode.binarytree;

/**
 * @description:
 * @Author: lihongzhi
 * @CreateDate: 2021/5/31 4:54 下午
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
