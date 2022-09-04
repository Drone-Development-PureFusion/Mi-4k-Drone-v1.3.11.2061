package com.fimi.soul.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C1995q;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.utils.RunnableC3131o;
import com.google.android.gms.drive.AbstractC4808e;
import java.io.File;
/* loaded from: classes.dex */
public class UpdateApkService extends Service {

    /* renamed from: e */
    private static final int f11435e = 8888;

    /* renamed from: h */
    private static boolean f11436h = false;

    /* renamed from: b */
    private C1995q f11438b;

    /* renamed from: c */
    private NotificationManager f11439c;

    /* renamed from: d */
    private Notification f11440d;

    /* renamed from: f */
    private final int f11441f = 1;

    /* renamed from: g */
    private final int f11442g = 2;

    /* renamed from: a */
    Handler f11437a = new Handler() { // from class: com.fimi.soul.service.UpdateApkService.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                Toast.makeText(UpdateApkService.this, (int) C1704R.C1707string.down_success, 0).show();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(AbstractC4808e.f17570a_);
                intent.setDataAndType(Uri.fromFile(new File(C3129m.m29058i(), C1756a.f4511D)), "application/vnd.android.package-archive");
                UpdateApkService.this.startActivity(intent);
            } else if (message.what == 2) {
                UpdateApkService.this.f11440d.contentView.setProgressBar(C1704R.C1706id.download_bar, 100, Integer.parseInt(message.obj.toString()), false);
                UpdateApkService.this.f11440d.contentView.setTextViewText(C1704R.C1706id.text_download_process, message.obj.toString() + "%");
                UpdateApkService.this.m29454a();
                return;
            } else {
                Toast.makeText(UpdateApkService.this, (int) C1704R.C1707string.down_fail, 0).show();
            }
            UpdateApkService.this.f11439c.cancel(UpdateApkService.f11435e);
            boolean unused = UpdateApkService.f11436h = false;
            UpdateApkService.this.stopSelf();
        }
    };

    /* renamed from: a */
    public void m29454a() {
        this.f11439c.notify(f11435e, this.f11440d);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f11438b = C1995q.m33321a(this);
        this.f11439c = (NotificationManager) getSystemService("notification");
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(), 0);
        this.f11440d = new Notification();
        this.f11440d.icon = C1704R.C1705drawable.ic_launcher;
        this.f11440d.tickerText = getString(C1704R.C1707string.down_ing) + getString(C1704R.C1707string.app_name);
        this.f11440d.contentIntent = activity;
        this.f11440d.contentView = new RemoteViews(getPackageName(), (int) C1704R.layout.up_notification);
        this.f11440d.contentView.setProgressBar(C1704R.C1706id.download_bar, 100, 0, false);
        this.f11440d.contentView.setTextViewText(C1704R.C1706id.text_download_title, getString(C1704R.C1707string.down_ing) + " " + getString(C1704R.C1707string.app_name));
        this.f11440d.contentView.setTextViewText(C1704R.C1706id.text_download_process, "0%");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null && intent.getStringExtra("down_url") != null) {
            m29454a();
            if (!f11436h) {
                new Thread(new RunnableC3131o(intent.getStringExtra("down_url"), this.f11437a)).start();
            } else {
                Toast.makeText(this, (int) C1704R.C1707string.apk_downing, 0).show();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
