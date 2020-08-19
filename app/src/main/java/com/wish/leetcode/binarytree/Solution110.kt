package com.wish.leetcode.binarytree

/**
 * @description: 二叉树No.110
 * @Author: lihongzhi
 * @CreateDate: 2020/8/19 6:30 PM
 */
class Solution110 {
    fun isBalanced(root: TreeNode?): Boolean {
        return height(root) >= 0
    }

    private fun height(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val leftHeight = height(root.left)
        val rightHeight = height(root.right)
        return if (leftHeight < 0 || rightHeight < 0 || Math.abs(leftHeight - rightHeight) > 1) {
            -1
        } else {
            Math.max(leftHeight, rightHeight) + 1
        }
    }
}