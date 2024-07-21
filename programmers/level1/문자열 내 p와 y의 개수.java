import java.util.*;

class Solution {
    boolean solution(String s) {

        boolean answer = false;
        Map<Character, Integer> map = new HashMap<>();

        // 대소문자 정렬
        s = s.toLowerCase();

        // hashmap?
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // 갯수 확인
        if (map.get('p') == map.get('y')) {
            answer = true;
        }

        return answer;
    }

    boolean solution2(String s) {

        // 정규식으로 전부 바꾸고 각 갯수가 같은지 아닌지 파악해서 반환
        return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;
    }

    boolean solution3(String s) {

        // 전부 대문자로 바꿈
        s = s.toUpperCase();

        // char()로 문자열을 코드 스트림으로 변환
        // filter로 스트림 안에 문자들을 변환함
        return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("pPoooyY");
    }
}
