package com.stacktest;

import com.sun.org.apache.bcel.internal.generic.NEW;
import kevin.agrithm.algs4.Date;
import kevin.agrithm.algs4.Queue;
import kevin.agrithm.algs4.Stack;
import kevin.agrithm.algs4.Transaction;



/**
 * Created by Newsoul on 2016/6/25.
 */
public class StackTest {
    public static void main(String args[]){
        Stack<String> strings = new Stack<>();
        strings.push("atom");
        strings.pop();
        Queue<Transaction> collection = new Queue<Transaction>();
        collection.enqueue(new Transaction("tom",new Date(7,30,2016),200));
        collection.dequeue();

    }
}
