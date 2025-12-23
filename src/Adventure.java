
// Enter your Hero's name (user input)
// You have fallen from a tree and cannot remember anything about yourself. It is up to you, (Hero name), to rediscover your past and travel home.
// you begin with 100 Hitpoints
// CROSSROADS 1: You come accross 2 paths with signs that describe the paths, they are called the North and South paths. type your desired path
// You chose the North path! The norh path leads you to your hometown with few inhabitants, yet there is a town in between that may be hostile. 
// you chose the South path! The south path takes you through the vast grasslands. Here, you can travel directly home but there may be dangers in your way.
// Along the North path, you encounter a small dog that looks hungry
// DECISION: do you want to take this dog as your friend? (Y or N)   
// IF takes dog, the dog bites you and you are dead. 
// You lose! type YES to play again
// IF you don't take the dog, you walk to town past the dog anyway without it
// Once you reach the small town, it appears like it is a very nice place. you may decide to cointnue or stay behind
// IF user stays behind: You lost! Your one goall was to travel home and you got caught up in the small town
// You lose! type YES to play again!
// IF user goes to hometown: You walk back home, hoping to rediscover who you are
// At home: "Hero name!" Shouted an older woman, suddenly, all of your memories flood back
// You Win! Type yes to play again
// IF takes south path: You walk accross the path, when a mountain is in the way, you can either scale the mountain or go around
// IF user selects scale the mountain: While scaling the mountain, you encounter a friendly villager that knows the way to your hometown
// The villager takes you to hometown, (Go to line 16)
// IF you chose to go around the mountain: Unfortunately the trail takes you around the mountain into the woods. You get lost
// You lost! type YES to try again!

import java.util.Scanner;

public class Adventure {

    static void adventure() {
        Scanner s = new Scanner(System.in);
        String hero = s.nextLine();
        System.out.println("You have fallen from a tree and cannot remember anything about yourself. It is up to you, " + hero + ", to rediscover your past");

        String direction = "";
        System.out.println("CROSSROADS 1: You come accross 2 paths with signs that describe the paths, they are called the North and South paths. type your desired path(S or N)");
        direction = s.nextLine();
        while (!direction.equals("N") && !direction.equals("S")) {
            System.out.println(direction);
            System.out.println("Redo");
            System.out.println("CROSSROADS 1: You come accross 2 paths with signs that describe the paths, they are called the North and South paths. type your desired path(S or N)");
            direction = s.next();
        }
        if (direction.equals("N")) {
            System.out.println("You chose the North path! The norh path leads you to your hometown with few inhabitants, yet there is a town in between that may be hostile.");
            System.out.println("Along the North path, you encounter a small dog that looks hungry");
            System.out.println("do you want to take this dog as your friend? (Y or N)");
            direction = s.nextLine();
            while (!direction.equals("N") && !direction.equals("Y")) {
                System.out.println("Redo");
                System.out.println("do you want to take this dog as your friend? (Y or N)");
                direction = s.nextLine();
            }

            if (direction.equals("Y")) {
                System.out.println("the dog bites you and you are dead.");
                System.out.println("You lose! type YES to play again");
                s.close();
                return;
            } 
            System.out.println("you walk to town past the dog anyway without it");
            System.out.println("Once you reach the small town, it appears like it is a very nice place. you may decide to cointnue or stay behind");

            System.out.println("Do you stay behind? (Y or N)");
            direction = s.nextLine();
            while (!direction.equals("N") && !direction.equals("Y")) {
                System.out.println("Redo");
                System.out.println("Do you stay behind? (Y or N)");
                direction = s.nextLine();
            }
            if (direction.equals("N")) {
                System.out.println("You lost! Your one goall was to travel home and you got caught up in the small town");
                System.out.println("You lose! type YES to play again!");
                s.close();
                return;
            } 

            System.out.println("You walk back home, hoping to rediscover who you are");
            System.out.println(hero + "! Shouted an older woman, suddenly, all of your memories flood back");
            System.out.println("You Win! Type yes to play again");

            
        }
        if (direction.equals("S")) {
            System.out.println("You walk accross the path, when a mountain is in the way, you can either scale the mountain or go around");
            System.out.println("Go up the M or W around");
            while (!direction.equals( "M") && !direction.equals("W")) {
                System.out.println("Redo");
                System.out.println("Go up the M or W around");
                direction = s.nextLine();
            } 
            if (direction.equals("M")) {
                System.out.println("While scaling the mountain, you encounter a friendly villager that knows the way to your hometown");
                System.out.println("you encounter a small dog that looks hungry");
                System.out.println("do you want to take this dog as your friend? (Y or N)");
                direction = s.nextLine();
                while (!direction.equals("N") && !direction.equals("Y")) {
                    System.out.println("Redo");
                    System.out.println("do you want to take this dog as your friend? (Y or N)");
                    direction = s.nextLine();
                }

                if (direction.equals("Y")) {
                    System.out.println("the dog bites you and you are dead.");
                    System.out.println("You lose! type YES to play again");
                    s.close();
                    return;
                } 
                System.out.println("you walk to town past the dog anyway without it");
                System.out.println("Once you reach the small town, it appears like it is a very nice place. you may decide to cointnue or stay behind");

                System.out.println("Do you stay behind? (Y or N)");
                direction = s.nextLine();
                while (!direction.equals("N") && !direction.equals("Y")) {
                    System.out.println("Redo");
                    System.out.println("Do you stay behind? (Y or N)");
                    direction = s.nextLine();
                }
                if (direction.equals("N")) {
                    System.out.println("You lost! Your one goall was to travel home and you got caught up in the small town");
                    System.out.println("You lose! type YES to play again!");
                    s.close();
                    return;
                } 

                System.out.println("You walk back home, hoping to rediscover who you are");
                System.out.println(hero + "! Shouted an older woman, suddenly, all of your memories flood back");
                System.out.println("You Win! Type yes to play again");
            } else {
                System.out.println("Unfortunately the trail takes you around the mountain into the woods. You get lost");
                System.out.println("You lost! type YES to try again!");
            }
        }
        s.close();
        }

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        while(true) {
            adventure();
            if (!s.nextLine().equals("YES")) {
                break;
            }
        }
        s.close();
    }

}

