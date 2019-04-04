package com.bible.amplified.test.bible;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.bible.amplified.test.bible.MainActivity;
import com.bible.amplified.test.bible.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by USER on 16/03/2019.
 */

public class FCMReceiver  extends FirebaseMessagingService {
    private static final String TAG = "Ch9";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());
        }
        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) { Log.d(TAG, "Message Notification Body: " +
                remoteMessage.getNotification().getBody());
        }
        String message = remoteMessage.getNotification().getBody();
        sendNotification(message);



    }

    private void sendNotification(String message) {

        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
       PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,PendingIntent.FLAG_ONE_SHOT);
        //intent.putExtra("menuFragment", "favoritesMenuItem");
        intent.putExtra("From", "notifyFrag");


        Uri defaultSoundUri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION); NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_bible_img) .setContentTitle("Daily Bible Verse") .setContentText(message) .setAutoCancel(true) .setSound(defaultSoundUri) .setContentIntent(pendingIntent);
        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0 /* ID of notification */, notificationBuilder.build());
    }
}
