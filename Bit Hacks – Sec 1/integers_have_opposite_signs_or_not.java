public class integers_have_opposite_signs_or_not {
    public static void main(String[] args) {
        //value
        int value = 0;

            //--Normal Concept
        if(value > 0)
            System.out.println(" value is Positive");
        else if(value == 0)
            System.out.println("Value is Zero ");
        else
            System.out.println("Value is negative");


        //--- using bit concept
            // -- formula to evalute integer
            // 1 + (value>>31)-(-value>>31)  if 0 then negative, 2 then positive , zero is zero

            int num = value;
            // System.out.println(Integer.toBinaryString(num));
            // System.out.println(Integer.toBinaryString(num>>31));
            String result = (num >> 31) == 0 ? "Positive" : "Negative";
                if (num == 0) {
                    result = "Zero";
                }
            System.out.println("The number is " + result);

            int res= 1+(num>>31)-(-num>>31);
            System.out.println(res);

    }
}
