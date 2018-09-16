#include <iostream>

using namespace std;

int main()
{
    // n个班级，每辆车最多可以乘坐m个人
    int n, m;
    cin >> n >> m;
    // 存储每个班级的人数
    int array[n];
    for (int i = 0; i < n; ++i)
    {
        cin >> array[i];
    }
    // 总共需要的车的数量
    int sum = 0;
    // 车还能坐的人数
    int num = 0;
    // 遍历各个班级安排座位
    for (int i = 0; i < n; ++i)
    {
        num = m;
        num = num - array[i];
        sum++;
        while(i < (n - 1) && num >= array[i + 1])
        {
            i++;
            num = num - array[i];
        }
    }
    cout << sum << endl;
    return 0;
}