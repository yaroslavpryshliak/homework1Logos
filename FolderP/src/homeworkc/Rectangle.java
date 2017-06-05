package homeworkc;

public class Rectangle {
	
	int length ;
	int width ;
	int s; //plowa
	int p; //perumetr
	
	Rectangle(){
		length = 15;
		width = 6;
	}
	
	Rectangle(int s, int length, int width){
		this.length = length;
		this.width = width;
	}
	
	int plowa(){
		return s = length * width;
		}
	
	int perumetr(){
		return this.p = 2*(this.length + this.width);
		}
	
	
	
}
