package SOLID;
 
public class ISP_01_Fixed {
 
    // Interface Segregation Principle (ISP) Example
    public interface Printable {
        void printDocument();
    }
 
   
    public interface Scannable {
        void scanDocument();
    }
 
    
    public interface Faxable {
        void faxDocument();
    }
 
    public static class SimplePrinter implements Printable {
        @Override
        public void printDocument() {
            System.out.println("SimplePrinter: Sending document to the printer ...");
        }
    }
 
    // A multi-functional printer can implement multiple interfaces
    public static class MultiFunctionPrinter implements Printable, Scannable, Faxable {
        @Override
        public void printDocument() {
            System.out.println("MultiFunctionPrinter: Printing document...");
        }
 
        @Override
        public void scanDocument() {
            System.out.println("MultiFunctionPrinter: Scanning document...");
        }
 
        @Override
        public void faxDocument() {
            System.out.println("MultiFunctionPrinter: Faxing document...");
        }
    }
 
    public static void main(String[] args) {
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.printDocument();
 
        System.out.println("---");
 
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.printDocument();
        mfp.scanDocument();
        mfp.faxDocument();
    }
}