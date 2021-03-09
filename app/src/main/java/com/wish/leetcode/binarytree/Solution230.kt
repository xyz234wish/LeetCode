package com.wish.leetcode.binarytree

/**
 * @description: 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 * @Author: lihongzhi
 * @CreateDate: 3/9/21 4:24 PM
 */
class Solution230 {
    private var res = 0
    private var index = 0

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        traverse(root, k)
        return res
    }

    private fun traverse(root: TreeNode?, k: Int) {
        if (root == null) {
            return
        }
        traverse(root.left, k)
        index++
        if (index == k) {
            res = root.`val`
            return
        }
        traverse(root.right, k)
    }
}