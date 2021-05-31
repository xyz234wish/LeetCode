package com.wish.leetcode.bfs;

import com.wish.leetcode.binarytree.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 给定一个 完美二叉树，填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * @Author: lihongzhi
 * @CreateDate: 2021/5/31 3:54 下午
 */
public class Solution116 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        Node temp = null;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if (i == size - 1) {
                    temp = null;
                    break;
                }
                if (temp != null) {
                    temp.next = poll;
                }
                temp = poll;
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
        }
        return root;
    }
}
