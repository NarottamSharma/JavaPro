public class Variable {
    void main(String[] args) {
        int a;
        String name;
        a =10;
        name = "Narottam";
        IO.println(a);
        IO.println(name);
        System.out.println("Name is "+ name+ " age is "+ a +" years old");
        String day = "Tuesday";
        switch (day) {
            case "Saturday" -> System.out.println("Start of the day ");
            case "Monday" -> System.out.println("Today is Monday");
            default -> System.out.println("Work");
        }

        int[] arr = {1,2,3,4,5,6,6,8};
        int sum  = 0;
        for(int i=0;i< arr.length;i++){
            System.out.println(i);
            sum +=i;
        }
        IO.println(sum);

        int i=1;
        int mul = 1;
        while(i< arr.length){
            mul*=i;
            i++;
        }
        IO.println(mul);

        System.out.println("Hello "+ name);
        System.out.println("Hello "+ name);
        System.out.println("Hello "+ name);
        
    }

}
