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
        System.out.println(" 1  2  3  4  5  6  7 ");
        System.out.println(" ");
    }

    public static char [][] placeToken (char [][] taula, int pos, char token){

        for (int i = 0; i < taula.length; i++) {
            if (taula[pos][i] == ' '){
                taula[pos][i] = token;
            }
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

    public static boolean checkEnd(char[][] taula) {
        int rows = taula.length;
        int columns = taula[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                // Comprobació vertical
                if (i + 3 < rows &&
                        taula[i][j] != ' ' &&
                        taula[i][j] == taula[i+1][j] &&
                        taula[i][j] == taula[i+2][j] &&
                        taula[i][j] == taula[i+3][j]) {
                    return true;
                }

                // Comprobació horizontal
                if (j + 3 < columns &&
                        taula[i][j] != ' ' &&
                        taula[i][j] == taula[i][j+1] &&
                        taula[i][j] == taula[i][j+2] &&
                        taula[i][j] == taula[i][j+3]) {
                    return true;
                }

                // Comprobació diagonal descendent
                if (i + 3 < rows && j + 3 < columns &&
                        taula[i][j] != ' ' &&
                        taula[i][j] == taula[i+1][j+1] &&
                        taula[i][j] == taula[i+2][j+2] &&
                        taula[i][j] == taula[i+3][j+3]) {
                    return true;
                }

                // Comprobació diagonal ascendent
                if (i + 3 < rows && j - 3 >= 0 &&
                        taula[i][j] != ' ' &&
                        taula[i][j] == taula[i+1][j-1] &&
                        taula[i][j] == taula[i+2][j-2] &&
                        taula[i][j] == taula[i+3][j-3]) {
                    return true;
                }
            }
        }

        return false;
    }
}
