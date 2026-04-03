package Task2.main;

public class Main {
    public static void main(String[] args) {
        Pawn pawn = new Pawn(new Position(4, 5), true);
        System.out.println(pawn.isLegalMove(new Position(4, 6)));
        System.out.println(pawn.isLegalMove(new Position(0, 4)));
        System.out.println(pawn.isLegalMove(new Position(0, 6)));

        Rook rook = new Rook(new Position(5, 3), false);
        System.out.println(rook.isLegalMove(new Position(6, 3)));
        System.out.println(rook.isLegalMove(new Position(5, 1)));
        System.out.println(rook.isLegalMove(new Position(2, 0)));
    }
}
