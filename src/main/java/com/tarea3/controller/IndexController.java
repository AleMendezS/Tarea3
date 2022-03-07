package com.tarea3.controller;

import com.tarea3.dao.ClienteDao;
import com.tarea3.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired
    private ClienteDao clienteDao;
    
    @RequestMapping("/")
    public String page(Model model) {
        log.info("Ahora se usa arquitectura MVC");
        
        Cliente cliente = new Cliente("Jesus","Arroyo S","arroyo@gmail.com","24417345");
        model.addAttribute(cliente);
        
        Cliente cliente2 = new Cliente("Jesus desde una clase","Arroyo S","arroyo@gmail.com","24417345");
        var clientes = Arrays.asList(cliente,cliente2);
        model.addAttribute("clientes",clientes);
        
        String mensaje ="hola desde el controlador";
        model.addAttribute("TextoSaludo", mensaje);
        
        var clientesDB = clienteDao.findAll();
        model.addAttribute("clientesDB", clientesDB);
        
        return "index";
    }
    
}
