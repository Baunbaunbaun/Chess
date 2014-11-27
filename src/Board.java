public class Board {

    Piece[][] board;

    public Board() {
        this.board = new Piece[8][8];

    }

    public Piece getPiece(Position position){

        return this.board[position.getX()][position.getY()];
    }
}
