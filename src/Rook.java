public class Rook extends Piece {

    public Rook(Colors color) {
        super(color);
    }

    @Override
    public char key() {
        return 'R';
    }
    public char getColor(){
        return (this.Color == Colors.BLACK) ? 'B' : 'W';
    }
}
