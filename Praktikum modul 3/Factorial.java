public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.print("6! = ");
        System.out.println(f.HitungFactorial(6)); 
    }
    public int HitungFactorial(int x){
        if(x==1){
            return 1;
        }else{
            return x * HitungFactorial(x-1);
        }
    }
}
