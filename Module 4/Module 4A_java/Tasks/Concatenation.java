package Tasks;

public class Concatenation {

    public static void main(String... args) {

        int age = 38;
        String adjective = "My age is ";

        String conjunction = adjective + age;

        System.out.println(conjunction);

        System.out.println(adjective.concat(age+" "));

    }
}


