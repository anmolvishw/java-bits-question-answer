// Question Explain in last section @anmolvishw

public class integer_is_even_or_odd{
    public static void main(String[] args) {
        // some values ::::::
        int value = 20;

    if((value & 1) != 0)
        System.out.println(" Is Odd");
    else
        System.out.println("Is Even");

    }

}

/*
 * This is probably one of the simplest and most commonly used bit hacks.
 *  The expression n & 1 returns value 1 or 0 depending upon whether n is odd or even.

        00010100    &           (n = 20)
        00000001                (1)
        ~~~~~~~~
        00000000
        
        
        00010101    &            (n = 21)
        00000001                 (1)
        ~~~~~~~~
        00000001
 */