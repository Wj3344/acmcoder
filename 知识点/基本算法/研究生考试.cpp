#include <iostream>

using namespace std;

int main()
{
    int N;
    cin >> N;
    // 政治、英语、数学、专业课成绩
    int politics, english, math, specialized;
    for (int i = 0; i < N; ++i)
    {
        cin >> politics >> english >> math >> specialized;
        if (politics < 60 || english < 60)
        {
            cout << "Fail" << endl;
            continue;
        }
        if (math < 90 || specialized < 90)
        {
            cout << "Fail" << endl;
            continue;
        }
        int sum = politics + english + math + specialized;
        if (sum < 310)
        {
            cout << "Fail" << endl;
            continue;
        }
        if(sum < 350)
        {
            cout << "Zifei" << endl;
            continue;
        }
        if(sum >= 350)
        {
            cout << "Gongfei" << endl;
            continue;
        }
    }
    return 0;
}