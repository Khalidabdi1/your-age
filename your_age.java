import java.util.Scanner;

public class your_age{

static int Try(int year ,int brith_year){
return year-brith_year;

}

public static void main(String[] args) {

Scanner input=new Scanner(System.in);
String name ="khalid";
int age =22;
System.out.println("enter you brith year");
int brith_year =input.nextInt();
System.out.println("enter  year");
int year =input.nextInt();
System.out.println("your age");

System.out.println(Try(year,brith_year));


}

}