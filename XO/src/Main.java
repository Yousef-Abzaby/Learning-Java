import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> xChecker = new ArrayList<Integer>();
    static ArrayList<Integer> oChecker = new ArrayList<Integer>();
    static int[][] winningCombinations =    {
                                                    {1,2,3},
                                                    {4,5,6},
                                                    {7,8,9},
                                                    {1,4,7},
                                                    {2,5,8},
                                                    {3,6,9},
                                                    {1,5,9},
                                                    {3,5,7}
                                            };

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
                if (weHave_Winner(xChecker, oChecker) == 1) {
                    System.out.println("Player X wins!");
                    play_Again();
                }
            } else {
                changeDisplay(displayedGrid, choose(), player2);
                if (weHave_Winner(xChecker, oChecker) == -1) {
                    System.out.println("Player O wins!");
                    play_Again();
                }
            }
            if (i == 9) {
                System.out.println("It's a draw!");
                play_Again();
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
        if (!(oChecker.contains(position) || xChecker.contains(position))) {
            if (player.XO == 'X') {
                xChecker.add(position);
            } else {
                oChecker.add(position);
            }
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

    // Winning algorithm
    static int weHave_Winner(ArrayList<Integer> xChecker, ArrayList<Integer> oChecker) {
        for (int[] combination : winningCombinations) {

            ArrayList<Integer> winningCombo = new ArrayList<>();
            for (int pos : combination) {
                winningCombo.add(pos);
            }

            if (xChecker.containsAll(winningCombo)) {
                return 1; // X wins
            }
            if (oChecker.containsAll(winningCombo)) {
                return -1; // O wins
            }
        }
        return 0; // No winner yet
    }
    static void play_Again() {
        System.out.println("Would you like to play again? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("Y")) {
            Main.main(new String[0]);
        } else if (answer.equals("N")) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Invalid input");
            play_Again();
        }
    }
}