/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espressionemusicale;

import hibernate.ManageDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author FSEVERI\loreggian3064
 */
@Controller
public class LoginController {
    ManageDatabase dbman = new ManageDatabase();
    
    public LoginController(){
    }
    
    @RequestMapping(value = "/login")
    public String login(ModelMap m){
        return "login";
    }
}
