package com.google.android.gms.internal;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.AbstractC4246ad;
import com.google.android.gms.cast.framework.AbstractC4356s;
import com.google.android.gms.cast.framework.AbstractC4359t;
import com.google.android.gms.cast.framework.AbstractC4362u;
import com.google.android.gms.cast.framework.AbstractC4374y;
import com.google.android.gms.cast.framework.AbstractC4377z;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.AbstractC4338f;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.internal.aff;
import com.google.android.gms.internal.akb;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.Map;
/* loaded from: classes.dex */
public class afc {

    /* renamed from: a */
    private static final C4440m f21438a = new C4440m("CastDynamiteModule");

    /* renamed from: a */
    private static IBinder m17809a(Context context, String str) {
        try {
            return (IBinder) context.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static AbstractC4338f m17814a(Service service, AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, CastMediaOptions castMediaOptions) {
        try {
            return m17813a(service.getApplicationContext()).mo17800a(BinderC4173f.m25293a(service), abstractC4170e, abstractC4170e2, castMediaOptions);
        } catch (RemoteException e) {
            f21438a.m24163a(e, "Unable to call %s on %s.", "newMediaNotificationServiceImpl", aff.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: a */
    public static AbstractC4359t m17810a(Context context, CastOptions castOptions, afh afhVar, Map<String, IBinder> map) {
        try {
            return m17813a(context).mo17799a(BinderC4173f.m25293a(context.getApplicationContext()), castOptions, afhVar, map);
        } catch (RemoteException e) {
            f21438a.m24163a(e, "Unable to call %s on %s.", "newCastContextImpl", aff.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: a */
    public static AbstractC4362u m17811a(Context context, CastOptions castOptions, AbstractC4170e abstractC4170e, AbstractC4356s abstractC4356s) {
        try {
            return m17813a(context).mo17797a(castOptions, abstractC4170e, abstractC4356s);
        } catch (RemoteException e) {
            f21438a.m24163a(e, "Unable to call %s on %s.", "newCastSessionImpl", aff.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: a */
    public static AbstractC4374y m17815a(Service service, AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2) {
        try {
            return m17813a(service.getApplicationContext()).mo17801a(BinderC4173f.m25293a(service), abstractC4170e, abstractC4170e2);
        } catch (RemoteException e) {
            f21438a.m24163a(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", aff.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: a */
    public static AbstractC4377z m17808a(Context context, String str, String str2, AbstractC4246ad abstractC4246ad) {
        try {
            return m17813a(context).mo17796a(str, str2, abstractC4246ad);
        } catch (RemoteException e) {
            f21438a.m24163a(e, "Unable to call %s on %s.", "newSessionImpl", aff.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: a */
    private static aff m17813a(Context context) {
        if (!m17816a()) {
            return m17807b(context);
        }
        try {
            return aff.AbstractBinderC6259a.m17802a(akb.m17066a(context, akb.f22109a, "com.google.android.gms.cast.framework.dynamite").m17062a("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"));
        } catch (akb.C6444a e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static afo m17812a(Context context, AsyncTask<Uri, Long, Bitmap> asyncTask, afp afpVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            return m17813a(context.getApplicationContext()).mo17798a(BinderC4173f.m25293a(asyncTask), afpVar, i, i2, z, j, i3, i4, i5);
        } catch (RemoteException e) {
            f21438a.m24163a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", aff.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: a */
    static boolean m17816a() {
        return true;
    }

    /* renamed from: b */
    private static aff m17807b(Context context) {
        return aff.AbstractBinderC6259a.m17802a(m17809a(context, "com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"));
    }
}
