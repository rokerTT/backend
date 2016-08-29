/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.backend.model;

/**
 *
 * @author Serega Vasilev
 */
public class Phones {
    private final String age;
    private final String carrier;
    private final String id;
    private final String imageUrl; 
    private final String name;
    private final String snippet;
    private final String status; 
    

public Phones(String age, String carrier, String id, String imageUrl,String name, String snippet, String status){
   
    this.age = age;
    this.carrier = carrier;
    this.id = id;
    this.imageUrl = imageUrl; 
    this.name = name;
    this.snippet = snippet;
    this.status = status;
} 
    
 
    public String getAge(){
        return age;
    }
    public String getCarrier(){
        return carrier;
    }
    public String getId(){
        return id;
    }
    public String getImageUrl(){
        return imageUrl;
    }
    public String getName(){
        return name;
    }
    public String getSnippet(){
        return snippet;
    }
    public String getStatus(){
        return status;
    }
}

