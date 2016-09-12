//Person.java
public class Person {
	// composition has-a relationship
	private Job job;
	private Education education;

	public Person() {
		this.job = new Job();
		this.education = new Education();
		job.setSalary(1000L);
		job.setRole("Some role");
		String s[]=new String [10];
		s[1]=new String("School 1");
		s[2]=new String("School 2");
		s[3]=new String("School 3");
		s[4]=new String("School 4");
		s[5]=new String("School 5");
		s[6]=new String("School 6");
		s[7]=new String("School 7");
		s[8]=new String("School 8");
		s[9]=new String("School 9");
		s[0]=new String("School 10");
		education.setSchools(s);
	}

	public long getSalary() {
		return job.getSalary();
	}
	
	public String toString(){
		return(job+"\n"+education);
	}
}