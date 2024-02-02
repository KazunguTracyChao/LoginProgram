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
        int maxAttempts = 3;
        int attempts = maxAttempts;
        
        
        while (attempts > 0)
        {System.out.print("Enter your username: ");
        String inputUsername = loginScanner.nextLine();
        
        System.out.print("Enter your password: ");
        String inputPassword = loginScanner.nextLine();
        
       
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword))
        { System.out.println("Login successful. Welcome!");
          break;
        }
        
        else
        {System.out.println("Login failed. Please try again.");
            attempts--;
            System.out.println("You have " + attempts + " attempts remaining.");
        }
        
        }
   
        if (attempts == 0)
        {System.out.println("Login attempts exceeded. Exiting program.");
        }

        
        loginScanner.close();
        
        
        }
    }
