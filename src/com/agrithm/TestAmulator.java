package com.agrithm;

import java.util.concurrent.atomic.DoubleAccumulator;

/**
 * Created by Newsoul on 2016/6/24.
 */
public class TestAmulator {
    public static void main(String[] args){
        int T = Integer.parseInt(args[0]);
        Accumulator a = new Accumulator();
        for (int t = 0; t<T;t++){
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}
