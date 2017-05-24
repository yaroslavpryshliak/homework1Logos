package homework;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
	//Parne or notParne (if-else #1)
	   {sc = new Scanner(System.in);
		System.out.println("Vvedit' zile 4uslo dlja perevirku parnosti : ");
		int res = sc.nextInt();
			boolean bool = (res % 2) == 0;
		if (bool){
		System.out.println("Vvedene 4uslo parne");}
		else{System.out.println("Vvedene 4uslo neparne");}}
	//Parne or notParne (if-else #1)
		System.out.println(" ");
	//Naibluw4e do 10 (if-else #2)
	   {int i = 10;
		double m = 8.5;
		double n = 11.45;
		double a = i - m;
		double b = n - i;
			 if(a<b){System.out.println("4uslo: "+m+" bluw4e do 4usla - "+i+" Niw: "+n);}
		else if(b<a){System.out.println("4uslo: "+n+" bluw4e do 4usla - "+i+" Niw: "+m);}
		else if(a==b){System.out.println("4uslo M="+m+" ta 4uslo N="+n+" rivni miw sobojy po dovwuni do 4usla 10");}}
	//Naibluw4e do 10 (if-else #2)
	   System.out.println(" ");
	//Duskruminant (if-else #3)
	   {double D, a = 2, b = 4, c = 2;
		D = Math.pow(b, 2) - 4 * a * c;
		System.out.println("Duskriminant = "+D);
		if(D > 0){
			double x1 = (-b + Math.sqrt(D)) / (2 * a);
			double x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("Rivnjanja maje 2 riznuh diusnuh koreni: x1 = " + x1 + ", x2 = " + x2);} 
		else if (D == 0){
			double x = -b /(2 * a);
			System.out.println("Rivnjanja maje 1 korin' (2 odunakovi koreni): x1,2 = " + x);}
		else if(D < 0) {
			System.out.println("Rivnjanja nemaje diusnuh koreniv");}}
	//Duskruminant (if-else #3)
	   System.out.println(" ");
	//Poslidovnist' vid 1000 do 9997 (Loops #1)
	   {for(int i = 997; i < 9997; ){
		   int sum = i += 3;
		   System.out.println(sum);}}
	//Poslidovnist' vid 1000 do 9997 (Loops #1)
	   System.out.println(" ");
	//Poslidovnist' vid 1 do 109 (Loops #2)
	   {for(int i = -1; i < 109; ){
		   int sum = i += 2;
		   System.out.println(sum);}}
	//Poslidovnist' vid 1 do 109 (Loops #2)
	   System.out.println(" ");
	//Poslidovnist' vid 90 do 0 (krok 5) (Loops #3)
 	 {int num = 90;
	  while (num > -1) {
      System.out.println(num);
	  num-=5;}}
	//Poslidovnist' vid 90 do 0 (krok 5) (Loops #3)
 	  System.out.println(" ");
 	//Poslidovnist' 2 v stepeni vid 1 do 20 (Loops #4)
		{for(int i = 1; i <= 20; i++ ){
			int sum = (int) Math.pow(2, i);
			System.out.println(sum);}}
	//Poslidovnist' 2 v stepeni vid 1 do 20 (Loops #4)
	  System.out.println(" ");
    //Poslidovnist' 2a-1 a=2 (Loops #5)
		{for(int a = 2; a < 10000; a = 2*a-1 ) { //zidaje perwe 2 jakwo zabratu z cukly 3 ymovy
			System.out.print(" "+a+" ");}
	//Poslidovnist' 2a-1 a=2 (Loops #5)
	  System.out.println(" ");
	  System.out.println(" ");
    //Poslidovnist' 2a+200 a=-166 (Loops #6)
	  {for(int a = -166 ; a < 100 ;){
		  a=2*a+200;
	  if(a>-100&&a<100){System.out.println("Dvohzna4numu 4lenamu poslidovnosti a bydyt' 4usla: "+a);}}
	//Poslidovnist' 2a+200 a=-166 (Loops #6)
	  System.out.println(" ");
	//Factorial 4usla from buttons (Loops #7)
		{	sc = new Scanner(System.in);
			System.out.println("Vvedit' natyral'ne 4uslo N!: ");
		if(sc.hasNextInt()){
			int fact = sc.nextInt();
			int sum = 1;
				for(int i = fact; 0 < i; --i ){
				sum = sum * i; 
			}System.out.println(sum);} //drykye ostanje zna4enja @sum@ (v sereduni pokazyje zukl)}
		else System.out.println("Vvedene ne 4uslo");}	
    //Factorial 4usla from buttons (Loops #7)
		System.out.println(" ");
	//Pozutuvni podilnuku natyralnogo 4usla (Loops #8)
		{	sc = new Scanner(System.in);
			System.out.println("Vvedit' natyral'ne 4uslo: ");
		if(sc.hasNextInt()){
			int nat = sc.nextInt();
			for(int i = nat; 0 < i; --i ){
				int sum = nat % i; 
				System.out.println(sum);
				if(sum == 0)
             System.out.println(i+" - e dilnukom vvedenogo 4usla ");}}//Peredajem i % == 0
		else System.out.println("Vvedene ne 4uslo");}
	//Pozutuvni podilnuku natyralnogo 4usla (Loops #8)
	}
}
	}
}

	
		
		

		
	




 