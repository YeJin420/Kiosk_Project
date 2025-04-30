package kiosk_Lv1;

import java.util.Scanner;

public class Main {

    // 속성
    // 생성자
    // 기능

    public static void main(String[] args) {
        CoffeeMenu();
    }
        public static void CoffeeMenu() {

            // 빽다방 메뉴 ㅎㅎ..
            System.out.println(" COFFEE MENU ");
            System.out.println(" 1. 아메리카노   | W 1,500 | 뉴크롭원두와 스페셜티 커피 원두를 블렌딩한 아메리카노 "); // 아이스 500원 추가
            System.out.println(" 2. 카페라떼     | W 3,000 | 진한 에스프레소와 우유가 어우러져 탄생한 부드러운 카페라떼 ");
            System.out.println(" 3. 콜드브루     | W 4,000 | 장시간 추출해 맛과 향이 풍부한 콜드브루 ");
            System.out.println(" 4. 미숫가루     | W 3,000 | 고소하고 진한 맛의 미숫가루 "); // 물 3,000원, 우유 4,000원, 두유 4,500원 추가
            System.out.println(" 5. 딸기라떼     | W 2,000 | 달콤한 딸기 과육이 가득! 부드럽고 달콤하게 즐기는 딸기라떼 ");
            System.out.println(" 0. 종류                 | 종료");
            CoffeeMenuInput();
        }

        public static void CoffeeMenuInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println(" 번호를 입력해 주세요." );
            String input = sc.next();

            if(input.equals("1")) {
                System.out.println("아메리카노");
                }else if (input.equals("2")) {
                  System.out.println("카페라떼");
                  }else if (input.equals("3")) {
                   System.out.println("콜드브루");
                   }else if (input.equals("4")) {
                    System.out.println("딸기라떼");
                    }else{
                System.out.println("다시 입력해 주세요");
                CoffeeMenuInput();
            }
            }

    }


// 클래스 MenuItem, Kiosk
// 기능 getter(), setter()

//[ SHAKESHACK MENU ]
//1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
//2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
//3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
//4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
//0. 종료      | 종료
//0 <- // 0을 입력
//
//프로그램을 종료합니다.