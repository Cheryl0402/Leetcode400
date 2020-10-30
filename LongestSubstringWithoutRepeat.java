class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i = 0, max = 0;
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            while (set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}

