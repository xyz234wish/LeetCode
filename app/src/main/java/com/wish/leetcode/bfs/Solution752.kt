package com.wish.leetcode.bfs

import java.util.*

/**
 * @description: 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。
 * 每个拨轮可以自由旋转：例如把 '9' 变为 '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。
 * @Author: lihongzhi
 * @CreateDate: 3/10/21 6:33 PM
 */
class Solution752 {
    fun openLock(deadends: Array<String>, target: String): Int {
        val dead = mutableSetOf<String>()
        val queue = LinkedList<String>()
        val visited = mutableSetOf<String>()
        dead.addAll(deadends)
        queue.offer("0000")
        visited.add("0000")
        var step = 0
        while (!queue.isEmpty()) {
            val size = queue.size
            for (i in 0..size - 1) {
                val poll = queue.poll() ?: continue
                if (dead.contains(poll)) {
                    continue
                }
                if (poll == target) {
                    return step
                }
                for (j in 0..3) {
                    val plus = plus(poll, j)
                    if (!visited.contains(plus)) {
                        queue.offer(plus)
                        visited.add(plus)
                    }
                    val minus = minus(poll, j)
                    if (!visited.contains(minus)) {
                        queue.offer(minus)
                        visited.add(minus)
                    }
                }
            }
            step++
        }
        return -1
    }

    //加一
    private fun plus(s: String, i: Int): String {
        val charArray = s.toCharArray()
        if (charArray[i] == '9') {
            charArray[i] = '0'
        } else {
            charArray[i] = charArray[i] + 1
        }
        return String(charArray)
    }

    //减一
    private fun minus(s: String, i: Int): String {
        val charArray = s.toCharArray()
        if (charArray[i] == '0') {
            charArray[i] = '9'
        } else {
            charArray[i] = charArray[i] - 1
        }
        return String(charArray)
    }
}