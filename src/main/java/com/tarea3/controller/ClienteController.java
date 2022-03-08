/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.tarea3.controller;

import com.tarea3.dao.ClienteDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author arroy
 */
@Controller
@Slf4j /* log en el output */

public class ClienteController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @RequestMapping("/cliente")
    public String page(Model model) {
        
        
        var clientesDB = clienteDao.findAll();
        model.addAttribute("clientesDB", clientesDB);
        
        return "cliente";
    }
    
}
