package org.junit;

import java.util.Arrays;

public class C03_ArrayKiyasla {
     /*
Task : iki array'i esitliğini kiyaslayan method creat ediniz
  */
    public static boolean arrayEsitMi(Object[]a,Object[]b){
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
//    boolean arrayEsitMi(int []arr1, int arr2[]){
//      if(arr1.length==arr2.length){
//        for(int i=0; i<arr1.length; i++){
//            if(arr1[i]!=arr2[i]){
//                return false;
//            }
//        }}else{
//          return false;
//      }
//        return true;
//    }
}
