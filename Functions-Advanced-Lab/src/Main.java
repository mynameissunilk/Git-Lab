import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		//Q1
		evenTest(22);
		evenTest(13);

		//Q2
		//stringCompare("hello", "hello");
		System.out.println(stringCompare("jfkld;", ";lkjf"));

		//Q3
		letterPrint("Whale");
		letterPrint("Jamaica Mon \n");

		//Q4
		System.out.println(genRandom());
		System.out.println(genRandom());
		System.out.println(genRandom());

		//Q5
		nextDay(06,22,2016);

		//Q6
		omitWord("Hippopotamus \n");

		//07
		gThan5(8);

		//Q8
		sameIntTest(2,2);
		sameIntTest(2,3);

		//Q9
		getLocale("us");
		getLocale("de");
		getLocale("hu");
		getLocale("Abuja, Nigeria");

		//Q10
		vowelCons();
    }

    /** Question 1 **/
    public static Boolean evenTest(int a){
        if(a % 2 == 0 ){
            return true;

        }
		return false;
	}

    /** Question 2 **/
    public static Boolean stringCompare(String a, String b){
        for(int i = 0; i <= a.length()-1; i++ ){
                if(a.charAt(i) != b.charAt(i))
                    return false;
		}

		return true;
    }

    /** Question 3 **/
    public static void letterPrint(String s){
        for(int i = 0; i <= s.length()-1; i++){
            System.out.print(s.charAt(i) + " ");
			if(s.charAt(i) == 'w' || s.charAt(i) == 'W')
				break;
		}
    }

    /** Question 4... use random  **/
    /** generate random number, print it, if greater than 50, otherwise return -1**/
    public static int genRandom(){
	Random rand = new Random();
	int randomInteger = rand.nextInt();
	if(randomInteger > 50)
	    return randomInteger;
	else
	    return -1;
    }

    /** Question 5 **/
    public static void nextDay(int d, int m, int y){
		d+=1;
		System.out.println("Tomorrow's Date || Day: " + d + " Month: " + m + " Year " + y);

    }

    /** Question 6 **/
    public static void omitWord(String s){
	for(int i = 0; i <= s.length()-1; i = i + 2){
	    System.out.print(s.charAt(i));
	}
    }

    /** Question 7 **/
    public static void gThan5(int a){
	    java.util.Scanner scan = new Scanner(System.in);
	    String input = scan.next();
	    int parsedInput = Integer.parseInt(input);

		if(parsedInput > 5){
			while(parsedInput > 0){
				if(parsedInput == 4) {
				parsedInput--;
				}
				System.out.println(parsedInput);
				parsedInput--;
			}
		}
	}



    /** Question 8 **/
    public static void sameIntTest(int a, int b){
	if(a != b){
	    a += 1;
	    b += 1;
	    System.out.println(a + b);
	}
	else System.out.println("Same number...");
    }

    /** Question 9 **/
    public static void getLocale(String s){
	String locale;
	switch(s){
	case "us":
	    locale = "United States";
	    break;

	case "de":
	    locale = "Germany";
	    break;

	case "hu":
	    locale = "Hungary";
	    break;

	default:
	    locale = "Unknown";
	    break;
	}
	System.out.println(locale);

    }

    /** Question 10**/
    public static void vowelCons(){
	System.out.println("Enter a letter: ");
	Scanner scan = new Scanner(System.in);
	String input = scan.next();
	for(int i = 0; i <= input.length()-1; i++){
	    if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' )
		System.out.println("VOWEL");
	    else
		System.out.println("CONSONANT");
	}
    }
}
