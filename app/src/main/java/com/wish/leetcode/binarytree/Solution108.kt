package com.wish.leetcode.binarytree

/**
 * @description: 二叉树No.108
 * @Author: lihongzhi
 * @CreateDate: 2020/8/18 6:31 PM
 */
class Solution108 {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return toBst(nums, 0, nums.size - 1)
    }

    private fun toBst(nums: IntArray, left: Int, right: Int): TreeNode? {
        return when {
            left > right -> null
            else -> {
                val mid = (left + right) / 2
                val node = TreeNode(nums[mid])
                node.left = toBst(nums, left, mid - 1)
                node.right = toBst(nums, mid + 1, right)
                return node
            }
        }
    }
}