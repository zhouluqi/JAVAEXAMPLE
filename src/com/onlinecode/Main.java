import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str =scanner.nextLine();
        char[] a = str.toCharArray();
        int[]b=new int[str.length()];
        for(int i =0;i<a.length;i++){
            b[i]=Integer.valueOf(a[i])-48;
        }
        System.out.println(goodluckid(b));
    }
    public static int goodluckid(int[] b){
        int backsum = b[3]+b[4]+b[5];
        int presum = b[0]+b[1]+b[2];
        int count =1;
        if(backsum-presum==0){
            return 0;
        }
        if(backsum-presum>18){
            count=3;
        }else if(backsum-presum>9){
            count = 2;
        }

        if(presum-backsum>18){
            count=3;
        }else if(presum-backsum>9){
            count = 2;
        }else {
            return count;
        }
        return count;
    }
}
