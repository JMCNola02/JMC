package Lab02;
import java.util.Scanner;
public class LearningProgramming2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();
		int problems = input.nextInt();
		int hour = 60;
		int time = minutes * problems;
		if(time <= hour){
			System.out.println(true);
		}
		else{
			System.out.println(false);
			}
		}
	}
