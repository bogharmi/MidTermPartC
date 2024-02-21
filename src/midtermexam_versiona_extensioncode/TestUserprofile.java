/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author MITANSU BOGHARA
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

   
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Science Fiction");
        System.out.println("2. Fantasy");
        System.out.println("3. Thriller");
        System.out.println("4. Romance");

  
        System.out.print("Enter the number of your favorite genre that you like: ");
        int choice = scanner.nextInt();

       
        String userGenre;
        switch (choice) {
            case 1:
                userGenre = "Science Fiction";
                break;
            case 2:
                userGenre = "Fantasy";
                break;
            case 3:
                userGenre = "Thriller";
                break;
            case 4:
                userGenre = "Romance";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Science Fiction.");
                userGenre = "Science Fiction";
        }

       
        UserProfile userProfile = new UserProfile(userName, userGenre);

    
        System.out.println("User Profile created successfully.");
        System.out.println("User Name: " + userProfile.getUserID());
        System.out.println("User's Favorite Genre: " + userProfile.getGenre());

        scanner.close();
    }
}
