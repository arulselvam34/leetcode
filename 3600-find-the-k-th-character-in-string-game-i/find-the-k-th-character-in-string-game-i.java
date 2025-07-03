class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("a");
        while(str.length() < k){
            int s = str.length();
            for(int i=0;i<s;i++){
                char nextCh = (char) ('a' + ((str.charAt(i)-'a')+1)%26);
                str.append(nextCh);
            }
        }
        return str.charAt(k-1);
    }
}