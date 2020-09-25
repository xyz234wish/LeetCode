package com.wish.leetcode.binarytree

import java.util.HashMap

/**
 * @description: 根据一棵树的中序遍历与后序遍历构造二叉树。
 * @Author: lihongzhi
 * @CreateDate: 2020/9/25 8:08 PM
 */
class Solution106 {
    private val indexMap = HashMap<Int, Int>()

    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        val n = postorder.size
        for (i in 0..n - 1) {
            indexMap[inorder[i]] = i
        }
        return buildChildTree(inorder, postorder, 0, n - 1, 0, n - 1)
    }

    private fun buildChildTree(
        inorder: IntArray,
        postorder: IntArray,
        inStart: Int,
        inEnd: Int,
        postStart: Int,
        postEnd: Int
    ): TreeNode? {
        if (postStart > postEnd) {
            return null
        }
        val rootNode = TreeNode(postorder[postEnd])

        val inOrderRoot = indexMap[postorder[postEnd]] ?: 0
        val leftTreeSize = inOrderRoot - inStart
        rootNode.left = buildChildTree(
            inorder,
            postorder,
            inStart,
            inStart + leftTreeSize,
            postStart,
            postStart + leftTreeSize - 1
        )
        rootNode.right = buildChildTree(
            inorder,
            postorder,
            inStart + leftTreeSize + 1,
            inEnd,
            postStart + leftTreeSize,
            postEnd - 1
        )
        return rootNode
    }
}