class Solution {
    public String reverseWords(String s) {
        List<String> result = new ArrayList<>();
        String answer = "";
        int last_index = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {

                if (last_index < i) {
                    result.add(s.substring(last_index, i));
                }

                last_index = i + 1;
            }
        }

        // Add last word
        if (last_index < s.length()) {
            result.add(s.substring(last_index));
        }

        // Reverse the words
        for (int i = result.size() - 1; i >= 0; i--) {
            answer += result.get(i);

            if (i != 0) {
                answer += " ";
            }
        }

        return answer;
    }
}