package classLoader;

import java.lang.reflect.Method;

public class StudentTest {

    public static void main(String[] args) throws Exception {

        Class classobj = Class.forName("classLoader.Student");


        for (Method method : classobj.getDeclaredMethods()) {

            System.out.println(method.getName());

        }

        System.out.println("checking class object reference types");

        Student student = new Student();
        Class classObj = student.getClass();

        Student student1 = new Student();
        Class classObj1 = student1.getClass();

        System.out.println(classObj.hashCode() == classObj1.hashCode());


    }
}
