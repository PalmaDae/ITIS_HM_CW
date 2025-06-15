package Sweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static boolean gameOver = false;
    public static Scanner scanner = new Scanner(System.in);
    public static int turn = 0;

    /**
        Коды для поля
        -1 - не открытая, пустая
        -2 - не открытая, с миной
        -3 - открытая, пустая
        -4 - открытая, с миной
        -5 - флажок с миной
        -6 - флажок без мины
        0-8 - сколько мин рядом
     **/
    public static int[][] generateSweeper(int row, int column, int bombs) {
        Random random = new Random();

        int[][] field = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0 ; j < column; j++) {
                field[i][j] = -1;
            }
        }

        for (int i = 0; i < bombs; i++) {
            int x = 0;
            int y = 0;
            do  {
                x = random.nextInt(0, row);
                y = random.nextInt(0, column);
            } while (field[x][y] == -2);

            field[x][y] = -2;
        }
        return field;
    }

    public static int[] userData(int row, int column) {
        System.out.println("Введите индексы и действие");
        String line = scanner.nextLine();

        String[] data = line.split(" ");

        int[] array = new int[3];

        if (Integer.parseInt(data[0]) < 0 || Integer.parseInt(data[0]) > row) {
            throw new IllegalArgumentException("AtataException");
        } else if (Integer.parseInt(data[1]) < 0 || Integer.parseInt(data[1]) > column) {
            throw new IllegalArgumentException("AtataException");
        } else if (Integer.parseInt(data[2]) != 0 && Integer.parseInt(data[2]) != 1) {
            throw new IllegalArgumentException("AtataException");
        } else {
            array[0] = Integer.parseInt(data[0]);
            array[1] = Integer.parseInt(data[1]);
            array[2] = Integer.parseInt(data[2]);
        }

        return array;
    }

    /**
        Коды для поля
        -1 - не открытая, пустая
        -2 - не открытая, с миной
        -3 - открытая, пустая
        -4 - открытая, с миной
        -5 - флажок с миной
        -6 - флажок без мины
        0-8 - сколько мин рядом
     **/

    public static void printField(Game game) {
        String[][] newField = new String[game.row][game.column];

        for (int i = 0; i < game.row; i++) {
            for (int j = 0; j < game.column; j++) {
                if (game.field[i][j] == -1 || game.field[i][j] == -2) {
                    newField[i][j] = "■";
                } else if (game.field[i][j] == -3) {
                    newField[i][j] = "□";
                } else if (game.field[i][j] == -5 || game.field[i][j] == -6) {
                    newField[i][j] = "⚐";
                } else if (game.field[i][j] == -4) {
                    newField[i][j] = "\uD83D\uDCA3";
                } else {
                    newField[i][j] = String.valueOf(game.field[i][j]);
                }
            }
        }

        for (String[] bom : newField) {
            System.out.println(Arrays.toString(bom));
        }
    }

    public static void changeCell(Game game, int x, int y) {
        if (game.field[x][y] != -1) {
            return;
        }

        int cnt = countBombsAround(x,y, game);

        if (cnt == 0) {
            game.field[x][y] = -3;

            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (dx == 0 && dy == 0) {
                        continue;
                    }

                    int newX = x + dx;
                    int newY = y + dy;

                    if (newX >= 0 && newX < game.row && newY >= 0 && newY < game.column) {
                        changeCell(game, newX, newY);
                    }
                }
            }
        } else {
            game.field[x][y] = countBombsAround(x,y, game);
        }

    }

    public static int countBombsAround(int x, int y, Game game) {
        int cnt = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;

                int newX = x + i;
                int newY = y + j;

                if (newX >= 0 && newX < game.row && newY >= 0 && newY < game.column) {
                    if (game.field[newX][newY] == -2 ) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    public static void process(Game game, int[] data) {
        //Смотрим на какую клетку мы нажали и что сделали

        int action = data[2];

        int x = data[0];
        int y = data[1];

        if (action == 0) {
            //Закрытая мина, на открытую мину
            if (game.field[x][y] == -2 && turn != 0) {
                game.field[x][y] = -4;
                System.out.println("Game Over!");
                gameOver = true;
            //Закрытая мина, на открытую мину
            } else if (game.field[x][y] == -2 && turn == 0) {
                System.out.println("Первый ход и уже бомба, попробуйте ещё");
                data = userData(game.row, game.column);
            //Закрытая пустая, но открытую пустую
            } else if (game.field[x][y] == -1) {
                changeCell(game, x, y);
                //Функция, которая открывает соседние пустые клетки
                //Ф-ия, которая номера делает сколько рядом бомб
            }
        } else if (action == 1) {
            //Если флажок с миной, убираем флажок
            if (game.field[x][y] == -5) {
                game.field[x][y] = -2;
            //Если флажок без мины, убираем флажок
            } else if (game.field[x][y] == -6) {
                game.field[x][y] = -1;
            //Не открытую пустую на флажок без мины
            } else if (game.field[x][y] == -1) {
                game.field[x][y] = -6;
            //Не открытая с миной, флажок с миной
            } else if (game.field[x][y] == -2) {
                game.field[x][y] = -5;
            } else {
                System.out.println("Клетка открыта");
            }

        }
    }

     /**
        Коды для поля
        -1 - не открытая, пустая
        -2 - не открытая, с миной
        -3 - открытая, пустая
        -4 - открытая, с миной
        -5 - флажок с миной
        -6 - флажок без мины
        0-8 - сколько мин рядом
     **/

    public static void gameplay(Game game, int bombs) {
        printField(game);

        while (!gameOver) {
            //Данные пользователя
            int[] data = userData(game.row, game.column);
            System.out.println("Ход: " + turn);
            //Изменение модели игры
            process(game, data);
            //Отрисовка на экран
            printField(game);
            //Подсчитка ходов;
            turn++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Количество строк");
        int row = scanner.nextInt();
        System.out.println("Количество столбцов");
        int column = scanner.nextInt();
        System.out.println("Количество мин");
        int bombs = scanner.nextInt();

        scanner.nextLine();

        int[][] field = generateSweeper(row, column, bombs);

        Game game = new Game(field, row,column);

        gameplay(game, bombs);
    }
}
