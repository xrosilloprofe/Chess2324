public class Main {
    public static void main(String[] args) {
        Board tablero = new Board();
        Knight r1= new Knight(tablero,new Coordinate('E',4), Knight.Type.BLACK);
//        King r2=new King(tablero,new Coordinate('C',1), King.Type.WHITE);
//        Bishop b1 = new Bishop(tablero, new Coordinate('A',1),Bishop.Type.BLACK);
//        Bishop b2 = new Bishop(tablero, new Coordinate('E',8),Bishop.Type.WHITE);
        System.out.println(tablero);
    }
}
