package hw;
import java.io.*;
/*
    Q. 년도와 월을 입력받아 달력을 출력하는 프로그램을 구현하시오.
    단, 윤년과 평년, 요일도 나타나게 하시오.


    <출력 예시>
    년도 입력 :
    월 입력 :

    ---------- 2024년 7월 -------------
    일 월 화 수 목 금 토
    1 2 3 4 5 6 7
    8 9 10 11 12 13 14

 */

public class calender {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year;
        int month;

        //입력부
        while (true){
            System.out.print("년도 입력 : ");
            year = Integer.parseInt(br.readLine());
            if (year <0 || year > 9999){
                System.out.println("잘못된 년도 입력입니다");
                System.out.println("------------------------------");
                continue;
            }
            break;
        }

        while (true){
            System.out.print("월 입력 : ");
            month = Integer.parseInt(br.readLine());
            if (month < 1 || month > 12){
                System.out.println("잘못된 월 입력입니다");
                System.out.println("------------------------------");
                continue;
            }
            break;
        }

        //1년 1월 1일부터 입력받은 날까지의 날 수 계산
        int total = (year-1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

        int end = 0;
        for (int i=1; i<month; i++){
            switch (i){
                case 1:
                    end = 31;
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                        end = 29;
                    }
                    else end = 28;
                    break;
                case 3:
                    end = 31;
                    break;
                case 4:
                    end = 30;
                    break;
                case 5:
                    end = 31;
                    break;
                case 6:
                    end = 30;
                    break;
                case 7:
                    end = 31;
                    break;
                case 8:
                    end = 30;
                    break;
                case 9:
                    end = 31;
                    break;
                case 10:
                    end = 30;
                    break;
                case 11:
                    end = 31;
                    break;
                case 12:
                    end = 30;
                    break;
            }
            total += end;
        }

        //요일 계산
        int pv;
        int blank = 0;
        pv = total % 7;
        switch (pv){
            case 0:
                blank = 1;
                break;
            case 1:
                blank = 2;
                break;
            case 2:
                blank = 3;
                break;
            case 3:
                blank = 4;
                break;
            case 4:
                blank = 5;
                break;
            case 5:
                blank = 6;
                break;
            case 6:
                blank = 0;
                break;
        }

        //달력형태 구현부
        System.out.println("일\t|\t월\t|\t화\t|\t수\t|\t목\t|\t금\t|\t토\t");
        System.out.println("---------------------");

        int day = 1;
        int k = 0;
        while (day <= 31){
            if (blank != 0){
                while (k < blank){
                    System.out.print(" \t");
                    k++;
                }
            }

            if ((day+blank) % 7 == 0){
                System.out.println(day);
            }
            if ((day+blank) % 7 != 0) {
                System.out.print(day + "\t");
            }
            day++;
        }
    }
}
