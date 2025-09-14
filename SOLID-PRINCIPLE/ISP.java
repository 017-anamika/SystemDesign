/* 4. Interface Segregation Principle (ISP)
A class should not be forced to implement methods it does not use.
  */
// ❌ Wrong: One fat interface
interface Machine {
    void print();
    void scan();
    void fax();
}

// ✅ Correct: Split into smaller interfaces
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

// A basic printer that only prints
class BasicPrinter implements Printer {
    public void print() {
        System.out.println("Printing document...");
    }
}

// A multifunction printer that can print and scan
class MultiFunctionPrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class ISP {
    public static void main(String[] args) {
        // Using a simple printer
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print();

        // Using a multifunction printer
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
    }
}
