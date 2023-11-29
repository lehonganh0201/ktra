package Ktra;

import java.util.Scanner;

public class Bai1 {
    public static boolean check(String str){
        if(str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)=='['||str.charAt(str.length()-1)=='{'){
            return false;
        }
        int cnt1=0,cnt2=0,cnt3=0;
        for(char c:str.toCharArray()){
            if(c=='('||c==')'){
                if(c=='('){
                    cnt1++;
                }
                else cnt1--;
            }
            else if(c=='['||c==']'){
                if(c=='['){
                    cnt2++;
                }
                else cnt2--;
            }
            else if (c=='{'||c=='}'){
                if(c=='{'){
                    cnt3++;
                }
                else cnt3--;
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
