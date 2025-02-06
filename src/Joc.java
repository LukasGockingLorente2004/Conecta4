public class Joc {
    public static void main(String[] args) {

        Table table = new Table();



        table.placeToken(table.getTable(),0,0,'X');

        table.printTable(table.getTable());

        table.setTable(table.resetTable(table.getTable()));

        table.printTable(table.getTable());

    }

    public static void play (Table table){
        
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
