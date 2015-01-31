public class Pawn extends Piece {

    private Position[] movePositions;

    public Pawn(Colors color) {
        super(color);
    }

    @Override
    public char key() {
        return 'P';
    }

    public char getColor() {
        return (this.Color == Colors.BLACK) ? 'B' : 'W';
    }

    @Override
    public boolean isLegalMove(
            Position start,
            Position end,
            Board board) {

        //moves straight up
        if (this.Color == Colors.WHITE) {

            //one move
            if (start.getX() == end.getX() || (end.getY() - start.getY()) == 1) {
                movePositions[0] = new Position(end.getY(), start.getX());
            }
            //two move, first move
            if (start.getX() == end.getX() || (end.getY() - start.getY()) == 2 || start.getY() == 2) {

                Byte yPlus = end.getY();

                for (int y = 0; y < 2; y++) {

                    yPlus++;

                    movePositions[y] = new Position(yPlus, start.getX());

                }

                if (start.getY() > end.getY()) {


                }
            }

            if (start.getY() == 2) {

            }
        }

        if (this.Color == Colors.WHITE) {
        }

        //Pawns first move
        if (start.getY() == 2 || start.getY() == 7 && Math.abs(end.getY() - start.getY()) <= 2) {

            movePositions = new Position[Math.abs(start.getY() - end.getY())];

            Byte yPlus = start.getY();

            for (int y = 0; y < (Math.abs(start.getY() - end.getY())); y++) {

                yPlus++;

                movePositions[y] = new Position(yPlus, start.getX());
            }

        }


        if (start.getY() >= 2 || start.getY() <= 7 && Math.abs(end.getY() - start.getY()) <= 2) {

        }

        //check if the positions are empty
        return board.allPositionsAreEmpty(movePositions);
    }
}
