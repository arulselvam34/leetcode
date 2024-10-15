class Solution {
    public long minimumSteps(String s) {
        int n = s.length();

        long operations = 0;
        long count1 = 0;

        int i = 0;
        while(i<n) {
            if(s.charAt(i) == '1') {
                count1++;
            } else {
                operations += count1;
            }
            i++;
        }

        return operations;
    }
}