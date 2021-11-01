#include <bits/stdc++.h>
using namespace std;

// contest: Codeforces Beta Round #34 (Div. 2), problem: (A) Reconnaissance 2, Accepted

int main() {
	int n;
	cin >> n;
	int a[n];
	for (int i = 0; i < n; ++i)
	{
		cin >> a[i];
	}
	int l,m,diff = 1001;
	for (int i = 0; i+1 < n; ++i)
	{
		if (abs(a[i]-a[i+1]) < diff)
		{
			diff = abs(a[i]-a[i+1]);
			l = i+1;
			m = i+2;
		}
	}
	if (abs(a[n-1]-a[0]) < diff)
		{
			diff = abs(a[n-1]-a[0]);
			l = 1;
			m = n;
		}
	cout << l << " " << m;
	return 0;
}