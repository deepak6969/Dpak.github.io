#include <stdio.h>

int binarySearch(int arr[], int length, int element){
    int low = 0;
    int high = length-1;


    while (low<=high){
        int middle = (low+high)/2;
        if (arr[middle] ==  element){
            return middle;
        }
        else if (arr[middle]>element){
            high = middle-1;
        }
        else if (arr[middle]<element){
            low = middle+1;
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

    printf("Index of %d in Array is: %d", element, binarySearch(arr, length, element)+1);
    return 0;
}
