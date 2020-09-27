package com.wish.leetcode.binarytree

/**
 * @description: 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 * @Author: lihongzhi
 * @CreateDate: 2020/9/27 7:51 PM
 */
class SolutionInterview0402 {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return helper(nums, 0, nums.size - 1)
    }

    private fun helper(nums: IntArray, start: Int, end: Int): TreeNode? {
        if (start > end) {
            return null
        }

        val root = (start + end) / 2
        val rootNode = TreeNode(nums[root])
        rootNode.left = helper(nums, start, root - 1)
        rootNode.right = helper(nums, root + 1, end)
        return rootNode
    }
}