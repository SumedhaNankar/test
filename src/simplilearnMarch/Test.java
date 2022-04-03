package simplilearnMarch;

import java.util.Scanner;

public class Test 
{
	public static void main(String[]args)
	{
	   String name;
	   int score=0,ans1, ans2, ans3;
	   Scanner obj = new Scanner(System.in);
	   
	   System.out.println("Enter your name: ");
	   name = obj.nextLine();
	   
	   System.out.println("*********************");
	   System.out.println("Hi, " + name + " welcome to quiz");
	   System.out.println("*********************");
	   
	   //Question 1:
	   System.out.println("Q1. Capital of Arizona");
	   System.out.println("1.Phoenix 2.Tempe 3.Scottsdale");
	   System.out.println("Enter your choice:");
	   ans1 = obj.nextInt();
	   
	   //Question 2:
	   System.out.println("Q2. Capital of Utah");
	   System.out.println("1.Westvalley 2.Salt Lake City 3.Peoria");
	   System.out.println("Enter your choice:");
	   ans2 = obj.nextInt();
	   
	   //Question 3:
	   System.out.println("Q3. Capital of Illinois");
	   System.out.println("1.Chicago 2.Springfield 3.Augusta");
	   System.out.println("Enter your choice:");
	   ans3 = obj.nextInt();
	   
	   //check if answers are correct or not:
	   if(ans1 == 1) {
		   score = score + 20;
	   }
	   if(ans2 == 2) {
		   score = score + 20;
	   }
	   if(ans3 == 1) {
		   score = score + 20;
	   }
	   
	   if(score == 60) {
		   System.out.println("You have a perfect score");
	   }
	   else {
		   System.out.println("Sorry you failed and have a score: " + score);
	   }
	   obj.next();
	}
	
	

}
