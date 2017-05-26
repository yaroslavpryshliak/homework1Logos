package homework;

import java.util.Arrays;
import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
	//Masuvu vid 2 , 4 ... do 20 - Zada4a #1
		{int[] array0 = new int[10]; //Zmina zna4enja kilkosti mistja masuva ne minjae resultat
		for(int i = 2, a = 0; i <21; i += 2 ){
			 if(i>0){
			 array0[a]=i;
			 System.out.print(array0[a]+" ");
			 }}
		System.out.println(" ");
		{for(int j = 2, a = 0; j <21; j += 2 ){
			 if(j>0){
			 array0[a]=j;
			 System.out.println(array0[a]+" ");}}}
													int[]ar = new int[21];
													for (int i = 2; i < ar.length; i=i+2) {
														System.out.print(i+" ");}
													System.out.println(" ");
													for (int j = 2; j < ar.length; j=j+2) {
														System.out.println(j+" ");}
		}
	//Masuvu vid 2 do 20 - Zada4a #1
		System.out.println(" ");
	//Masuvu vid 99 do ... 3 , 1 - Zada4a #2
		{int[] array1 = new int[50]; 
		for(int j = 1, a = 0; j <100; j += 2 ){
			 if(j>0){
			 array1[a]=j;
			 System.out.print(array1[a]+" ");}}
		System.out.println(" ");
		for(int i = 101, a = 0; i > 1; i -= 2 ){
			 if(i>0){
			 array1[a]=i-2;
			 System.out.print(array1[a]+" ");
			 }}}
	//Masuvu vid 99 do ... 3 , 1 - Zada4a #2
		System.out.println(" ");
		System.out.println(" ");
	//Masuv 15 vupadkovuh + parnist' - Zada4a #3
		{int[] array = new int[15];
		for(int i = 0, b=0; i <  array.length; i++) {array[i] =  (int)(Math.random() * 10);
		  if(array[i]%2==0){
			  System.out.println(++b +"./" + " parne wo dilutsa bez osta4i z vidrizky vupadkovuh 15 4usel == " + array[i]);}}}
	//Masuv 15 vupadkovuh + parnist' - Zada4a #3
		System.out.println(" ");
	//Masuv 8 vupadkovuh + zamina neparnosti - Zada4a #4
		{int[] array = new int[8];
		int[] array2 = array;
		for(int i = 0, b=0; i <  array.length; i++) {array[i] =  (int)(Math.random() * 10 + 1);
		  System.out.print(array[i]+ " ");}
		System.out.println(" ");
		for (int j = 0; j < array2.length; ++j) {
			if (array2[j] % 2 != 0){ array2[j] = 0; }
			System.out.print(array2[j]+" ");}}
	//Masuv 8 vupadkovuh + zamina neparnosti - Zada4a #4
		System.out.println(" ");
		System.out.println(" ");
	//Masuv 2 vupadkovuh masuva + 0, 5 - Zada4a #5
		{int[] array = new int[5];
		int[] array2 = new int[5];
		float a = 0;
		float c = 0;
				for(int i = 0, b=0; i <  array.length; i++) {array[i] =  (int)(Math.random() * 6 + 0);
						a = a + array[i];
						System.out.print(array[i]+" ");}
			System.out.println(" ");
			System.out.print(a/array.length+" - serednje zna4enja perwogo masuvy");
			System.out.println(" ");
				for(int j = 0, b=0; j <  array2.length; j++) {array2[j] =  (int)(Math.random() * 6 + 0);
						c = c + array2[j];
						System.out.print(array2[j]+ " ");}
			System.out.println(" ");
			System.out.print(c/array.length+" - serednje zna4enja drygogo masuvy");
			System.out.println(" ");
		if(a>c){System.out.println("Serednje zna4enja perwogo masuvy bilwe drygogo");}
		else if(c>a){System.out.println("Serednje zna4enja drygogo masuvy bilwe perwogo");}
		else if(a==c){System.out.println("Serednje zna4enja dvoh masuviv rivne");}}
	//Masuv 2 vupadkovuh masuva + 0, 5 - Zada4a #5
		System.out.println(" ");
	//Masuv 4 vupadkovuh masuva + 10, 99 - Zada4a #6
		{int[] array = new int[4];
			for(int i = 0; i <  array.length; i++) {array[i] =  (int)(Math.random() * 90 + 10);
		System.out.print(array[i]+" ");}
			if (array[0]<array[1] && array[1]<array[2] && array[2]<array[3]){
                System.out.println("== Masuv e ZROSTAJY4uM !!!...");}
			else System.out.println("== masuv ne zrostajy4ui");}
	//Masuv 4 vupadkovuh masuva + 10, 99 - Zada4a #6         									
		System.out.println(" ");
	//Masuv 20 perwuh 4leniv Fibonachi - Zada4a #7
		int[] array = new int[23];
		array[0] = 1;
		array[1] = 1;
		for(int i = 3; i <  array.length; ++i){
			array[i] = array[i-2]+array[i-1]; // 0, 1 vid nuh vidwtovhyetsa 1 1 ***
			System.out.print(array[i]+" ");}
	//Masuv 20 perwuh 4leniv Fibonachi - Zada4a #7													
		System.out.println(" ");
	//Masuv 12 vupadkovuh - Zada4a #8
		int mass[] = new int[12];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) Math.floor(Math.random() * 31) - 15;
            System.out.print(mass[i] + " ");}
        
        int maxm = mass[0], index = 0;
        for (int j = 0; j < mass.length; j++) {
            if ( mass[j] >= maxm ) { maxm = mass[j]; index = j; }}
        System.out.println("/// Naubilwe 4uslo == " + maxm + " jogo index == " + index);
	//Masuv 12 vupadkovuh - Zada4a #8	                                                 
		System.out.println(" ");
	//Masuvu 3 z vupadkovumu - Zada4a #9
			 {int[] mass1=new int[10];
		     int[] mass2=new int[10];
		     double[]mass3=new double[10];
		     Random rn = new Random();    
		        for(int i = 0; i < 10; i++) { 
		        	mass1[i] = rn.nextInt(9) + 1;
		        	mass2[i] = rn.nextInt(9) + 1;
		        	mass3[i] = (double) mass1[i]/mass2[i];} 
		        int rahz = 0;
		        for(int i = 0; i < mass3.length; i++)
		            if(mass3[i] % 1 == 0) rahz++; //pru dileni odunakovu 4usel rivne       
		        System.out.println(Arrays.toString(mass1)); //arr vuvid v stroky
		        System.out.println(Arrays.toString(mass2));
		        System.out.println(Arrays.toString(mass3));
		        System.out.println("Kilkist' ziluh 4usel v tretjomy masuvi " + rahz);}  
	//Masuvu 3 z vupadkovumu - Zada4a #9
			 System.out.println(" ");
	//Masuv z nau4astiwum elemntom - Zada4a #10
			 {int a=0,b0=0,c1=0;
		        int[] array6 = new int[11];
		        for(int i=0; i<array6.length; i++){
		            array6[i]=(int)(Math.random()*3)-1;
		            System.out.print(array6[i]+" ");	
		            
		            if( array6[i]< 0 )	{ ++a; } //-1+(+1)
		            else if( array6[i]==0 )	 { ++b0; } //0+(+1)
		            else if( array6[i]>0 )	{ ++c1; } //1+(+1)

		         if(i==array6.length-1){				//-1 raniwe dodanui do zna4en' <0, ==0, >0
		                if(a>b0&a>c1)
		                    System.out.println("Chastiwe zystri4aetsa -1");
		                else if(b0>a&b0>c1)
		                    System.out.println("Chastiwe zystri4aetsa 0");
		                else if(c1>a&c1>b0)
		                    System.out.println("Chastiwe zystri4aetsa 1");}}}
	//Masuv z nau4astiwum elemntom - Zada4a #10
		}
}
