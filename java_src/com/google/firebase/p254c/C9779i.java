package com.google.firebase.p254c;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7435nc;
import com.google.android.gms.internal.C7446nj;
import com.google.android.gms.p239g.AbstractC5282c;
import com.google.android.gms.p239g.AbstractC5283d;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5286g;
import com.google.firebase.C9751b;
import com.google.firebase.p254c.C9793k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
/* renamed from: com.google.firebase.c.i */
/* loaded from: classes2.dex */
public class C9779i {

    /* renamed from: a */
    static final /* synthetic */ boolean f30523a;

    /* renamed from: b */
    private final Uri f30524b;

    /* renamed from: c */
    private final C9771d f30525c;

    static {
        f30523a = !C9779i.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9779i(@NonNull Uri uri, @NonNull C9771d c9771d) {
        boolean z = true;
        C4588d.m23618b(uri != null, "storageUri cannot be null");
        C4588d.m23618b(c9771d == null ? false : z, "FirebaseApp cannot be null");
        this.f30524b = uri;
        this.f30525c = c9771d;
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<byte[]> m7063a(final long j) {
        final C5286g c5286g = new C5286g();
        C9793k c9793k = new C9793k(this);
        AbstractC9785j abstractC9785j = (AbstractC9785j) ((AbstractC9785j) c9793k.m6974a(new C9793k.AbstractC9794a() { // from class: com.google.firebase.c.i.5
            @Override // com.google.firebase.p254c.C9793k.AbstractC9794a
            /* renamed from: a */
            public void mo6965a(C9793k.C9795b c9795b, InputStream inputStream) {
                int i = 0;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 16384);
                        if (read == -1) {
                            byteArrayOutputStream.flush();
                            c5286g.m20830a((C5286g) byteArrayOutputStream.toByteArray());
                            return;
                        }
                        i += read;
                        if (i > j) {
                            Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                            throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } finally {
                    inputStream.close();
                }
            }
        }).mo7020a(new AbstractC5283d<C9793k.C9795b>() { // from class: com.google.firebase.c.i.4
            @Override // com.google.android.gms.p239g.AbstractC5283d
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7033a(C9793k.C9795b c9795b) {
                if (!c5286g.m20832a().mo7028a()) {
                    Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
                    c5286g.m20831a((Exception) C9774g.m7118a(Status.f16788c));
                }
            }
        })).mo7021a(new AbstractC5282c() { // from class: com.google.firebase.c.i.3

            /* renamed from: a */
            static final /* synthetic */ boolean f30530a;

            static {
                f30530a = !C9779i.class.desiredAssertionStatus();
            }

            @Override // com.google.android.gms.p239g.AbstractC5282c
            /* renamed from: a */
            public void mo7035a(@NonNull Exception exc) {
                C9774g m7116a = C9774g.m7116a(exc, 0);
                if (f30530a || m7116a != null) {
                    c5286g.m20831a((Exception) m7116a);
                    return;
                }
                throw new AssertionError();
            }
        });
        c9793k.r();
        return c5286g.m20832a();
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<C9776h> m7059a(@NonNull C9776h c9776h) {
        C4588d.m23627a(c9776h);
        C5286g c5286g = new C5286g();
        C9803p.m6929a().m6928a(new RunnableC9809r(this, c5286g, c9776h));
        return c5286g.m20832a();
    }

    @NonNull
    /* renamed from: a */
    public C9769c m7057a(@NonNull File file) {
        return m7050b(Uri.fromFile(file));
    }

    @Nullable
    /* renamed from: a */
    public C9779i m7064a() {
        String path = this.f30524b.getPath();
        if (path == null || path.equals("/")) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        return new C9779i(this.f30524b.buildUpon().path(lastIndexOf == -1 ? "/" : path.substring(0, lastIndexOf)).build(), this.f30525c);
    }

    @NonNull
    /* renamed from: a */
    public C9779i m7054a(@NonNull String str) {
        C4588d.m23618b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        String m14488c = C7435nc.m14488c(str);
        try {
            return new C9779i(this.f30524b.buildUpon().appendEncodedPath(C7435nc.m14490a(m14488c)).build(), this.f30525c);
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(m14488c);
            Log.e("StorageReference", valueOf.length() != 0 ? "Unable to create a valid default Uri. ".concat(valueOf) : new String("Unable to create a valid default Uri. "), e);
            throw new IllegalArgumentException("childName");
        }
    }

    @NonNull
    /* renamed from: a */
    public C9793k m7058a(@NonNull C9793k.AbstractC9794a abstractC9794a) {
        C9793k c9793k = new C9793k(this);
        c9793k.m6974a(abstractC9794a);
        c9793k.r();
        return c9793k;
    }

    @NonNull
    /* renamed from: a */
    public C9797l m7062a(@NonNull Uri uri) {
        C4588d.m23618b(uri != null, "uri cannot be null");
        C9797l c9797l = new C9797l(this, null, uri, null);
        c9797l.r();
        return c9797l;
    }

    @NonNull
    /* renamed from: a */
    public C9797l m7061a(@NonNull Uri uri, @NonNull C9776h c9776h) {
        boolean z = true;
        C4588d.m23618b(uri != null, "uri cannot be null");
        if (c9776h == null) {
            z = false;
        }
        C4588d.m23618b(z, "metadata cannot be null");
        C9797l c9797l = new C9797l(this, c9776h, uri, null);
        c9797l.r();
        return c9797l;
    }

    @NonNull
    /* renamed from: a */
    public C9797l m7060a(@NonNull Uri uri, @Nullable C9776h c9776h, @Nullable Uri uri2) {
        boolean z = true;
        C4588d.m23618b(uri != null, "uri cannot be null");
        if (c9776h == null) {
            z = false;
        }
        C4588d.m23618b(z, "metadata cannot be null");
        C9797l c9797l = new C9797l(this, c9776h, uri, uri2);
        c9797l.r();
        return c9797l;
    }

    @NonNull
    /* renamed from: a */
    public C9797l m7056a(@NonNull InputStream inputStream) {
        C4588d.m23618b(inputStream != null, "stream cannot be null");
        C9797l c9797l = new C9797l(this, (C9776h) null, inputStream);
        c9797l.r();
        return c9797l;
    }

    @NonNull
    /* renamed from: a */
    public C9797l m7055a(@NonNull InputStream inputStream, @NonNull C9776h c9776h) {
        boolean z = true;
        C4588d.m23618b(inputStream != null, "stream cannot be null");
        if (c9776h == null) {
            z = false;
        }
        C4588d.m23618b(z, "metadata cannot be null");
        C9797l c9797l = new C9797l(this, c9776h, inputStream);
        c9797l.r();
        return c9797l;
    }

    @NonNull
    /* renamed from: a */
    public C9797l m7053a(@NonNull byte[] bArr) {
        C4588d.m23618b(bArr != null, "bytes cannot be null");
        C9797l c9797l = new C9797l(this, (C9776h) null, bArr);
        c9797l.r();
        return c9797l;
    }

    @NonNull
    /* renamed from: a */
    public C9797l m7052a(@NonNull byte[] bArr, @NonNull C9776h c9776h) {
        boolean z = true;
        C4588d.m23618b(bArr != null, "bytes cannot be null");
        if (c9776h == null) {
            z = false;
        }
        C4588d.m23618b(z, "metadata cannot be null");
        C9797l c9797l = new C9797l(this, c9776h, bArr);
        c9797l.r();
        return c9797l;
    }

    @NonNull
    /* renamed from: b */
    public C9769c m7050b(@NonNull Uri uri) {
        C9769c c9769c = new C9769c(this, uri);
        c9769c.r();
        return c9769c;
    }

    @NonNull
    /* renamed from: b */
    public C9779i m7051b() {
        return new C9779i(this.f30524b.buildUpon().path("").build(), this.f30525c);
    }

    @NonNull
    /* renamed from: c */
    public String m7049c() {
        String path = this.f30524b.getPath();
        if (f30523a || path != null) {
            int lastIndexOf = path.lastIndexOf(47);
            return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
        }
        throw new AssertionError();
    }

    @NonNull
    /* renamed from: d */
    public String m7048d() {
        String path = this.f30524b.getPath();
        if (f30523a || path != null) {
            return path;
        }
        throw new AssertionError();
    }

    @NonNull
    /* renamed from: e */
    public String m7047e() {
        return this.f30524b.getAuthority();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9779i)) {
            return false;
        }
        return ((C9779i) obj).toString().equals(toString());
    }

    @NonNull
    /* renamed from: f */
    public C9771d m7046f() {
        return this.f30525c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: g */
    public C9751b m7045g() {
        return m7046f().m7124f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: h */
    public C7446nj m7044h() {
        return C7446nj.m14445a(m7045g());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @NonNull
    /* renamed from: i */
    public List<C9797l> m7043i() {
        return C9802o.m6934a().m6933a(this);
    }

    @NonNull
    /* renamed from: j */
    public List<C9769c> m7042j() {
        return C9802o.m6934a().m6931b(this);
    }

    @NonNull
    /* renamed from: k */
    public AbstractC5285f<C9776h> m7041k() {
        C5286g c5286g = new C5286g();
        C9803p.m6929a().m6928a(new RunnableC9801n(this, c5286g));
        return c5286g.m20832a();
    }

    @NonNull
    /* renamed from: l */
    public AbstractC5285f<Uri> m7040l() {
        final C5286g c5286g = new C5286g();
        AbstractC5285f<C9776h> m7041k = m7041k();
        m7041k.mo7020a(new AbstractC5283d<C9776h>() { // from class: com.google.firebase.c.i.1
            @Override // com.google.android.gms.p239g.AbstractC5283d
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7033a(C9776h c9776h) {
                c5286g.m20830a((C5286g) c9776h.m7082l());
            }
        });
        m7041k.mo7021a(new AbstractC5282c() { // from class: com.google.firebase.c.i.2
            @Override // com.google.android.gms.p239g.AbstractC5282c
            /* renamed from: a */
            public void mo7035a(@NonNull Exception exc) {
                c5286g.m20831a(exc);
            }
        });
        return c5286g.m20832a();
    }

    @NonNull
    /* renamed from: m */
    public C9793k m7039m() {
        C9793k c9793k = new C9793k(this);
        c9793k.r();
        return c9793k;
    }

    /* renamed from: n */
    public AbstractC5285f<Void> m7038n() {
        C5286g c5286g = new C5286g();
        C9803p.m6929a().m6928a(new RunnableC9800m(this, c5286g));
        return c5286g.m20832a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: o */
    public Uri m7037o() {
        return this.f30524b;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f30524b.getAuthority());
        String valueOf2 = String.valueOf(this.f30524b.getPath());
        return new StringBuilder(String.valueOf(valueOf).length() + 5 + String.valueOf(valueOf2).length()).append("gs://").append(valueOf).append(valueOf2).toString();
    }
}
