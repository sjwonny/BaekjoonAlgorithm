import java.util.Scanner;

public class Main { public static void main(String[] args) { Scanner sc = new Scanner(System.in); int score =0; String grade="";  score = sc.nextInt(); if(score>=90 && score<=100) { grade = "A"; }else if(score>=80) { grade = "B"; }else if(score>=70) { grade = "C"; }else if(score>=60) { grade = "D"; }else { grade = "F"; }

System.out.println(grade);

}

}