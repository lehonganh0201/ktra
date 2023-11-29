package Ktra;

import java.util.Scanner;

public class Bai1 {
    public static boolean check(String str){
        if(str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)=='['||str.charAt(str.length()-1)=='{'){
            return false;
        }
        int cnt1=0,cnt2=0,cnt3=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)==')'){
                if(str.charAt(i)=='('){
                    cnt1++;
                }
                else {
                    if(cnt1==0){
                        return false;
                    }
                    cnt1--;
                }
            }
            else if(str.charAt(i)=='['||str.charAt(i)==']'){
                if(str.charAt(i)=='['){
                    cnt2++;
                }
                else {
                    if(cnt2==0){
                        return false;
                    }
                    cnt2--;
                }
            }
            else if (str.charAt(i)=='{'||str.charAt(i)=='}'){
                if(str.charAt(i)=='{'){
                    cnt3++;
                }
                else {
                    if(cnt3==0){
                        return false;
                    }
                    cnt3--;
                }
            }
            if(cnt1>1||cnt1<0||cnt2>1||cnt2<0||cnt3>1||cnt3<0){
                return false;
            }
        }
        if(cnt1==0 && cnt2 ==0 && cnt3==0){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(check(str)){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
