//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
   int[] arr = new int[5];
   arr[1] = 10;
   arr[0] = 20;
   arr[2] = 100;
   arr[3] = 40;
   arr[4] = 50;
   for(int i:arr){
       IO.println(i);
   }
    int a = arr.length ;
    IO.println(a);
    Arrays.sort(arr);
    IO.println(Arrays.toString(arr));

//    merge 2 array
    int[] arr1={1,3,4,6};
    int[] arr2={2,5,7};
    int[] res = new int[arr1.length+arr2.length];
    int i=0;
    int j = 0;
    int idx = 0;
    while(i<arr1.length  && j< arr2.length){
        if(arr1[i]<arr2[j]){
            res[idx] = arr1[i];
            i++;
            idx++;
        }
        else {
            res[idx] = arr2[j];
            j++;
            idx++;
        }
    }
    while(j< arr2.length){
        res[idx]= arr2[j];
        j++;
        idx++;
    }
    while(i<arr1.length){
        res[idx]=arr1[i];
        idx++;
        i++;
    }
    IO.println(Arrays.toString(res));




}
