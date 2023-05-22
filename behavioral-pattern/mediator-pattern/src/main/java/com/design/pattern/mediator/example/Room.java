package com.design.pattern.mediator.example;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * CharRoom
 *
 * @author Wenzhou
 * @since 2023/5/22 15:35
 */
public class Room {
    public static void showMessage(User user, String message) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(new Date()) + " [" + user.getName() + "]: " + message);
    }
}
