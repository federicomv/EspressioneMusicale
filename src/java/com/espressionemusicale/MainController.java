/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espressionemusicale;

import hibernate.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author FSEVERI\loreggian3064
 */
@Controller
public class MainController {
    
    ManageDatabase dbman = new ManageDatabase();
    
    public MainController(){
    }
    
    @RequestMapping(value="/")
    public String index(ModelMap map){
        map.put("titolo", "Espressione Musicale");
        List<Evento> eventi = dbman.getEventi();
        map.put("eventi", eventi);
        return "paginaPrincipale";
    }
    
}
