package ProgramesPrtaice;

public class StarPattern4 {


    public static void printnumberPattern(int rownum) {

        for (int i = 1; i <= rownum; i++) {

            for (int j = rownum; j > i; j--) {

                System.out.print(" ");

            }

            for (int k = 1; k <= i; k++) {

                System.out.print("*" + " ");

            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        printnumberPattern(5);
    }
}
