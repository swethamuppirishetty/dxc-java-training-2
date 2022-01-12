import java.util.ArrayList;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int list[]=new int[n];
        for(int i=0;i<n;i++){
            list[i]=sc.nextInt();
        }
        
        
        System.out.println(isUnique(list));

    }
     

public static boolean isUnique(int[] list){
    for(int i=0;i<=list.length;i++){
        for(int j=i+1;j<=list.length;j++){
            if(list[i]==list[j]){
                return false;
            }
        }
        

    }
    return true;

         
}
}


