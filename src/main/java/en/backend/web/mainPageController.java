/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.backend.web;

import en.backend.model.Phones;
import en.backend.service.PhonesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;


/**
 *
 * @author Serega Vasilev
 */
@CrossOrigin(origins = "http://localhost:8383")
@RestController
@RequestMapping("api/phones")
public class mainPageController {
    @Autowired
    private PhonesService phonesService;
    
    
    @RequestMapping
    public List<Phones> getListOfPhones(){
        return phonesService.findAll();
    }
}
