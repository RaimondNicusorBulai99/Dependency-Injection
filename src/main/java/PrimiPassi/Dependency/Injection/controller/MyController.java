package PrimiPassi.Dependency.Injection.controller;

import PrimiPassi.Dependency.Injection.component.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("Constructor MyController has been called");
        this.myService = myService;
    }

    @GetMapping(value = "/getName")
    public String getMyService() {
        System.out.println("Method getMyService has been called");
        return myService.getName();
    }

    @GetMapping(value = "/")
    public String defaultMessage() {
        System.out.println("Method defaultMessage has been called");
        return "Welcome " + getMyService() + " in this web site";
    }
}