/* 
n is positive integer
if n is even:
	n/2
if n is odd:
	n * 3 + 1

3 -> 10 -> 5 .... -> 1

1<= n <= 10^6

3
*/

#include <iostream>

int main() {
	long n;
	std::cin >> n;
	std::cout << n << " ";
	while (n != 1) {
		if(n % 2 == 0) {
			n = n /2;
		}
		else {
			n = n * 3 + 1;
		}
		std::cout << n << " ";
	}
	return 0;
}