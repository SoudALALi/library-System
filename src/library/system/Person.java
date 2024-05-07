/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.system;

/**
 *
 * @author Soud Al-Ali
 */
public class Person {
    private String name;
    private String contactInformation;
    
    public Person (){
    
   }

    public Person(String name, String contactInformation ) {
        this.name = name;
        this.contactInformation = contactInformation;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getContactInformation() {
        return contactInformation;
    }

   

    
     
}
