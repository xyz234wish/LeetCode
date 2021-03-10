package com.wish.leetcode.binarytree

/**
 * @description: 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 * @Author: lihongzhi
 * @CreateDate: 3/10/21 4:14 PM
 */
class Solution297 {
    private val SEP = ","
    private val NULL = "#"
    private val sb = StringBuilder()
    private var index = 0

    // Encodes a URL to a shortened URL.
    fun serialize(root: TreeNode?): String {
        sb.clear()
        traverse(root, sb)
        return sb.toString()
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        val nodeList = data.split(SEP)
        index = 0
        return traverse(nodeList)
    }

    private fun traverse(root: TreeNode?, sb: StringBuilder) {
        if (root == null) {
            sb.append(NULL).append(SEP)
            return
        }
        sb.append(root.`val`).append(SEP)
        traverse(root.left, sb)
        traverse(root.right, sb)
    }

    private fun traverse(list: List<String>): TreeNode? {
        val value = list[index]
        index++
        if (value == NULL) {
            return null
        }
        val treeNode = TreeNode(value.toInt())
        treeNode.left = traverse(list)
        treeNode.right = traverse(list)
        return treeNode
    }
}