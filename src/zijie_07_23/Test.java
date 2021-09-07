package zijie_07_23;

import java.util.Scanner;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/23 12:00 下午
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int []a = new int[m];
        for(int i = 0; i<m;i++){
            a[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int []b = new int[n];
        for(int i = 0; i<n;i++){
            b[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(getMaxKValueV2(a,b, k));
    }

    int getMaxKValue(int[] a, int []b, int k){
        int m = a.length-1;
        int n = b.length-1;
        while(k>0){
            if(k==0){
                break;
            }
            if(a[m]<b[n]){
                m--;
            }else if(a[m]>b[n]){
                n--;
            }
            k--;
        }
        return a[m]<b[n]?b[n]:a[m];
    }

    public static int getMaxKValueV2(int[] a, int []b, int k){
        if(a[a.length-1]<b[0]){
            if(k<=b.length){
                return b[b.length-k];
            }else{
                return a[a.length-(k-b.length)];
            }
        }

        if(b[b.length-1]<a[0]){
            if(k<=b.length){
                return b[b.length-k];
            }else{
                return a[a.length-(k-b.length)];
            }
        }

        int l = 0;
        int r = a.length-1;
        while(l<r){
            int m = l+(r-l)/2;
            System.out.println(m);
            if(a[m]<b[k-(a.length-m)] && a[m]>b[k-(a.length-m)+1]){
//                System.out.println();
                System.out.println(a[m]);
                return a[m];
            }else if(a[m]<b[0]){
                l = m;
            }else{
                r = m;
            }
        }
        return -1;
    }
}
