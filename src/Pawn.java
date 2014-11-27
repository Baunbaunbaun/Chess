public class Pawn extends Piece {

    public Pawn(Colors color) {
        super(color);
    }

    @Override
    public char key() {
        return 'P';
    }
    public char getColor(){
        return (this.Color == Colors.BLACK) ? 'B' : 'W';
    }
}
