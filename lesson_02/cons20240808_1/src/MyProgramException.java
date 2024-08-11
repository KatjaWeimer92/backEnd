public class MyProgramException extends RuntimeException{
    String msg;
    int value1;
    int value2;

    public MyProgramException(String msg, int value1, int value2) {
        this.msg = msg;
        this.value1 = value1;
        this.value2 = value2;
    }
}
