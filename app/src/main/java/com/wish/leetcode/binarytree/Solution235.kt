package com.wish.leetcode.binarytree

/**
 * @description: 二叉树No.235给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * @Author: lihongzhi
 * @CreateDate: 2020/8/26 6:48 PM
 */
class Solution235 {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (p == null || q == null) {
            return null
        }
        var node: TreeNode? = root
        while (node != null) {
            when {
                p.`val` > node.`val` && q.`val` > node.`val` -> node = node.right
                p.`val` < node.`val` && q.`val` < node.`val` -> node = node.left
                else -> return node
            }
        }
        return null
    }
}