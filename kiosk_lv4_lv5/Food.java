package kiosk_lv4_lv5;

// 통합적으로 Drink, Dessert 공통 필드 : 공통 속성과 메서드를 묶고 자식클래스만 만들고 싶을 때 씀
// abstract 는 추상클래스, 직접 객체를 만들 수 없음
// 공통필드를 정의하고 공통 메서드도 만들 수 있지만 스스로 객체 생성 불가
// 하지만 Drink Dessert 클래스 상속 가능

public abstract class Food {
    private int number;
    private String name;
    private int price;
    private String description;


    public Food(int number, String name, int price, String description) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

