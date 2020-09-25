package com.wish.leetcode.binarytree

import java.util.HashMap

/**
 * @description: 根据一棵树的前序遍历与中序遍历构造二叉树。
 * @Author: lihongzhi
 * @CreateDate: 2020/9/24 8:23 PM
 */
class Solution105 {
    private val indexMap = HashMap<Int, Int>()

    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        val n = preorder.size
        for (i in 0..n - 1) {
            indexMap[inorder[i]] = i
        }
        return buildChildTree(preorder, inorder, 0, n - 1, 0, n - 1)
    }

    private fun buildChildTree(
        preOrder: IntArray,
        inOrder: IntArray,
        preStart: Int,
        preEnd: Int,
        inStart: Int,
        inEnd: Int
    ): TreeNode? {
        if (preStart > preEnd) {
            return null
        }
        val inOrderRoot = indexMap[preOrder[preStart]] ?: 0

        val rootNode = TreeNode(preOrder[preStart])
        val leftTreeSize = inOrderRoot - inStart
        rootNode.left = buildChildTree(
            preOrder,
            inOrder,
            preStart + 1,
            preStart + leftTreeSize,
            inStart,
            inOrderRoot - 1
        )
        rootNode.right = buildChildTree(
            preOrder,
            inOrder,
            preStart + leftTreeSize + 1,
            preEnd,
            inOrderRoot + 1,
            inEnd
        )
        return rootNode
    }
}