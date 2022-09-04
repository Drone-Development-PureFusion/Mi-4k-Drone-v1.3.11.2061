package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.AbstractC4803c;
import com.google.android.gms.drive.AbstractC4807d;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.drive.AbstractC4836f;
import com.google.android.gms.drive.C4985j;
import com.google.android.gms.drive.C5021n;
import com.google.android.gms.drive.C5111w;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.C5011i;
import com.google.android.gms.drive.query.C5030a;
import com.google.android.gms.drive.query.C5031b;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ajw;
/* renamed from: com.google.android.gms.drive.internal.bx */
/* loaded from: classes2.dex */
public class C4929bx extends C4939c implements AbstractC4836f {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.bx$a */
    /* loaded from: classes2.dex */
    public static class BinderC4932a extends BinderC4879bc {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC4836f.AbstractC4837a> f17925a;

        public BinderC4932a(ahl.AbstractC6344b<AbstractC4836f.AbstractC4837a> abstractC6344b) {
            this.f17925a = abstractC6344b;
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22275a(Status status) {
            this.f17925a.mo7413a(new C4934c(status, null));
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22268a(OnDriveIdResponse onDriveIdResponse) {
            this.f17925a.mo7413a(new C4934c(Status.f16786a, new C4924bv(onDriveIdResponse.m22611a())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.bx$b */
    /* loaded from: classes2.dex */
    public static class BinderC4933b extends BinderC4879bc {

        /* renamed from: a */
        private final ahl.AbstractC6344b<AbstractC4836f.AbstractC4838b> f17926a;

        public BinderC4933b(ahl.AbstractC6344b<AbstractC4836f.AbstractC4838b> abstractC6344b) {
            this.f17926a = abstractC6344b;
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22275a(Status status) {
            this.f17926a.mo7413a(new C4936e(status, null));
        }

        @Override // com.google.android.gms.drive.internal.BinderC4879bc, com.google.android.gms.drive.internal.AbstractC4967o
        /* renamed from: a */
        public void mo22268a(OnDriveIdResponse onDriveIdResponse) {
            this.f17926a.mo7413a(new C4936e(Status.f16786a, new C4929bx(onDriveIdResponse.m22611a())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.bx$c */
    /* loaded from: classes2.dex */
    public static class C4934c implements AbstractC4836f.AbstractC4837a {

        /* renamed from: a */
        private final Status f17927a;

        /* renamed from: b */
        private final AbstractC4808e f17928b;

        public C4934c(Status status, AbstractC4808e abstractC4808e) {
            this.f17927a = status;
            this.f17928b = abstractC4808e;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f17927a;
        }

        @Override // com.google.android.gms.drive.AbstractC4836f.AbstractC4837a
        /* renamed from: b */
        public AbstractC4808e mo22386b() {
            return this.f17928b;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.bx$d */
    /* loaded from: classes2.dex */
    static abstract class AbstractC4935d extends AbstractC4911bs<AbstractC4836f.AbstractC4837a> {
        AbstractC4935d(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4836f.AbstractC4837a mo7807b(Status status) {
            return new C4934c(status, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.bx$e */
    /* loaded from: classes2.dex */
    public static class C4936e implements AbstractC4836f.AbstractC4838b {

        /* renamed from: a */
        private final Status f17929a;

        /* renamed from: b */
        private final AbstractC4836f f17930b;

        public C4936e(Status status, AbstractC4836f abstractC4836f) {
            this.f17929a = status;
            this.f17930b = abstractC4836f;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f17929a;
        }

        @Override // com.google.android.gms.drive.AbstractC4836f.AbstractC4838b
        /* renamed from: b */
        public AbstractC4836f mo22384b() {
            return this.f17930b;
        }
    }

    /* renamed from: com.google.android.gms.drive.internal.bx$f */
    /* loaded from: classes2.dex */
    static abstract class AbstractC4937f extends AbstractC4911bs<AbstractC4836f.AbstractC4838b> {
        AbstractC4937f(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4836f.AbstractC4838b mo7807b(Status status) {
            return new C4936e(status, null);
        }
    }

    public C4929bx(DriveId driveId) {
        super(driveId);
    }

    /* renamed from: a */
    private int m22393a(AbstractC4807d abstractC4807d, C5011i c5011i) {
        if (abstractC4807d == null) {
            return (c5011i == null || !c5011i.m22117c()) ? 1 : 0;
        }
        int m22739f = abstractC4807d.mo22412f().m22739f();
        abstractC4807d.mo22411g();
        return m22739f;
    }

    /* renamed from: a */
    private AbstractC4494i<AbstractC4836f.AbstractC4837a> m22398a(AbstractC4489g abstractC4489g, final C5021n c5021n, final int i, final C5111w c5111w) {
        C5011i m22119a = C5011i.m22119a(c5021n.m22086e());
        final int i2 = (m22119a == null || !m22119a.m22117c()) ? 0 : 1;
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4935d(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bx.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c5021n.m22081j().m22155a(c4913bt.B());
                c4913bt.m22433i().mo22313a(new CreateFileRequest(C4929bx.this.a(), c5021n.m22081j(), i, i2, c5111w), new BinderC4932a(this));
            }
        });
    }

    /* renamed from: a */
    private C5021n m22391a(C5021n c5021n, String str) {
        return c5021n.m22090a(ajw.f22066K, str);
    }

    /* renamed from: a */
    private Query m22390a(Query query) {
        Query.C5027a m22045a = new Query.C5027a().m22045a(C5030a.m22037a(C5031b.f18045d, a()));
        if (query != null) {
            if (query.m22053a() != null) {
                m22045a.m22045a(query.m22053a());
            }
            m22045a.m22043a(query.m22052b());
            m22045a.m22044a(query.m22051c());
        }
        return m22045a.m22046a();
    }

    /* renamed from: a */
    private void m22392a(C5021n c5021n) {
        if (c5021n == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        C5011i m22119a = C5011i.m22119a(c5021n.m22086e());
        if (m22119a != null && !m22119a.m22118b()) {
            throw new IllegalArgumentException("May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead.");
        }
    }

    /* renamed from: b */
    private void m22389b(AbstractC4489g abstractC4489g, C5021n c5021n, AbstractC4807d abstractC4807d, C5111w c5111w) {
        if (c5021n == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        C5011i m22119a = C5011i.m22119a(c5021n.m22086e());
        if (m22119a != null && m22119a.m22120a()) {
            throw new IllegalArgumentException("May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder");
        }
        c5111w.a(abstractC4489g);
        if (abstractC4807d == null) {
            return;
        }
        if (!(abstractC4807d instanceof C4919bu)) {
            throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
        }
        if (abstractC4807d.mo22423a() != null) {
            throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
        }
        if (!abstractC4807d.mo22410h()) {
            return;
        }
        throw new IllegalArgumentException("DriveContents are already closed.");
    }

    @Override // com.google.android.gms.drive.AbstractC4836f
    /* renamed from: a */
    public AbstractC4494i<AbstractC4803c.AbstractC4806c> mo22400a(AbstractC4489g abstractC4489g) {
        return mo22394a(abstractC4489g, (Query) null);
    }

    @Override // com.google.android.gms.drive.AbstractC4836f
    /* renamed from: a */
    public AbstractC4494i<AbstractC4836f.AbstractC4838b> mo22399a(AbstractC4489g abstractC4489g, final C5021n c5021n) {
        if (c5021n == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        if (c5021n.m22086e() != null && !c5021n.m22086e().equals(AbstractC4836f.f17636b_)) {
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        }
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4937f(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bx.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C4913bt c4913bt) {
                c5021n.m22081j().m22155a(c4913bt.B());
                c4913bt.m22433i().mo22312a(new CreateFolderRequest(C4929bx.this.a(), c5021n.m22081j()), new BinderC4933b(this));
            }
        });
    }

    @Override // com.google.android.gms.drive.AbstractC4836f
    /* renamed from: a */
    public AbstractC4494i<AbstractC4836f.AbstractC4837a> mo22397a(AbstractC4489g abstractC4489g, C5021n c5021n, AbstractC4807d abstractC4807d) {
        m22392a(c5021n);
        return m22395a(abstractC4489g, c5021n, abstractC4807d, (C5111w) null);
    }

    @Override // com.google.android.gms.drive.AbstractC4836f
    /* renamed from: a */
    public AbstractC4494i<AbstractC4836f.AbstractC4837a> mo22396a(AbstractC4489g abstractC4489g, C5021n c5021n, AbstractC4807d abstractC4807d, C4985j c4985j) {
        m22392a(c5021n);
        return m22395a(abstractC4489g, c5021n, abstractC4807d, C5111w.m21803a(c4985j));
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4836f.AbstractC4837a> m22395a(AbstractC4489g abstractC4489g, C5021n c5021n, AbstractC4807d abstractC4807d, C5111w c5111w) {
        C5111w c5111w2 = c5111w == null ? (C5111w) new C5111w.C5113a().mo21791b() : c5111w;
        m22389b(abstractC4489g, c5021n, abstractC4807d, c5111w2);
        int m22393a = m22393a(abstractC4807d, C5011i.m22119a(c5021n.m22086e()));
        String m21801e = c5111w2.m21801e();
        if (m21801e != null) {
            c5021n = m22391a(c5021n, m21801e);
        }
        return m22398a(abstractC4489g, c5021n, m22393a, c5111w2);
    }

    @Override // com.google.android.gms.drive.AbstractC4836f
    /* renamed from: a */
    public AbstractC4494i<AbstractC4803c.AbstractC4806c> mo22394a(AbstractC4489g abstractC4489g, Query query) {
        return new C4894br().mo22467a(abstractC4489g, m22390a(query));
    }
}
