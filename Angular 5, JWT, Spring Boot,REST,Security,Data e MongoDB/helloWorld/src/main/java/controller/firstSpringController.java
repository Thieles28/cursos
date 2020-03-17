package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstSpringController {
    @RequestMapping("visualizar")
    public String hellloWord() {
        String helloword = "Olá esse meu primeiro projeto!";
        return helloword;
    }
}
