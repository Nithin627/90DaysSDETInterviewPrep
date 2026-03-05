package com.day2;

public class Employee {

	private String empName;
	private String empId;
	private String project;
	private double salary;
	private String companyName;

	private Employee(String empName, String empId, String project, double salary, String companyName) {
		super(); // Call the parent class constructor
		this.empName = empName;
		this.empId = empId;
		this.project = project;
		this.salary = salary;
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", project=" + project + ", salary=" + salary
				+ ", companyName=" + companyName + "]";
	}

//	Inner Class --static
	public static class Builder {
		private String empName;
		private String empId;
		private String project;
		private double salary;
		private String companyName;

		public Builder setEmpName(String empName) {
			this.empName = empName;
			return this;
		}

		public Builder setEmpId(String empId) {
			this.empId = empId;
			return this;
		}

		public Builder setProject(String project) {
			this.project = project;
			return this;
		}

		public Builder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public Builder setCompanyName(String companyName) {
			this.companyName = companyName;
			return this;
		}

		public Employee build() {
			Employee emp = new Employee(empName, empId, project, salary, companyName);
			return emp;
		}

	}

}
