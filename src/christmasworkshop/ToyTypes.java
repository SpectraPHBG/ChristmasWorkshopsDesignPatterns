package christmasworkshop;

public enum ToyTypes {
    DOLL,
    BIKE;
    public static boolean contains(String dollType){
       if(dollType != null){
           if(dollType.equals(DOLL.toString())){
               return true;
           }
           else if(dollType.equals(BIKE.toString())){
               return true;
           }
       }
       return false;
    }
}
