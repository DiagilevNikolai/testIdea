package d.ya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> chanksOnServers = new ArrayList<>();

        System.out.println("Введите 3 числа (кол-во чанков, серверов, запросы) :");
        int chanks = in.nextInt();
//        int servers = in.nextInt();
        int requests = in.nextInt();

        System.out.println("расположение чанков на серверах :" );
        for (int i = 0; i < chanks; i++) {
            chanksOnServers.add(in.nextInt());
        }
        System.out.println(requests + " запросов: " );
        for (int i = 0; i < requests; i++) {
            List requestsList = new ArrayList();

            int serverA = in.nextInt();
            int serverB = in.nextInt();
            int chankFrom = in.nextInt();
            int chankTo = in.nextInt();

            for (int j = chankTo; j < chankFrom; j++) {
                System.out.println(chanksOnServers.get(j));
            }

        }
    }
}
