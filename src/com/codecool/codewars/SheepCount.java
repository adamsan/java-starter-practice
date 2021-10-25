package com.codecool.codewars;

public class SheepCount {
    public static void main(String[] args) {
        int sheepCount = count("sheep", args);
        int wolfCount = count("wolf", args);

        System.out.println("Sheeps counted: " + sheepCount);
        System.out.println("Wolfs counted: " + wolfCount);

        // Print the sheep surviving the wolf attack:
        // If a sheep is preceeded by a wolf, it will be eaten.
        // Example:  orange sheep wolf sheep sheep
        //                               ^ this sheep will be eaten by the wolf befor it.
        // Output: Sheep survived: 2

        int aliveSheepCount = getAliveSheepCount(args);
        System.out.println("Sheep survived: " + aliveSheepCount);

    }

    private static int getAliveSheepCount(String[] args) {
        int aliveSheepCount = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("sheep")) {
                boolean preceededByWolf = i > 0 && args[i - 1].equals("wolf");
                if (!preceededByWolf) {
                    aliveSheepCount++;
                }
            }
        }
        return aliveSheepCount;
    }

    private static int count(String target, String[] strings) {
        int count = 0;
        for (String el : strings) {
            if (target.equals(el)) {
                count++;
            }
        }
        return count;
    }
}
