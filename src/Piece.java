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

        return this.getColor() + "" + this.key();

    }

    public boolean isLegalMove(
            Position start,
            Position end,
            Board board) {

        Piece ppiece = board.getPiece(end);

        if (ppiece != null) {
            return ppiece.getColor() != this.getColor();
        } else {
            return true;
        }
    }
}
