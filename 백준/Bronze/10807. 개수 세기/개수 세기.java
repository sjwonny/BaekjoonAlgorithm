import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 테스트 케이스 개수 읽기
        int N = Integer.parseInt(br.readLine());
        String [] A = new String [N];   
        String input = br.readLine();
        int count = 0;
          A = input.split(" ");
        String v = br.readLine();
        // 결과 출력
        for(int i=0; i < N ; i ++) {
        	if(A[i].equals(v) ) { 
        		count++;
        	}
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        
        
    }
}
