public class BasicFunction {
    static void greet() {
        System.out.println("Hello!");
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static void greet(String name, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(i + ". Hello, " + name + "!");
        }
    }

    static void greet(int age) {
        System.out.println("You are " + age + " years old.");
    }

    public static void main(String[] args) {
        greet();
        greet("Anurag");
        greet("Anurag", 3);
        greet(20);
    }
}
