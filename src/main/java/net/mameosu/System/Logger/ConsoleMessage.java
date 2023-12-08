package net.mameosu.System.Logger;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ConsoleMessage {

    private static String GetExecuteTimeFormat() {

        DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        return dtfm.format(LocalTime.now());
    }

    public static void PrintConsoleMessage(String msg, Level level) {

         System.out.println("<" + level.name() + ": " + GetExecuteTimeFormat() + "> " + msg);
    }
}
