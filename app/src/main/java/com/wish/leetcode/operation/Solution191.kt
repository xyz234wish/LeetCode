package com.wish.leetcode.operation

/**
 * @description: 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 * @Author: lihongzhi
 * @CreateDate: 2021/5/10 4:55 下午
 */
class Solution191 {
    fun hammingWeight(n: Int): Int {
        var num = n
        var count = 0
        while (num != 0) {
            num = num and (num - 1)
            count++
        }
        return count
    }
}