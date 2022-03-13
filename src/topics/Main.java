package topics;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> immutableList = List.of("foo", "bar", "ss", "foo", "bar", "ss", "foo", "bar", "ss","foo", "bar", "ss");
        immutableList.add("2");

        immutableList.forEach(System.out::println);

        System.out.println(5
        +
                3);
    }
}
