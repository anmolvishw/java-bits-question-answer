
public class decimal_to_binary {
    static String tobinary(int val){
        String hold=new String("");
        //when zero
       if(val == 0 )
        return "0";

        //When Positive Value
        if(val >0)
         while(val != 0){
           int temp=val%2;
           hold = hold + temp;
           val/=2;
        }

        return hold;
    }
    public static void main(String[] args) {
        // value 
        int  val =15; //000..0111

        System.out.println(tobinary(val));
    }
}
