package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.AbstractC4803c;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.drive.internal.C4894br;
import com.google.android.gms.internal.ahl;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.drive.internal.ak */
/* loaded from: classes2.dex */
public class BinderC4855ak extends BinderC4879bc {

    /* renamed from: a */
    private final ahl.AbstractC6344b<AbstractC4803c.AbstractC4804a> f17839a;

    /* renamed from: b */
    private final AbstractC4808e.AbstractC4809a f17840b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4855ak(ahl.AbstractC6344b<AbstractC4803c.AbstractC4804a> abstractC6344b, AbstractC4808e.AbstractC4809a abstractC4809a) {
        this.f17839a = abstractC6344b;
        this.f17840b = abstractC4809a;
    }

    @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
    /* renamed from: a */
    public void mo22275a(Status status) {
        this.f17839a.mo7413a(new C4894br.C4902b(status, null));
    }

    @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
    /* renamed from: a */
    public void mo22271a(OnContentsResponse onContentsResponse) {
        this.f17839a.mo7413a(new C4894br.C4902b(onContentsResponse.m22615b() ? new Status(-1) : Status.f16786a, new C4919bu(onContentsResponse.m22616a())));
    }

    @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
    /* renamed from: a */
    public void mo22269a(OnDownloadProgressResponse onDownloadProgressResponse) {
        if (this.f17840b != null) {
            this.f17840b.mo22402a(onDownloadProgressResponse.m22613a(), onDownloadProgressResponse.m22612b());
        }
    }
}
