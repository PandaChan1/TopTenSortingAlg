public class sumOfFrac {
    public static void main(String[] args){
        double sum=0;
        for (int i = 1;i < 101;i++){
            if (i % 2 == 0){
                sum-=1.0/i;
            }else{
                sum+=1.0/i;
            }
        }
        System.out.println("1/1-1/2+1/3-1/4+...+1/99-1/100 = "+sum);
    }
}
