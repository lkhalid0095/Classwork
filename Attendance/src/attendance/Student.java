package attendance;

public class Student implements Attendee {
	private String firstName;
	private String lastName;
	
	public Student(String firstName,String lastName) {
		firstName = "";
		lastName = "";
	}
	@Override
	public boolean isPresent() {
		if(setPresent() == String "Present") 
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPresent(boolean present) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean mathces(String first, String last) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean matches(String last) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getReportString() {
		// TODO Auto-generated method stub
		return null;
	}

}
