package autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    private A a;

    @Autowired
    public B(A a) {
        this.a = a;
    }

    public void callA() {
        System.out.println(a.testA());
    }
}
