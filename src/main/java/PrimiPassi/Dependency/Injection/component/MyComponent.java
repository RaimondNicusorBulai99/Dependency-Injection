package PrimiPassi.Dependency.Injection.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private String myComponentName;

    public MyComponent() {
        System.out.println("Constructor MyComponent has been called");
        this.myComponentName = "Raimond Nicusor Bulai";
    }

    public String getMyComponentName() {
        System.out.println("Method getMyComponentName has been called");
        return this.myComponentName;
    }
}
