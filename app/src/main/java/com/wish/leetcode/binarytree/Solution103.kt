package com.wish.leetcode.binarytree

import java.util.*

/**
 * @description: 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * @Author: lihongzhi
 * @CreateDate: 2020/9/23 8:04 PM
 */

//       3
//     / \
//   9    20
//  /\    /  \
// 5  4   15  7
class Solution103 {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val result = ArrayList<ArrayList<Int>>()
        if (root == null) {
            return result
        }
        val q: LinkedList<TreeNode> = LinkedList()
        q.offer(root)
        val temp: LinkedList<TreeNode> = LinkedList()
        var leftOrder = true
        while (!q.isEmpty()) {
            val list: ArrayList<Int> = ArrayList()
            temp.clear()
            for (i in 0..q.size - 1) {
                val poll = q.poll() ?: continue
                list.add(poll.`val`)
                if (leftOrder) {
                    if (poll.left != null) {
                        temp.addFirst(poll.left)
                    }
                    if (poll.right != null) {
                        temp.addFirst(poll.right)
                    }
                } else {
                    if (poll.right != null) {
                        temp.addFirst(poll.right)
                    }
                    if (poll.left != null) {
                        temp.addFirst(poll.left)
                    }
                }
            }
            q.addAll(temp)
            result.add(list)
            leftOrder = !leftOrder
        }
        return result
    }
}