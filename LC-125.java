class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String a = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                a = a + s.charAt(i);
            }
        }

        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }

        return a.equals(b);
    }
}
