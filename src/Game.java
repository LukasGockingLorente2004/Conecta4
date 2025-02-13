import java.util.Scanner;

public class Game {

    public Game() {
    }

    public static void play (){

        System.out.println("Introdueix el nom del jugador 1");

        Scanner scanner1 = new Scanner(System.in);
        String Scanner1 = scanner1.nextLine();

        Player jugador1 = new Player(Scanner1,Token.Circle);

        System.out.println("Introdueix el nom del jugador 2");

        Scanner scanner2 = new Scanner(System.in);
        String Scanner2 = scanner2.nextLine();

        Player jugador2 = new Player(Scanner2,Token.Cross);

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


}
