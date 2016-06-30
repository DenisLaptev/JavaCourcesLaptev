package my_package;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

/**
 * Created by lapte on 28.06.2016.
 */
public class MyCalculatorTest {
    @BeforeClass
    public static void messageStart(){
        System.out.println("Start of the TestClass");
    }

    @AfterClass
    public static void messageFinish(){
        System.out.println("Finish of the TestClass");
    }



}