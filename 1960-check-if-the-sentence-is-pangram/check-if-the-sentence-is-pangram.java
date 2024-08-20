class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] ch = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            ch[sentence.charAt(i) - 97] = true;
        }

        if (present(ch) == true) {
            return true;
        }
        return false;
    }

    static boolean present(boolean[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == false) {
                return false;
            }
        }
        return true;
    }
}