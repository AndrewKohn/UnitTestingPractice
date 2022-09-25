/*
	UnitTestingPractice
		learning and testing out JUnit testing
 */

public class UnitTestingPractice
{
	public static void main(String[] args)
	{
		SimpleCalculator sc = new SimpleCalculator();

		System.out.println(sc.add(4,5));
	}
}

class SimpleCalculator {
	public int add(int a, int b){
		return a + b;
	}
}

class Grader {
	public char determineLetterGrade(int numberGrade){
		if(numberGrade < 0){
			throw new IllegalArgumentException("Grade cannot be lower than 0");
		}else if(numberGrade < 60){
			return 'F';
		}else if(numberGrade < 70){
			return 'D';
		}else if(numberGrade < 80){
			return 'C';
		}else if(numberGrade < 90){
			return 'B';
		}else{
			return 'A';
		}
	}
}