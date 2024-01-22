import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Board tablero = new Board();
        Knight c1= new Knight(tablero,new Coordinate('E',4), Knight.Type.BLACK);
        King r2=new King(tablero,new Coordinate('D',2), King.Type.WHITE);
        Bishop b1 = new Bishop(tablero, new Coordinate('F',2),Bishop.Type.BLACK);
        Bishop b2 = new Bishop(tablero, new Coordinate('E',8),Bishop.Type.WHITE);

        System.out.println(Arrays.toString(c1.getNextMovements()));
        tablero.highligh(c1.getNextMovements());

        System.out.println(tablero);

    }
}
