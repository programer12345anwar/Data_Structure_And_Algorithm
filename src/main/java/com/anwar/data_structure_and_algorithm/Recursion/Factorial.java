package com.anwar.data_structure_and_algorithm.Recursion;

import java.util.Scanner;

//static class hello{
//    public void say(){
//        System.out.println("Hi");
//    }
//}


//Only public and default are allowed as access modifiers for top-level classes. Other modifiers like private, protected, and static are not allowed. However, non-access modifiers like final, abstract, and sealed are allowed.


public class Factorial {
    public int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Factorial f=new Factorial();
        System.out.println(f.fact(n));
        sc.close();
    }
}

//NB:A non-static method can be called from a static method by creating an object of the class. Direct calling is not allowed because non-static methods belong to instances.
