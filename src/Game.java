import java.util.Scanner;

public class Game {

    public Game() {
    }

    public static void play (){

        Player player1 = new Player(askPlayerName(1),Token.Circle);

        Player player2 = new Player(askPlayerName(2),Token.Cross);

        Table table = new Table();

        int End = 0;

        while (End == 0){

            table.printTable();

            table.placeToken(askTokenPosition(),player1.getToken());

            table.printTable();

            if (table.checkEnd()){
                printFinale(player1);
                End++;
            }

            table.placeToken(askTokenPosition(),player2.getToken());

            if (table.checkEnd()){
                table.printTable();
                printFinale(player2);
                End++;
            }
        }
    }

    private static String askPlayerName (int playerNumber){
        System.out.println("Introdueix el nom del jugador " + playerNumber);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int askTokenPosition (){
        System.out.println("Introduex la posició on vols posar la fitxa ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printFinale (Player player){
        System.out.println("La partida ha acabat.");
        System.out.println("Ha guanyat: " + player.getName());
    }


}
