interface abc {
    void draw();
}

class F implements abc {
    @Override
    public void draw() {
        System.out.println("Hello class A");
    }
}

class G implements abc {
    @Override
    public void draw() {
        System.out.println("hello Class B");
    }
}

class Student1 {
    public static void main(String[] args) {
        abc d1 = new F();
        abc d2 = new G();
        d1.draw();
        d2.draw();
    }
}
