class Solution {
    public int reversePairs(int[] nums,int low,int mid,int high) {
         int i = low;
        int j = mid + 1;
        List<Integer> temp = new ArrayList<>();
        
        while (i <= mid && j <= high) {
            if (nums[i] > nums[j]) {
                temp.add(nums[j]);
                j++;
            } else {
                temp.add(nums[i]);
                i++;
            }
        }
        
        while (i <= mid) {
            temp.add(nums[i]);
            i++;
        }
        
        while (j <= high) {
            temp.add(nums[j]);
            j++;
        }
        
        for (int k = 0; k < temp.size(); k++) {
            nums[low + k] = temp.get(k);
        }
        return low;
    }
    
    public int countPairs(int[] nums, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int count = 0;
        
        while (i <= mid) {
            while (j <= high && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
            i++;
        }
        
        return count;
    }
    
    public int mergeSort(int[] nums, int low, int high) {
        if (low >= high) return 0;
        
        int mid = low + (high - low) / 2;
        int count = 0;
        
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);
        count += countPairs(nums, low, mid, high);
        
        reversePairs(nums, low, mid, high);
        
        return count;
    }
    
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}
