import java.util.Scanner;
class Employee{
int salary,workhours;
void getInfo(int salary1,int workhours1){
		this.salary=salary1;
		this.workhours=workhours1;
}
void addSal(){
if(this.salary<500){
this.salary+=10;}}
void addWork(){
if(this.workhours>6){
this.salary+=5;}
}}
class CallerClass{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Please enter your salary and work hours:\n(Please press enter after each entry)\n");
 int workersalary=sc.nextInt();
 int workerhours=sc.nextInt();
 Employee e=new Employee();
 e.getInfo(workersalary,workerhours);
 e.addSal();
 e.addWork();
 System.out.println("\nNew salary="+e.salary);
}}