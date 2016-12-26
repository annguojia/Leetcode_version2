//package stack;
//
//import java.util.Queue;
//import java.util.LinkedList;
//
///**
// * Created by ann on 11/30/15.
// */
//public class ImplementStackUsingQueue {
//
//    // Push element x onto stack.
//    Queue<Integer> queue1 = new LinkedList<Integer>() {};
//    Queue<Integer> queue2 = new LinkedList<Integer>() {};
//
//    public void push(int x) {
//        queue1.offer(x);
//
//    }
//
//    // Removes the element on top of the stack.
//    public void pop() {
//        while(queue1.size() > 1) {
//            int cur = queue1.poll();
//            queue2.offer(cur);
//        }
//        queue1.poll();
//        while(!queue2.isEmpty()) {
//            int temp = queue2.poll();
//            queue1.offer(temp);
//        }
//
//    }
//
//    // Get the top element.
//    public int top() {
//        while(queue1.size() > 1) {
//            int cur = queue1.poll();
//            queue2.offer(cur);
//        }
//        int res = queue1.poll();
//        queue2.offer(res);
//        while(!queue2.isEmpty()) {
//            int temp = queue2.poll();
//            queue1.offer(temp);
//        }
//
//    }
//
//    // Return whether the stack is empty.
//    public boolean empty() {
//        return queue1.isEmpty();
//
//    }
//}
