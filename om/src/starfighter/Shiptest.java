package starfighter;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Shiptest
{
    public static void main( String args[] )
    {
        LightBike test = new LightBike1();
        System.out.println("Ship 1 " + test);

        LightBike1 test2 = new LightBike1(50,75);
        System.out.println("Ship 2 " + test2);

        LightBike1 test3 = new LightBike1();
        test3.setX(3);
        test3.setY(5);
        System.out.println("Ship 3 " + test3);
    }
}
