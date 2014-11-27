public abstract class Piece {

    protected enum Colors {

        BLACK, WHITE

    }

    public final Enum Color;

    public Piece(Colors color) {
        this.Color = color;
    }

    public abstract char key();

    public abstract char getColor();

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(getColor() + "" + key());

        return sb.toString();
    }

    public boolean isLegalMove(
            Position start,
            Position end,
            Board board){

        Piece ppiece = board.getPiece(end);

        return ppiece != null && ppiece.getColor() != this.getColor();
    }
}
