package Tasks;
// Class B
public class B {
    public static void main(String[] args) {
        // Create an object of class A
        A objectA = new A();

        // Call the method in class A and print the result
        String result = objectA.getName("Anthony Chiazor");
        System.out.println("Name from Class A: " + result);
    }
}
