public class Queen extends Piece {

    public Queen(Colors color) {
        super(color);
    }

    @Override
    public char key() {
        return 'Q';
    }
    public char getColor(){
        return (this.Color == Colors.BLACK) ? 'B' : 'W';
    }
}
