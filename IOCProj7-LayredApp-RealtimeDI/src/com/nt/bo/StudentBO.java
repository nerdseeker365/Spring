package com.nt.bo;

public class StudentBO {
<<<<<<< HEAD
	private int sno;
	private String sname;
	private int total;
	private float avg;
	private String result;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
=======
	
	private int sno;
	
	private String sname;
	
	private int total;
	
	private float avg;
	
	private String result;
	
	

	/*these properties used to create table::
	 * 
	 *  
	 *  SQL> create table spring_student (sno number(5) primary key,sname varchar2(20),total number(8),avg number(10,2),result varchar2(10));
*/
	public int getSno() {
		
		return sno;
		
	}
	
	public void setSno(int sno) {
		
		this.sno = sno;
		
	}
	
	public String getSname() {
		
		return sname;
		
	}
	
	public void setSname(String sname) {
		
		this.sname = sname;
		
	}
	
	public int getTotal() {
		
		return total;
		
	}
	
	public void setTotal(int total) {
		
		this.total = total;
		
	}
	
	public float getAvg() {
		
		return avg;
		
	}
	
	public void setAvg(float avg) {
		
		this.avg = avg;
		
	}
	
	public String getResult() {
		
		return result;
		
	}
	
	public void setResult(String result) {
		
		this.result = result;
		
>>>>>>> refs/remotes/origin/master
	}
	

}
