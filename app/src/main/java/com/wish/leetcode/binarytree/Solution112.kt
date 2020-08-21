package com.wish.leetcode.binarytree

/**
 * @description: 二叉树No.112
 * @Author: lihongzhi
 * @CreateDate: 2020/8/21 6:38 PM
 */
class Solution112 {
    fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
        return when {
            root == null -> false
            root.left == null && root.right == null -> root.`val` == sum
            else -> {
                hasPathSum(root.left, sum - root.`val`)
                        || hasPathSum(root.right, sum - root.`val`)
            }
        }
    }
}