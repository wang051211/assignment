#include <iostream>
using namespace std;

void main()
{
int grade[8];
int N=100;
cout<<"请输入英语四级成绩:"<<endl;
for(int i=0;i<N;i++){
    cin>>grade[i];
if(grade[i]>=425&&grade[i]<=710)
	cout<<"通过四级考试"<<endl;
else if(grade[i]<425&&grade[i]>=0)
	cout<<"未通过四级考试"<<endl;
else 
	cout<<"您输入的数据不合法！"<<endl;
}
}