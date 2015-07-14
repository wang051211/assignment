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
 printf("请输入一个整数n：");
 scanf("%d",&n);
 printf("斐波拉契数列为：");
 for(i=0;i<n+1;i++)
   printf("%d\t",fib(i));
   printf("\n");
 return 0;
}
