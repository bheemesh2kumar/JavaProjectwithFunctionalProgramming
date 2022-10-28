package predefinedFI;

import java.util.function.Function;
import java.util.function.Predicate;


public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer, Integer> function = i -> i * i;

        System.out.println(function.apply(2));


        Function<String, Integer> function1 = i -> i.length();

        System.out.println(function1.apply("abc"));


        Function<String, String> function2 = i -> i.toLowerCase();
        System.out.println(function2.apply("ABC"));


        Predicate<String> predicate=i->i.length()%2==0;
        System.out.println(predicate.test("ab"));


    }


}
