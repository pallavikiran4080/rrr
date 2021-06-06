package com.hackerrank.selenium;


	class GFG {
		public static void main(String[] args) {
			GFG test = new GFG();
	        int output =test.sum(6,8,5);
	        System.out.println(output);

	    }

	   public int sum(int i,int j,int k){
//hai ssh key
	       int sum =0;

	       for ( ;i<=j;i++){
	           sum =sum+i;
	       }
	       for ( ;k<j;k++){
	           sum=sum+k;
	       }
	return  sum;
	   }

	   
	  	}
	 



