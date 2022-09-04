package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.internal.AbstractC7443ni;
import com.google.android.gms.internal.akb;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.firebase.C9751b;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.nj */
/* loaded from: classes2.dex */
public class C7446nj {

    /* renamed from: a */
    private static final Object f24902a = new Object();

    /* renamed from: b */
    private static volatile C7446nj f24903b;

    /* renamed from: c */
    private AbstractC7443ni f24904c;

    /* renamed from: d */
    private Context f24905d;

    private C7446nj(@NonNull Context context) {
        this.f24905d = context;
        try {
            this.f24904c = AbstractC7443ni.AbstractBinderC7444a.m14465a(akb.m17066a(context, akb.f22109a, "com.google.android.gms.firebasestorage").m17062a("com.google.firebase.storage.network.NetworkRequestFactoryImpl"));
            if (this.f24904c != null) {
                return;
            }
            Log.e("NetworkRqFactoryProxy", "Unable to load Firebase Storage Network layer.");
            throw new RemoteException();
        } catch (akb.C6444a e) {
            Log.e("NetworkRqFactoryProxy", "NetworkRequestFactoryProxy failed with a RemoteException:", e);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public static C7446nj m14445a(@NonNull C9751b c9751b) {
        if (f24903b == null) {
            synchronized (f24902a) {
                if (f24903b == null) {
                    f24903b = new C7446nj(c9751b.m7224a());
                }
            }
        }
        return f24903b;
    }

    @NonNull
    /* renamed from: a */
    public C7447nk m14451a(Uri uri) {
        return new C7447nk(this.f24904c.mo14462a(uri, BinderC4173f.m25293a(this.f24905d)));
    }

    @NonNull
    /* renamed from: a */
    public C7447nk m14450a(Uri uri, long j) {
        return new C7447nk(this.f24904c.mo14461a(uri, BinderC4173f.m25293a(this.f24905d), j));
    }

    @NonNull
    /* renamed from: a */
    public C7447nk m14449a(Uri uri, String str) {
        return new C7447nk(this.f24904c.mo14454b(uri, BinderC4173f.m25293a(this.f24905d), str));
    }

    @NonNull
    /* renamed from: a */
    public C7447nk m14448a(Uri uri, String str, byte[] bArr, long j, int i, boolean z) {
        return new C7447nk(this.f24904c.mo14457a(uri, BinderC4173f.m25293a(this.f24905d), str, BinderC4173f.m25293a(bArr), j, i, z));
    }

    @NonNull
    /* renamed from: a */
    public C7447nk m14447a(Uri uri, JSONObject jSONObject) {
        return new C7447nk(this.f24904c.mo14460a(uri, BinderC4173f.m25293a(this.f24905d), BinderC4173f.m25293a(jSONObject)));
    }

    @NonNull
    /* renamed from: a */
    public C7447nk m14446a(Uri uri, JSONObject jSONObject, String str) {
        return new C7447nk(this.f24904c.mo14459a(uri, BinderC4173f.m25293a(this.f24905d), BinderC4173f.m25293a(jSONObject), str));
    }

    @Nullable
    /* renamed from: a */
    public String m14452a() {
        try {
            return this.f24904c.mo14464a();
        } catch (RemoteException e) {
            Log.e("NetworkRqFactoryProxy", "getBackendAuthority failed with a RemoteException:", e);
            return null;
        }
    }

    @NonNull
    /* renamed from: b */
    public C7447nk m14444b(Uri uri) {
        return new C7447nk(this.f24904c.mo14455b(uri, BinderC4173f.m25293a(this.f24905d)));
    }

    @NonNull
    /* renamed from: b */
    public C7447nk m14443b(Uri uri, String str) {
        return new C7447nk(this.f24904c.mo14453c(uri, BinderC4173f.m25293a(this.f24905d), str));
    }

    @Nullable
    /* renamed from: c */
    public String m14442c(Uri uri) {
        try {
            return this.f24904c.mo14463a(uri);
        } catch (RemoteException e) {
            Log.e("NetworkRqFactoryProxy", "getDefaultURL failed with a RemoteException:", e);
            return null;
        }
    }
}
