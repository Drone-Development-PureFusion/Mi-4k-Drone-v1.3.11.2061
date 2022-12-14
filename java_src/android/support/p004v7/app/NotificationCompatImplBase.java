package android.support.p004v7.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import android.support.p001v4.app.NotificationBuilderWithBuilderAccessor;
import android.support.p001v4.app.NotificationCompatBase;
import android.support.p004v7.appcompat.C0176R;
import android.widget.RemoteViews;
import java.text.NumberFormat;
import java.util.List;
/* renamed from: android.support.v7.app.NotificationCompatImplBase */
/* loaded from: classes.dex */
class NotificationCompatImplBase {
    static final int MAX_MEDIA_BUTTONS = 5;
    static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;

    NotificationCompatImplBase() {
    }

    private static RemoteViews applyStandardTemplate(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, boolean z2) {
        boolean z3;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i2);
        boolean z4 = false;
        boolean z5 = false;
        if (bitmap == null || Build.VERSION.SDK_INT < 16) {
            remoteViews.setViewVisibility(C0176R.C0178id.icon, 8);
        } else {
            remoteViews.setViewVisibility(C0176R.C0178id.icon, 0);
            remoteViews.setImageViewBitmap(C0176R.C0178id.icon, bitmap);
        }
        if (charSequence != null) {
            remoteViews.setTextViewText(C0176R.C0178id.title, charSequence);
        }
        if (charSequence2 != null) {
            remoteViews.setTextViewText(C0176R.C0178id.text, charSequence2);
            z4 = true;
        }
        if (charSequence3 != null) {
            remoteViews.setTextViewText(C0176R.C0178id.info, charSequence3);
            remoteViews.setViewVisibility(C0176R.C0178id.info, 0);
            z3 = true;
        } else if (i > 0) {
            if (i > context.getResources().getInteger(C0176R.integer.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(C0176R.C0178id.info, context.getResources().getString(C0176R.C0179string.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(C0176R.C0178id.info, NumberFormat.getIntegerInstance().format(i));
            }
            remoteViews.setViewVisibility(C0176R.C0178id.info, 0);
            z3 = true;
        } else {
            remoteViews.setViewVisibility(C0176R.C0178id.info, 8);
            z3 = z4;
        }
        if (charSequence4 != null && Build.VERSION.SDK_INT >= 16) {
            remoteViews.setTextViewText(C0176R.C0178id.text, charSequence4);
            if (charSequence2 != null) {
                remoteViews.setTextViewText(C0176R.C0178id.text2, charSequence2);
                remoteViews.setViewVisibility(C0176R.C0178id.text2, 0);
                z5 = true;
            } else {
                remoteViews.setViewVisibility(C0176R.C0178id.text2, 8);
            }
        }
        if (z5 && Build.VERSION.SDK_INT >= 16) {
            if (z2) {
                remoteViews.setTextViewTextSize(C0176R.C0178id.text, 0, context.getResources().getDimensionPixelSize(C0176R.dimen.notification_subtext_size));
            }
            remoteViews.setViewPadding(C0176R.C0178id.line1, 0, 0, 0, 0);
        }
        if (j != 0) {
            if (z) {
                remoteViews.setViewVisibility(C0176R.C0178id.chronometer, 0);
                remoteViews.setLong(C0176R.C0178id.chronometer, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + j);
                remoteViews.setBoolean(C0176R.C0178id.chronometer, "setStarted", true);
            } else {
                remoteViews.setViewVisibility(C0176R.C0178id.time, 0);
                remoteViews.setLong(C0176R.C0178id.time, "setTime", j);
            }
        }
        remoteViews.setViewVisibility(C0176R.C0178id.line3, z3 ? 0 : 8);
        return remoteViews;
    }

    private static <T extends NotificationCompatBase.Action> RemoteViews generateBigContentView(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, List<T> list, boolean z2, PendingIntent pendingIntent) {
        int min = Math.min(list.size(), 5);
        RemoteViews applyStandardTemplate = applyStandardTemplate(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, getBigLayoutResource(min), false);
        applyStandardTemplate.removeAllViews(C0176R.C0178id.media_actions);
        if (min > 0) {
            for (int i2 = 0; i2 < min; i2++) {
                applyStandardTemplate.addView(C0176R.C0178id.media_actions, generateMediaActionButton(context, list.get(i2)));
            }
        }
        if (z2) {
            applyStandardTemplate.setViewVisibility(C0176R.C0178id.cancel_action, 0);
            applyStandardTemplate.setInt(C0176R.C0178id.cancel_action, "setAlpha", context.getResources().getInteger(C0176R.integer.cancel_button_image_alpha));
            applyStandardTemplate.setOnClickPendingIntent(C0176R.C0178id.cancel_action, pendingIntent);
        } else {
            applyStandardTemplate.setViewVisibility(C0176R.C0178id.cancel_action, 8);
        }
        return applyStandardTemplate;
    }

    private static <T extends NotificationCompatBase.Action> RemoteViews generateContentView(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, List<T> list, int[] iArr, boolean z2, PendingIntent pendingIntent) {
        RemoteViews applyStandardTemplate = applyStandardTemplate(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, C0176R.layout.notification_template_media, true);
        int size = list.size();
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        applyStandardTemplate.removeAllViews(C0176R.C0178id.media_actions);
        if (min > 0) {
            for (int i2 = 0; i2 < min; i2++) {
                if (i2 >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i2), Integer.valueOf(size - 1)));
                }
                applyStandardTemplate.addView(C0176R.C0178id.media_actions, generateMediaActionButton(context, list.get(iArr[i2])));
            }
        }
        if (z2) {
            applyStandardTemplate.setViewVisibility(C0176R.C0178id.end_padder, 8);
            applyStandardTemplate.setViewVisibility(C0176R.C0178id.cancel_action, 0);
            applyStandardTemplate.setOnClickPendingIntent(C0176R.C0178id.cancel_action, pendingIntent);
            applyStandardTemplate.setInt(C0176R.C0178id.cancel_action, "setAlpha", context.getResources().getInteger(C0176R.integer.cancel_button_image_alpha));
        } else {
            applyStandardTemplate.setViewVisibility(C0176R.C0178id.end_padder, 0);
            applyStandardTemplate.setViewVisibility(C0176R.C0178id.cancel_action, 8);
        }
        return applyStandardTemplate;
    }

    private static RemoteViews generateMediaActionButton(Context context, NotificationCompatBase.Action action) {
        boolean z = action.getActionIntent() == null;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C0176R.layout.notification_media_action);
        remoteViews.setImageViewResource(C0176R.C0178id.action0, action.getIcon());
        if (!z) {
            remoteViews.setOnClickPendingIntent(C0176R.C0178id.action0, action.getActionIntent());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(C0176R.C0178id.action0, action.getTitle());
        }
        return remoteViews;
    }

    private static int getBigLayoutResource(int i) {
        return i <= 3 ? C0176R.layout.notification_template_big_media_narrow : C0176R.layout.notification_template_big_media;
    }

    public static <T extends NotificationCompatBase.Action> void overrideBigContentView(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, List<T> list, boolean z2, PendingIntent pendingIntent) {
        notification.bigContentView = generateBigContentView(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, list, z2, pendingIntent);
        if (z2) {
            notification.flags |= 2;
        }
    }

    public static <T extends NotificationCompatBase.Action> void overrideContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, List<T> list, int[] iArr, boolean z2, PendingIntent pendingIntent) {
        notificationBuilderWithBuilderAccessor.getBuilder().setContent(generateContentView(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, list, iArr, z2, pendingIntent));
        if (z2) {
            notificationBuilderWithBuilderAccessor.getBuilder().setOngoing(true);
        }
    }
}
