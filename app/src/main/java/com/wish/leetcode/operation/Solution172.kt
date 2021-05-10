package com.wish.leetcode.operation

/**
 * @description: 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * @Author: lihongzhi
 * @CreateDate: 2021/5/10 5:20 下午
 */
class Solution172 {
    fun trailingZeroes(n: Int): Int {
        var res = 0L
        var step = 5L
        while (step <= n) {
            res += n / step
            step *= 5
        }
        return res.toInt()
    }
}