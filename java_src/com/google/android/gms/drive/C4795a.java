package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.drive.internal.C4887bk;
import com.google.android.gms.drive.internal.C4919bu;
/* renamed from: com.google.android.gms.drive.a */
/* loaded from: classes2.dex */
public class C4795a {

    /* renamed from: a */
    public static final String f17548a = "response_drive_id";

    /* renamed from: b */
    private final C4887bk f17549b = new C4887bk(0);

    /* renamed from: c */
    private AbstractC4807d f17550c;

    /* renamed from: d */
    private boolean f17551d;

    /* renamed from: a */
    public IntentSender m22715a(AbstractC4489g abstractC4489g) {
        C4588d.m23626a(Boolean.valueOf(this.f17551d), "Must call setInitialDriveContents to CreateFileActivityBuilder.");
        C4588d.m23622a(abstractC4489g.mo17353j(), "Client must be connected");
        if (this.f17550c != null) {
            this.f17550c.mo22411g();
        }
        return this.f17549b.m22491a(abstractC4489g);
    }

    /* renamed from: a */
    public C4795a m22714a(DriveId driveId) {
        this.f17549b.m22490a(driveId);
        return this;
    }

    /* renamed from: a */
    public C4795a m22713a(AbstractC4807d abstractC4807d) {
        if (abstractC4807d == null) {
            this.f17549b.m22492a(1);
        } else if (!(abstractC4807d instanceof C4919bu)) {
            throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
        } else {
            if (abstractC4807d.mo22423a() != null) {
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if (abstractC4807d.mo22410h()) {
                throw new IllegalArgumentException("DriveContents are already closed.");
            }
            this.f17549b.m22492a(abstractC4807d.mo22412f().m22739f());
            this.f17550c = abstractC4807d;
        }
        this.f17551d = true;
        return this;
    }

    /* renamed from: a */
    public C4795a m22712a(C5021n c5021n) {
        this.f17549b.m22489a(c5021n);
        return this;
    }

    /* renamed from: a */
    public C4795a m22711a(String str) {
        this.f17549b.m22488a(str);
        return this;
    }
}
