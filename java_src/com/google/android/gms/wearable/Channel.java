package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.AbstractC9453c;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public interface Channel extends Parcelable {

    /* renamed from: com.google.android.gms.wearable.Channel$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9426a extends AbstractC4500k, AbstractC4502m {
        /* renamed from: c */
        InputStream mo8045c();
    }

    /* renamed from: com.google.android.gms.wearable.Channel$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9427b extends AbstractC4500k, AbstractC4502m {
        /* renamed from: c */
        OutputStream mo8044c();
    }

    /* renamed from: a */
    AbstractC4494i<Status> mo8071a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    AbstractC4494i<Status> mo8070a(AbstractC4489g abstractC4489g, int i);

    /* renamed from: a */
    AbstractC4494i<Status> mo8069a(AbstractC4489g abstractC4489g, Uri uri);

    /* renamed from: a */
    AbstractC4494i<Status> mo8068a(AbstractC4489g abstractC4489g, Uri uri, long j, long j2);

    /* renamed from: a */
    AbstractC4494i<Status> mo8067a(AbstractC4489g abstractC4489g, Uri uri, boolean z);

    /* renamed from: a */
    AbstractC4494i<Status> mo8066a(AbstractC4489g abstractC4489g, AbstractC9453c.AbstractC9454a abstractC9454a);

    /* renamed from: a */
    String mo8072a();

    /* renamed from: b */
    AbstractC4494i<AbstractC9426a> mo8062b(AbstractC4489g abstractC4489g);

    /* renamed from: b */
    AbstractC4494i<Status> mo8061b(AbstractC4489g abstractC4489g, AbstractC9453c.AbstractC9454a abstractC9454a);

    /* renamed from: b */
    String mo8063b();

    /* renamed from: c */
    AbstractC4494i<AbstractC9427b> mo8059c(AbstractC4489g abstractC4489g);
}
