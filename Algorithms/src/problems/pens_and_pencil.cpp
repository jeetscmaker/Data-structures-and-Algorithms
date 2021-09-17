#include <bits/stdc++.h>
using namespace std;

// contest: Codeforces Round #592 (Div. 2), problem: (A) Pens and Pencils

int main () {
	int t;
	cin >> t;
	while (t-- > 0) {
		int a, b, c, d, k;
		cin >> a >> b >> c >> d >> k;
		int p = a/c + (a%c == 0 ? 0 : 1);
		int q = b/d + (b%d == 0 ? 0 : 1);
		if((p + q) > k)
			cout << -1;
		else
			cout << p <<  " " << q;
		cout << "\n";
	}
	return 0;
}