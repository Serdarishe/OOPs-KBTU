package Task2.main;

public abstract class Piece {
    protected Position a;
    protected boolean isWhite;

    public Piece(Position a, boolean isWhite) {
        this.a = a;
        this.isWhite = isWhite;
    }

    public abstract boolean isLegalMove(Position b);
}
