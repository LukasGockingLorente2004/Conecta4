public class Table {

    private final Token [][] table;



    public Table() {
        this.table = new Token[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                table[i][j] = Token.Empty;
            }
        }
    }

    public void printTable (){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(" " + table[i][j].label + " ");
            }
            System.out.println();
        }
        System.out.println(" 1  2  3  4  5  6  7 ");
        System.out.println(" ");
    }

    public Token [][] placeToken (int pos, Token token){

        pos--;

        for (int i = 0; i < table.length; i++) {
            if (table[table.length - 1 - i][pos] == Token.Empty){
                table[table.length - 1 - i][pos] = token;
                break;
            }
        }

        return table;
    }

    public boolean checkEnd() {
        int rows = table.length;
        int columns = table[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (i + 3 < rows &&
                        table[i][j] != Token.Empty &&
                        table[i][j] == table[i+1][j] &&
                        table[i][j] == table[i+2][j] &&
                        table[i][j] == table[i+3][j]) {
                    return true;
                }

                if (j + 3 < columns &&
                        table[i][j] != Token.Empty &&
                        table[i][j] == table[i][j+1] &&
                        table[i][j] == table[i][j+2] &&
                        table[i][j] == table[i][j+3]) {
                    return true;
                }

                if (i + 3 < rows && j + 3 < columns &&
                        table[i][j] != Token.Empty &&
                        table[i][j] == table[i+1][j+1] &&
                        table[i][j] == table[i+2][j+2] &&
                        table[i][j] == table[i+3][j+3]) {
                    return true;
                }

                if (i + 3 < rows && j - 3 >= 0 &&
                        table[i][j] != Token.Empty &&
                        table[i][j] == table[i+1][j-1] &&
                        table[i][j] == table[i+2][j-2] &&
                        table[i][j] == table[i+3][j-3]) {
                    return true;
                }
            }
        }

        return false;
    }
}
