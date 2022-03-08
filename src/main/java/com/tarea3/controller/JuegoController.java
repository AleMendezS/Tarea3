/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.tarea3.controller;


import com.tarea3.dao.JuegoDao;
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

public class JuegoController {
    @Autowired
    private JuegoDao juegoDao;
    
    @RequestMapping("/juegos")
    public String page(Model model) {
        
        var juegosDB = juegoDao.findAll();
        model.addAttribute("juegosDB", juegosDB);
        
        return "juegos";
    }
    
}
