package kiosk_lv4_lv5;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {

    //
    private List<Food> foodsItem;

    public MainMenu() {
        foodsItem = new ArrayList<>();

        // Drinks
        foodsItem.add(new Drink(1, "아메리카노", 1500, "뉴크롭원두와 스페셜티 커피 원두를 블렌딩한 아메리카노"));
        foodsItem.add(new Drink(2, "카페라떼", 3000, "진한 에스프레소와 우유가 어우러져 탄생한 부드러운 카페라떼"));
        foodsItem.add(new Drink(3, "콜드브루", 4000, "장시간 추출해 맛과 향이 풍부한 콜드브루"));
        foodsItem.add(new Drink(4, "미숫가루", 3500, "고소하고 진한 맛의 미숫가루"));
        foodsItem.add(new Drink(5, "딸기라떼", 3500, "달콤한 딸기 과육이 가득! 부드럽고 달콤하게 즐기는 딸기라떼"));

        // Desserts
        foodsItem.add(new Dessert(1, "소프트 아이스크림", 2000, "입안에서 부드럽게 사르륵 녹는 마성의 아이스크림"));
        foodsItem.add(new Dessert(2, "사라다빵", 3500, "어린시절 빵집에서 사먹던 추억의 감자 사라다빵"));
        foodsItem.add(new Dessert(3, "크리미슈", 2000, "비스킷과 부드러운 크림의 환상 조합"));
        foodsItem.add(new Dessert(4, "쫀득 감자빵", 2800, "진짜 감자로 맛을 살린 짭짤 쫄깃한 빵"));
    }

    // 게터
    public List<Food> getFoodsItem() {
        return foodsItem;
    }

    // 기본 메뉴 출력
    public void showMainMenu() {
        System.out.println("[ MAIN MENU ]");
        System.out.println("1. Drinks");
        System.out.println("2. Desserts");
        System.out.println("0. 종료");
    }

    // Drink 메뉴 출력
    public void showDrinkMenu() {
        System.out.println("[ DRINKS MENU ]");
        for (Food item : foodsItem) {
            if (item instanceof Drink) {
                System.out.println(item.getNumber() + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            }
        }
        System.out.println("0. 디저트 메뉴로 이동");
    }


    // Dessert 메뉴 출력
    public void showDessertMenu() {
        System.out.println("[ DESSERTS MENU ]");
        for (Food item : foodsItem) {
            if (item instanceof Dessert) {
                System.out.println(item.getNumber() + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            }
        }
        System.out.println("0. 음료 메뉴로 이동");
    }

}
