import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Board tablero = new Board();
        Rook rook= new Rook(tablero,new Coordinate('D',5), Rook.Type.BLACK);
        Queen queen=new Queen(tablero,new Coordinate('B',3), Queen.Type.WHITE);
        Bishop b1 = new Bishop(tablero, new Coordinate('C',3),Bishop.Type.BLACK);
        Bishop b2 = new Bishop(tablero, new Coordinate('A',4),Bishop.Type.WHITE);
        Pawn peon1 = new Pawn(tablero,new Coordinate('A',7),Pawn.Type.WHITE);
        Pawn peon2 = new Pawn(tablero,new Coordinate('A',2),Pawn.Type.BLACK);

        tablero.highligh(peon1.getNextMovements());
        tablero.highligh(peon2.getNextMovements());
        System.out.println(tablero);
//        tablero.resetColor();
//        System.out.println(tablero);

    }
}
