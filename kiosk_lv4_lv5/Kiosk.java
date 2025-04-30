package kiosk_lv4_lv5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private MainMenu mainMenu = new MainMenu();             // 메뉴 데이터
    private List<Food> cart = new ArrayList<>();            // 사용자가 고른 메뉴 저장 리스트

    public void chooseMainMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 메인 메뉴 출력
            mainMenu.showMainMenu();
            int input = sc.nextInt();

            if (input == 1) {
                // 음료 선택
                chooseDrinkMenu(sc);
                break;
            } else if (input == 2) {
                // 디저트 선택
                chooseDessertMenu(sc);
                break;
            } else if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
        sc.close();
    }

    // 음료 선택
    public void chooseDrinkMenu(Scanner sc) {
        while (true) {
            // 음료 메뉴 출력
            mainMenu.showDrinkMenu();
            System.out.println("0. 담기 그만하고 결제하기");
            int input = sc.nextInt();

            if (input >= 1 && input <= 4) {
                // 메뉴 담기
                addToCart(input, 1);
            } else if (input == 0) {
                askMoreOptions(sc);
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    // 디저트 메뉴 출력
    public void chooseDessertMenu(Scanner sc) {
        while (true) {
            mainMenu.showDessertMenu();
            System.out.println("0. 담기 그만하고 결제하기");
            int input = sc.nextInt();

            if (input >= 1 && input <= 4) {
                addToCart(input, 2);
            } else if (input == 0) {
                askMoreOptions(sc);
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }


    // 선택 항목 장바구니에 담기
    // add To Cart
    public void addToCart(int input, int category) {
        for (Food item : mainMenu.getFoodsItem()) {
            if (category == 1 && item instanceof Drink && item.getNumber() == input) {
                cart.add(item);
                System.out.println("담기 완료: " + item.getName());
                return;
            } else if (category == 2 && item instanceof Dessert && item.getNumber() == input) {
                cart.add(item);
                System.out.println("담기 완료: " + item.getName());
                return;
            }
        }
    }

    // 더 필요한 상품 있는지 재차 물음
    // ask More Options
    private void askMoreOptions(Scanner sc) {
        while (true) {
            System.out.println("추가로 담을 상품이 있으십니까?");
            System.out.println("1. 음료 추가");
            System.out.println("2. 디저트 추가");
            System.out.println("0. 결제하기");
            int input = sc.nextInt();

            if (input == 1) {
                chooseDrinkMenu(sc);
                break;
            } else if (input == 2) {
                chooseDessertMenu(sc);
                break;
            } else if (input == 0) {
                printFinalCart();
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }


    // 최종 주문 내역
    // print Final Cart
    private void printFinalCart() {
        System.out.println("[ 주문하신 내역 ]");
        int total = 0;
        for (Food item : cart) {
            System.out.println("- " + item.getName()  + " W | "  + item.getPrice() + " | " + item.getDescription());
            total += item.getPrice();
        }
        System.out.println("총 결제 금액: " + total);
        System.out.println("감사합니다. 주문이 완료되었습니다!");
    }
}



// 객체 이름들 정하고 시작
// chooseMainMenu
// chooseDrinkMenu
// chooseDessertMenu
// addToCart
// askMoreOptions
// askMoreOptions
// printFinalCart