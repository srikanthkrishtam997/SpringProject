package com.java.core;

import java.util.ArrayList;
import java.util.List;

public class DuplicateFInd {
	 // Driver Code 
    public static void main(String[] args) 
    { 
        boolean isP=false;
  List<Integer> l=new ArrayList<>();
        int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 }; 
        int n = arr.length; 
  for(int i=0;i<arr.length;i++){
  for(int j=i+1;j<arr.length;j++){
      if(arr[i]==arr[j]){
          if(l.contains(arr[i])){
              break;
          }else{
              l.add(arr[i]);
              isP=true;
          }
      }
  }
  }
  System.out.println(l);
       
    } 
}
