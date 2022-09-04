package com.google.firebase.p254c;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7434nb;
import com.google.android.gms.internal.C7447nk;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.google.firebase.c.k */
/* loaded from: classes2.dex */
public class C9793k extends AbstractC9785j<C9795b> {

    /* renamed from: b */
    private C9779i f30554b;

    /* renamed from: c */
    private C7434nb f30555c;

    /* renamed from: d */
    private volatile Exception f30556d = null;

    /* renamed from: e */
    private volatile int f30557e = 0;

    /* renamed from: f */
    private AbstractC9794a f30558f;

    /* renamed from: g */
    private long f30559g;

    /* renamed from: h */
    private long f30560h;

    /* renamed from: i */
    private long f30561i;

    /* renamed from: j */
    private InputStream f30562j;

    /* renamed from: k */
    private C7447nk f30563k;

    /* renamed from: com.google.firebase.c.k$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9794a {
        /* renamed from: a */
        void mo6965a(C9795b c9795b, InputStream inputStream);
    }

    /* renamed from: com.google.firebase.c.k$b */
    /* loaded from: classes2.dex */
    public class C9795b extends AbstractC9785j<C9795b>.C9792b {

        /* renamed from: c */
        private final long f30565c;

        C9795b(Exception exc, long j) {
            super(exc);
            this.f30565c = j;
        }

        /* renamed from: a */
        public long m6964a() {
            return this.f30565c;
        }

        /* renamed from: b */
        public long m6963b() {
            return C9793k.this.m6968k();
        }

        @Override // com.google.firebase.p254c.AbstractC9785j.C9792b, com.google.firebase.p254c.AbstractC9785j.AbstractC9791a
        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ Exception mo6940c() {
            return super.mo6940c();
        }

        @Override // com.google.firebase.p254c.AbstractC9785j.C9792b
        @NonNull
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C9779i mo6939d() {
            return super.mo6939d();
        }

        @Override // com.google.firebase.p254c.AbstractC9785j.C9792b
        @NonNull
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC9785j<C9795b> mo6938e() {
            return super.mo6938e();
        }

        /* renamed from: f */
        public InputStream m6962f() {
            return C9793k.this.f30562j;
        }
    }

    /* renamed from: com.google.firebase.c.k$c */
    /* loaded from: classes2.dex */
    private static class C9796c extends InputStream {

        /* renamed from: a */
        private C9793k f30566a;

        /* renamed from: b */
        private InputStream f30567b;

        /* renamed from: c */
        private int f30568c;

        public C9796c(@NonNull C9793k c9793k, @NonNull InputStream inputStream) {
            this.f30566a = c9793k;
            this.f30567b = inputStream;
        }

        /* renamed from: a */
        private void m6961a() {
            if (this.f30566a.v() == 32) {
                throw C9774g.f30498k;
            }
        }

        @Override // java.io.InputStream
        public int available() {
            m6961a();
            return this.f30567b.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f30567b.close();
            if (this.f30566a.f30563k != null) {
                this.f30566a.f30563k.m14436b();
            }
            m6961a();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f30568c = i;
            this.f30567b.mark(i);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f30567b.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            m6961a();
            int read = this.f30567b.read();
            if (read != -1) {
                this.f30566a.m6975a(1L);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i, int i2) {
            m6961a();
            int i3 = 0;
            int i4 = i2;
            int i5 = i;
            while (i4 > 262144) {
                int read = this.f30567b.read(bArr, i5, AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
                if (read != -1) {
                    i3 += read;
                    i5 += read;
                    i4 -= read;
                    this.f30566a.m6975a(read);
                    m6961a();
                    if (read < 262144) {
                        break;
                    }
                } else if (i3 != 0) {
                    return i3;
                } else {
                    return -1;
                }
            }
            if (i4 > 0) {
                int read2 = this.f30567b.read(bArr, i5, i4);
                if (read2 == -1) {
                    if (i3 == 0) {
                        return -1;
                    }
                    return i3;
                }
                i3 += read2;
                this.f30566a.m6975a(read2);
            }
            return i3;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m6961a();
            this.f30566a.m6975a(-this.f30568c);
            this.f30567b.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            m6961a();
            int i = 0;
            while (j > 262144) {
                long skip = this.f30567b.skip(262144L);
                i = (int) (i + skip);
                if (skip < 262144) {
                    this.f30566a.m6975a(skip);
                    return i;
                }
                this.f30566a.m6975a(262144L);
                j -= 262144;
                m6961a();
            }
            long skip2 = this.f30567b.skip(j);
            this.f30566a.m6975a(skip2);
            return (int) (i + skip2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9793k(@NonNull C9779i c9779i) {
        this.f30554b = c9779i;
        this.f30555c = new C7434nb(this.f30554b.m7045g(), this.f30554b.m7046f().m7131b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6975a(long j) {
        this.f30559g += j;
        if (this.f30561i + 262144 <= this.f30559g) {
            a(4, false);
        }
    }

    /* renamed from: a */
    private boolean m6976a(int i) {
        return i == 308 || (i >= 200 && i < 300);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C9793k m6974a(@NonNull AbstractC9794a abstractC9794a) {
        C4588d.m23627a(abstractC9794a);
        C4588d.m23623a(this.f30558f == null);
        this.f30558f = abstractC9794a;
        return this;
    }

    @Override // com.google.firebase.p254c.AbstractC9785j, com.google.firebase.p254c.AbstractC9768b
    /* renamed from: h */
    public boolean mo6970h() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.p254c.AbstractC9785j, com.google.firebase.p254c.AbstractC9768b
    /* renamed from: i */
    public boolean mo6969i() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    /* renamed from: k */
    long m6968k() {
        return this.f30560h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.p254c.AbstractC9785j
    @NonNull
    /* renamed from: l */
    public C9779i mo6949l() {
        return this.f30554b;
    }

    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: m */
    protected void mo6948m() {
        C9803p.m6929a().m6926c(D());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.p254c.AbstractC9785j
    @NonNull
    /* renamed from: n */
    public C9795b mo6944q() {
        return new C9795b(C9774g.m7116a(this.f30556d, this.f30557e), this.f30561i);
    }

    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: o */
    void mo6946o() {
        this.f30555c.m14491b();
        if (this.f30556d != null) {
            a(64, false);
        } else if (!a(4, false)) {
        } else {
            try {
                this.f30563k = this.f30554b.m7044h().m14450a(this.f30554b.m7037o(), 0L);
                this.f30555c.m14492a(this.f30563k, false);
                this.f30557e = this.f30563k.m14430g();
                this.f30556d = this.f30563k.m14431f() != null ? this.f30563k.m14431f() : this.f30556d;
                boolean z = m6976a(this.f30557e) && this.f30556d == null && v() == 4;
                if (z) {
                    this.f30560h = this.f30563k.m14428i();
                    InputStream m14434c = this.f30563k.m14434c();
                    if (m14434c != null) {
                        this.f30562j = new C9796c(this, m14434c);
                        if (this.f30558f != null) {
                            try {
                                this.f30558f.mo6965a(x(), this.f30562j);
                            } catch (Exception e) {
                                Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e);
                                this.f30556d = e;
                            }
                        }
                    } else {
                        this.f30556d = new IOException("Could not open resulting stream.");
                    }
                }
                if (this.f30562j == null) {
                    this.f30563k.m14436b();
                }
                if (z && this.f30556d == null && v() == 4) {
                    a(4, false);
                    a(128, false);
                    return;
                }
                if (a(v() == 32 ? 256 : 64, false)) {
                    return;
                }
                Log.w("StreamDownloadTask", new StringBuilder(62).append("Unable to change download task to final state from ").append(v()).toString());
            } catch (RemoteException e2) {
                Log.e("StreamDownloadTask", "Unable to create firebase storage network request.", e2);
                this.f30556d = e2;
                a(64, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: p */
    public void mo6945p() {
        this.f30555c.m14495a();
    }

    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: z */
    protected void mo6966z() {
        this.f30561i = this.f30559g;
    }
}
