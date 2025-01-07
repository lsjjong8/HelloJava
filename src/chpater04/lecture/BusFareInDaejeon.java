package chpater04.lecture;

import java.util.Scanner;

public class BusFareInDaejeon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("만 나이 입력: ");
        int age = sc.nextInt();

        // 버스요금 기준
        if(age < 0) {
            System.out.println("나이를 잘못 입력하셨습니다.");
        } else if(age >= 19) {
            System.out.println("버스요금(성인) : 1500원");
        } else if(age >= 13) {
            System.out.println("버스요금(청소년) : 750원");
        } else if(age >= 6) {
            System.out.println("버스요금(어린이) : 350원");
        } else {
            System.out.println("버스요금(6세 미만) : 무료");
        }
    }
}