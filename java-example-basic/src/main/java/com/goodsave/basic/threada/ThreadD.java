package com.goodsave.basic.threada;

/**
 * ThreadD
 * Created by Joker on 2017/7/19.
 */
public class ThreadD {


    public static void main(String args[]) throws Exception {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("开始");
                for (int i = 1; i <= 10; i++) {
                    Thread.sleep(1000);
                    System.out.println("-------------->" + i);
                }

                /*int i = 1;
                while (i <= 10) {
                    System.out.println("-------------->" + i);
                    i++;
                    Thread.sleep(1000);
                }*/

                System.out.println("结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();


        try {
            int i = 1;
            while (i <= 5) {
                System.out.println("----->" + i);
                i++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("到达5秒");
        thread.interrupt();
        System.out.println("已执行interrupt");
    }


}
