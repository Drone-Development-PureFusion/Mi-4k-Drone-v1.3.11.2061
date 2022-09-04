package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.drive.C4798b;
import com.google.android.gms.drive.C5021n;
import com.google.android.gms.drive.DriveId;
/* renamed from: com.google.android.gms.drive.internal.bk */
/* loaded from: classes2.dex */
public class C4887bk {

    /* renamed from: a */
    protected C5021n f17851a;

    /* renamed from: b */
    private Integer f17852b;

    /* renamed from: c */
    private String f17853c;

    /* renamed from: d */
    private DriveId f17854d;

    /* renamed from: e */
    private final int f17855e;

    public C4887bk(int i) {
        this.f17855e = i;
    }

    /* renamed from: a */
    public IntentSender m22491a(AbstractC4489g abstractC4489g) {
        C4588d.m23626a(this.f17851a, "Must provide initial metadata to CreateFileActivityBuilder.");
        C4588d.m23622a(abstractC4489g.mo17353j(), "Client must be connected");
        C4913bt c4913bt = (C4913bt) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4798b.f17559a);
        this.f17851a.m22081j().m22155a(c4913bt.B());
        try {
            return c4913bt.m22433i().mo22314a(new CreateFileIntentSenderRequest(this.f17851a.m22081j(), this.f17852b == null ? 0 : this.f17852b.intValue(), this.f17853c, this.f17854d, this.f17855e));
        } catch (RemoteException e) {
            throw new RuntimeException("Unable to connect Drive Play Service", e);
        }
    }

    /* renamed from: a */
    public void m22492a(int i) {
        this.f17852b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public void m22490a(DriveId driveId) {
        this.f17854d = (DriveId) C4588d.m23627a(driveId);
    }

    /* renamed from: a */
    public void m22489a(C5021n c5021n) {
        this.f17851a = (C5021n) C4588d.m23627a(c5021n);
    }

    /* renamed from: a */
    public void m22488a(String str) {
        this.f17853c = (String) C4588d.m23627a(str);
    }
}
