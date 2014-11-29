public class Main {

    public static void main(String[] args) {
        Rook r = new Rook(Piece.Colors.BLACK);
        Pawn p = new Pawn(Piece.Colors.WHITE);
        Queen q = new Queen(Piece.Colors.WHITE);

        System.out.println(r + " " + p + " " + q);

        Board brd = new Board();

        Byte a = 1;
        Byte b = 1;

        Byte k = 6;
        Byte l = 1;


        Position rookStartPosition = new Position(a, b);
        Position rookEndPosition = new Position(k, l);

        System.out.println(brd.getPiece(rookStartPosition));
        System.out.println(brd.getPiece(rookEndPosition));

        brd.board[1][1] = r;

        System.out.println(brd.getPiece(rookStartPosition));

        r.isLegalMove(rookStartPosition, rookEndPosition, brd);

    }
}
