package com.techelevator;

import java.io.IOException;

public class ExceptionFun {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException ae) {

           // nothing to see here
        }
        catch (Exception e) {
            return;
        }
        finally {

        }



    }
}
