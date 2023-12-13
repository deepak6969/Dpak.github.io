
#include <stdio.h>

int linearSearch(int arr[], int length, int element){
    int i;
    for (i=0; i<length; i++){
        if (arr[i] == element){
            return i;
        }
        else {
            continue;
        }
    }
}
int main(){
    int length;
    int i;
    int element;

   printf("Enter Length of Array: ");
   scanf("%d", &length);
    int arr[length];

   printf("Enter Elements of Array: \n");
    for (i=0; i<length; i++){
        scanf("%d", &arr[i]);
    }

    printf("Enter Element: ");
    scanf("%d", &element);

    printf("Index of %d in Array is: %d", element+1, linearSearch(arr, length, element));
    return 0;
}
