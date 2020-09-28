#include<iostream>
using namespace std;
int main()
{
  int units,cost;
  cin>>units;

  if(units<=200)
    cost=0.50*units;
  else if(units<=400)
    cost=100+(units*0.65);
  else if(units<=600)
    cost=200+(units*0.80);
  else
    cost=425+(units*1.25);
   cout<<"Rs."<<cost;
    
  
  //Type your code here.
}