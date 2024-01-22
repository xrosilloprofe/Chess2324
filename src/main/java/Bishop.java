public class Bishop extends Piece {
    public Bishop(Board board, Coordinate coordinate, Type type) {
        super(type.getType(), board.getCellAt(coordinate));
    }

    @Override
    public Coordinate[] getNextMovements() {
        return new Coordinate[0];
    }

    public enum Type {
        BLACK(Piece.Type.BLACK_BISHOP),
        WHITE(Piece.Type.WHITE_BISHOP);

        private Piece.Type type;

        Type(Piece.Type type) {
            this.type = type;
        }

        public Piece.Type getType() {
            return type;
        }
    }
}
