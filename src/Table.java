public class Table {

    private char [][] table = new char[6][7];

    public Table() {
        this.table = new char[6][7]; // Crea un array vacío (inicializado con '\0')
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                table[i][j] = ' '; // Llena el tablero con espacios en blanco
            }
        }
    }

    public char[][] getTable() {
        return table;
    }

    public void setTable(char[][] table) {
        this.table = table;
    }

    public static void printTable (char [][] table){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print( "|" + table[i][j] + "|");
            }
            System.out.println();
            System.out.println("---------------------");
        }
        System.out.println(" ");
    }

    public static char [][] placeToken (char [][] taula, int pos1, int pos2, char token){
        if (taula[pos1][pos2] == ' '){
            taula[pos1][pos2] = token;
        }

        return taula;
    }

    public static char [][] resetTable (char [][] table){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                table[i][j] = ' '; // Llena el tablero con espacios en blanco
            }
        }
        return table;
    }
}
