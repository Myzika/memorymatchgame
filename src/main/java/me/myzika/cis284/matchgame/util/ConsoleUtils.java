package me.myzika.cis284.matchgame.util;

import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.TimeUnit;

public class ConsoleUtils {
    public static void clearScreen() {
        System.out.println(new String(new char[80]).replace("\0", "\r\n"));
    }

    public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void timer() {
        StopWatch watch = new StopWatch();
        watch.start();

        for (int i = 0; i <= 900; i++) {
            System.out.print("\r");
            System.out.flush();
            long millis = watch.getTime();
            System.out.print(String.format("%d min, %d sec",
                    TimeUnit.MILLISECONDS.toMinutes(millis),
                    TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
            ));
            ConsoleUtils.wait(1000);
        }

        watch.stop();


    }
}