#include <iostream>
using namespace std;

void main()
{
int grade[8];
int N=100;
cout<<"������Ӣ���ļ��ɼ�:"<<endl;
for(int i=0;i<N;i++){
    cin>>grade[i];
if(grade[i]>=425&&grade[i]<=710)
	cout<<"ͨ���ļ�����"<<endl;
else if(grade[i]<425&&grade[i]>=0)
	cout<<"δͨ���ļ�����"<<endl;
else 
	cout<<"����������ݲ��Ϸ���"<<endl;
}
}