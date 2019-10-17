import java.util.Scanner;
class Area2{
		static float length,breadth;
		Area2(float x,float y){
		length=x;
		breadth=y;}
		public static float returnArea(){
		return (length)*(breadth);}
		
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter length and breadth respectively");
		Area2 a=new Area2(sc.nextFloat(),sc.nextFloat());
		System.out.println("\nArea="+a.returnArea());
		}
}