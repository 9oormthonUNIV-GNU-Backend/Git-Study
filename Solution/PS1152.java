import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.trim();
        String[] splitArr = str.split(" ");
        int count = 0;
        for (int i = 0; i < splitArr.length; i++) {
            if (splitArr[i].equals("")) {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
