import java.util.*;

public class java_end_of_file{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;;i++){
        if(sc.hasNext()){
            System.out.println(i+" "+sc.nextLine());
            }
            else
            break;
        }
    }
}
