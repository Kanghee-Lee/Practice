
public class Triangle {
	double length, heigth;
	
	public Triangle() {
		length=0;
		heigth=0;
	}
	
	public Triangle(double num) {
		length=heigth=num;
	}
	
	public Triangle(double num1, double num2) {
		length=num1;
		heigth=num2;
	}
	
	public void change(double a, double b) {
		length=a;
		heigth=b;
	}
	
	public double area(){
		double result=length*heigth/2;
		return result;
	}
}
