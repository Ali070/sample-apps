package org.kaaproject.demo.notification.service;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

import org.kaaproject.demo.notification.R;
import org.kaaproject.demo.notification.activity.MainActivity;

/**
 * Created by user083255 on 01.06.16.
 */
public class NotificationService  {
//    @Nullable
//    @Override
//    public IBinder onBind(Intent intent) {
//        return null;
//    }
//
//    public void sendNotification() {
//        NotificationCompat.Builder builder =
//                new NotificationCompat.Builder(this)
//                        .setSmallIcon(R.drawable.ic_launcher)
//                        .setContentTitle("My Notification Title")
//                        .setContentText("Something interesting happened");
//        int NOTIFICATION_ID = 12345;
//
//        Intent notificationIntent = new Intent(this, MainActivity.class);
//
//        PendingIntent contentIntent = PendingIntent.getActivity(
//                this, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//        builder.setContentIntent(contentIntent);
//        NotificationManager notificationManager =
//                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        notificationManager.notify(NOTIFICATION_ID, builder.build());
//    }

}
