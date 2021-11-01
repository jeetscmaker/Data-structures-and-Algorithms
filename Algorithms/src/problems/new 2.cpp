#include <bits/stdc++.h>
using namespace std;

// contest: Codeforces Round #673 (Div. 2), problem: (A) Copy-paste

int main () {
	int t;
	cin >> t;
	while (t-- > 0) {
		int n, k;
		cin >> n >> k;
		int a[n];
		for(int i=0; i<n; i++){
			cin >> a[i];
		}
		sort(a, a+n);
		bool time_to_break_the_while_loop = false;
		int count = 0;
		while(true) {
			int p = n-1;
			for(int i=1; i<=p; i++){
				if(a[0]+a[i] > k) {
					p = i - 1;
					if(p == 0) {
						time_to_break_the_while_loop = true;
					    break;
					}
				}
				else {
					a[i] += a[0];
					count++;
				}
			}
			if(time_to_break_the_while_loop) break;
		}
		cout << count << endl;
	}
	return 0;
}