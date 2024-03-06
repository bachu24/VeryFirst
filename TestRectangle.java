
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle box1= new Rectangle();
		Rectangle box2= new Rectangle(1,3);
		System.out.println("Width: "+box1.width);
		System.out.println("Length: "+box1.length);
		
		System.out.println("Perimeter: "+box1.findPerimeter());
		System.out.println("Diagonal: "+box1.findDiagonal());
		if(box1.isSquare()){
			System.out.println("It is a square box");
		}else {
			System.out.println("It is a square box");
		}
		
		System.out.println("Width: "+box2.width);
		System.out.println("Length: "+box2.length);
		System.out.println("Perimeter: "+box2.findPerimeter());
		System.out.println("Diagonal: "+box2.findDiagonal());
		if(box2.isSquare()){
			System.out.println("It is a square box");
		}else {
			System.out.println("It is not a square box");
		}
		
	}

}
