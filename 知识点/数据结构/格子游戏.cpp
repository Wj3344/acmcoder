#include <iostream>

using namespace std;

void function(int array[], int start, int end, int operation)
{
    int sum = 0;
    int max = array[start];
    switch (operation)
    {
    case 1:
        // 修改一个格子的权值
        array[start] = end;
        break;
    case 2:
        // 求连续一段格子权值和

        for (int i = start; i <= end; ++i)
        {
            sum += array[i];
        }
        cout << sum << endl;
        break;
    case 3:
        // 求连续一段格子的最大值

        for (int i = start; i <= end; ++i)
        {
            max = array[i] > max ? array[i] : max;
        }
        cout << max << endl;
        break;
    default:
        break;
    }
}

int main()
{
    int n, m;
    cin >> n >> m;
    int array[n + 1];
    int number;
    int sum = 0;
    int max = 0;
    for (int i = 1; i <= n; ++i)
    {
        cin >> number;
        array[i] = number;
    }
    int operation, start, end;
    for (int j = 0; j < m; ++j)
    {
        cin >> operation >> start >> end;
        function(array, start, end, operation);
    }
    return 0;
}