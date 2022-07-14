import java.util.Scanner;
class InvalidCountryException extends Exception  {
	InvalidCountryException(String s) {
		super(s);
	}
}
class UserRegistration
{
    public void registerUser(String username, String usercountry) throws InvalidCountryException {
        if(usercountry.equalsIgnoreCase("India")) {
            System.out.println("User registration done successfully");
        } else {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
    }
	public static void main(String[] args) {
	    String str1, str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        str1=sc.next();
        System.out.println("Enter Country");
        str2=sc.next();
        try {
            UserRegistration obj=new UserRegistration();
            obj.registerUser(str1, str2);
        } catch (InvalidCountryException e) {
			e.printStackTrace();
		}
	}
}