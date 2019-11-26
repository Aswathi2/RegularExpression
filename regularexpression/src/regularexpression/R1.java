package regularexpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class R1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
//pattern and matcher are two classes in regular expression and here 
//the input consist of two variables and last character must be s
Pattern p=Pattern.compile(".s");
Matcher m=p.matcher("a&");
//b receive two values true or false
boolean b=m.matches();
System.out.println(b);
	}

}
