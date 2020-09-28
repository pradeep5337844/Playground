#include<iostream>
using namespace std;
int main()
{
  int x,y,r;
  float i,a,d,t;
  cin>>x>>r>>y;
  i=(x*y*r)/100;
  a=x+i;
  d=0.02*i;
  t=a-d;
  cout<<i<<endl;
  cout<<a<<endl;
  cout<<d<<endl;
  cout<<t<<endl;
    //Type your code here.
}