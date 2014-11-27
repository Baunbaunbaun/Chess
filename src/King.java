public class King extends Piece {

    public King(Colors color) {
        super(color);
    }

    @Override
    public char key() {
        return 'K';
    }
    public char getColor(){
        return (this.Color == Colors.BLACK) ? 'B' : 'W';
    }
}
