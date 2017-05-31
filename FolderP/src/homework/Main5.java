package homework;

import java.util.Scanner;

public class Main5 {

	private static Scanner sc;
	private static String comto;

	public static void main(String[] args) {
	    System.out.println(comps(comto));  //vuklukaje metod "comps"(na "private static String comto;")
}
	 static int comps(String comto2){
			sc = new Scanner(System.in);
	        System.out.println("Enter first text");
	        String s1 = sc.nextLine();
	        System.out.println("Enter second text");
	        String s2 = sc.nextLine();
	        int len1 = s1.length();
	        int len2 = s2.length(); // rozbuwaem na char vvedeni dani
	        int min = Math.min(len1, len2); // znahodumo minimum dlja vidwtovhyvnja
	        char[] m1 = s1.toCharArray(); // peretvoryjem v masuv chariv m1
	        char[] m2 = s2.toCharArray(); // peretvoryjem v masuv chariv m2
	        int a = 0;
	        while (a < min) { 
	            char c1 = m1[a]; //masuv chary text (po zukly)
	            char c2 = m2[a];
	            if (c1 != c2) {
	                return c1 - c2; // jakwo zminutu minysu zminutsa porjadok minysy perwogo (vertaje roboty nad charamu)
	            }
	            ++a;
	        }
			return len1-len2; // jakwo zminutu minysu (zminutsa porjadok rozmiwenja vid original compareTo (vertaje roboty nad int))
		}
}