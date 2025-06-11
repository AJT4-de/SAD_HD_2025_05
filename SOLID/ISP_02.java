package SOLID;
 
public class ISP_02 {
    // Interface Segregation Principle (ISP) Example
    public interface Workable {
        void work();
    }
 
    public interface Restable {
        void rest();
    }
 
    public static class Developer implements Workable, Restable {
        @Override
        public void work() {
            System.out.println("Developer is coding ...");
        }
 
        @Override
        public void rest() {
            System.out.println("Developer is taking a break!");
        }
    }

    public static class Robot implements Workable {
        @Override
        public void work() {
            System.out.println("Robot is weorking hard");
        }
       
    }
 
    public static void manageWorker(Workable worker) {
        worker.work();
        if (worker instanceof Restable) 
            ((Restable) worker).rest();
        } else {
            System.out.println("This worker (" + worker.getClass().getSimpleName() + ") does not need to rest or cannot rest.");
        }
    }
 
    public static void main(String[] args) {
        System.out.println("--- Developer Cycle ---");
        manageWorker(new Developer());
 
        System.out.println("\n--- Robot Cycle ---");
        manageWorker(new Robot());
    }
