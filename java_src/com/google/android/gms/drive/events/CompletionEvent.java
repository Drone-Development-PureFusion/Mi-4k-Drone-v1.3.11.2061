package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4692o;
import com.google.android.gms.drive.C5021n;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.AbstractC4973q;
import com.google.android.gms.drive.internal.C4938by;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.ajw;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class CompletionEvent extends AbstractSafeParcelable implements ResourceEvent {
    public static final Parcelable.Creator<CompletionEvent> CREATOR = new C4819g();

    /* renamed from: a */
    public static final int f17584a = 0;

    /* renamed from: b */
    public static final int f17585b = 1;

    /* renamed from: c */
    public static final int f17586c = 2;

    /* renamed from: d */
    public static final int f17587d = 3;

    /* renamed from: e */
    final int f17588e;

    /* renamed from: f */
    final DriveId f17589f;

    /* renamed from: g */
    final String f17590g;

    /* renamed from: h */
    final ParcelFileDescriptor f17591h;

    /* renamed from: i */
    final ParcelFileDescriptor f17592i;

    /* renamed from: j */
    final MetadataBundle f17593j;

    /* renamed from: k */
    final List<String> f17594k;

    /* renamed from: l */
    final int f17595l;

    /* renamed from: m */
    final IBinder f17596m;

    /* renamed from: n */
    private boolean f17597n = false;

    /* renamed from: o */
    private boolean f17598o = false;

    /* renamed from: p */
    private boolean f17599p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompletionEvent(int i, DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, List<String> list, int i2, IBinder iBinder) {
        this.f17588e = i;
        this.f17589f = driveId;
        this.f17590g = str;
        this.f17591h = parcelFileDescriptor;
        this.f17592i = parcelFileDescriptor2;
        this.f17593j = metadataBundle;
        this.f17594k = list;
        this.f17595l = i2;
        this.f17596m = iBinder;
    }

    /* renamed from: a */
    private void m22693a(boolean z) {
        m22684k();
        this.f17599p = true;
        C4692o.m23125a(this.f17591h);
        C4692o.m23125a(this.f17592i);
        if (this.f17593j != null && this.f17593j.m22151b(ajw.f22061F)) {
            ((BitmapTeleporter) this.f17593j.m22154a(ajw.f22061F)).m23901b();
        }
        if (this.f17596m == null) {
            String valueOf = String.valueOf(z ? "snooze" : "dismiss");
            C4938by.m22377c("CompletionEvent", valueOf.length() != 0 ? "No callback on ".concat(valueOf) : new String("No callback on "));
            return;
        }
        try {
            AbstractC4973q.AbstractBinderC4974a.m22254a(this.f17596m).mo22253a(z);
        } catch (RemoteException e) {
            String str = z ? "snooze" : "dismiss";
            String valueOf2 = String.valueOf(e);
            C4938by.m22377c("CompletionEvent", new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(valueOf2).length()).append("RemoteException on ").append(str).append(": ").append(valueOf2).toString());
        }
    }

    /* renamed from: k */
    private void m22684k() {
        if (this.f17599p) {
            throw new IllegalStateException("Event has already been dismissed or snoozed.");
        }
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    /* renamed from: a */
    public int mo22667a() {
        return 2;
    }

    @Override // com.google.android.gms.drive.events.ResourceEvent
    /* renamed from: b */
    public DriveId mo22669b() {
        m22684k();
        return this.f17589f;
    }

    /* renamed from: c */
    public String m22692c() {
        m22684k();
        return this.f17590g;
    }

    /* renamed from: d */
    public InputStream m22691d() {
        m22684k();
        if (this.f17591h == null) {
            return null;
        }
        if (this.f17597n) {
            throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
        }
        this.f17597n = true;
        return new FileInputStream(this.f17591h.getFileDescriptor());
    }

    /* renamed from: e */
    public InputStream m22690e() {
        m22684k();
        if (this.f17592i == null) {
            return null;
        }
        if (this.f17598o) {
            throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        }
        this.f17598o = true;
        return new FileInputStream(this.f17592i.getFileDescriptor());
    }

    /* renamed from: f */
    public C5021n m22689f() {
        m22684k();
        if (this.f17593j != null) {
            return new C5021n(this.f17593j);
        }
        return null;
    }

    /* renamed from: g */
    public List<String> m22688g() {
        m22684k();
        return new ArrayList(this.f17594k);
    }

    /* renamed from: h */
    public int m22687h() {
        m22684k();
        return this.f17595l;
    }

    /* renamed from: i */
    public void m22686i() {
        m22693a(false);
    }

    /* renamed from: j */
    public void m22685j() {
        m22693a(true);
    }

    public String toString() {
        String sb;
        if (this.f17594k == null) {
            sb = "<null>";
        } else {
            String valueOf = String.valueOf(TextUtils.join("','", this.f17594k));
            sb = new StringBuilder(String.valueOf(valueOf).length() + 2).append("'").append(valueOf).append("'").toString();
        }
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", this.f17589f, Integer.valueOf(this.f17595l), sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4819g.m22652a(this, parcel, i | 1);
    }
}
