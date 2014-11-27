public class Main {

    public static void main(String[] args) {
        Rook r = new Rook(Piece.Colors.BLACK);
        Pawn p = new Pawn(Piece.Colors.WHITE);
        Queen q = new Queen(Piece.Colors.WHITE);

        System.out.println(r + " " + p + " " + q);

        Board brd = new Board();
    }
}
