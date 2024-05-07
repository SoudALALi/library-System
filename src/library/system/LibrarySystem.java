/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Soud Al-Ali
 */
public class LibrarySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> listOfAuthors = new ArrayList<>();
        ArrayList<String> listOfAuthors2 = new ArrayList<>();
        ArrayList<String> listOfAuthors3 = new ArrayList<>();
        ArrayList<String> listOfAuthors4 = new ArrayList<>();
        ArrayList<String> listOfAuthors5 = new ArrayList<>();
        ArrayList<String> listOfAuthors6 = new ArrayList<>();
        
        
        
        listOfAuthors.add(new String("David Baldacci"));
        listOfAuthors2.add(new String("Agatha Christie"));
        listOfAuthors3.add(new String("Stephen King"));
        listOfAuthors4.add(new String("sddPenny Jordan"));
        listOfAuthors.add(new String("John Grisham"));
        listOfAuthors5.add(new String("James Patterson"));
        listOfAuthors6.add(new String("Jirō Akagawa"));
        listOfAuthors6.add(new String("Horatio Alger"));

        ArrayList<String> topicInerests = new ArrayList<>();
        ArrayList<String> topicInerests2 = new ArrayList<>();
        ArrayList<String> topicInerests3 = new ArrayList<>();
        ArrayList<String> topicInerests4 = new ArrayList<>();
        ArrayList<String> topicInerests5 = new ArrayList<>();
        ArrayList<String> topicInerests6 = new ArrayList<>();

        topicInerests.add(new String("Race"));
        topicInerests.add(new String("Youth"));
        topicInerests.add(new String(" Friendship"));
        topicInerests.add(new String("Death"));
        topicInerests.add(new String("travelers"));
        topicInerests.add(new String("Revenge"));
        topicInerests.add(new String("Coming of aga"));
        topicInerests.add(new String("Redemption"));
        topicInerests.add(new String("Love"));
        topicInerests.add(new String("Good "));
        topicInerests.add(new String("evil"));

        topicInerests2.add(new String("Race"));
        topicInerests2.add(new String("Youth"));
        topicInerests2.add(new String(" Friendship"));
        topicInerests2.add(new String("Death"));
        topicInerests2.add(new String("travelers"));
        topicInerests2.add(new String("Revenge"));
        topicInerests2.add(new String("Coming of aga"));

        topicInerests3.add(new String("Coming of aga"));
        topicInerests3.add(new String("Redemption"));
        topicInerests3.add(new String("Love"));
        topicInerests3.add(new String("Good "));
        topicInerests3.add(new String("evil"));

        topicInerests4.add(new String("Death"));
        topicInerests4.add(new String("travelers"));
        topicInerests4.add(new String("Revenge"));

        topicInerests5.add(new String("Love"));
        topicInerests5.add(new String("Good "));
        topicInerests5.add(new String("evil"));
        topicInerests5.add(new String("Death"));
        topicInerests5.add(new String("travelers"));
        topicInerests5.add(new String("Revenge"));

        topicInerests6.add(new String("Good "));
        topicInerests6.add(new String("evil"));
        topicInerests6.add(new String("Death"));

        ArrayList<Book> collectionOfBook = new ArrayList<Book>();

        collectionOfBook.add(new Book("The Catcher in the Rye", listOfAuthors, 12, true));
        collectionOfBook.add(new Book("Wuthering Heights ", listOfAuthors2, 2, true));
        collectionOfBook.add(new Book("Crime and Punishment", listOfAuthors4, 13, true));
        collectionOfBook.add(new Book("The Brothers Karamazov", listOfAuthors, 4, true));
        collectionOfBook.add(new Book("Lolita", listOfAuthors5, 5, true));
        collectionOfBook.add(new Book("The Divine Comedy", listOfAuthors3, 6, true));
        collectionOfBook.add(new Book("Madame Bovary", listOfAuthors6, 7, true));
        collectionOfBook.add(new Book("Pride and Prejudice", listOfAuthors5, 8, true));
        collectionOfBook.add(new Book("The Odyssey", listOfAuthors2, 9, true));
        collectionOfBook.add(new Book("Hamlet", listOfAuthors2, 10, true));
        collectionOfBook.add(new Book("War and Peace ", listOfAuthors, 11, true));
        collectionOfBook.add(new Book("Moby sick", listOfAuthors, 1, true));
        collectionOfBook.add(new Book("The Great Gatsby", listOfAuthors4, 3, true));
        collectionOfBook.add(new Book("One Hundred Years of Solitude", listOfAuthors5, 14, true));
        collectionOfBook.add(new Book("Don Quixote", listOfAuthors3, 15, true));
        collectionOfBook.add(new Book("Ulysses ", listOfAuthors, 16, true));

        ArrayList<Borrower> brrowersList = new ArrayList<Borrower>();
        ArrayList<Book> borroweBooks = new ArrayList<Book>();
        ArrayList<Book> borroweBooks2 = new ArrayList<Book>();
        ArrayList<Book> borroweBooks3 = new ArrayList<Book>();
        ArrayList<Book> borroweBooks4 = new ArrayList<Book>();
        ArrayList<Book> borroweBooks5 = new ArrayList<Book>();
        ArrayList<Book> borroweBooks6 = new ArrayList<Book>();

        brrowersList.add(new Borrower(topicInerests, borroweBooks, "sam", "0791440242"));
        brrowersList.add(new Borrower(topicInerests2, borroweBooks2, "ali", "0791440242"));
        brrowersList.add(new Borrower(topicInerests3, borroweBooks3, "sara", "0791440242"));
        brrowersList.add(new Borrower(topicInerests4, borroweBooks4, "ahmad", "0791440242"));
        brrowersList.add(new Borrower(topicInerests5, borroweBooks5, "saif", "0791440242"));
        brrowersList.add(new Borrower(topicInerests6, borroweBooks6, "sa'ad", "0791440242"));

              Admin Soud = new Admin(300, 9, "Soud", "0781882136");
        Library THETOP = new Library(Soud, collectionOfBook, brrowersList);
        
        CheckOut sell = new CheckOut();
        sell.IfBookAvaliable(collectionOfBook.get(1), brrowersList.get(3));
        
        CheckOut sell3 = new CheckOut();
        sell.IfBookAvaliable(collectionOfBook.get(1), brrowersList.get(3));
        
       System.out.println(brrowersList.get(3).getBorroweBooks());
        System.out.println(brrowersList.get(4).getBorroweBooks());
        
        
        
        System.out.println("");
        
         for (int i = 0; i < collectionOfBook.size(); i++) {

            System.out.print(THETOP.getCollectionOfBook().get(i).getISBNnumber() + "  ");

        }
         System.out.println("");
         
         System.out.println("");
           THETOP.search(collectionOfBook.get(5));
         System.out.println("");
        
        brrowersList.get(3).search(collectionOfBook.get(5));
        
    }

}
