/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.system;

/**
 *
 * @author Soud Al-Ali
 */
public class Admin  extends Person {
    private int adminSalary;
     private int adminWorkHours;

     public Admin(){
    
    }
    public Admin(int adminSalary, int adminWorkHours, String perName, String perInf) {
        super(perName, perInf);
        this.adminSalary = adminSalary;
        this.adminWorkHours = adminWorkHours;
    }

    public int getAdminSalary() {
        return adminSalary;
    }

    public int getAdminWorkHours() {
        return adminWorkHours;
    }

    public void setAdminSalary(int adminSalary) {
        this.adminSalary = adminSalary;
    }

    public void setAdminWorkHours(int adminWorkHours) {
        this.adminWorkHours = adminWorkHours;
    }

    @Override
    public String toString() {
        return "Admin{" + "adminSalary=" + adminSalary + ", adminWorkHours=" + adminWorkHours + '}';
    }
     
}
