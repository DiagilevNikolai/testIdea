package d.ya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> chanksOnServers = new ArrayList<>();

//        System.out.println("Введите 3 числа (кол-во чанков, серверов, запросы) :");
        int chanks = in.nextInt();
        int servers = in.nextInt();
        int requests = in.nextInt();

//        System.out.println("расположение чанков на серверах :" );
        for (int i = 0; i < chanks; i++) {
            chanksOnServers.add(in.nextInt());
        }
//        System.out.println(requests + " запросов: " );
        for (int i = 0; i < requests; i++) {
            int serverA = in.nextInt();
            int serverB = in.nextInt();
            int chankFrom = in.nextInt();
            int chankTo = in.nextInt();

            int amountOfTries = 0;
            int amountOfYes = 0;
            for (int j = chankFrom-1; j <= chankTo - 1; j++) {
                if(chanksOnServers.get(j)==serverA){
                    amountOfYes = amountOfYes + 1;
                }
                amountOfTries++;
            }

            if(amountOfTries==amountOfYes && serverB<=servers && serverA <=servers){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
