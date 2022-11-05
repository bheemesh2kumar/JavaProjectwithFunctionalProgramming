package ProgramesPrtaice;

public class FirstNonRepeatChar {

    //aabcbdfd
    //c
    public static void getFirstNonRepeatedChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            Boolean unique = true;

            for (int j = 0; j < str.length(); j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {

                    unique = false;
                    break;
                }

            }

            if (unique) {
                System.out.println("your first non repeat char is " + str.charAt(i));
            }

        }

    }

    public static void main(String[] args) {

        getFirstNonRepeatedChar("aabdbds");

    }


}
