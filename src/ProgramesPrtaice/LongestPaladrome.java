package ProgramesPrtaice;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class LongestPaladrome {

    public static String getLongestPaladrome(String str) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {

            int len1 = expanFrommMiddle(str, i, i);
            int len2 = expanFrommMiddle(str, i, i + 1);
            int maxlen = Math.max(len1, len2);

            if (maxlen > (end - start)) {
                start = i - ((maxlen - 1) / 2);
                end = i + (maxlen / 2);
            }

        }

        return str.substring(start, end + 1);

    }

    private static int expanFrommMiddle(String strval, int left, int right) {
        if (strval.length() < 0 || strval == "" || left > right) {

            return 0;
        }
        while (left >= 0 && right < strval.length() && strval.charAt(left) == strval.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {
        String strnewval = getLongestPaladrome("racecar");
        System.out.println(strnewval);

    }


}
