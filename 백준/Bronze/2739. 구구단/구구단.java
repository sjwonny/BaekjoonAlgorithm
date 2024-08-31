import java.util.Scanner;

public class Main { public static void main(String[] args) { Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();  //1~9까지 입력 가능

            for(int i = 1; i <=9; i++) {
                System.out.println(n +" * "+ i +" = "+ n*i);

            }

}
}