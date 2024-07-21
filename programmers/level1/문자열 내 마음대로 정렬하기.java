import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 일단 문자열을 정렬시킴
        Arrays.sort(strings);
        // subString으로 정렬할 거를 세팅한 다음 세팅 시킴
        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
        return strings;
    }
}