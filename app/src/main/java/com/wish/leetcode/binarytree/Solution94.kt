package com.wish.leetcode.binarytree

/**
 * @description: 二叉树No.94给定一个二叉树，返回它的中序 遍历。
 * @Author: lihongzhi
 * @CreateDate: 2020/8/27 6:50 PM
 */
class Solution94 {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val res = ArrayList<Int>()
        traverse(root, res)
        return res
    }

    private fun traverse(root: TreeNode?, res: ArrayList<Int>) {
        if (root == null) {
            return
        }
        traverse(root.left, res)
        res.add(root.`val`)
        traverse(root.right, res)
    }
}