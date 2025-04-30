package kiosk_lv2_lv3;

public class MenuItem {
    // 속성
    String name;
    double price;
    String explanation;

    // 생성자
    public MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    // 게터
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExplanation() {
        return explanation;

    }

    // 메서드
    // double 로 하니 소수점까지 다 나와서 보기 어색함, int 캐스팅으로 강제변환
    public void outputMenuItem(int num) {
        System.out.println(num + ". " + name + " | " + (int)price + "원 | " + explanation);
    }


    }
