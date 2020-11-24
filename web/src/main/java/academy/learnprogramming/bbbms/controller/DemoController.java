package academy.learnprogramming.bbbms.controller;

import academy.learnprogramming.bbms.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    private final DemoService service;

    @Autowired
    public  DemoController(DemoService service) {
        this.service = service;
    }
    @GetMapping("demo")
    public String demo(Model model){
        model.addAttribute(("message"),service.getMessage());
        return("demo/demo");
    }
}
