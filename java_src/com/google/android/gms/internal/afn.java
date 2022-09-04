package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.internal.afp;
/* loaded from: classes2.dex */
public abstract class afn extends AsyncTask<Uri, Long, Bitmap> {

    /* renamed from: a */
    private static final C4440m f21471a = new C4440m("FetchBitmapTask");

    /* renamed from: b */
    private final afo f21472b;

    /* renamed from: com.google.android.gms.internal.afn$a */
    /* loaded from: classes2.dex */
    private class BinderC6272a extends afp.AbstractBinderC6275a {
        private BinderC6272a() {
        }

        @Override // com.google.android.gms.internal.afp
        /* renamed from: a */
        public int mo17755a() {
            return 9683208;
        }

        @Override // com.google.android.gms.internal.afp
        /* renamed from: a */
        public void mo17754a(long j, long j2) {
            afn.this.publishProgress(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    public afn(Context context) {
        this(context, 0, 0, false, 2097152L, 5, 333, 10000);
    }

    public afn(Context context, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        this.f21472b = afc.m17812a(context.getApplicationContext(), this, new BinderC6272a(), i, i2, z, j, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Bitmap doInBackground(Uri... uriArr) {
        if (uriArr.length != 1 || uriArr[0] == null) {
            return null;
        }
        try {
            return this.f21472b.mo17758a(uriArr[0]);
        } catch (RemoteException e) {
            f21471a.m24163a(e, "Unable to call %s on %s.", "doFetch", afo.class.getSimpleName());
            return null;
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    public AsyncTask<Uri, Long, Bitmap> m17762a(Uri uri) {
        return Build.VERSION.SDK_INT >= 11 ? executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri) : execute(uri);
    }
}
