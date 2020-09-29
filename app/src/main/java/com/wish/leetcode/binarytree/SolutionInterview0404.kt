package com.wish.leetcode.binarytree

/**
 * @description: 实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
 * @Author: lihongzhi
 * @CreateDate: 2020/9/28 8:33 PM
 */
class SolutionInterview0404 {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }
        val leftTreeDepth = treeDepth(root.left)
        val rightTreeDepth = treeDepth(root.right)
        if (Math.abs(leftTreeDepth - rightTreeDepth) > 1) {
            return false
        }
        return isBalanced(root.left) && isBalanced(root.right)
    }

    private fun treeDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        return Math.max(treeDepth(root.left), treeDepth(root.right)) + 1
    }
}