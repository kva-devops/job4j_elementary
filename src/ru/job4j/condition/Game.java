package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("Tanks")) {
            System.out.println("Start game - Tanks");
        } else if (name.equals("Super Mario")) {
            System.out.println("Start game - Super Mario");
        } else if (name.equals("Robocop")) {
            System.out.println("Start game - Robocop");
        } else {
            System.out.println("Don't find this game: " + name + ". Try again.");
        }
    }

    public static void main(String[] args) {
        Game.menu("Tanks");
        Game.menu("Robocop");
        Game.menu("Contra");
        Game.menu("Super Mario");

    }
}
