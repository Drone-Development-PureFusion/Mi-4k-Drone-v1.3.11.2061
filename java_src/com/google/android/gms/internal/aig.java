package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.internal.ahl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public interface aig {

    /* renamed from: com.google.android.gms.internal.aig$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6382a {
        /* renamed from: a */
        void mo17230a(int i, boolean z);

        /* renamed from: a */
        void mo17229a(Bundle bundle);

        /* renamed from: a */
        void mo17228a(ConnectionResult connectionResult);
    }

    /* renamed from: a */
    ConnectionResult mo17242a(long j, TimeUnit timeUnit);

    @Nullable
    /* renamed from: a */
    ConnectionResult mo17241a(@NonNull C4467a<?> c4467a);

    /* renamed from: a */
    <A extends C4467a.AbstractC4474c, R extends AbstractC4502m, T extends ahl.AbstractC6343a<R, A>> T mo17240a(@NonNull T t);

    /* renamed from: a */
    void mo17243a();

    /* renamed from: a */
    void mo17238a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    boolean mo17239a(ait aitVar);

    /* renamed from: b */
    ConnectionResult mo17237b();

    /* renamed from: b */
    <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T mo17236b(@NonNull T t);

    /* renamed from: c */
    void mo17235c();

    /* renamed from: d */
    boolean mo17234d();

    /* renamed from: e */
    boolean mo17233e();

    /* renamed from: f */
    void mo17232f();

    /* renamed from: g */
    void mo17231g();
}
