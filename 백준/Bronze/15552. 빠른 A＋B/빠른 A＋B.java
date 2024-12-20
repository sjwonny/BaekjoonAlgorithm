import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 테스트 케이스 개수 읽기
        int T = Integer.parseInt(br.readLine());
        int [] sum = new int [T];      
        for (int i = 0; i < T; i++) {
            // 한 줄 입력받아 공백으로 나누기
           StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sum[i] = A+B;
        }
        
        // 결과 출력
        for(int i=0; i < T ; i ++) {
        bw.write(String.valueOf(sum[i]));
        bw.newLine();
        }
        bw.flush();
        bw.close();
        
        
    }
}