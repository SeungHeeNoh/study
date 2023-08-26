import java.util.*;

// class Student implements Comparable<Student> {
// 	String name;
// 	int ban;
// 	int no;
// 	int kor;
// 	int eng;
// 	int math;

// 	public Student() {
// 	}

// 	public Student(String name, int ban, int no, int kor, int eng, int math) {
// 		this.name = name;
// 		this.ban = ban;
// 		this.no = no;
// 		this.kor = kor;
// 		this.eng = eng;
// 		this.math = math;
// 	}

// 	int getTotal() {
// 		return kor+eng+math;
// 	}

// 	float getAverage() {
// 		return (int)((getTotal()/3f)*10+0.5)/10f;
// 	}

// 	@Override
// 	public String toString() {
// 		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " +math + ", " + getTotal()  + ", " + getAverage();
// 	}

// 	@Override
// 	public int compareTo(Student o) {
// 		return name.compareTo(o.name);
// 	}
// }

public class Exercise06 {
	static int getGroupCount(TreeSet<Student> test, int from, int to) {
		int count = 0;

		for(Student s : test) {
			if ( from <= s.getAverage() && s.getAverage() < to) count++;
		}

		return count;
	}
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return (int)(s1.getAverage() - s2.getAverage());
			}
		});

		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));

		Iterator it = set.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("[60~69] : " + getGroupCount(set, 60, 70));
		System.out.println("[70~79] : " + getGroupCount(set, 70, 80));
		System.out.println("[80~89] : " + getGroupCount(set, 80, 90));
		System.out.println("[90~100] : " + getGroupCount(set, 90, 101));

	}
}
