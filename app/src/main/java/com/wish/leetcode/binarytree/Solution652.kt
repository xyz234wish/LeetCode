package com.wish.leetcode.binarytree

import java.util.*

/**
 * @description: 给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。
 * @Author: lihongzhi
 * @CreateDate: 3/9/21 3:41 PM
 */
class Solution652 {
    private val res = LinkedList<TreeNode>()
    private val sub = hashMapOf<String, Int>()

    fun findDuplicateSubtrees(root: TreeNode?): List<TreeNode?> {
        traverse(root)
        return res
    }

    private fun traverse(root: TreeNode?): String {
        if (root == null) {
            return "#"
        }
        val left = traverse(root.left)
        val right = traverse(root.right)
        val subTree = "${left},${right},${root.`val`}"
        val count = sub[subTree] ?: 0
        if (count == 1) {
            res.add(root)
        }
        sub[subTree] = count + 1
        return subTree
    }
}