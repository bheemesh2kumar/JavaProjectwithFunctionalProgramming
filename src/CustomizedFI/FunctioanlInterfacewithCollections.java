package CustomizedFI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctioanlInterfacewithCollections {


    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(10);
        values.add(12);
        values.add(6);
        values.add(15);
        values.add(17);
        values.add(21);
        System.out.println(values);
        //Collections.sort(values);
        System.out.println(values);
        Comparator<Integer> comparator =
                (i1, i2) -> i1 < i2 ? 1 : i1 > i2 ? -1 : 0;
        Collections.sort(values, comparator);
        System.out.println(values);
        System.out.println("even number are ");
        List<Integer> newvalues = values.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newvalues);
        System.out.println("odd numbers are");
        List<Integer> newvalues1 = values.stream().filter(i -> i % 2 != 0).sorted().collect(Collectors.toList());
        System.out.println(newvalues1);
        System.out.println("successfully added agian");


    }


}
