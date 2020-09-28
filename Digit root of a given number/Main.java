#include<bits/stdc++.h>

using namespace std;

int sum_digit(int a)

{

 int sum = 0;

 while( a > 0 )

 {

   int b = a%10 ;

    sum = sum + b;  

     a = a/10 ;

 }

 if(0<sum && sum<=9)

 {

     return sum;

 }

else

sum_digit(sum);

}

int main()

{

 int m ;

 cin>>m;

 cout<<sum_digit(m);

 return 0 ;

}