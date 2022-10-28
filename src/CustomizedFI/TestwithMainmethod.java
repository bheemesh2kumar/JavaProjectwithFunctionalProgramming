package CustomizedFI;

public class TestwithMainmethod {

    public static void main(String[] args) {
       /* InterfaceDemo interfaceDemo = new TestClass();
        String finalval=interfaceDemo.printStringvalue("hello", "bye bye");
        System.out.println(finalval);
        */

        InterfaceDemo interfaceDemo = (str1, str2) -> String.format("the values are %s and %s", str1, str2);
        String finalval = interfaceDemo.printStringvalue("hello", "hi");
        System.out.println(finalval);


        StringssortingMethods stringssortingMethods
                =(str1,str2)->str1.length() + " " + str2.length();
        String newstr=stringssortingMethods.printAllStringsinSortingOrder("abcd","ab");
        System.out.println(newstr);






    }
}
