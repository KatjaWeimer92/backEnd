public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int res = div(a,b);
        System.out.println(res);

    }

    public static int div(int a,int b){
        int rez;
        try {
            rez = a/b;
            return rez;
            } catch (ArithmeticException e) {
        } catch (Exception e){
            System.out.println("error!");
        }

      return 0;
    }

    public void m1(){
        throw new RuntimeException();
    }
}
