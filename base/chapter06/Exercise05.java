package exercise4.src.js.chapter06;

public class Exercise05 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s.info());
	}
}

class Student {
	String name;
	int ban, no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor+eng+math;
	}

	float getAverage() {
		return (int)(getTotal()/3f*10+0.5)/10f;
	}

	String info() {
		String result = name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ",";
		result += getTotal() + ",";
		result += getAverage();

		return result;
	}
}
