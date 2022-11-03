package PrimiPassi.Dependency.Injection.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        System.out.println("Constructor MyService has been called");
        this.myComponent = myComponent;
    }

    public String getName() {
        System.out.println("Method getName has been called");
        return myComponent.getMyComponentName();
    }
}
