/* CODE 4 MGRADY03 IE MARY GRADY*/

import java.util.*; 
import java.util.Scanner;
import java.Random;

public class Game{
  
    private Scanner scan = new Scanner(System.in); 

  
  public static void main(String args [])
  {
     Random rand = new Random();
    
    boolean answer=true;
    
    while(answer) //KEEP EM PLAYING TILL THEY SAY NO
    {
      int i = rand.nextInt(10);
      
      switch(i){ //switch case bc im extra. this randomizes the locations and gives you a random one. 10 seemed like enough
        case 0: forest();
          break; 
        case 1: ocean();
          break;
        case 2: hauntedHouse();
          break;
        case 3: hospital();
          break;
        case 4: rave();
          break;
        case 5: concert();
          break;
        case 6: car();
          break;
        case 7: apocolypse();
          break;
        case 8: school();
          break;
        case 9: pittsburgh();
          break;
      }
      
      System.out.println("play again? Enter y (yes) or n (no). if not y or n ur stupid its gonna be no.");
        char result= scan.nextLine().toLowerCase();
      
      if(result=='y')
          answer=true;
      else
        answerr=false;
  
    }
    
    System.out.println("Thanks for playing please go do something with your life now.");
    
  }
  
  
  //BELOW ARE THE POSSIBLE GAME SCENES YOU ARE GIVEN. THIS IS RANDOM. 10 POSSIBLE LOCATIONS! 
  
  public void forest()
  {
    System.out.println("You are standing in the middle of the forest.");
      String result=scan.nextLine();
  }
  
   public void ocean()
  {
    System.out.println("You are on a boat in the middle of the pirate infested indian ocean with a half kilo of cocaine.");
      String result=scan.nextLine();
  }
  
   public void hauntedHouse()
  {
    System.out.println("You are shaken awake by your friend screaming in a haunted house.");
      String result=scan.nextLine();
  }
  
   public void hospital()
  {
    System.out.println("You wake up in the hospital from a 3 year long coma.");
      String result=scan.nextLine();
  }
  
   public void rave()
  {
    System.out.println("You are high on molly in the pit of a rave.");
      String result=scan.nextLine();
  }
  
   public void concert()
  {
    System.out.println("You are sitting in seat 4A at the boston symphony orchestra.");
      String result=scan.nextLine();
  }
  
   public void car()
  {
    System.out.println("You are driving your subura up a snowy mountain.");
      String result=scan.nextLine();
  }
  
   public void apocolypse()
  {
    System.out.println("You are standing face to face with your ex-lover who is now a vampire.");
      String result=scan.nextLine();
  }
  
   public void school()
  {
    System.out.println("You are falling asleep listening to your professor talk about ancient china.");
      String result=scan.nextLine();
  }
  
   public void pittsburgh()
  {
    System.out.println("You are standing on the beam of the downtown bridge.");
      String result=scan.nextLine();
  }
  
  public void end()
  {
   System.out.println("The End."); 
  }
  
  
}
