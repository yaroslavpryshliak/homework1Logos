package homework;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int [][] array = new int [3][3]; 
		Scanner sc = new Scanner(System.in);
		/*print(array); //dryk matruzi --- ne obovjazkove
*/		boolean isRun = true;   // true dla while 
		while (isRun) {
			user(array, sc); // metod vvody dla korustyva4a
			System.out.println("User :"); // shematu4no
			print(array); // vuvid pisla vubory koordunat
			if (isGameOver(array)) break; // perevirka na 0 masuvah;
			cpu(array);
			System.out.println("CPU:");
			print(array);
			int isUserWin = whoWin(array);
			int isCpuWin = whoWin(array);
			if(isCpuWin == -1||isUserWin == 1){
				isRun = false;
				if(isCpuWin==-1){
					System.out.println("Cpu win");
				}else if(isUserWin==1){
					System.out.println("User win");
		}
	}
		}
	}
		static boolean isGameOver(int [] [] array){
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if(array[i][j]==0)return false;	}
				}
			return true;
		}
		static int whoWin(int [] [] array){{
			int wur = 0; int vus = 0; int dia1 = 0;  int dia2 = 0;
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array.length; j++) {
	                if (array[i][j] == 1) wur++; 
	                if (array[j][i] == 1) vus++;
	                if (array[i][j] == -1) wur--;
	                if (array[j][i] == -1) --vus;
	            }
	            if (wur == 3 || vus == 3) {
	                return 1;
	            }
	            if (wur == -3 || vus == -3) {
	                return -1;
	            }
	        }
	        for (int i = 0, j = 0; i < array.length ; i++) {//livui verh v pravui nuz
	            if (array[i][j] == 1) dia1++;
	            j++;
	            if(array[i][j] == -1) ++dia1;
	            --j;
	        }
	        if (dia1 == 3) {
	            return 1;
	        }
	        if (dia1 == - 3) {
	            return -1; 
	        }          
	        for (int i = 0, j = 2; i < array.length ; i++) { //livui nuz v pravui verh
	            if (array[i][j] == 1) dia2++;
	            j--;
	            if (array[i][j] == - 1) dia2--;
	            j++;
	        }
	        if (dia2 == 3) {
	            return 1;
	        }
	        if (dia2 == - 3) {
	            return -1;
	        }
			return 0;
			}
}			
		static void cpu( int [][] array){
			int x = (int) (Math.random() * 3);
			int y = (int) (Math.random() * 3);
			if (array[x][y] == 1 || array[x][y] == -1){ cpu(array); } // prohodut' povtorno
			while (array[x][y] == 0  ) { array[x][y] = -1; } //stave -1
			
		}
		
		static void user(int [] [] array, Scanner sc){
			System.out.println("Enter x:");
			int x = sc.nextInt()-1; // x = 0 , 1, 2(pru - minys 1) (pru vvodi korustyva4a 123)
			System.out.println("Enter y:"); 
			int y = sc.nextInt()-1; //y = 0 , 1, 2(pru - minys 1) (pru vvodi korustyva4a 123)
			array[y][x] = 1; // ---v zalewnosti vid zadanuh koordunat PRINT X == 1 [i][j]
		}
		
		static void print( int [] [] array ){
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++)           { /// 3 v rjadok   ///
					if(array[i][j]==0){System.out.print("  ");}
					if(array[i][j]==-1){System.out.print("0 ");}
					if(array[i][j]==1){System.out.print("x ");}    }
				
				System.out.println(); /// probel v nuz vid perwogo masuvy
				
			}
		}
	
	
	
}
