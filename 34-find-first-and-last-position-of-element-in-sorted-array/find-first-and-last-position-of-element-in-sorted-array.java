class Solution {
   public int[] searchRange(int[] arr, int target) {
        int firstOcc=-1,lastOcc=-1;
        firstOcc=findOcc(arr,target,true);
        lastOcc=findOcc(arr,target,false);
        return new int[] {firstOcc,lastOcc};
    }

    public int findOcc(int[] arr,int target,boolean isFirstOccu)
    {
        int si=0,ei=arr.length-1,res=-1;
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(arr[mid]>target)
                ei=mid-1;
            else if(arr[mid]<target)
                si=mid+1;
            else
                {
                    res=mid;
                    if(isFirstOccu)
                    {
                    ei=mid-1;
                    }
                    else
                    {
                        si=mid+1;
                    }
                }        
        }
        return res;
    }
}