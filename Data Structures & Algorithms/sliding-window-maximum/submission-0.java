class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       
        Deque<Integer> deque=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){

                //when new element comes nums[i],
                //make space for it n the front(window size cants be greater than k)
                while(!deque.isEmpty() && deque.peekFirst()<= i-k){
                    deque.removeFirst();
                }

                //now, when nums[i] comes, there is no need to keep small elements
                //in the window. we can pop them from back
                while(!deque.isEmpty() && nums[i]>=nums[deque.peekLast()]){

                    //removes from back
                    deque.pollLast();
                }

                //now push i in deque -> for nums[i]
                deque.addLast(i);

                //if(i>=k-1), then front of deque is our answer for that window
                if(i>=k-1){
                    list.add(nums[deque.peekFirst()]);
                }

                
        }
        return list.stream()
                                .mapToInt(j->j)
                                    .toArray();

    }

}
