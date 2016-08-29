/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.backend.service;

import en.backend.model.Phones;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Serega Vasilev
 */
@Service
public class PhonesService {
   private static List<Phones> items = new ArrayList<>();
   static {
       items.add(new Phones("0","","motorola-xoom-with-wi-fi","src/main/resources/img/phones/motorola-xoom-with-wi-fi.0.jpg",
               "Motorola XOOM\u2122 with Wi-Fi","The Next, Next Generation\r\n\r\nExperience the future with Motorola XOOM with Wi-Fi, the world's first tablet powered by Android 3.0 (Honeycomb).","true"));
       items.add(new Phones("1","","motorola-xoom", "img/phones/motorola-xoom.0.jpg",
               "MOTOROLA XOOM\u2122","The Next, Next Generation\n\nExperience the future with MOTOROLA XOOM, the world's first tablet powered by Android 3.0 (Honeycomb).","true"));
       items.add(new Phones("2","AT&amp;T","motorola-atrix-4g","img/phones/motorola-atrix-4g.0.jpg",
               "MOTOROLA ATRIX\u2122 4G","MOTOROLA ATRIX 4G the world's most powerful smartphone.","true"));
       items.add(new Phones("3","","dell-streak-7","img/phones/dell-streak-7.0.jpg","Dell Streak 7",
               "Introducing Dell\u2122 Streak 7. Share photos, videos and movies together. It\u2019s small enough to carry around, big enough to gather around.","true"));
        }
 
    public List<Phones> findAll() {
     return items;   
    }
    
}
