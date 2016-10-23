package Chatpter4Assignment.Question1;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person manObject = new Man("Noor");
        Person womanObject = new Woman("Fatima");

        System.out.println("Polymorphism Man object: " + manObject.getName());
        System.out.println("Polymorphism Woman object: " + womanObject.getName());
    }
}
