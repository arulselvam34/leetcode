class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int [n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n-1;i>=0;i--){
            int ind = i % n;
            int curr = nums[ind];
            while(!st.isEmpty() && st.peek() <= curr){
                st.pop();
            }
            if (i < n){
                if (st.isEmpty()){
                    ans[i] = -1;
                }
                else{
                    ans[i] = st.peek();
                }
            }
            st.push(curr);
        }
        return ans;
    }
}