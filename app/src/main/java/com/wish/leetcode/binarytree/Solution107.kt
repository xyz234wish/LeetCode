package com.wish.leetcode.binarytree

import java.util.*

/**
 * @description: 二叉树No.107
 * @Author: lihongzhi
 * @CreateDate: 2020/8/17 6:42 PM
 */
class Solution107 {
    // bfs框架解法
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val res: ArrayList<ArrayList<Int>> = ArrayList()
        if (root == null) {
            return res
        }
        val q: Queue<TreeNode> = LinkedList()
        q.offer(root)
        while (!q.isEmpty()) {
            val size = q.size
            val list: ArrayList<Int> = ArrayList()
            for (i in 0..size - 1) {
                val poll = q.poll()
                poll?.let {
                    list.add(it.`val`)
                }
                if (poll?.left != null) {
                    q.offer(poll.left)
                }
                if (poll?.right != null) {
                    q.offer(poll.right)
                }
            }
            res.add(0, list)
        }
        return res
    }
}