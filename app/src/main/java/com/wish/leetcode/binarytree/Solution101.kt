package com.wish.leetcode.binarytree

/**
 * @description: 二叉树No.101
 * @Author: lihongzhi
 * @CreateDate: 2020/8/13 8:32 PM
 */
class Solution101 {
    fun isSymmetric(root: TreeNode?): Boolean {
        return check(root, root)
    }

    private fun check(p: TreeNode?, q: TreeNode?): Boolean {
        return when {
            p == null && q == null -> true
            p == null || q == null -> false
            else -> p.`val` == q.`val` && check(p.left, q.right) && check(p.right, q.left)
        }
    }
}