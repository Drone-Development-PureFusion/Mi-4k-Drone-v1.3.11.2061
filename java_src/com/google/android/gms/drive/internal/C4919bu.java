package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4503n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4692o;
import com.google.android.gms.drive.AbstractC4803c;
import com.google.android.gms.drive.AbstractC4807d;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.drive.C4985j;
import com.google.android.gms.drive.C5021n;
import com.google.android.gms.drive.C5114x;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.AbstractC4911bs;
import com.google.android.gms.drive.internal.C4894br;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: com.google.android.gms.drive.internal.bu */
/* loaded from: classes2.dex */
public class C4919bu implements AbstractC4807d {

    /* renamed from: a */
    private final Contents f17901a;

    /* renamed from: b */
    private boolean f17902b = false;

    /* renamed from: c */
    private boolean f17903c = false;

    /* renamed from: d */
    private boolean f17904d = false;

    public C4919bu(Contents contents) {
        this.f17901a = (Contents) C4588d.m23627a(contents);
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: a */
    public AbstractC4494i<AbstractC4803c.AbstractC4804a> mo22422a(AbstractC4489g abstractC4489g) {
        if (mo22410h()) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (this.f17901a.m22740e() != 268435456) {
            throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        }
        mo22411g();
        return abstractC4489g.mo17255a((AbstractC4489g) new C4894br.AbstractC4903c(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bu.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22302a(new OpenContentsRequest(C4919bu.this.mo22423a(), AbstractC4808e.f17572c, C4919bu.this.f17901a.m22739f()), new BinderC4855ak(this, null));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: a */
    public AbstractC4494i<Status> mo22421a(AbstractC4489g abstractC4489g, C5021n c5021n) {
        return m22419a(abstractC4489g, c5021n, (C5114x) null);
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: a */
    public AbstractC4494i<Status> mo22420a(AbstractC4489g abstractC4489g, C5021n c5021n, C4985j c4985j) {
        return m22419a(abstractC4489g, c5021n, c4985j == null ? null : C5114x.m21796a(c4985j));
    }

    /* renamed from: a */
    public AbstractC4494i<Status> m22419a(AbstractC4489g abstractC4489g, final C5021n c5021n, C5114x c5114x) {
        final C5114x c5114x2 = c5114x == null ? (C5114x) new C5114x.C5116a().mo21791b() : c5114x;
        if (this.f17901a.m22740e() == 268435456) {
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        }
        if (C4985j.m22224a(c5114x2.c()) && !this.f17901a.m22738g()) {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
        c5114x2.a(abstractC4489g);
        if (mo22410h()) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (mo22423a() == null) {
            throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
        }
        if (c5021n == null) {
            c5021n = C5021n.f18012f;
        }
        mo22411g();
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bu.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c5021n.m22081j().m22155a(c4913bt.B());
                c4913bt.m22433i().mo22318a(new CloseContentsAndUpdateMetadataRequest(C4919bu.this.f17901a.m22743b(), c5021n.m22081j(), C4919bu.this.f17901a.m22739f(), C4919bu.this.f17901a.m22738g(), c5114x2), new BinderC4864at(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: a */
    public DriveId mo22423a() {
        return this.f17901a.m22743b();
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: b */
    public int mo22417b() {
        return this.f17901a.m22740e();
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: b */
    public void mo22416b(AbstractC4489g abstractC4489g) {
        if (mo22410h()) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        mo22411g();
        ((C49234) abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4911bs.AbstractC4912a(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bu.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c4913bt.m22433i().mo22317a(new CloseContentsRequest(C4919bu.this.f17901a.m22739f(), false), new BinderC4864at(this));
            }
        })).a((AbstractC4503n) new AbstractC4503n<Status>() { // from class: com.google.android.gms.drive.internal.bu.3
            @Override // com.google.android.gms.common.api.AbstractC4503n
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7161a(Status status) {
                if (!status.m24018f()) {
                    C4938by.m22377c("DriveContentsImpl", "Error discarding contents");
                } else {
                    C4938by.m22380a("DriveContentsImpl", "Contents discarded");
                }
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: c */
    public ParcelFileDescriptor mo22415c() {
        if (mo22410h()) {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        return this.f17901a.m22744a();
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: d */
    public InputStream mo22414d() {
        if (mo22410h()) {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if (this.f17901a.m22740e() != 268435456) {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if (this.f17903c) {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        }
        this.f17903c = true;
        return this.f17901a.m22742c();
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: e */
    public OutputStream mo22413e() {
        if (mo22410h()) {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (this.f17901a.m22740e() != 536870912) {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (this.f17904d) {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        }
        this.f17904d = true;
        return this.f17901a.m22741d();
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: f */
    public Contents mo22412f() {
        return this.f17901a;
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: g */
    public void mo22411g() {
        C4692o.m23125a(this.f17901a.m22744a());
        this.f17902b = true;
    }

    @Override // com.google.android.gms.drive.AbstractC4807d
    /* renamed from: h */
    public boolean mo22410h() {
        return this.f17902b;
    }
}
