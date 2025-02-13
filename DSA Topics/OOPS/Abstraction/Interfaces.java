//Interface: is a blueprint that contains only abstract methods ,It is used for multiple inheritance and to enforce method implementation in classes.

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("UP,DOWN,LEFT,RIGH,Diagonals(int all 4 directions)");
    }
}
class Hook implements ChessPlayer{
    public void moves(){
        System.out.println("UP,DOWN,LEFT,RIGH");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("UP,DOWN,LEFT,RIGH,Diagonal(by one step)");
    }
}
