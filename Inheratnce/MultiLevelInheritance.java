package Inheratnce;
class A {
    void display() {
        System.out.println("Super Class");
    }
}

class B extends A {
    void show() {
        System.out.println("Sub Class");
    }
}

class C extends B {
    void print() {
        System.out.println("Sub Sub Class");
    }
}



class MultiLevelInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.display();
        c.show();
        c.print();
    }
}
