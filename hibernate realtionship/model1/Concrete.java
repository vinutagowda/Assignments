package cts.model.model1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("cemp2")
@Table(name="a")
public class Concrete extends Employee {
	@Column
	private int duration;
	public Concrete() {
		
	}
	public Concrete(long eid,String ename,double basic,int duration) {
			super(eid,ename,basic);
			
		this.duration=duration;
		
		

}
	
//	@Override
//	public String toString() {
//		return "Concrete [duration=" + duration + ", getDuration()=" + getDuration() + ", getEid()=" + getEid()
//				+ ", getEname()=" + getEname() + ", getBasic()=" + getBasic() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
