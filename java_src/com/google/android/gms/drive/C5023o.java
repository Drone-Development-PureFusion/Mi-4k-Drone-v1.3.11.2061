package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.drive.internal.C4913bt;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.C5042g;
import com.google.android.gms.drive.query.internal.FilterHolder;
/* renamed from: com.google.android.gms.drive.o */
/* loaded from: classes2.dex */
public class C5023o {

    /* renamed from: a */
    public static final String f18016a = "response_drive_id";

    /* renamed from: b */
    private String f18017b;

    /* renamed from: c */
    private String[] f18018c;

    /* renamed from: d */
    private Filter f18019d;

    /* renamed from: e */
    private DriveId f18020e;

    /* renamed from: a */
    public IntentSender m22064a(AbstractC4489g abstractC4489g) {
        C4588d.m23622a(abstractC4489g.mo17353j(), "Client must be connected");
        if (this.f18018c == null) {
            this.f18018c = new String[0];
        }
        if (this.f18018c.length <= 0 || this.f18019d == null) {
            try {
                return ((C4913bt) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4798b.f17559a)).m22433i().mo22301a(new OpenFileIntentSenderRequest(this.f18017b, this.f18018c, this.f18020e, this.f18019d == null ? null : new FilterHolder(this.f18019d)));
            } catch (RemoteException e) {
                throw new RuntimeException("Unable to connect Drive Play Service", e);
            }
        }
        throw new IllegalStateException("Cannot use a selection filter and set mimetypes simultaneously");
    }

    /* renamed from: a */
    public C5023o m22063a(DriveId driveId) {
        this.f18020e = (DriveId) C4588d.m23627a(driveId);
        return this;
    }

    /* renamed from: a */
    public C5023o m22062a(Filter filter) {
        boolean z = true;
        C4588d.m23618b(filter != null, "filter may not be null");
        if (C5042g.m21985a(filter)) {
            z = false;
        }
        C4588d.m23618b(z, "FullTextSearchFilter cannot be used as a selection filter");
        this.f18019d = filter;
        return this;
    }

    /* renamed from: a */
    public C5023o m22061a(String str) {
        this.f18017b = (String) C4588d.m23627a(str);
        return this;
    }

    /* renamed from: a */
    public C5023o m22060a(String[] strArr) {
        C4588d.m23618b(strArr != null, "mimeTypes may not be null");
        this.f18018c = strArr;
        return this;
    }
}
