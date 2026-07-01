class A {
    void display() {
        System.out.println("Class A");
    }
}

class B {
    void show() {
        System.out.println("Class B");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.display();
        obj2.show();
    }
}