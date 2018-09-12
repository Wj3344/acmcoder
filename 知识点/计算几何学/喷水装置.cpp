#include <iostream>
#include <algorithm>
#include <cmath>

using namespace std;

/**
 * sort排序函数参数，升序排列
 * @param i
 * @param j
 * @return
 */
bool sortFunction(double i, double j)
{
    return i > j;
}

int main()
{
    // 喷水装置的数量
    int N;
    cin >> N;
    // 创建数组保存喷水装置的数据
    double array[N];
    for (int i = 0; i < N; ++i)
    {
        cin >> array[i];
    }
    // 对喷水装置数据进行从大到小的排序
    sort(array, array + N, sortFunction);
    double sum = 0;
    for (int j = 0; j < N; ++j)
    {
        sum += 2 * sqrt(array[j] * array[j] - 1);
        if (sum >= 20)
        {
            cout << (j + 1) << endl;
            break;
        }
    }
    return 0;
}