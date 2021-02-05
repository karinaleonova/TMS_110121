import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        String[][] gridIndex = { { "1", "1" }, { "2", "2" }, { "3", "3" }, { "4", "4" }, { "5", "5" }, { "6", "6" },
                { "7", "7" }, { "8", "8" }, { "9", "9" } };

        boolean stopTheGame = false;

        while (!stopTheGame) {

            for (int i = 0; i < gridIndex.length; i++) {
                System.out.print(gridIndex[i][1] + " ");
                if (i == 2 || i == 5) {
                    System.out.println("\n----------");
                }
                if (i == 0 || i == 1 || i == 3 || i == 4 || i == 6 || i == 7)
                    System.out.print("| ");
            }

            System.out.println("\n\nWhere do you want to put 'X' ?");
            System.out.println("Only numbers from 1-9 :");
            String userInput = s.nextLine();
            if (Integer.parseInt(userInput) > 9) {
                System.out.println("\nERROR , ONLY NUMBERS FROM 1-9 :");
                userInput = s.nextLine();
            }

            // Check in gridIndex is unique
            if (gridIndex[Integer.parseInt(userInput) - 1][1].equals("X")
                    || gridIndex[Integer.parseInt(userInput) - 1][1].equals("O")) {
                System.out.println("\n");
            } else {
                gridIndex[Integer.parseInt(userInput) - 1][1] = "X";
                System.out.println("\n");

                int count = 0;
                for (int i = 0; i < 8; i++) {

                    if ((gridIndex[0][1].equals("O") && gridIndex[1][1].equals("O") && gridIndex[2][1].equals("O"))
                            || (gridIndex[3][1].equals("O") && gridIndex[4][1].equals("O")
                                    && gridIndex[5][1].equals("O"))
                            || (gridIndex[6][1].equals("O") && gridIndex[7][1].equals("O")
                                    && gridIndex[8][1].equals("O"))
                            || (gridIndex[0][1].equals("O") && gridIndex[3][1].equals("O")
                                    && gridIndex[6][1].equals("O"))
                            || (gridIndex[1][1].equals("O") && gridIndex[4][1].equals("O")
                                    && gridIndex[7][1].equals("O"))
                            || (gridIndex[2][1].equals("O") && gridIndex[5][1].equals("O")
                                    && gridIndex[8][1].equals("O"))
                            || (gridIndex[0][1].equals("O") && gridIndex[4][1].equals("O")
                                    && gridIndex[8][1].equals("O"))
                            || (gridIndex[2][1].equals("O") && gridIndex[4][1].equals("O")
                                    && gridIndex[6][1].equals("O"))) {
                        System.out.println("\n0 PLAYER WON!!!\n");
                        stopTheGame = true;
                        break;

                    }
                    if ((gridIndex[0][1].equals("X") && gridIndex[1][1].equals("X") && gridIndex[2][1].equals("X"))
                            || (gridIndex[3][1].equals("X") && gridIndex[4][1].equals("X")
                                    && gridIndex[5][1].equals("X"))
                            || (gridIndex[6][1].equals("X") && gridIndex[7][1].equals("X")
                                    && gridIndex[8][1].equals("X"))
                            || (gridIndex[0][1].equals("X") && gridIndex[3][1].equals("X")
                                    && gridIndex[6][1].equals("X"))
                            || (gridIndex[1][1].equals("X") && gridIndex[4][1].equals("X")
                                    && gridIndex[7][1].equals("X"))
                            || (gridIndex[2][1].equals("X") && gridIndex[5][1].equals("X")
                                    && gridIndex[8][1].equals("X"))
                            || (gridIndex[0][1].equals("X") && gridIndex[4][1].equals("X")
                                    && gridIndex[8][1].equals("X"))
                            || (gridIndex[2][1].equals("X") && gridIndex[4][1].equals("X")
                                    && gridIndex[6][1].equals("X"))) {
                        System.out.println("\nX PLAYER WON!!!\n");

                        stopTheGame = true;
                        break;
                    }

                    if (!gridIndex[i][1].equals("X") && !gridIndex[i][1].equals("O")) {
                        gridIndex[i][1] = "O";

                        break;

                    }

                    count++;

                    if (count == 8) {
                        System.out.println("\nNO WINNER!!!\n");
                        stopTheGame = true;
                        break;
                    }

                }

            }
        }

    }
}
