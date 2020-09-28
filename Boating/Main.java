#include<iostream>
using namespace std;
int main()
{
  int tw,na,nc,nw;
  cin>>tw>>na>>nc;
  na=na*75;
  nc=nc*30;
  nw=na+nc;
  if(nw<tw)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
    
  
}