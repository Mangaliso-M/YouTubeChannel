package javaIntroduction;

public class ProjectManager extends Employee{
	
    protected String projectName;
	protected double projectDuration;

	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public double getProjectDuration() {
		return projectDuration;
	}
	public void setProjectDuration(double projectDuration) {
		this.projectDuration = projectDuration;
	}
}
