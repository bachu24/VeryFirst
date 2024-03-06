import java.lang.Math;

public class Rectangle {
	int width;
	int length;
	Rectangle(){
		width=1;
		length=1;
	}
	Rectangle(int w, int l){
		width=w;
		length=l;
	}
	double findArea() {
		return width*length;
	}
	double findPerimeter() {
		return 2*(width+length);
	}
	double findDiagonal() {
		return Math.sqrt(width*width+length*length);
	}
	boolean isSquare(){
		return width==length;
	
	}
	void pritnBasicInfo() {
		System.out.print("The width is "+width);
		System.out.print("The length is "+length);
	}
}