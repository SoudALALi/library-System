/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.system;

import java.util.ArrayList;

/**
 *
 * @author Soud Al-Ali
 */
public class Book {
    private String bookTitle;
    private ArrayList<String> listOfAuthors;
    private int ISBNnumber;
    private Boolean Available;

    
    
    public Book(){
        
    }
    public Book(String bookTitle, ArrayList<String> listOfAuthors, int ISBNnumber, Boolean Available) {
        this.bookTitle = bookTitle;
        this.listOfAuthors = listOfAuthors;
        this.ISBNnumber = ISBNnumber;
        this.Available = Available;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public ArrayList<String> getListOfAuthors() {
        return listOfAuthors;
    }

    public int getISBNnumber() {
        return ISBNnumber;
    }

    public Boolean getAvailable() {
        return Available;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setListOfAuthors(ArrayList<String> listOfAuthors) {
        this.listOfAuthors = listOfAuthors;
    }

    public void setISBNnumber(int ISBNnumber) {
        this.ISBNnumber = ISBNnumber;
    }

    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    @Override
    public String toString() {
        return "Book{" + "bookTitle=" + bookTitle + ", listOfAuthors=" + listOfAuthors + ", ISBNnumber=" + ISBNnumber + ", Available=" + Available + '}';
    }



}
