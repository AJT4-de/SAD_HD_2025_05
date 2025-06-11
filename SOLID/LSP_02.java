package SOLID;
 
public class LSP_02 {
 
    public static class Bird {
        public void eat() {
            System.out.println("The bird is eating...");
        }
    }
 
    public interface Flyable {
        void fly();
    }
 

    public static class Sparrow extends Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("The sparrow is flying...");
        }
    }
 
        public static class Penguin extends Bird {
        public void swim() {
            System.out.println("The penguin is swimming...");
        }
    }
 
        public static void letItFly(Flyable flyer) {
        flyer.fly();
    }
 
    
    public static void observeBirdBehavior(Bird bird) {
        bird.eat(); 
        if (bird instanceof Flyable) {
            System.out.println("This bird can fly. Attempting to make it fly:");
            ((Flyable) bird).fly(); 
        } else if (bird instanceof Penguin) {
            System.out.println("This bird is a penguin. Let's see it swim:");
            ((Penguin) bird).swim(); 
        } else {
            System.out.println("This bird has no special observed behavior other than eating.");
        }
    }
 
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();
 
        System.out.println("--- Using letItFly (only for Flyable birds) ---");
        letItFly(sparrow);

        System.out.println("\n--- Using observeBirdBehavior (for any bird) ---");
        observeBirdBehavior(sparrow);
        System.out.println("---");
        observeBirdBehavior(penguin);
    }
}