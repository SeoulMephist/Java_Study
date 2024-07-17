package hw;
import java.util.*;
/*
    Q. 구구단의 각 단을 출력할 형식을 입력받아, 입력받은 숫자만큼의 열을 가진
    구구단 출력을 구현하시오.
 */


public class 구구단 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 열의 개수를 입력하세요 : ");
        int col = sc.nextInt();

        int i = 2;
        int j = 1;
        int k = 0;

        for (i = 2; i <= 9; i+=col) {
            for (j = 1; j <= 9; j++) {
                for (k = 0; k < col && (i+k <= 9) ; k++) {
                    System.out.printf("%d x %d = %d\t", i+k, j, (i+k)*j);
                }
                System.out.print("\n");
            }
            System.out.println();
        }
    }
}
