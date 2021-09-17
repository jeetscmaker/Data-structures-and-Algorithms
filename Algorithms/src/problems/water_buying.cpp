#include <bits/stdc++.h>
using namespace std;

// contest: Codeforces Round #540 (Div. 3), problem: (A) Water Buying

int main () {
	int t;
	cin >> t;
	while (t-- > 0) {
		int64_t n;
		int a;
		float b;
		cin >> n >> a >> b;
		if(n == 1)
			cout << a;
		else
		{
			float c = b/2;
			if(c > a)
				cout << (n*a);
			else
				cout << ((int64_t)((n/2 )*b) + (n%2==0 ? 0 : a));
			
		}
		cout << "\n";
	}
	return 0;
}