import java.util.Scanner;

public class Game {

    public Game() {
    }

    public static void play (){

        Player jugador1 = new Player(askPlayerName(1),Token.Circle);

        Player jugador2 = new Player(askPlayerName(2),Token.Cross);

        Table table = new Table();

        int End = 0;

        while (End == 0){

            table.printTable();

            System.out.println("Introduex la posició on vols posar la fitxa ");

            Scanner scanner3 = new Scanner(System.in);
            int pos1 = scanner3.nextInt();

            table.placeToken(pos1,jugador1.getToken());

            table.printTable();

            if (table.checkEnd()){
                System.out.println("Ha guanyat: " + jugador1.getName());
                End++;
            }

            System.out.println("Introduex la posició on vols posar la fitxa ");

            Scanner scanner4 = new Scanner(System.in);
            int pos2 = scanner3.nextInt();

            table.placeToken(pos2,jugador2.getToken());

            if (table.checkEnd()){
                table.printTable();
                System.out.println("Ha guanyat: " + jugador2.getName());
                End++;
            }
        }
    }

    private static String askPlayerName (int playerNumber){
        System.out.println("Introdueix el nom del jugador " + playerNumber);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
