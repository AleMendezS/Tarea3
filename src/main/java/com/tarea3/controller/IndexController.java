package com.tarea3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author arroy
 */
@Slf4j /* log en el output */
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String page(Model model) {
        log.info("Ahora se usa arquitectura MVC");
        return "index";
    }
    
}
