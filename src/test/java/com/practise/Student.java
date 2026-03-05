package com.practise;

public class Student {

	private String stdName;
	private String stdId;
	private String section;
	private String gender;

	private Student(String stdName, String stdId, String section, String gender) {
		super();
		this.stdName = stdName;
		this.stdId = stdId;
		this.section = section;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdId=" + stdId + ", section=" + section + ", gender=" + gender + "]";
	}

	public static class stdBuilder {
		private String stdName;
		private String stdId;
		private String section;
		private String gender;

		public stdBuilder setStdName(String stdName) {
			this.stdName = stdName;
			return this;
		}

		public stdBuilder setStdId(String stdId) {
			this.stdId = stdId;
			return this;
		}

		public stdBuilder setSection(String section) {
			this.section = section;
			return this;
		}

		public stdBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}

		public Student stdBuild() {
			Student std = new Student(stdName, stdId, section, gender);
			return std;
		}

	}

}
