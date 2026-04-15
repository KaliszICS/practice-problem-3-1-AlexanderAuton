
/**

        * File: Lesson 3.1 - if

        * Author: A.Auton

        * Date Created: March 23, 2026

        * Date Last Modified: April 15, 2026

        */
	   public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static String evenOrOdd(int num)
	 {
if (num%2 == 0) {
	return "Even";
}
return "Odd";		
}
public static String teacherOrStudent(String s)
	{
if (s == "Kalisz"){
		return "Teacher";
}
return "Student";
	}
public static int fartherFromZero(int num) 
{
	if (num > 0){
		return (num + 5);
	}
	if (num < 0){
		return (num - 5);
	}
	return 0;
}
}