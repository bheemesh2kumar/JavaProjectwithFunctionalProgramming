package CustomizedFI;

public class TestClass implements InterfaceDemo {

    @Override
    public String printStringvalue(String str, String st2) {
        return String.format("given values are %s and %s", str, st2);
    }
}
