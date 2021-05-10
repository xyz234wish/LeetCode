package com.wish.leetcode.operation

/**
 * @description: 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 * @Author: lihongzhi
 * @CreateDate: 2021/5/10 5:12 下午
 */
class Solution321 {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n <= 0) {
            return false
        }
        return (n and (n - 1)) == 0
    }
}