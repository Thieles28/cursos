package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("visualizar")
public class firstspringbootController {
    public String helloWorld() {
        return "Meu primeiro projeto em spring boot";
    }
}
