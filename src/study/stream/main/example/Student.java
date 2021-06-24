package study.stream.main.example;

public class Student {

	private String name;
	private Integer age;
	private Double nota1;
	private Double nota2;
	private Double media;

	public Student(String name, Integer age, Double nota1, Double nota2) {
		this.name = name;
		this.age = age;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
	private void media() {
		media = (nota1 + nota2)/2;
	}
	
	public Double getMedia() {
		return this.media;
	}
	
	public Student concatMedia(Student other) {
		this.media += other.media;
		return this;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media;
	}
	
	
}
