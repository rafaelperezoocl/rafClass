package model;

public class Student {
	private String studName;
	private int studAge;
	private String studGender;
	private int studIDNumber;
	
	
	 public String getName() {
	        return studName;
	    }

	    public void setName(String name) {
	        this.studName = name;
	    }
	    
		 public int getstudAge() {
		        return studAge;
		    }

		    public void setstudAge(int studAge) {
		        this.studAge = studAge;
		    }   
	    
		    public String getstudGender() {
		        return studGender;
		    }

		    public void setstudGender(String studGender) {
		        this.studGender = studGender;
		    }
		    public int getstudIDNumber() {
		        return studIDNumber;
		    }

		    public void setstudIDNumber(int studIDNumber) {
		        this.studIDNumber = studIDNumber;
		    }
}
