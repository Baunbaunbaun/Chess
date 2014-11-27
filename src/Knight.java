public class Knight extends Piece {

    public Knight(Colors color) {
        super(color);
    }

    @Override
    public char key() {
        return 'N';
    }
    public char getColor(){
        return (this.Color == Colors.BLACK) ? 'B' : 'W';
    }
}
