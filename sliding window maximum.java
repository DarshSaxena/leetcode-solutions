import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] temp = new int[nums.length - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        int l = 0;

        for (int j = 0; j < nums.length; j++) {

            while (!dq.isEmpty() && dq.peekFirst() <= j - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[j]) {
                dq.pollLast();
            }

            dq.offerLast(j);

            if (j >= k - 1) {
                temp[l++] = nums[dq.peekFirst()];
            }
        }

        return temp;
    }
}
