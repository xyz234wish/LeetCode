package com.wish.leetcode.binarytree

/**
 * @description: 二叉树No.226翻转一棵二叉树
 * @Author: lihongzhi
 * @CreateDate: 2020/8/25 6:27 PM
 */
class Solution226 {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        val temp = root.left
        root.left = invertTree(root.right)
        root.right = invertTree(temp)
        return root
    }
}