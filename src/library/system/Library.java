/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.system;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/**
 *
 * @author Soud Al-Ali
 */
public class Library implements Search {

    private Admin admin;
    private ArrayList<Book> collectionOfBook;
    private ArrayList<Borrower> borrowers;

    public Library() {

    }

    public Library(Admin admin, ArrayList<Book> collectionOfBook, ArrayList<Borrower> borrowers) {
        this.admin = admin;
        this.collectionOfBook = collectionOfBook;
        this.borrowers = borrowers;
    }

    public Admin getAdmin() {
        return admin;
    }

    public ArrayList<Book> getCollectionOfBook() {
        return collectionOfBook;
    }

    public ArrayList<Borrower> getBorrowers() {
        return borrowers;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void setCollectionOfBook(ArrayList<Book> collectionOfBook) {
        this.collectionOfBook = collectionOfBook;
    }

    public void setBorrowers(ArrayList<Borrower> borrowers) {
        this.borrowers = borrowers;
    }

    @Override
    public String toString() {
        return "Library{" + "admin=" + admin + ", collectionOfBook=" + collectionOfBook + ", brrowersList=" + borrowers + '}';
    }

    

    /* Collections.sort(find);

        for (int i = 0; i < find.size(); i++) {
            for (int j = 0; j < collectionOfBook.size(); j++) {
                 boolean f =find(i).
                if (  collectionOfBook.get(j).getBookTitle() ) {
                    
                }
                
                
                
                
                
            }
            
            
            
            
        }
        
        
        
        
        
          
    }*/
    @Override
    public void search(Book book) {

        int arr1[] = new int[collectionOfBook.size()];
        for (int i = 0; i < collectionOfBook.size(); i++) {
            arr1[i] = collectionOfBook.get(i).getISBNnumber();

        }

        for (int i = 0; i < arr1.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < arr1.length; j++) {

                // Checking elements
                int temp = 0;
                if (arr1[j] < arr1[i]) {

                    // Swapping
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }

            // Printing sorted array elements
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                if (arr1[i] == collectionOfBook.get(j).getISBNnumber()) {

                    Book book2 = collectionOfBook.get(i);
                    collectionOfBook.set(i, collectionOfBook.get(j));
                    collectionOfBook.set(j, book2);

                }

                

            }
        
        }
           
            int last = collectionOfBook.get(collectionOfBook.size() - 1).getISBNnumber();
                int first = collectionOfBook.get(0).getISBNnumber();

               
                System.out.println("The list number well start from  (" + first + " to " + last + " )");
                int key = book.getISBNnumber();
                
                
            int mid = (first + last) / 2;
            while (first <= last) {
                if (arr1[mid] < key) {
                    first = mid + 1;
                } else if (arr1[mid] == key) {
                    System.out.println("The Book was found in index: " + mid  +"    "+ collectionOfBook.get(mid));
                    break;
                } else {
                    last = mid - 1;
                }
                mid = (first + last) / 2;
            }
            if (first > last) {
                System.out.println("Element is not found!");
            }

        }

    }

