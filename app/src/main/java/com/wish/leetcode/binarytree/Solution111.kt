package com.wish.leetcode.binarytree

import java.util.*

/**
 * @description: 二叉树No.111
 * @Author: lihongzhi
 * @CreateDate: 2020/8/20 6:48 PM
 */
class Solution111 {
    fun minDepth(root: TreeNode?): Int {
        var depth = 0
        if (root == null) {
            return depth
        }
        depth++
        val queue: Queue<TreeNode> = LinkedList()
        queue.offer(root)
        while (!queue.isEmpty()) {
            for (i in 0..queue.size - 1) {
                val poll = queue.poll()
                if (poll?.left == null && poll?.right == null) {
                    return depth
                }
                poll.left?.let {
                    queue.offer(it)
                }
                poll.right?.let {
                    queue.offer(it)
                }
            }
            depth++
        }
        return depth
    }
}