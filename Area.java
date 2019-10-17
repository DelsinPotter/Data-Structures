import java.util.Scanner;
class Area{
		static float length,breadth;
		public static void setDim(float len,float width){
		length=len;
		breadth=width;}
		public static float getArea(){
		return (length)*(breadth);}
		
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter length and breadth respectively");
		setDim(sc.nextFloat(),sc.nextFloat());
		System.out.println("\nArea="+getArea());
		}
}