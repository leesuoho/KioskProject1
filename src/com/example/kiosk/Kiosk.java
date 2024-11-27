package com.example.kiosk;

import java.util.List;
import java.util.Scanner;

/**
 * Kiosk 클래스
 * 키오스크 시스템을 구현
 */
public class Kiosk {
    /**
     * 키오스크의 메뉴 리스트
     * Menu 객체로 구성
     */
    private List<Menu> menu;// 메뉴 리스트

    /**
     * Kiosk 생성자
     * 키오스크의 메뉴 리스트를 초기화
     *
     * @param menu 프로그램에서 사용할 메뉴 리스트
     */
    public Kiosk(List<Menu> menu) {
        this.menu = menu;
    }

    /**
     * 프로그램 시작
     * 키오스크 메인 메뉴 출력
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);//사용자 입력을 받기 위한 Scanner
        MenuItem item;//사용자가 선택한 메뉴(음식)
        Menu category;//사용자가 선택한 카테고리(햄버거, 음료 등)

        while (true) {//메인 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menu.size(); i++) {//메뉴 리스트에 있는 각 카테고리를 출력
                System.out.println(i + 1 + ". " + menu.get(i).getCategoryName());
            }
            System.out.println("0. 종료          | 종료");//종료 옵션을 추가
            System.out.print("번호를 선택하세요: ");

            //사용자가 입력한 번호를 저장
            int chooseCategory = scanner.nextInt();
            if (chooseCategory == 0) {//0을 누르면 프로그램 종료
                System.out.println("프로그램을 종료합니다");
                break;
            } else if (chooseCategory <= menu.size()) {//유효한 카테고리를 선택했을 때
                category = menu.get(chooseCategory - 1);//사용자가 선택한 카테고리를 가져옵니다

                //선택한 카테고리의 상세 메뉴를 보여줍니다.
                System.out.println("[" + category.getCategoryName() + " MENU ]");

                for (int i = 0; i < category.getMenuItems().size(); i++) {
                    System.out.println(i + 1 + ". " + category.getMenuItems().get(i).getName() + " | W " + category.getMenuItems().get(i).getPrice() + " | " + category.getMenuItems().get(i).getExplain());
//                System.out.println("1. ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
//                System.out.println("2. SmokeShack   | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
//                System.out.println("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
//                System.out.println("4. Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                }

                System.out.println("0. 뒤로가기          | 뒤로가기");//뒤로가기 옵션
                System.out.print("번호를 선택하세요: ");

                //사용자가 상세 메뉴에서 입련한 번호를 저장
                int choose = scanner.nextInt();

                if (choose == 0) {//0을 누르면 이전 단계로 돌아갑니다
                    System.out.println("처음으로 되돌아갑니다.");
                    continue;//메인 메뉴로 돌아가기
                } else if (choose <= category.getMenuItems().size()) {//유효한 메뉴 목록을 선택했을 때
                    item = category.getMenuItems().get(choose - 1);//사용자가 선택한 메뉴 목록을 가져옵니다
                    System.out.println(choose + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getExplain() + "를 선택하셨습니다.");
                } else {//유효하지 않은 번호를 선택했을 때
                    System.out.println("잘못된 입렵입니다. 다시 선택해주세요.");
                }

                System.out.println();
            } else {//유효하지 않은 카테고리 번호를 선택했을 때
                System.out.println("지원하지 않는 번호입니다.");
            }
        }
    }
}