package android.support.p004v7.app;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.p001v4.app.NotificationBuilderWithBuilderAccessor;
/* renamed from: android.support.v7.app.NotificationCompatImpl21 */
/* loaded from: classes.dex */
class NotificationCompatImpl21 {
    NotificationCompatImpl21() {
    }

    public static void addMediaStyle(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, int[] iArr, Object obj) {
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle(notificationBuilderWithBuilderAccessor.getBuilder());
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        if (obj != null) {
            mediaStyle.setMediaSession((MediaSession.Token) obj);
        }
    }
}
