package com.wish.leetcode.binarytree

import java.util.*

/**
 * @description: 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）
 * @Author: lihongzhi
 * @CreateDate: 2020/9/22 8:01 PM
 */
class Solution102 {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val res: ArrayList<ArrayList<Int>> = ArrayList()
        if (root == null) {
            return res
        }
        val deep: Queue<TreeNode> = LinkedList()
        deep.offer(root)
        while (!deep.isEmpty()) {
            val size = deep.size
            val list: ArrayList<Int> = ArrayList()
            for (i in 0..size - 1) {
                val poll = deep.poll()
                poll?.let {
                    list.add(it.`val`)
                }
                if (poll?.left != null) {
                    deep.offer(poll.left)
                }
                if (poll?.right != null) {
                    deep.offer(poll.right)
                }
            }
            res.add(list)
        }
        return res
    }
}