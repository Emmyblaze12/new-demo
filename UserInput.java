import java.util.*;

public class UserInput{

public static String name(String name){
 return name;
}

	
public static void main(String... args){

Scanner sc = new Scanner(System.in);
System.out.print("What`s your name?: ");

String name = sc.nextLine();
String user = name(name);
 System.out.println("Hello Mr "+user+", thank you for using our application");

}

}
