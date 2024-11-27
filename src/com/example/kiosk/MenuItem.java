package com.example.kiosk;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 세부 메뉴 속성 가지는 클래스
 * 햄버거의 이름(name), 가격(price), 설명(explain)
 */
public class MenuItem {
    private String name;//메뉴 이름
    private double price;//메뉴 가격
    private String explain;//메뉴 설명

    /**
     * 생성자
     * 새로운 메뉴 아이템을 초기화
     *
     * @param name    메뉴 이름
     * @param price   메뉴 가격
     * @param explain 메뉴 설명
     */
    public MenuItem(String name, double price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    /**
     * 메뉴 이름 반환
     *
     * @return 메뉴 이름
     */
    public String getName() {
        return name;
    }

    /**
     * 메뉴 가격 반환
     *
     * @return 메뉴 가격
     */
    public double getPrice() {
        return price;
    }

    /**
     * 메뉴 설명 반환
     *
     * @return 메뉴 설명
     */
    public String getExplain() {
        return explain;
    }
}
