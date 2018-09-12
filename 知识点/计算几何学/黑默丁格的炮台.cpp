#include <iostream>
#include <cmath>

using namespace std;

bool isShoot(int x0, int y0, int x, int y, int R)
{
    x = abs(x0 - x);
    y = abs(y0 - y);
    if (sqrt(x * x + y * y) <= R)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int R, x1, y1, x2, y2, x3, y3, x0, y0;
    cin >> R >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x0 >> y0;
    int sum = 0;
    if (isShoot(x0, y0, x1, y1, R))
    {
        sum++;
    }
    if (isShoot(x0, y0, x2, y2, R))
    {
        sum++;
    }
    if (isShoot(x0, y0, x3, y3, R))
    {
        sum++;
    }
    cout << sum << "X" << endl;
    return 0;
}