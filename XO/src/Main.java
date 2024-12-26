import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> checker = new ArrayList<Integer>();

    public static void main(String[] args) {

        Player player1 = new Player('X');
        Player player2 = new Player('O');

        char[][] displayedGrid =    {
                                        {'1', '2', '3'},
                                        {'4', '5', '6'},
                                        {'7', '8', '9'}
                                    };

        display(displayedGrid);
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1) {
                changeDisplay(displayedGrid, choose(), player1);
            } else {
                changeDisplay(displayedGrid, choose(), player2);
            }

        }
    }

    // Method for taking the position

    static int choose(){
        System.out.println("Choose your position");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // Method for updating the grid

    static void changeDisplay(char[][] displayedGrid, int position, Player player){
        if (!checker.contains(position)) {
            checker.add(position);
            int row = (position - 1) / 3;
            int col = (position - 1) % 3;
            displayedGrid[row][col] = player.XO;
            display(displayedGrid);
        } else {
            System.out.println("Position is already in the grid");
            changeDisplay(displayedGrid, choose(), player);
        }
    }

    // Method for displaying the grid

    static void display(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}