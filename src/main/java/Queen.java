public class Queen extends Piece{
    public Queen(Board board, Coordinate coordinate, Type type){
        super(type.getType(), board.getCellAt(coordinate));
    }

    @Override
    public Coordinate[] getNextMovements() {
        return new Coordinate[0];
    }

    public enum Type{
        BLACK(Piece.Type.BLACK_QUEEN),
        WHITE(Piece.Type.WHITE_QUEEN);

        private Piece.Type type;
        Type(Piece.Type type){
            this.type=type;
        }

        public Piece.Type getType() {
            return type;
        }
    }

}
