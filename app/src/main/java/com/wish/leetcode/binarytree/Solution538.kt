package com.wish.leetcode.binarytree

/**
 * @description: 给出二叉 搜索 树的根节点，该树的节点值各不相同，请你将其转换为累加树（Greater Sum Tree），使每个节点 node 的新值等于原树中大于或等于node.val 的值之和。
 * @Author: lihongzhi
 * @CreateDate: 3/9/21 6:02 PM
 */
class Solution538 {
    private var sum = 0

    fun convertBST(root: TreeNode?): TreeNode? {
        traverse(root)
        return root
    }

    private fun traverse(root: TreeNode?) {
        if (root == null) {
            return
        }
        traverse(root.right)
        sum += root.`val`
        root.`val` = sum
        traverse(root.left)
    }
}