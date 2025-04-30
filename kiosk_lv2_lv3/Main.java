package kiosk_lv2_lv3;
// 사실 lv2랑 lv3 합쳐놓았습니다..

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 속성
    // 생성자
    // 기능
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menu = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        // 빽다방 메뉴 ㅎㅎ..
        menu.add(new MenuItem("아메리카노",1500 , " 뉴크롭원두와 스페셜티 커피 원두를 블렌딩한 아메리카노 "));
        menu.add(new MenuItem("카페라떼",  3000 , " 진한 에스프레소와 우유가 어우러져 탄생한 부드러운 카페라떼 "));
        menu.add(new MenuItem("콜드브루",  4000 , " 장시간 추출해 맛과 향이 풍부한 콜드브루 "));
        menu.add(new MenuItem("미숫가루",  3000 , " 고소하고 진한 맛의 미숫가루 "));
        menu.add(new MenuItem("딸기라떼",  2000 , " 달콤한 딸기 과육이 가득! 부드럽고 달콤하게 즐기는 딸기라떼 "));


        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        System.out.println(" COFFEE MENU ");

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        // for문만 단독으로 쓰면 정해진 만큼만 반복이고 while문을 쓰면 입력이나 상황에 따라 결과가 달라지기 때문에
        // 사용자 입장에서 반드시 한가지 음료만 주문할리 없으니 계속 반복하는 while문 사용
        while (true) {
            System.out.println(" COFFEE MENU ");
            for (int i = 0; i < menu.size(); i++) {
                menu.get(i).outputMenuItem(i + 1);
            }
            System.out.println("0. 종료 | 프로그램 종료");

            // 숫자를 입력 받기
            System.out.print("번호를 입력해 주세요: ");
            int input = sc.nextInt();

            // 입력된 숫자에 따른 처리
            if (input == 0) {
                // 프로그램을 종료
                System.out.println("프로그램을 종료합니다.");
                break;

                // 선택한 메뉴 : 이름, 가격, 설명
                // lv4에서는 Main에 하지말고 Menuitem.java 에 출력값 입력해보기
                // ㄴ 이유 나중에 보수할때 쉽고 확장도 편리해짐
            } else if (input >= 1 && input <= menu.size()) {
                MenuItem selectedItem = menu.get(input - 1);
                System.out.println("[선택한 메뉴]");
                System.out.println("이름: " + selectedItem.getName());
                System.out.println("가격: " + selectedItem.getPrice());
                System.out.println("설명: " + selectedItem.getExplanation());
            } else {
                System.out.println("유효한 번호를 입력해 주세요.");
            }
        }

        sc.close();
    }
}




// List 선언 및 초기화
// add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
// (add 보다 더 좋은 방법이 있다면 그렇게 해도 됩니다!)

// Scanner 선언

// 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
// 숫자를 입력 받기
// 입력된 숫자에 따른 처리
// 프로그램을 종료
// 선택한 메뉴 : 이름, 가격, 설명
