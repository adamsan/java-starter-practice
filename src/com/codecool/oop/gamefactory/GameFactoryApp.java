package com.codecool.oop.gamefactory;

import java.util.Random;

/**
 * Create a class hierarchy for Games. A Game can be a CardGame, a BoardGame, a ComputerGame.
 * A GameFactory creates Games, so for each Game type, create a corresponding factory - for example: CardGameFactory
 * Also create a MixedGameFactory, which randomly creates a different type of Game, when it's create method is called.
 * Create a GameFactoryCreator class, which builds a GameFactory, for each possible types of games.
 *
 * */
public class GameFactoryApp {
    public static void main(String[] args) {
        GameFactoryCreator gameFactoryCreator = new GameFactoryCreator();
        GameFactory gameFactory = gameFactoryCreator.create(GameType.MIXED);
        for (int i = 0; i < 10; i++) {
            System.out.println(gameFactory.create());
        }
    }
}
abstract class Game{}
class CardGame extends Game{}
class BoardGame extends Game{}
class ComputerGame extends Game{}

enum GameType {
    CARD, BOARD, COMPUTER, MIXED
}
interface GameFactory {
    Game create();
}
class CardGameFactory implements GameFactory {
    @Override
    public Game create() {
        return new CardGame();
    }
}

class BoardGameFactory implements GameFactory {
    @Override
    public Game create() {
        return new BoardGame();
    }
}

class ComputerGameFactory implements GameFactory {
    @Override
    public Game create() {
        return new ComputerGame();
    }
}
class MixedGameFactory implements GameFactory {
    private static final Random RAND = new Random();
    @Override
    public Game create() {
        return switch (RAND.nextInt(3)) {
            case 0 -> new BoardGame();
            case 1 -> new CardGame();
            case 2 -> new ComputerGame();
            case default -> throw new RuntimeException();
        };
    }
}
class GameFactoryCreator {
    public GameFactory create(GameType type){
        return switch (type) {
            case CARD -> new CardGameFactory();
            case BOARD -> new BoardGameFactory();
            case COMPUTER -> new ComputerGameFactory();
            case MIXED -> new MixedGameFactory();
        };
    }
 }