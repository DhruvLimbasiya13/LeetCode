class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            result += word1.charAt(i);
            result += word2.charAt(i);
            i++;
        }

        while (i < word1.length()) {
            result += word1.charAt(i);
            i++;
        }

        while (i < word2.length()) {
            result += word2.charAt(i);
            i++;
        }
        return result;
    }
}