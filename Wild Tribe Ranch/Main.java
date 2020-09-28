#include <iostream>
using namespace std;

int main() 
{
  int max,wt;
  cin>>max>>wt;
  if(wt>max)
    cout<<"Sorry, you can't enter";
  else if(wt<max)
    cout<<"Yes, you can enter.";
  else
    cout<<"Yes, you can enter. Kindly use a rope.";
    
}