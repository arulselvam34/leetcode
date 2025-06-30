class Solution {
    public void Subset(int ind,int[] nums,List<Integer> ds,List<List<Integer>> ansList){
        ansList.add(new ArrayList<> (ds));
        for(int i = ind;i < nums.length;i++){
            if( i!=ind && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            Subset(i+1,nums,ds,ansList);
            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ansList = new ArrayList<>();
        Subset(0,nums,new ArrayList<>(),ansList);
        return ansList;
        
    }
}