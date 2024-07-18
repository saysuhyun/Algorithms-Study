import javax.lang.model.type.ArrayType;
import java.util.*;

class Solution {
    public long solution(int a, int b) {

        long answer = 0;
        long min = a - b >= 0 ? b : a;
        long max = a - b > 0 ? a : b;

        for (long i = min; i < max; i++) {
            answer += i;
        }

        return answer;
    }

    /*
     * 등차 수열로 풀었네 ... 또 min max라는 함수로 매개변수 크기 비교함
     * 등차수열 공식 : 항의 갯수 * (마지막항 + 첫째항) / 2
     */

    public long solution2(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {

        if (a == b) {
            return a;
        }

        return (b - a + 1) * (b + a) / 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(3, 5);
    }
}
