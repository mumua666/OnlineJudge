#include <stdio.h>
#include <math.h>
/**
 * 计算[left,right)范围内 f(x) 与 g(x) 的差距和
 */
long get_diff(int left, int right, int r, int index)
{
    int start = left > (left / r) * r ? left : (left / r) * r;
    int end = right < (start / r) * r + r ? right : (start / r) * r + r;
    long sum = 0;
    int diff;
    while (start < end)
    {
        diff = start / r - index;
        diff = diff > 0 ? diff : -diff;
        sum += (end - start) * diff;
        start = end;
        end = right < (start / r) * r + r ? right : (start / r) * r + r;
    }
    return sum;
}
int main(void)
{
    int n, N;
    scanf("%d %d", &n, &N);
    int arr[n + 2];
    arr[0] = 0;
    for (int i = 1; i <= n; i++)
    {
        scanf("%d", &arr[i]);
    }
    arr[n + 1] = N;

    int f, g, diff, r = N / (n + 1);
    long error = 0;

    for (int i = 1; i < n + 2; i++)
    {
        error += get_diff(arr[i - 1], arr[i], r, i - 1);
    }

    printf("%ld\n", error);

    return 0;
}