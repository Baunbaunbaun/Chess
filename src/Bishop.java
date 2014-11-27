public class Bishop extends Piece {

    public Bishop(Colors color) {
        super(color);
    }

    @Override
    public char key() {
        return 'B';
    }
    public char getColor(){
        return (this.Color == Colors.BLACK) ? 'B' : 'W';
    }
}
