import java.util.*;

public class Exercise01 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		// kyo = list1.retainAll(list2);
		// cha = list1.removeAll(kyo);
		// hap = list1.addAll(list2);

		// kyo.addAll(list1);
		// kyo.retainAll(list2);

		// cha.addAll(list1);
		// cha.removeAll(kyo);

		// hap.addAll(list1);
		// hap.removeAll(kyo);
		// hap.addAll(list2);

		kyo.addAll(list1);
		kyo.retainAll(list2);

		cha.addAll(list1);
		cha.removeAll(list2);

		hap.addAll(list1);
		hap.removeAll(kyo);
		hap.addAll(list2);

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(kyo);
		System.out.println(cha);
		System.out.println(hap);
	}
}
