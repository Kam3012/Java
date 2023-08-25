
package myjava;

 class School {
	private String Name;
	private String History;
	private String Branch;
	private int Fees;
	
}
     class Teachers extends School{
    	    private String Name;
    		private String History;
    		private String Branch;
    		private int Fees;
    		
    		public String getName() {
    			return Name;
    		}
    		public void setName(String Name) {
    			this.Name=Name;
    		}
    		public String getHistory() {
    			return History;
    		}
    		public void setHistory(String History) {
    			this.History=History;
    		}
    		public String getBranch() {
    			return History;
    		}
    		public void setBranch(String Branch) {
    			this.Branch=Branch;}
    		public int getFees() {
    			return Fees;
    		}
    		public void setFees(int Fees) {
    			this.Fees=Fees;
    		}
    		void display() {
    			System.out.println(Name +" "+ History +" "+ Branch +  " "+ Fees);
    		}}
    	 class Students extends School{
    		 private String Name;
     		private String History;
     		private String Branch;
    	 
    	      public String getName() {
 			  return Name;}
 		      
 		     public void setName(String Name) {
 			  this.Name=Name;}
 		     
 		     public String getHistory() {
 			 return History;}
 		     
 		      public void setHistory(String History) {
 			this.History=History;}
 		
 		     public String getBranch() {
 			  return History;}
 		      
 		     public void setBranch(String Branch) {
 			  this.Branch=Branch;}
 		     
 		    void display1() {
    			System.out.println(Name +" "+ History +" "+ Branch );
    		}
    	 
    	 }

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Teachers t = new Teachers();
		 t.setName("GuruNanak Matric Higher sec school");
		 t.setHistory("Top School in Velachery");
		 t.setBranch("Computer Science");
		 t.setFees(10000);
		 t.display();
		 
		 Students std = new Students();
		 std.setName("GuruNanak Matric Higher sec school");
		 std.setHistory("Top School in Velachery");
		 std.setBranch("Computer Science");
		 std.display1();
		 
	}

	}

