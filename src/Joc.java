import java.util.Scanner;

public class Joc {

    public static void play (){

        System.out.println("Introdueix el nom del jugador 1");

        Scanner scanner1 = new Scanner(System.in);
        String Scanner1 = scanner1.nextLine();

        Player jugador1 = new Player(Scanner1,'O');

        Scanner scanner2 = new Scanner(System.in);
        String Scanner2 = scanner2.nextLine();

        Player jugador2 = new Player(Scanner2,'X');

        Table table = new Table();

        int End = 0;

        while (End == 0){

            table.printTable(table.getTable());

            System.out.println("Introduex la posició o vols posar la fitxa ");

        }

    }


}
