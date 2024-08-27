// ví dụ về truyền tham số trong c và java
#include <stdio.h>

// void increment(int x) 
// {
//     x++; // tăng biến x lên 1 giá trị
// }

void increment(int *x) 
{
    (*x)++;
}

int main()
{
    int num = 9;
    printf("Befor increment: %d", num);

    increment(&num);
    num = 11;
    printf("\nAfter increment: %d", num);

    return 0;
}

// trong lập trình c/c++ truyền theo giá trị vào hàm increment() sẽ tạo thêm biến mới là x và chỉ copy lại giá trị của biến num (=9) sau đó tăng x lên 1 giá trị
// trong lậ trình c/c++ truyền theo con trỏ hoặc tham chiếu vào hàm increment() sẽ tạo thêm biến mới x cùng trỏ tới giá trị của biến num (=9) (tức giá trị của 10 có hai biến cùng trỏ tới là num và x) nên x có thể thay đổi được giá trị của số đó