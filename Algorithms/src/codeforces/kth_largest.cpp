#include <bits/stdc++.h>
using namespace std;

// contest: Codeforces Global Round 13, problem: (A) K-th Largest Value

int main() {
	int n,q;
	cin >> n >> q;
	int a[n];
	int count1 = 0, count0 = 0;
	for (int i = 0; i < n; ++i)
	{
		cin >> a[i];
		if(a[i] == 1) count1++;
		else count0++;
	}
	while (q--) {
		int t;
		cin >> t;
		if(t == 1) {
			int x;
			cin >> x;
			if(a[x-1] == 0){
				count1++;
				count0--;
			}	
			else {
				count0++;
				count1--;
			}
			// initially i missed below step and so got wrong answer on test 2.
			a[x-1] = 1 - a[x-1];	
		}
		else if(t == 2) {
			int k;
			cin >> k;
			if(k <= count1)
				cout << 1;
			else
				cout << 0;
			cout << endl;
		}
	}
	return 0;
}
