package Assignment;

interface LibraryUser {
	void registerAccount();

	void requestBook();
}

class KidUsers implements LibraryUser {
	int age;
	String bookType;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public void registerAccount() {
		if (age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		} else if (age > 12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	public void requestBook() {

		if (bookType.equalsIgnoreCase("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}

class AdultUser implements LibraryUser {
	int age;
	String bookType;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public void registerAccount() {
		if (age > 12) {
			System.out.println("You have successfully registered under a Adult Account");
		} else if (age < 12) {
			System.out.println("Sorry, Age must be greater than 12 to register as a adult");
		}
	}

	public void requestBook() {
		if (bookType.equalsIgnoreCase("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult Friction books");
		}
	}
}

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers kidUsers = new KidUsers();
		kidUsers.setAge(10);
		kidUsers.setBookType("Kids");
		kidUsers.registerAccount();
		kidUsers.requestBook();
		AdultUser adultUser = new AdultUser();
		adultUser.setAge(18);
		adultUser.setBookType("Fiction");
		adultUser.registerAccount();
		adultUser.requestBook();
	}
}