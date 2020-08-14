package com.wish.leetcode.binarytree

/**
 * @description: 二叉树No.104
 * @Author: lihongzhi
 * @CreateDate: 2020/8/14 6:16 PM
 */
class Solution104 {
    fun maxDepth(root: TreeNode?): Int {
        return when {
            root == null -> 0
            else -> {
                1 + Math.max(maxDepth(root.left), maxDepth(root.right))
            }
        }
    }
}