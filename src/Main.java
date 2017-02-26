GanttStart: 2017-02-26
GanttDue: 2017-03-15

public class Main {

    public static void main(String[] args) {
        Rook r = new Rook(Piece.Colors.BLACK);
        Pawn p = new Pawn(Piece.Colors.WHITE);
        Queen q = new Queen(Piece.Colors.WHITE);

        System.out.println(r + " " + p + " " + q);

        Board brd = new Board();

        //A1
        Byte a = 1;
        Byte b = 1;

        //F1
        Byte k = 6;
        Byte l = 1;

        //C1
        Byte m = 3;
        Byte n = 1;

        //A4
        Byte s = 1;
        Byte t = 4;


        brd.board[1][1] = r;
        brd.board[1][3] = q;
        brd.board[1][4] = p;

        Position rookStartPosition = new Position(a, b);
        Position rookEndPosition = new Position(k, l);
        Position queenPosition = new Position(m, n);
        Position pawnStartPosition = new Position(s, t);

        System.out.println(brd.getPiece(rookStartPosition));
        System.out.println(brd.getPiece(rookEndPosition));
        System.out.println(brd.getPiece(queenPosition));

        brd.board[6][1] = r;


        System.out.println(brd.getPiece(rookStartPosition));

        System.out.println(r.isLegalMove(rookStartPosition, rookEndPosition, brd));

        System.out.println(r.Color);
        System.out.println(q.Color);
        System.out.println(p.Color);
    }
}
