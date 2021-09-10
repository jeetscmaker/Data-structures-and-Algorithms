
#include <bits/stdc++.h>
using namespace std;

class String {
private:
    string str;
public:
    String () {}
    String(string s){
        str = s;
    }
    
    string get(){
        return str;
    }

    bool ends_with(string r) {
        int n = str.length();
        int m = r.length();
        if(m > n) 
            return false;
        for (int i = n-1, j = m-1; i>=0 && j>=0; --i, --j)
            if (str[i] != r[j])
                return false;
        
        return true;
    }
}; 

int main() {
    String s("textbook");
    string r = "book";
    string t = "pook";
    cout << s.get() << endl;
    cout << s.get() << " ends with " << r << ": " << (s.ends_with(r) ? "true" : "false") << endl;
    cout << s.get() << " ends with " << t << ": " << (s.ends_with(t) ? "true" : "false") << endl;
    return 0;
}