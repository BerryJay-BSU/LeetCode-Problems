class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int size = word1.length();
        String appendString = "";
        char[] temp;
        int indexToAppend;
        int sizeToAppend;

        if (word1.length() > word2.length()) {
            size = word2.length();
            temp = word1.toCharArray();
            sizeToAppend = word1.length() - word2.length();
            indexToAppend = word2.length();
            appendString = String.copyValueOf(temp, indexToAppend, sizeToAppend);
        } else if (word1.length() < word2.length()) {
            size = word1.length();
            temp = word2.toCharArray();
            sizeToAppend = word2.length() - word1.length();
            indexToAppend = word1.length();
            appendString = String.copyValueOf(temp, indexToAppend, sizeToAppend);
        }

        for (int i = 0; i < size; i++) {
            result += word1.charAt(i);
            result += word2.charAt(i);
        }
        
        result += appendString;
        return result;
    }
}