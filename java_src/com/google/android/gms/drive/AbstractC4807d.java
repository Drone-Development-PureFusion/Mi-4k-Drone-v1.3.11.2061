package com.google.android.gms.drive;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.AbstractC4803c;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: com.google.android.gms.drive.d */
/* loaded from: classes2.dex */
public interface AbstractC4807d {
    /* renamed from: a */
    AbstractC4494i<AbstractC4803c.AbstractC4804a> mo22422a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    AbstractC4494i<Status> mo22421a(AbstractC4489g abstractC4489g, C5021n c5021n);

    /* renamed from: a */
    AbstractC4494i<Status> mo22420a(AbstractC4489g abstractC4489g, C5021n c5021n, C4985j c4985j);

    /* renamed from: a */
    DriveId mo22423a();

    /* renamed from: b */
    int mo22417b();

    /* renamed from: b */
    void mo22416b(AbstractC4489g abstractC4489g);

    /* renamed from: c */
    ParcelFileDescriptor mo22415c();

    /* renamed from: d */
    InputStream mo22414d();

    /* renamed from: e */
    OutputStream mo22413e();

    /* renamed from: f */
    Contents mo22412f();

    /* renamed from: g */
    void mo22411g();

    /* renamed from: h */
    boolean mo22410h();
}
