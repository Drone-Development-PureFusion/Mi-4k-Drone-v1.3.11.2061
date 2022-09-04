package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.MainThread;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes2.dex */
public class aij {

    /* renamed from: d */
    protected final aik f21940d;

    /* JADX INFO: Access modifiers changed from: protected */
    public aij(aik aikVar) {
        this.f21940d = aikVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static aik m17219b(Activity activity) {
        return m17217b(new aih(activity));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static aik m17217b(aih aihVar) {
        return aihVar.m17227a() ? zzrn.m12686a(aihVar.m17225c()) : zzrc.m12691a(aihVar.m17226b());
    }

    @MainThread
    /* renamed from: a */
    public void mo14499a() {
    }

    @MainThread
    /* renamed from: a */
    public void mo17223a(int i, int i2, Intent intent) {
    }

    @MainThread
    /* renamed from: a */
    public void mo17222a(Bundle bundle) {
    }

    @MainThread
    /* renamed from: a */
    public void mo17221a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @MainThread
    /* renamed from: b */
    public void mo17220b() {
    }

    @MainThread
    /* renamed from: b */
    public void mo17218b(Bundle bundle) {
    }

    /* renamed from: e */
    public Activity m17216e() {
        return this.f21940d.mo12687a();
    }

    @MainThread
    /* renamed from: f */
    public void mo17204f() {
    }
}
