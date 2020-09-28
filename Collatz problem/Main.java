#include<iostream>
using namespace std;
int main()
{
  int n,s,i=0;
  cin>>n;
  s=n;
  cout<<s<<endl;
  while(n!=1)
  {
    if(n%2==0)
      n=n/2;
    else
      n=(3*n)+1;
    ++i;
    cout<<n<<endl;
  }
  cout<<i;
  //Type your code here.
}