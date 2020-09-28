#include<iostream>
using namespace std;
int main()
{
  int pf,df,sf,pa,da,sa,ps,ds,ss;
  float tf,ta,ts;
cin>>pf>>df>>sf>>ps>>ds>>ss>>pa>>da>>sa;
  tf=pf-(pf*df/100)+sf;
  ta=pa-(pa*da/100)+sa;
  ts=ps-(ps*ds/100)+ss;
  cout<<"In Flipkart Rs."<<tf<<endl;
  cout<<"In Snapdeal Rs."<<ts<<endl;
  cout<<"In Amazon Rs."<<ta<<endl;
  if(tf<=ta && tf<=ts)
    cout<<"He will prefer Flipkart";
  else if(ts<=ta && ts<=tf)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
    
  //Type your code here.
}