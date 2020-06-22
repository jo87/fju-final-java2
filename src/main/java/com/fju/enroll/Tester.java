package com.fju.enroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    題目說明:
    1) 共有多個個課程，每個課程各有其開課人數，資料放在 courses.txt (請勿修改該檔案內容)
    2) 程式執行後先讀取課程檔並印出課程列表
    3) 請使用者輸入報名課程 a或 b、c ...
    4) 再輸入欲報名人數並累加，如輸入1則在該課程加1人，輸入3則加3人，以此類推。
    5) 當輸入的人數值在加入後大於該課程能容納的人數限制時，印出Full字樣，並且不累加。若還在
       容納人數內，則累加並印出所有課程與目前人數。
    6) 輸入人數後，印出所有課程狀態，並繼續讓使用者報名
    7) 課程若輸入 0 時，結束本程式
    8) 可新增程式碼以完成功能，但已存在的程式碼皆不可修改

    記分:
     30% [1] 讀取 courses.txt 內的所有課程並回傳課程集合，並印出所有課程
         a) 程式設計一       8
         b) Word文書處理    13
         c) 初級英語會話     6
         ...
         請輸入課程代號:

     20% [2] 完成必要的類別設計，讓程式可正常運作得到正確結果 Course 類別

     20% [2] 取得使用者輸入 a 、b 或 c 課程代號，並運算後回應 (說明 3,4,5,6,7)
         a) 程式設計一       8
         b) Word文書處理    13
         c) 初級英語會話     6
         ...
         請輸入課程代號: b
         請輸入報名人數: 3
         a) 程式設計一       8
         b) Word文書處理    10
         c) 初級英語會話     6
         ...
         請輸入課程代號:
    30% [4] 使用者輸入課程代號後，若該課程名額是零，請印出"本課程已額滿"，並不需要
            請使用者再輸入人數，直接列印課程清單，如下:
         a) 程式設計一       8
         b) Word文書處理    0
         c) 初級英語會話     6
         ...
         請輸入課程代號: b
         本課程已額滿
         a) 程式設計一       8
         b) Word文書處理    0
         c) 初級英語會話     6
         ...
         請輸入課程代號:
 */
public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Course> courses = getCourses();
        for (Course c: courses) {
            System.out.println(c.id + ") " + c.name + "\t" + c.seats);
        }
        System.out.println("請輸入課程代號:");


        System.out.println("請輸入報名人數:");

    }

    public static List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();

            Course c = new Course(id, name, seats);

        return null;
    }
}

