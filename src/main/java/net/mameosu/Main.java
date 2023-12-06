package net.mameosu;

import net.mameosu.System.StartUp;

import java.util.Scanner;

public class Main extends Tool {
    public static void main(String[] args) {

        String key;
        String token;

        Scanner sc = new Scanner(System.in);

        System.out.println("osu!のapiキーを入力してください");
        key = sc.next();
        System.out.println("discord botのtokenを入力してください");
        token = sc.next();

        StartUp startUp = new StartUp(key, token);
    }
}