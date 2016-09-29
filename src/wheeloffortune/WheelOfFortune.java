/*
* IST 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* TODO: DON'T FORGET TO PUT YOUR NAME AND ID
* Student: Anthony Curran
* ID: afc5125
*/
package wheeloffortune;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class WheelOfFortune {
    // To read from the keyboard
    private static final Scanner _keyboard = new Scanner(System.in);
    
    // Used to get random values for puzzle and wheel
    private static final Random _random = new Random();
    
    // True if we want to show all letters
    private static boolean revealLetters = false;
    
    /*
     These are the wedges that are part of the wheel.
     There are 24.  Some values can appear more than once
    */
    
    private static final List<String> _wedges = Arrays.asList(
            /* 01 */"$5000",
            /* 02 */"$600",
            /* 03 */"$500",
            /* 04 */"$300",
            /* 05 */"$500",
            /* 06 */"$800",
            /* 07 */"$550",
            /* 08 */"$400",
            /* 09 */"$300",
            /* 10 */"$900",
            /* 11 */"$500",
            /* 12 */"$300",
            /* 13 */"$900",
            /* 14 */"BANKRUPT",
            /* 15 */"$600",
            /* 16 */"$400",
            /* 17 */"$300",
            /* 18 */"LOSE A TURN",
            /* 19 */"$800",
            /* 20 */"$350",
            /* 21 */"$450",
            /* 22 */"$700",
            /* 23 */"$300",
            /* 24 */"$600"
    );        
            
    /*
    The number of wedges will not change throughout the game
    We can cache the value so we're not calling .size() over and over
    */        
    private static final int _wedgeCount = _wedges.size();
    
    private static String chooseRandomWedgeValue() {
      // Choose a random index
      int randomWedgeIndex = _random.nextInt(_wedgeCount);
      
      // Return the corresponding wedge
      return _wedges.get(randomWedgeIndex);
    }
    
    // The menu choices
    private static final List<String> _menuChoices = Arrays.asList(
            "1. Spin the wheel",
            "2. Buy a vowel",
            "3. Solve the puzzle",
            "4. Quit the game",
            "", // 5 possibly used in the future
            "", // 6 possibly used in the future
            "", // 7 possibly used in the future
            "8. Toggle puzzle reveal",
            "9. Test letter input"
    );
    
    private static final int _quitChoiceNumber = 4;
    
    // The different puzzles to choose from
    private static final List<String> _puzzles = Arrays.asList(
            "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",
            "PENN STATE ABINGTON",
            "INFORMATION SCIENCES AND TECHNOLOGY"
    );       
    
    /*
    The number of puzzles will not change throughout the game
    We can cache the value so we're not calling .size() over and over
    */
    private static final int _puzzleCount = _puzzles.size();
    
    /*
    We will store the guessed letters in a hash map.
    The "key" will be the character that was guessed
    The "value" will be true/false
    
    Actually, the "value" aspect of this is not relevant.
    Just the fact that a letter appears in the map as a key, is enough to imply
    it was guessed.
    */
    
   private static Map<Character, Boolean> guessedLetters = new HashMap<>();
   
   /*
   Given a puzzle, return a masked version, with hidden letters
   */
   
   private static String maskPuzzle(String puzzle, boolean revealLetters) {
       // Use a string builder, since Java strings are immutable
       StringBuilder maskedPuzzle = new StringBuilder();
       
       // For each letter in the puzzle
       for (int i = 0; i < puzzle.length(); i++) {
           // Current letter
           
       }
   }
}
