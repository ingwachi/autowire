package notAutowire;

public class B {

    private A a;

    public B(A a) {
        this.a = a;
    }

    public void callA() {
        System.out.println(a.testA());
    }
}
