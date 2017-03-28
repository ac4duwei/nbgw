package com.okchengle.nbgw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author michael
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld() {
        System.out.println("xxxxx");
        return "demo";
    }

}
