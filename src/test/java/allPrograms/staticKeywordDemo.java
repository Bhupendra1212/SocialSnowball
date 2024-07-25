package allPrograms;

 public class staticKeywordDemo {
	
	int employeeid;
	String employeename;
	static String employeecompany="InfiwaveSolutions";
	
	staticKeywordDemo(int employeeid,String employeename){
		this.employeeid=employeeid;
		this.employeename=employeename;
		
	}
	
	
	public void displaymethod() {
		System.out.println(employeeid+" "+employeename+" "+employeecompany);
		

	}
	public static void main(String[] args)  {
	staticKeywordDemo e1=new staticKeywordDemo(101,"Rahul");
	e1.displaymethod();
	staticKeywordDemo e2=new staticKeywordDemo(102,"Rani");
    e2.displaymethod();
	}
}	
 	
		
	
	


