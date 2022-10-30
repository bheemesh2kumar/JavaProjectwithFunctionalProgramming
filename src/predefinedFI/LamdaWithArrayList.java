package predefinedFI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaWithArrayList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("bheemesh");
        arrayList.add("venkatesh");
        arrayList.add("hemanth");
        arrayList.add("vishnu");
        arrayList.add("rajesh");
        arrayList.add("bhavishni");
        arrayList.add("bhopalraja");

        System.out.println(arrayList);
        System.out.println("printing using iterator method");
        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("using lamda expressions");

        arrayList.stream().forEach(System.out::println);


        //applay filters using comparator
        System.out.println("applay filters using comparator");

        Comparator<String> comparator
                = (first, second) -> first.compareTo(second) < 0 ? 1 : first.compareTo(second) > 0 ? -1 : 0;

        List<String> newArryList1 = arrayList.stream()
                .filter(i -> i.charAt(0) == 'b').sorted().collect(Collectors.toList());
        System.out.println("sorting based on java");
        System.out.println(newArryList1);

        List<String> newArryList2 = arrayList.stream()
                .filter(i -> i.charAt(0) == 'b').sorted(comparator).collect(Collectors.toList());
        // newArryList.stream().forEach(System.out::print);
        System.out.println("sorting based on comparator");
        System.out.println(newArryList2);


    }
}
