package hello;
import java.util.Date;

public class Project{
	private String projectName;
	private String managerName;
	private Date startDate;
	private Date endDate;

	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String toString(){
		return new StringBuilder().append(this.getProjectName()).append(this.getManagerName()).append(this.getStartDate()).append(this.getEndDate()).toString();
	}

	
}