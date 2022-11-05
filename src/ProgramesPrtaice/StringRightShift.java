package ProgramesPrtaice;

import java.util.Arrays;

public class StringRightShift {


    public static void rightShiftchars(String str, int num) {

        char[] strarry = str.toCharArray();
        System.out.println(Arrays.toString(strarry));

        for (int i = 0; i < num; i++) {

            char lastChar = strarry[str.length() - 1];

            for (int j = strarry.length - 1; j > 0; j--) {

                strarry[j] = strarry[j - 1];

            }
            strarry[0] = lastChar;
            System.out.println(Arrays.toString(strarry));
        }


    }


    public static void main(String[] args) {
        String s = "suryahome";
        rightShiftchars(s, 3);
    }
}
