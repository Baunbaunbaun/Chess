public class Rook extends Piece {

    private Position[] movePositions;

    public Rook(Colors color) {
        super(color);
    }

    @Override
    public char key() {
        return 'R';
    }

    public char getColor() {
        return (this.Color == Colors.BLACK) ? 'B' : 'W';
    }

    @Override
    public boolean isLegalMove(
            Position start,
            Position end,
            Board board) {

//Rook moves in column
        if (start.getX() == end.getX()) {

            movePositions = new Position[Math.abs(start.getY() - end.getY())];

            if (start.getY() < end.getY()) {

                Byte yPlus = start.getY();

                for (int y = 0; y < (Math.abs(start.getY() - end.getY())); y++) {

                    yPlus++;

                    movePositions[y] = new Position(yPlus, start.getX());
                }
            }
            if (start.getY() > end.getY()) {

                Byte yPlus = end.getY();

                for (int y = 0; y < (Math.abs(start.getY() - end.getY())); y++) {

                    yPlus++;

                    movePositions[y] = new Position(yPlus, start.getX());
                }
            }
            return board.allPositionsAreEmpty(movePositions);
        }

//Rook moves in row
        if (start.getY() == end.getY()) {
            movePositions = new Position[Math.abs(start.getX() - end.getX())];

            if (start.getX() < end.getX()) {

                Byte xPlus = start.getX();

                for (int x = 0; x < (Math.abs(start.getX() - end.getX())); x++) {

                    xPlus++;

                    movePositions[x] = new Position(xPlus, start.getY());
                }
            }
            if (start.getX() > end.getX()) {

                Byte xPlus = end.getX();

                for (int x = 0; x < (Math.abs(start.getX() - end.getX())); x++) {

                    xPlus++;

                    movePositions[x] = new Position(xPlus, start.getY());
                }
            }
            return board.allPositionsAreEmpty(movePositions);

        } else return false;
    }
}

