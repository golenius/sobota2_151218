public class Lab41_3 {
    public static void main(String[] args) {
        CC cc = new CC(false);
    }
}

class AA {
    AA(){
        System.out.println("konstruuje AA");
    }
    AA(boolean con){
        if (con == true) {
            //System.out.println("konstruuje CC");
        }
        else
            System.out.println("AA - not  silent");
    }

}
class BB extends  AA{
    BB(){
        System.out.println("konstruuje BB");
    }
    BB(boolean con){
        super(true);
        if (con == true) {
            //System.out.println("konstruuje CC");
        }
        else
            System.out.println("BB - not  silent");
    }
}
class CC extends  BB{
    CC(){
        System.out.println("konstruuje CC");
    }
    CC (boolean con){
        super(true);
        if (con == true) {
            //System.out.println("konstruuje CC");
        }
        else
        System.out.println("CC  - not  silent");
    }
}
