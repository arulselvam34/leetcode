class Solution {

    public void Subset(int ind ,int[] arr,List<List<Integer>> ans,List<Integer> ds){
        ans.add(new ArrayList<> (ds));
        for(int i = ind; i < arr.length; i++){
            if(i!=ind && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            Subset(i+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Subset(0,nums,ans,new ArrayList<>());
        return ans;
    }
}