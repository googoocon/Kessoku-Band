package com.kmit.www;

public class banbok {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 1; i <= 4; i++) { //i++이 sum+= 1보다 더 늦게 계산됨
            sum += i;
        }
        System.out.println(sum);
    }

}

// i=1 sum=0
// i=2 sum=1
// i=3 sum=3
// i=4 sum=6
// sum=10
