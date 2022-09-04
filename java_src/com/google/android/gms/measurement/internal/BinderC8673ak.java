package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.support.annotation.BinderThread;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.C4656l;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4702y;
import com.google.android.gms.measurement.internal.AbstractC8740y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* renamed from: com.google.android.gms.measurement.internal.ak */
/* loaded from: classes2.dex */
public class BinderC8673ak extends AbstractC8740y.AbstractBinderC8741a {

    /* renamed from: a */
    private final C8668aj f27790a;

    /* renamed from: b */
    private Boolean f27791b;
    @Nullable

    /* renamed from: c */
    private String f27792c;

    public BinderC8673ak(C8668aj c8668aj) {
        this(c8668aj, null);
    }

    public BinderC8673ak(C8668aj c8668aj, @Nullable String str) {
        C4588d.m23627a(c8668aj);
        this.f27790a = c8668aj;
        this.f27792c = str;
    }

    @BinderThread
    /* renamed from: c */
    private void m10671c(AppMetadata appMetadata) {
        C4588d.m23627a(appMetadata);
        m10670c(appMetadata.f27594b);
        this.f27790a.m10689o().m10500h(appMetadata.f27595c);
    }

    @BinderThread
    /* renamed from: c */
    private void m10670c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f27790a.m10698f().m10834f().m10831a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        try {
            m10672b(str);
        } catch (SecurityException e) {
            this.f27790a.m10698f().m10834f().m10830a("Measurement Service called with invalid calling package", str);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8740y
    @BinderThread
    /* renamed from: a */
    public List<UserAttributeParcel> mo10325a(final AppMetadata appMetadata, boolean z) {
        m10671c(appMetadata);
        try {
            List<C8722l> list = (List) this.f27790a.m10696h().m10761a(new Callable<List<C8722l>>() { // from class: com.google.android.gms.measurement.internal.ak.7
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public List<C8722l> call() {
                    BinderC8673ak.this.f27790a.m10738K();
                    return BinderC8673ak.this.f27790a.m10688p().m10402a(appMetadata.f27594b);
                }
            }).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C8722l c8722l : list) {
                if (z || !C8723m.m10496l(c8722l.f27911b)) {
                    arrayList.add(new UserAttributeParcel(c8722l));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f27790a.m10698f().m10834f().m10830a("Failed to get user attributes", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8740y
    @BinderThread
    /* renamed from: a */
    public void mo10326a(final AppMetadata appMetadata) {
        m10671c(appMetadata);
        this.f27790a.m10696h().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.ak.8
            @Override // java.lang.Runnable
            public void run() {
                BinderC8673ak.this.f27790a.m10738K();
                BinderC8673ak.this.m10673a(appMetadata.f27600h);
                BinderC8673ak.this.f27790a.m10709b(appMetadata);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8740y
    @BinderThread
    /* renamed from: a */
    public void mo10324a(final EventParcel eventParcel, final AppMetadata appMetadata) {
        C4588d.m23627a(eventParcel);
        m10671c(appMetadata);
        this.f27790a.m10696h().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.ak.2
            @Override // java.lang.Runnable
            public void run() {
                BinderC8673ak.this.f27790a.m10738K();
                BinderC8673ak.this.m10673a(appMetadata.f27600h);
                BinderC8673ak.this.f27790a.m10724a(eventParcel, appMetadata);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8740y
    @BinderThread
    /* renamed from: a */
    public void mo10322a(final EventParcel eventParcel, final String str, final String str2) {
        C4588d.m23627a(eventParcel);
        C4588d.m23625a(str);
        m10670c(str);
        this.f27790a.m10696h().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.ak.3
            @Override // java.lang.Runnable
            public void run() {
                BinderC8673ak.this.f27790a.m10738K();
                BinderC8673ak.this.m10673a(str2);
                BinderC8673ak.this.f27790a.m10723a(eventParcel, str);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8740y
    @BinderThread
    /* renamed from: a */
    public void mo10321a(final UserAttributeParcel userAttributeParcel, final AppMetadata appMetadata) {
        C4588d.m23627a(userAttributeParcel);
        m10671c(appMetadata);
        if (userAttributeParcel.m10894a() == null) {
            this.f27790a.m10696h().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.ak.5
                @Override // java.lang.Runnable
                public void run() {
                    BinderC8673ak.this.f27790a.m10738K();
                    BinderC8673ak.this.m10673a(appMetadata.f27600h);
                    BinderC8673ak.this.f27790a.m10706b(userAttributeParcel, appMetadata);
                }
            });
        } else {
            this.f27790a.m10696h().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.ak.6
                @Override // java.lang.Runnable
                public void run() {
                    BinderC8673ak.this.f27790a.m10738K();
                    BinderC8673ak.this.m10673a(appMetadata.f27600h);
                    BinderC8673ak.this.f27790a.m10722a(userAttributeParcel, appMetadata);
                }
            });
        }
    }

    @WorkerThread
    /* renamed from: a */
    void m10673a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(":", 2);
            if (split.length != 2) {
                return;
            }
            try {
                long longValue = Long.valueOf(split[0]).longValue();
                if (longValue > 0) {
                    this.f27790a.m10699e().f27688b.m10783a(split[1], longValue);
                } else {
                    this.f27790a.m10698f().m10832z().m10830a("Combining sample with a non-positive weight", Long.valueOf(longValue));
                }
            } catch (NumberFormatException e) {
                this.f27790a.m10698f().m10832z().m10830a("Combining sample with a non-number weight", split[0]);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8740y
    @BinderThread
    /* renamed from: a */
    public byte[] mo10323a(final EventParcel eventParcel, final String str) {
        C4588d.m23625a(str);
        C4588d.m23627a(eventParcel);
        m10670c(str);
        this.f27790a.m10698f().m10844D().m10830a("Log and bundle. event", eventParcel.f27610b);
        long mo16431c = this.f27790a.m10685s().mo16431c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f27790a.m10696h().m10756b(new Callable<byte[]>() { // from class: com.google.android.gms.measurement.internal.ak.4
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public byte[] call() {
                    BinderC8673ak.this.f27790a.m10738K();
                    return BinderC8673ak.this.f27790a.m10707b(eventParcel, str);
                }
            }).get();
            if (bArr == null) {
                this.f27790a.m10698f().m10834f().m10831a("Log and bundle returned null");
                bArr = new byte[0];
            }
            this.f27790a.m10698f().m10844D().m10828a("Log and bundle processed. event, size, time_ms", eventParcel.f27610b, Integer.valueOf(bArr.length), Long.valueOf((this.f27790a.m10685s().mo16431c() / 1000000) - mo16431c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f27790a.m10698f().m10834f().m10829a("Failed to log and bundle. event, error", eventParcel.f27610b, e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8740y
    @BinderThread
    /* renamed from: b */
    public void mo10320b(final AppMetadata appMetadata) {
        m10671c(appMetadata);
        this.f27790a.m10696h().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.ak.1
            @Override // java.lang.Runnable
            public void run() {
                BinderC8673ak.this.f27790a.m10738K();
                BinderC8673ak.this.m10673a(appMetadata.f27600h);
                BinderC8673ak.this.f27790a.m10726a(appMetadata);
            }
        });
    }

    /* renamed from: b */
    protected void m10672b(String str) {
        if (this.f27792c == null && C4656l.m23349a(this.f27790a.m10686r(), Binder.getCallingUid(), str)) {
            this.f27792c = str;
        }
        if (str.equals(this.f27792c)) {
            return;
        }
        if (this.f27791b == null) {
            this.f27791b = Boolean.valueOf(("com.google.android.gms".equals(this.f27792c) || C4702y.m23090a(this.f27790a.m10686r(), Binder.getCallingUid())) && !this.f27790a.m10745D());
        }
        if (this.f27791b.booleanValue()) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }
}
