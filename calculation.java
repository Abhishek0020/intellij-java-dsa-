public class calculation {
    void fact(int n){
        int fact=1;
        for (int i=1;i<=5;i++){
            fact=fact*i;
        }
        System.out.println(" "+fact);
    }
    public static void main(String[] args) {
        new calculation().fact(5);
    }

}
