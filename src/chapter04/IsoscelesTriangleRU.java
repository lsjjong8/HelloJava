package chapter04;

import java.util.Scanner;

public class IsoscelesTriangleRU { // 오른쪽 위가 직각인 이등변 삼각형
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는? :");
        int n = sc.nextInt();

        // 오른쪽 아래가 직각인 이등변 삼각형을 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j < i)
                    System.out.print(" "); // i+1번째라인에는 i개, 2번째 라인에는 i++개
                else
                    System.out.print("*"); // 1번째라인에는 n-i개, 2번째 라인에는 n-(i+1)개
            }
            System.out.println();
        }
    }
}
