package LamdaWithClasses;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(121, "tom");
        System.out.println(employee);

        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(new Employee(70, "tom"));
        arrayList.add(new Employee(87, "roy"));
        arrayList.add(new Employee(66, "jimmy"));
        arrayList.add(new Employee(45, "sunny"));
        arrayList.add(new Employee(56, "screw"));

        System.out.println("sorting employee objects normally");

        System.out.println(arrayList);


        Comparator<Employee> comparator
                = (emp1, emp2) -> emp1.id < emp2.id ? -1 : emp1.id > emp2.id ? 1 : 0;
        arrayList.sort(comparator);
        System.out.println("sorted based on customized rule");
        System.out.println(arrayList);


    }
}
