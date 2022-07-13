/*
 * ===문제 출처===
 * 4673 셀프 넘버, <https://www.acmicpc.net/problem/4673>.
 * */

// public class Main {
// 	public static void main(String args[]) {
//         System.out.println(new SelfNumber(10000).getSelfNumberList());
// 	}
// }

class SelfNumber {
    private int length;
    private boolean[] memo;

    public SelfNumber(int length) {
        this.length = length;
        memo = new boolean[length+1];
    }

    public String getSelfNumberList() {
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=length; i++) {
            setSelfNumber(i);
        }

        for(int i=1; i<=length; i++) {
            if(!memo[i]) {
                sb.append(i + "\n");
            }
        }

        return sb.toString();
    }

    private void setSelfNumber(int start) {
        int nextValue = getNextValue(start);

        while(nextValue <= length && !memo[nextValue]) {
            memo[nextValue] = true;
            nextValue = getNextValue(nextValue);
        }
    }

    private int getNextValue(int n) {
        int total = n;

        while(n != 0) {
            total += n%10;
            n /= 10;
        }

        return total;
    }
}