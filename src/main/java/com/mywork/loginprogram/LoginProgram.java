/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mywork.loginprogram;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class LoginProgram 
{

    public static void main(String[] args)       
    { Scanner loginScanner = new Scanner(System.in);
        
        String correctUsername = "user";
        String correctPassword = "password";
        
//        This code sets the correct username and password that the user needs to provide for a successful login.
        
        int maxAttempts = 3;
        int attempts = maxAttempts;
        
//        This code sets the maximum number of login attempts (maxAttempts) and initializes the variable attempts to keep track of the remaining login attempts.
        
        while (attempts > 0)
        {System.out.print("Enter your username: ");
        String inputUsername = loginScanner.nextLine();
        
        System.out.print("Enter your password: ");
        String inputPassword = loginScanner.nextLine();
        
//       This code prompts the user to enter their username and password and reads the input using the Scanner object.
        
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword))
        { System.out.println("Login successful. Welcome!");
          break;
        }
        
//        This code checks if the entered username and password match the correct credentials. If so, prints a success message, and the loop is exited with the break statement.
        
        else
        {System.out.println("Login failed. Please try again.");
            attempts--;
            System.out.println("You have " + attempts + " attempts remaining.");
        }
        
        }
   
        if (attempts == 0)
        {System.out.println("Login attempts exceeded. Exiting program.");
        }

//        This code checks if the maximum login attempts have been reached. If so, prints a message indicating that login attempts are exceeded.
        
        loginScanner.close();
        
//        This code closes the Scanner.
        
        }
    }
