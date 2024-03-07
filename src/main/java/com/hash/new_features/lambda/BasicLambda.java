package com.hash.new_features.lambda;

import java.util.function.Function;

public class BasicLambda {
    public static void main(String[] args) {
        AddFunction addFunction = (a, b) ->a+b;
        SubtractFunction subtractFunction = (a,b) -> a-b;
        System.out.println(addFunction.add(4,6));
        useLamdaAsArg(subtractFunction);
    }

    //we can pass lambda function as a argument
    public static void useLamdaAsArg(SubtractFunction subtractFunction){
        System.out.println(subtractFunction.subtract(6,6));
    }

    interface AddFunction{
        public int add(int a, int b);
    }

    interface SubtractFunction{
        public int subtract(int a, int b);
    }
}

