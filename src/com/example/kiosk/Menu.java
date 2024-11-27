package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

/**
 * Menu 클래스
 * 메뉴 카테고리를 관리하는 클래스
 * ex) 버거메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem 을 포함합니다.
 */
public class Menu {
    private String categoryName;//카테고리 이름(Burger, Drinks, Desserts)
    private List<MenuItem> menuItems;//카테고리에 포함된 메뉴 아이템 리스트

    /**
     * 생성자
     * 카테고리와 그것에 포함된 메뉴 아이템을 초기화
     *
     * @param categoryName 카테고리 이름
     * @param menuItems    카테고리에 포함된 메뉴 아이템
     */
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    /**
     * 카테고리 이름 반환
     *
     * @return 카테고리 이름
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 카테고리에 포함된 메뉴 아이템 리스트 반환
     *
     * @return 메뉴 아이템 리스트
     */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
