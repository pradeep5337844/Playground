#include <iostream>
using namespace std;

int main() 
{
   int op,n1,n2,ans;
  cout<<"Enter first number : Enter second number : Menu"<<endl;
  cout<<"1.Addition"<<endl;
  cout<<"2.Subtraction"<<endl;
  cout<<"3.Multiplication"<<endl;
  cout<<"4.Division"<<endl;
  cout<<"5.Remainder"<<endl;
  cin>>n1>>n2>>op;
  switch(op)
  {
    case 1:ans=n1+n2;
      cout<<ans;
    break;
    case 2:ans=n1-n2;
      cout<<ans;
    break;
    case 3:ans=n1*n2;
      cout<<ans;
    break;
    case 4:ans=n1/n2;
      cout<<ans;
    break;
    case 5:ans=n1%n2;
      cout<<ans;
    break;
    default:
      cout<<"Invalid operation";
  } 
  
}