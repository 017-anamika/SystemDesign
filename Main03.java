//builder pattern
class Student {
	public int id;
	public String name;
	public double cgpa;
	public String branch;

	private Student(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.branch = builder.branch;
		this.cgpa = builder.cgpa;
	}

	static class Builder {
		public int id;
		public String name;
		public double cgpa;
		public String branch;

		public Builder setId(int id) {
			this.id=id;
			return this;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setCgpa(double cgpa) {
			this.cgpa = cgpa;
			return this;
		}
		public Builder setBranch(String branch) {
			this.branch=branch;
			return this;
		}
		public Student build () {
			return new Student(this);
		}
	}

	@Override
	public String toString() {
		return "Student [Name=" + name + ", id=" + id + ", Branch=" + branch + ", cgpa=" + cgpa + "]";
	}
}


class Main03 {
	public static void main(String[] args) {
		Student s1 = new Student.Builder().setBranch("CA").setCgpa(07.21).setName("Anamika").setId(17).build();
		System.out.println(s1);

	}
}