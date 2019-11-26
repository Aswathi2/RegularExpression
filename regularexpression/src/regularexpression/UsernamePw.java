package regularexpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UsernamePw {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter email id");
	String user=s.next();
	System.out.println("enter password");
	String pw=s.next();
	//pattern for email id
	String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	//pattern for password
	Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
	 //pattern is object and Pattern is a class
	Pattern pattern = Pattern.compile(regex);
	//matcher is a class
	 Matcher em=pattern.matcher(user);
	 Matcher emm=pswNamePtrn.matcher(pw);
	 if(em.matches())
	System.out.println("valid email");
	 else
		 System.out.println("invalid email");
	 if(emm.matches())
			System.out.println("valid pw");
			 else
				 System.out.println("invalid pw");
	

		}

	}


