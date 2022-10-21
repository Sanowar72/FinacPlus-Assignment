#include<iostream>
#include<string.h>
using namespace std;



void cipher(char ch[],int n){
   int len = strlen(ch);
    int count;

        for (int i = 0; i < len; i++)
        {
           
            count = 0;
            for (int j = 0; j < len; j++)
            {
                if (ch[i] == ch[j])
                    count++;
            }

            if (count > 1 && ch[i] != ch[i -1])
            {
                char res1 = ch[i] + n;
                cout << res1 << count;
            }
           else if(count<2 )
            {
                char res2 = ch[i] + n;
                cout << res2;
            }
        }
}

int main(){
    cipher("AABCCC",3);
    
    return 0;
}