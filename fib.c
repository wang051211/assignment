#include<stdio.h>
//9999999
 int fib(int n){
 if(n==0||n==1)
	return n;
  
 else 
   return fib(n-1)+fib(n-2);
  
}

int main(){
 int n,i;
 printf("������һ������n��");
 scanf("%d",&n);
 printf("쳲���������Ϊ��");
 for(i=0;i<n+1;i++)
   printf("%d\t",fib(i));
   printf("\n");
 return 0;
}
