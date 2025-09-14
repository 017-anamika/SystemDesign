/* 4. Dependency Inversion Principle (DIP)
 Depend on abstractions, not on concrete classes.
*/
// Abstraction (interface)
interface Pen {
    void write();
}

// Low-level modules
class BluePen implements Pen {
    public void write() {
        System.out.println("Writing with Blue Pen");
    }
}

class RedPen implements Pen {
    public void write() {
        System.out.println("Writing with Red Pen");
    }
}

// High-level module depends on abstraction
class Teacher {
    private Pen pen;

    // Dependency Injection (pen is "injected")
    Teacher(Pen pen) {
        this.pen = pen;
    }

    void teach() {
        pen.write();  // Works with ANY pen
    }
}

// Test
public class DIP {
    public static void main(String[] args) {
        Pen pen = new RedPen();   // choose any pen
        Teacher teacher = new Teacher(pen);
        teacher.teach();
    }
}


