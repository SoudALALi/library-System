/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.system;

/**
 *
 * @author Soud Al-Ali
 */
public class CheckOut {
     

    public CheckOut() {
        
    }
     public void IfBookAvaliable (Book book, Borrower borrower){
         
         if (book.getAvailable()) {
             borrower.getBorroweBooks().add(book);
             book.setAvailable(false);
             System.out.println("The book is in your list");
             
         }else{
             System.out.println("The book is not Available");
         }
         
         
     }
}
