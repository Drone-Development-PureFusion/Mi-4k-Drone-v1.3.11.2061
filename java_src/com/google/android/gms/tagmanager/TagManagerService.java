package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepName;
@KeepName
/* loaded from: classes.dex */
public class TagManagerService extends Service {
    @WorkerThread
    @KeepName
    public static void initialize(Context context) {
        C9217l.m8904b(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        initialize(this);
        return C9217l.m8908a(this);
    }
}
