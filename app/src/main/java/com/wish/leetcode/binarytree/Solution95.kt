package com.wish.leetcode.binarytree

import java.util.*

/**
 * @description: 二叉树No.95给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
 * @Author: lihongzhi
 * @CreateDate: 2020/8/29 6:10 PM
 */
class Solution95 {

    fun generateTrees(n: Int): List<TreeNode?> {
        if (n == 0) {
            return LinkedList<TreeNode>()
        }
        return helper(1, n)
    }

    private fun helper(start: Int, end: Int): List<TreeNode?> {
        val allTrees = LinkedList<TreeNode?>()
        if (start > end) {
            allTrees.add(null)
            return allTrees
        }
        for (i in start..end) {
            val leftTrees = helper(start, i - 1)
            val rightTrees = helper(i + 1, end)
            leftTrees.forEach { leftTree ->
                rightTrees.forEach { rightTree ->
                    val centerTree = TreeNode(i)
                    centerTree.left = leftTree
                    centerTree.right = rightTree
                    allTrees.add(centerTree)
                }
            }
        }
        return allTrees
    }
}