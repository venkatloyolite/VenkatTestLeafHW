package HW2;

public class ClassLibraryManagement {

	public static void main(String[] args) {
		
		Library Call = new Library();
		String Books = Call.addBook("Science");
		System.out.println("Book Name is" +Books);
		Call.issueBook();
				
		
		// TODO Auto-generated method stub

	}

}
