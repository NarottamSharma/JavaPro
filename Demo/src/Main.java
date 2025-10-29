//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
   int[] arr = new int[5];
   arr[1] = 10;
   arr[0] = 20;
   arr[2] = 30;
   arr[3] = 40;
   arr[4] = 50;
   for(int i:arr){
       IO.println(i);
   }

}
