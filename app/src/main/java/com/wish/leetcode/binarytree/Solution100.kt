package com.wish.leetcode.binarytree

/**
 * @description: 二叉树No.100
 * @Author: lihongzhi
 * @CreateDate: 2020/8/13 6:33 PM
 */

class Solution100 {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return traverse(p, q)
    }

    private fun traverse(p: TreeNode?, q: TreeNode?): Boolean {
        return when {
            p == null && q == null -> true
            p == null || q == null -> false
            else -> {
                if (traverse(p.left, q.left) && traverse(p.right, q.right)) {
                    p.`val` == q.`val`
                } else {
                    false
                }
            }
        }
    }
}