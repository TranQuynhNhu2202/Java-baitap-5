package Model;

public class Student {
	 private int age;
	    private String name;
	    private String Lop;

	    public Student(int age, String name, String lop) {
	        this.age = age;
	        this.name = name;
	        Lop = lop;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getLop() {
	        return Lop;
	    }

	    public void setLop(String lop) {
	        Lop = lop;
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "age=" + age +
	                ", name='" + name + '\'' +
	                ", Lop='" + Lop + '\'' +
	                '}';
	    }
	}


