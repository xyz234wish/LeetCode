package com.wish.leetcode.binarytree

/**
 * @description: 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
 * @Author: lihongzhi
 * @CreateDate: 2020/9/19 6:19 PM
 */
class Solution96 {
    fun numTrees(n: Int): Int {
        val result = IntArray(n + 1)
        result[0] = 1
        result[1] = 1

        for (i in 2..n) {
            for (j in 1..i) {
                result[i] += result[j - 1] * result[i - j]
            }
        }
        return result[n]
    }
}