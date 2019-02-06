package com.somecompanyy.randomik;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] list = new String[3];
        list[0] = "Фильм: Начало";
        list[1] = "Фильм: Время";
        list[2] = "Фильм: Как украсть небоскрёб";

        System.out.println("Если хотите продолжить введите 1");
        System.out.println("Если хотите продолжить введите любое другое число");
        int selection = sc.nextInt();

        for (;selection==1;){
            rand.random(0, 3);
            if (rand.randomnumber == 0) {
                System.out.println(list[0]);
                System.out.println("Если хотите продолжить введите 1");
                System.out.println("Если хотите продолжить введите любое другое число");
                selection = sc.nextInt();
            }
            else if (rand.randomnumber == 1) {
                System.out.println(list[1]);
                System.out.println("Если хотите продолжить введите 1");
                System.out.println("Если хотите продолжить введите любое другое число");
                selection = sc.nextInt();
            }
            else{
                System.out.println(list[2]);
                System.out.println("Если хотите продолжить введите 1");
                System.out.println("Если хотите продолжить введите любое другое число");
                selection = sc.nextInt();
            }
        }
        System.out.println("Спасибо что были с нами");
    }
    }

