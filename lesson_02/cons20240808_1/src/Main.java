public class Main {
    public static void main(String[] args)  throws Exception{
        int a=10;
        int b = 1;
        try {
            int res = div(a,b);
            System.out.println(res);
        } catch (Exception e){
            System.out.println("Error!");
        }

    }

    public static int div(int a, int b){
        int rez;
        try {
            rez = a / b;
        } catch (ArithmeticException e){
            throw new MyProgramException("деление", a, b);
        }

        return rez;
    }


    public static void m1 () throws Exception{
        // exception
        throw new Exception();
    }
}
