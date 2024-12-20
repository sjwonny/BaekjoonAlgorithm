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
            // 한 줄 입력받아 공백으로 나누기
           StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            long C = Long.parseLong(st.nextToken());
           long sum = A + B + C;
        
        // 결과 출력
        bw.write(String.valueOf(sum));
       
        
        bw.flush();
        bw.close();
    }
    }
