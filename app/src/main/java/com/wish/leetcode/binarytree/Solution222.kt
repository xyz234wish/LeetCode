package com.wish.leetcode.binarytree

/**
 * @description: 给你一棵 完全二叉树 的根节点 root ，求出该树的节点个数。
 * @Author: lihongzhi
 * @CreateDate: 3/17/21 4:27 PM
 */
class Solution222 {
    fun countNodes(root: TreeNode?): Int {
        var l = root
        var r = root
        var hl = 0
        var hr = 0
        while (l != null) {
            l = l.left
            hl++
        }
        while (r != null) {
            r = r.right
            hr++
        }
        return if (hl == hr) {
            Math.pow(2.0, hl.toDouble()).toInt() - 1
        } else 1 + countNodes(root?.left) + countNodes(root?.right)
    }
}