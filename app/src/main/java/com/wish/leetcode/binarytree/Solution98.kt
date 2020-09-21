package com.wish.leetcode.binarytree

/**
 * @description: 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * @Author: lihongzhi
 * @CreateDate: 2020/9/21 7:40 PM
 */
class Solution98 {
    fun isValidBST(root: TreeNode?): Boolean {
        return traverse(root, null, null)
    }

    private fun traverse(root: TreeNode?, lower: Int?, upper: Int?): Boolean {
        if (root == null) {
            return true
        }
        if (lower != null && root.`val` <= lower) {
            return false
        }
        if (upper != null && root.`val` >= upper) {
            return false
        }
        if (!traverse(root.left, lower, root.`val`)) {
            return false
        }
        if (!traverse(root.right, root.`val`, upper)) {
            return false
        }
        return true
    }
}