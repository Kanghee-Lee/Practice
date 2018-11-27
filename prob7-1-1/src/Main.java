
public class Main {

	public static void main(String[] args) {
		Triangle tri1 = new Triangle(5.2, 10);
		Triangle tri2 = new Triangle(3, 5);
		
		System.out.println("첫번째 삼각형의 넓이 : " + tri1.area());
		System.out.println("두번째 삼각형의 넓이 : " + tri2.area());
	}

}
