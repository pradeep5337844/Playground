#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  long int multiplyNumbers(int n);



int n;

cin>>n;

cout<<"The factorial of "<<n<<" is "<<multiplyNumbers(n);

return 0;

}

long int multiplyNumbers(int n) {

if (n>=1)

return n*multiplyNumbers(n-1);

else

return 1;

}
