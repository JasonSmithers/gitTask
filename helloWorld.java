import java.util.Scanner;
public class helloWorld {


	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please provide a sentence");
		String sentence = userInput.nextLine();
		
		System.out.print(sentence);

	}

}
