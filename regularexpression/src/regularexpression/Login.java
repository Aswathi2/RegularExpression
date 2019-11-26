package regularexpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int flag=0;
//inputting from user side
System.out.println("ENTER THE FIRST NAME");
String name=s.next();
System.out.println("ENTER THE SECOND NAME");
String name1=s.next();
System.out.println("ENTER THE EMAIL ID");
String email=s.next();
System.out.println("ENTER THE REGNO");
String regno=s.next();
System.out.println("ENTER THE RANK");
String rank=s.next();
System.out.println("ENTER THE YEAR");
String year=s.next();
System.out.println("ENTER THE DEPARTMENT");
String dept=s.next();
//NAME FORMAT
String n= "[A-Z][a-z]*";
String n1="[A-Z]+([ '-][a-zA-Z]+)*";
//EMAIL FORMAT
String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
//regno format
String r="^[0-9]*$";
//rank format
String ra="^[0-9]$";
//year format
String y="^[0-9]*$";
//dept format
String d="^[A-Z].[a-zA-Z ]*$";
//pattern function to convert into some format
Pattern p=Pattern.compile(n);
Pattern p6=Pattern.compile(n1);
Pattern p1=Pattern.compile(regex);
Pattern p2=Pattern.compile(r);
Pattern p3=Pattern.compile(ra);
Pattern p4=Pattern.compile(y);
Pattern p5=Pattern.compile(d);
//matcher function to check if the input has same format or not
Matcher em=p.matcher(name);
Matcher em1=p6.matcher(name1);
Matcher em2=p1.matcher(email);
Matcher em3=p2.matcher(regno);
Matcher em4=p3.matcher(rank);
Matcher em5=p4.matcher(year);
Matcher em6=p5.matcher(dept);
//if all matches
if(em.matches()&& em1.matches()&&em2.matches()&&em3.matches()&&em4.matches()&&em5.matches()&&em6.matches())
{
	System.out.println("********LOGIN********");
	System.out.println("USER NAME:"+email);
	System.out.println("ENTER THE PASSWORD");
	String pw=s.next();
	//System.out.println();
	Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
	Matcher em7=pswNamePtrn.matcher(pw);
	if(em7.matches())
	{
		System.out.println("USER NAME :\n"+email);
		System.out.println("PASSWORD :\n"+pw);	
		System.out.println("SUCCESSFULLY LOGIN");
	}
	else
		System.out.println("INVALID PASSWORD");

}
else
{
	if(!em.matches())
	{
		System.out.println("Invalid first name");
		flag=1;
	}
	if(!em1.matches())
	{
		System.out.println("Invalid last name");
		flag=1;}
	if(!em2.matches()) {
	
		System.out.println("Invalid email");
		flag=1;}
	if(!em3.matches()) {
		flag=1;
		System.out.println("Invalid regno");}
	if(!em4.matches()) {
		System.out.println("Invalid  rank");
		flag=1;}
	if(!em5.matches()) {
		System.out.println("Invalid year");}
	if(!em6.matches()) {
		System.out.println("Invalid department");
	}
}
}}