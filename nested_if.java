public class nested_if {
    public static void main(String[] args) {
        int num1=20,num2=10,num3=45;
        if(num1>num2) {
            if (num2 > num3) {
                System.out.println("maximum num" + num2);
            } else {
                System.out.println("maximum num" + num3);
            }
        }
        else{
            if(num2>num3){
                System.out.println("maxmum num:"+num2);

            }
            else{
                System.out.println("maximum num:"+num3);
            }
        }
    }
}
