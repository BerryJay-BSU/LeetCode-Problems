class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        test(solution, "abc",  "pqr",  "apbqcr");
        test(solution, "ab",   "pqrs", "apbqrs");
        test(solution, "abcd", "pq",   "apbqcd");
        test(solution, "a",    "z",    "az");
        test(solution, "a",    "xyz",  "axyz");
    }

    static void test(Solution solution, String word1, String word2,
                     String expected) {
        try {
            String actual = solution.mergeAlternately(word1, word2);
            System.out.printf("%s + %s → %s | expected: %s | %s%n",
                    word1, word2, actual, expected,
                    expected.equals(actual) ? "PASS" : "FAIL");
        } catch (Exception e) {
            System.out.printf("%s + %s → %s | expected: %s%n",
                    word1, word2, e, expected);
        }
    }
}