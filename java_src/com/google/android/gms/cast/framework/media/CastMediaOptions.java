package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.AbstractC4335e;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.Locale;
/* loaded from: classes.dex */
public class CastMediaOptions extends AbstractSafeParcelable {

    /* renamed from: b */
    private final int f16247b;

    /* renamed from: c */
    private final String f16248c;

    /* renamed from: d */
    private final String f16249d;

    /* renamed from: e */
    private final AbstractC4335e f16250e;

    /* renamed from: f */
    private final NotificationOptions f16251f;

    /* renamed from: a */
    private static final C4440m f16246a = new C4440m("CastMediaOptions");
    public static final Parcelable.Creator<CastMediaOptions> CREATOR = new C4334d();

    /* renamed from: com.google.android.gms.cast.framework.media.CastMediaOptions$a */
    /* loaded from: classes2.dex */
    public static final class C4287a {

        /* renamed from: b */
        private String f16253b;

        /* renamed from: c */
        private C4291a f16254c;

        /* renamed from: a */
        private String f16252a = MediaIntentReceiver.class.getName();

        /* renamed from: d */
        private NotificationOptions f16255d = new NotificationOptions.C4288a().m24648a();

        /* renamed from: a */
        public C4287a m24696a(NotificationOptions notificationOptions) {
            this.f16255d = notificationOptions;
            return this;
        }

        /* renamed from: a */
        public C4287a m24695a(C4291a c4291a) {
            this.f16254c = c4291a;
            return this;
        }

        /* renamed from: a */
        public C4287a m24694a(String str) {
            this.f16252a = str;
            return this;
        }

        /* renamed from: a */
        public CastMediaOptions m24697a() {
            return new CastMediaOptions(1, this.f16252a, this.f16253b, this.f16254c == null ? null : this.f16254c.m24635a().asBinder(), this.f16255d);
        }

        /* renamed from: b */
        public C4287a m24693b(String str) {
            this.f16253b = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CastMediaOptions(int i, String str, String str2, IBinder iBinder, NotificationOptions notificationOptions) {
        this.f16247b = i;
        this.f16248c = str;
        this.f16249d = str2;
        this.f16250e = AbstractC4335e.AbstractBinderC4336a.m24490a(iBinder);
        this.f16251f = notificationOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m24703a() {
        return this.f16247b;
    }

    /* renamed from: b */
    public String m24702b() {
        return this.f16248c;
    }

    /* renamed from: c */
    public NotificationOptions m24701c() {
        return this.f16251f;
    }

    /* renamed from: d */
    public String m24700d() {
        return this.f16249d;
    }

    /* renamed from: e */
    public C4291a m24699e() {
        if (this.f16250e != null) {
            try {
                return (C4291a) BinderC4173f.m25294a(this.f16250e.mo24487b());
            } catch (RemoteException e) {
                f16246a.m24163a(e, "Unable to call %s on %s.", "getWrappedClientObject", AbstractC4335e.class.getSimpleName());
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastMediaOptions)) {
            return false;
        }
        CastMediaOptions castMediaOptions = (CastMediaOptions) obj;
        return C4430f.m24206a(this.f16248c, castMediaOptions.m24702b()) && C4430f.m24206a(this.f16249d, castMediaOptions.f16249d) && C4430f.m24206a(this.f16251f, castMediaOptions.f16251f);
    }

    /* renamed from: f */
    public IBinder m24698f() {
        if (this.f16250e == null) {
            return null;
        }
        return this.f16250e.asBinder();
    }

    public int hashCode() {
        return C4585c.m23633a(this.f16248c, this.f16249d, this.f16251f);
    }

    public String toString() {
        return String.format(Locale.ROOT, "CastMediaOptions(mediaIntentReceiverClassName=%s, expandedControllerActivityClassName=%s, notificationOptions=%s)", this.f16248c, this.f16249d, this.f16251f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4334d.m24491a(this, parcel, i);
    }
}
