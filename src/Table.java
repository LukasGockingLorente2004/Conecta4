public class Table {

    private char[][] table = new char[6][7];

    public Table() {
        this.table = new char[6][7]; // Crea un array vacío (inicializado con '\0')
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                table[i][j] = ' '; // Llena el tablero con espacios en blanco
            }
        }
    }
}
