package com.se.project.game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the board");
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        System.out.print("Enter size of each team: ");
        int size = scanner.nextInt();
        GameMaster gameMaster = new GameMaster(x, y, size);
        //gameMaster.start();
        gameMaster.run();
    }
}