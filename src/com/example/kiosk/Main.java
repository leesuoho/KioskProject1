package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //전체 메뉴 리스트를 저장할 리스트 생성
        List<Menu> menu = new ArrayList<>();

        //카테고리(버거, 음료, 디저트)별 메뉴 아이템 리스트 생성
        List<MenuItem> burgerMenuItems = new ArrayList<>();
        List<MenuItem> drinksMenuItems = new ArrayList<>();
        List<MenuItem> dessertsMenuItems = new ArrayList<>();

        //버거 메뉴 아이템 추가
        burgerMenuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        //음료 메뉴 아이템 추가
        drinksMenuItems.add(new MenuItem("cock", 2.0, "콜라"));
        drinksMenuItems.add(new MenuItem("soda", 2.0, "사이다"));
        drinksMenuItems.add(new MenuItem("fanta", 2.0, "환타"));

        //디저트 메뉴 아이템 추가
        dessertsMenuItems.add(new MenuItem("potato", 2.5, "감자튀김"));
        dessertsMenuItems.add(new MenuItem("cheese stick", 2.5, "치즈스틱"));

        //버거 메뉴 생성 후 전체 메뉴 리스트에 추가
        Menu burgerMenu = new Menu("Burger", burgerMenuItems);
        menu.add(burgerMenu);
        //음료 메뉴 생성 후 전체 메뉴 리스트에 추가
        Menu drinksMenu = new Menu("drinks", drinksMenuItems);
        menu.add(drinksMenu);
        //디저트 메뉴 생성 후 전체 메뉴 리스트에 추가
        Menu dessertsMenu = new Menu("desserts", dessertsMenuItems);
        menu.add(dessertsMenu);

        //키오스크 객체 생성, 시작
        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}
