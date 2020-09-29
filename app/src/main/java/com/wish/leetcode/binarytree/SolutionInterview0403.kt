package com.wish.leetcode.binarytree

import java.util.*

/**
 * @description: 给定一棵二叉树，设计一个算法，创建含有某一深度上所有节点的链表（比如，若一棵树的深度为 D，则会创建出 D 个链表）。返回一个包含所有深度的链表的数组。
 * @Author: lihongzhi
 * @CreateDate: 2020/9/28 7:55 PM
 */
class SolutionInterview0403 {
    fun listOfDepth(tree: TreeNode?): Array<ListNode?> {
        val list = ArrayList<ListNode?>()
        val queue = LinkedList<TreeNode?>()
        if (tree == null) {
            return emptyArray()
        }
        queue.offer(tree)
        while (!queue.isEmpty()) {
            var root: ListNode? = null
            var node: ListNode? = null
            for (index in 0..queue.size - 1) {
                val poll = queue.poll()
                if (node == null) {
                    node = ListNode(poll!!.`val`)
                    root = node
                } else {
                    node.next = ListNode(poll!!.`val`)
                    node = node.next
                }
                if (poll.left != null) {
                    queue.offer(poll.left)
                }
                if (poll.right != null) {
                    queue.offer(poll.right)
                }
            }
            list.add(root)
        }
        return list.toTypedArray()
    }
}