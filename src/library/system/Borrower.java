/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Soud Al-Ali
 */
public class Borrower extends Person implements Search {

    private ArrayList<String> topicInerests;
    private ArrayList<Book> borroweBooks;

    public Borrower() {

    }

    public Borrower(ArrayList<String> topicInerests, ArrayList<Book> borroweBooks, String perName, String perInf) {
        super(perName, perInf);
        this.topicInerests = topicInerests;
        this.borroweBooks = borroweBooks;
    }

    public ArrayList<String> getTopicInerests() {
        return topicInerests;
    }

    public ArrayList<Book> getBorroweBooks() {
        return borroweBooks;
    }

    public void setTopicInerests(ArrayList<String> topicInerests) {
        this.topicInerests = topicInerests;
    }

    public void setBorroweBooks(ArrayList<Book> borroweBooks) {
        this.borroweBooks = borroweBooks;
    }

    @Override
    public String toString() {
        return "Borrowers{" + "topicInerests=" + topicInerests + ", borroweBooks=" + borroweBooks + '}';
    }

    //  return 
    @Override
    public void search(Book book) {
       
        int bookISBNnumber = book.getISBNnumber();
        boolean k = false;
        
        for (int i = 0; i < borroweBooks.size(); i++) {
              if (borroweBooks.get(i).getISBNnumber()== bookISBNnumber){
                  k=true;
            
              }
        }
        
        
        if (k) {
            System.out.println("The book is in this list ");
        }
        else{
            System.out.println("The book isn't in this list ");
        }
        }
        
    }


