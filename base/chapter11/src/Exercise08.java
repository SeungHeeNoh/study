import java.util.*;

// class Student implements Comparable<Student> {
// 	String name;
// 	int ban;
// 	int no;
// 	int kor;
// 	int eng;
// 	int math;

// 	int total;
// 	int schoolRank;

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
// 		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " +math + ", " + getTotal()  + ", " + getAverage() + ", " + schoolRank;
// 	}

// 	@Override
// 	public int compareTo(Student o) {
// 		return -(getTotal() - o.getTotal());
// 	}
// }

public class Exercise08 {
	public static void calculateSchoolRank(List list) {
		Collections.sort(list);

		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();

		for(int i=1; i<=length; i++) {
			Student s = (Student)(list.get(i-1));

			if(s.getTotal() == prevTotal) {
				s.schoolRank = prevRank;
			}else {
				s.schoolRank = i;
				prevRank = i;
				prevTotal = s.getTotal();
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));

		calculateSchoolRank(list);

		Iterator<Student> it = list.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
