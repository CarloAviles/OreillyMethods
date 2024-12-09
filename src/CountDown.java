public class CountDown {
    public static void main(String[] args) {
        countDownFrom(10);
        countUpTo(5,15);
    }

    public static void countDownFrom(int num){
        if(num>=0){
            System.out.println(num);
            countDownFrom(num - 1);
        }
    }

    public static void countUpTo(int start, int finish){
        if(start<=finish){
            System.out.println(start);
            countUpTo(start + 1, finish);
        }
    }


}
