public class Board {

    Piece[][] board = new Piece[8][8];

    public Piece getPiece(Position position) {

        if (this.board[position.getX()][position.getY()] == null) return null;
        else
            return this.board[position.getX()][position.getY()];
    }


    public boolean allPositionsAreEmpty(Position[] positions) {

        for (int i = 0; i < positions.length; i++) {

            if (this.getPiece(positions[i]) != null) {
                return false;
            }
        }
        return true;
    }
}
