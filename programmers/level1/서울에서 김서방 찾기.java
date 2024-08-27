class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int count = 0;
        for (String a : seoul) {

            if (a.equals("Kim")) {
                answer = String.format("김서방은 %d에 있다", count);
                break;
            }
            count++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[] { "Jane", "Kim" });
    }
}
