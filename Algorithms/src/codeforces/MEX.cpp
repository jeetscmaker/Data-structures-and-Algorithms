#include <bits/stdc++.h>
using namespace std;
// contest: Codeforces Round #708 (Div. 2), problem: (A) Meximization, Accepted,
int main () {
	short t;
	cin >> t;
	while(t--) {
		short n;
		cin >> n;
		short a[n];
		for (short i = 0; i < n; ++i)
		{
			cin >> a[i];
		}
		sort(a, a+n);
		vector<short> b;
		short i = 0;
		for (; i+1 < n; ++i)
		{
			cout << a[i] << " ";
			while (i+1 < n && a[i] == a[i+1])
			{
				b.push_back(a[i+1]);
				++i;
			}
		}
		if(i<n)
			cout << a[i] << " ";
		for(short num : b) {
			cout << num << " ";
		}
		cout << "\n";
	}
}