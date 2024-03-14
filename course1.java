package courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class course1 {
	
	@Id
private int  id;
	private String course;
	private int prices;
	private String course_code;
	
	
	public int  getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getPrices() {
		return prices;
	}
	public void setPrices(int prices) {
		this.prices = prices;
	}
	public String getCourse_code() {
		return course_code;
	}
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[id ,course,pices,course_id]="+id+" "+course+" "+prices+"  "+course_code;
	}
	
}
