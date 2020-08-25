package com.wish.leetcode.binarytree

/**
 * @description: 二叉树No.112 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
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