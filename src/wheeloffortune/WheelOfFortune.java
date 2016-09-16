/*
* IST 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* TODO: DON'T FORGET TO PUT YOUR NAME AND ID
* Student: Anthony Curran
* ID: afc5125
*/
package wheeloffortune;

import java.util.Scanner;

public class WheelOfFortune {
    

  public static void main(String[] args) {
      input();
  }
  
  public static void input(){
    String input;
    String letter;
    Scanner scanner = new Scanner(System.in);
    
      System.out.println("Welcome to Wheel of Fortune!\n Type 'Spin' to spin the wheel.\n"
              + "Type 'Vowel' to buy a vowel.\n Type 'Solve' to solve the puzzle.\n"
              + "Type 'Test' to be a QA Tester.\n Type 'Quit' to quit.");
      input = scanner.next();
      System.out.println(input);
      
      while (input != "0"){
          if ("Spin".equals(input)){
              input = "You've spun the wheel.";
              System.out.println(input);
              System.out.println("Pick a letter");
              letter = scanner.next();
                if(letter.matches("[A-z]")){
                    System.out.println("You picked the letter " +  letter);
                    input();
                   
                }
                else {
                    System.out.println("I'm sorry but that's not a letter,"
                    + "try entering an actual letter. ");
                    input();
                            }
          }
      }
  }
  
}
