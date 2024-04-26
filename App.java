
public class App{

	
public static void main(String... args){

UserData data = new UserData(101,"Bakare Samson",34);System.out.println(data);

}

}

record UserData(int id, String name, int age ){}
