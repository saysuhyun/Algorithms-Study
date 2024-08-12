import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Num2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                list.add(i);
            }
        }

        try {
            result = list.get(b - 1);
        } catch (IndexOutOfBoundsException e) {
            result = 0;
        }

        System.out.print(result);
    }
}
