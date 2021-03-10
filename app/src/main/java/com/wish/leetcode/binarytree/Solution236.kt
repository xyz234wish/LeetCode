package com.wish.leetcode.binarytree

/**
 * @description: 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * @Author: lihongzhi
 * @CreateDate: 3/10/21 5:00 PM
 */
class Solution236 {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        if (root == p || root == q) {
            return root
        }

        val left = lowestCommonAncestor(root.left, p, q)
        val right = lowestCommonAncestor(root.right, p, q)
        if (left == null && right == null) {
            return null
        }
        if (left != null && right != null) {
            return root
        }
        return left ?: right
    }
}