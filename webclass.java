public class webclass {
    // interface
    // to multiple multiple inheritance(multiplr a , b -> c)
    // total abstraction
    //  all methods are public , static ,and without imlplementation, 
    //variable are final, staic and public
    
public static void main(String args[]){
    Queen q = new Queen(); 
    q.moves();
}
}
interface ChessPlayer{
    void moves();

}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println(" up,down,left,right,diagonal(in all direcdtions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println(" up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println(" up,down,left,right,diagonal(by 1 step)");
    }
}
