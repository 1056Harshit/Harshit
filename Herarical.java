     class A {
        void get() {
            System.out.println("A class");
        }
    }

    class B extends A {
        void put() {
            System.out.println("B class");
        }
    }

    class C extends A {
        void show() {
            System.out.println("C class");
        }
    }

    class test{
        public static void main(String[] args) {
            B k = new B();
            k.get();
            k.put();

            C p = new C();
            p.show();
        }
    

    }

