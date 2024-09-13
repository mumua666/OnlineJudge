#include <stdio.h>
// #define SIZE (int)1e5 + 10
int getIndex(int arr[], int value, int size)
{
    int left = 0, right = size - 1;
    int mid = left + (right - left >> 1);
    while (left < right)
    {
        if (arr[mid] < value)
        {
            left = mid;
        }
        else if (arr[mid] > value)
        {
            right = mid - 1;
        }
        else
        {
            right = mid;
        }
        mid = left + (right - left >> 1);
        if (left == mid)
        {
            if (arr[right] <= value)
            {
                left = right;
            }
            break;
        }
    }
    return left;
}
int main(void)
{
    int n, N;
    scanf("%d %d", &n, &N);
    int arr[100010];
    arr[0] = 0;
    for (int i = 1; i <= n; i++)
    {
        scanf("%d", &arr[i]);
    }

    int f, g, diff, r = N / (n + 1);
    long error = 0;
    for (int i = 0; i < N; i++)
    {
        if (i >= arr[n])
            f = n;
        else
            f = getIndex(arr, i, n + 1);
        // printf("%d ", f);
        g = i / r;
        diff = f - g;
        diff = diff > 0 ? diff : -diff;
        error += diff;
    }
    // putchar(10);
    printf("%ld\n", error);

    return 0;
}