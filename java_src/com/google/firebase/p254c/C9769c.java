package com.google.firebase.p254c;

import android.net.Uri;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.C7434nb;
import com.google.android.gms.internal.C7447nk;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.p286a.p287a.C11086e;
/* renamed from: com.google.firebase.c.c */
/* loaded from: classes2.dex */
public class C9769c extends AbstractC9785j<C9770a> {

    /* renamed from: b */
    private final Uri f30471b;

    /* renamed from: c */
    private long f30472c;

    /* renamed from: d */
    private C9779i f30473d;

    /* renamed from: e */
    private C7434nb f30474e;

    /* renamed from: f */
    private long f30475f = -1;

    /* renamed from: g */
    private String f30476g = null;

    /* renamed from: h */
    private volatile Exception f30477h = null;

    /* renamed from: i */
    private long f30478i = 0;

    /* renamed from: j */
    private int f30479j;

    /* renamed from: com.google.firebase.c.c$a */
    /* loaded from: classes2.dex */
    public class C9770a extends AbstractC9785j<C9770a>.C9792b {

        /* renamed from: c */
        private final long f30481c;

        C9770a(Exception exc, long j) {
            super(exc);
            this.f30481c = j;
        }

        /* renamed from: a */
        public long m7138a() {
            return this.f30481c;
        }

        /* renamed from: b */
        public long m7137b() {
            return C9769c.this.m7140k();
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
        public /* bridge */ /* synthetic */ AbstractC9785j<C9770a> mo6938e() {
            return super.mo6938e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9769c(@NonNull C9779i c9779i, @NonNull Uri uri) {
        this.f30473d = c9779i;
        this.f30471b = uri;
        this.f30474e = new C7434nb(this.f30473d.m7046f().m7124f(), this.f30473d.m7046f().m7131b());
    }

    /* renamed from: a */
    private boolean m7141a(int i) {
        return i == 308 || (i >= 200 && i < 300);
    }

    /* renamed from: k */
    long m7140k() {
        return this.f30475f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.p254c.AbstractC9785j
    @NonNull
    /* renamed from: l */
    public C9779i mo6949l() {
        return this.f30473d;
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
    public C9770a mo6944q() {
        return new C9770a(C9774g.m7116a(this.f30477h, this.f30479j), this.f30472c);
    }

    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: o */
    void mo6946o() {
        FileOutputStream fileOutputStream;
        a(4, false);
        this.f30474e.m14491b();
        try {
            C7447nk m14450a = this.f30473d.m7044h().m14450a(this.f30473d.m7037o(), this.f30478i);
            this.f30474e.m14492a(m14450a, false);
            this.f30479j = m14450a.m14430g();
            this.f30477h = m14450a.m14431f() != null ? m14450a.m14431f() : this.f30477h;
            boolean z = m7141a(this.f30479j) && this.f30477h == null && v() == 4;
            if (z) {
                this.f30475f = m14450a.m14428i();
                String m14438a = m14450a.m14438a(C11086e.f35729v);
                if (!TextUtils.isEmpty(m14438a) && this.f30476g != null && !this.f30476g.equals(m14438a)) {
                    Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                    this.f30478i = 0L;
                    this.f30476g = null;
                    m14450a.m14436b();
                    mo6948m();
                    return;
                }
                this.f30476g = m14438a;
                InputStream m14434c = m14450a.m14434c();
                if (m14434c != null) {
                    try {
                        File file = new File(this.f30471b.getPath());
                        if (!file.exists()) {
                            if (this.f30478i > 0) {
                                String valueOf = String.valueOf(file.getAbsolutePath());
                                Log.e("FileDownloadTask", valueOf.length() != 0 ? "The file downloading to has been deleted:".concat(valueOf) : new String("The file downloading to has been deleted:"));
                                throw new IllegalStateException("expected a file to resume from.");
                            } else if (!file.createNewFile()) {
                                String valueOf2 = String.valueOf(file.getAbsolutePath());
                                Log.w("FileDownloadTask", valueOf2.length() != 0 ? "unable to create file:".concat(valueOf2) : new String("unable to create file:"));
                            }
                        }
                        if (this.f30478i > 0) {
                            String valueOf3 = String.valueOf(file.getAbsolutePath());
                            Log.d("FileDownloadTask", valueOf3.length() != 0 ? "Resuming download file ".concat(valueOf3) : new String("Resuming download file "));
                            fileOutputStream = new FileOutputStream(file, true);
                        } else {
                            fileOutputStream = new FileOutputStream(file);
                        }
                        byte[] bArr = new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START];
                        do {
                            int read = m14434c.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            this.f30472c += read;
                        } while (a(4, false));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        m14434c.close();
                    } catch (Exception e) {
                        Log.e("FileDownloadTask", "Exception occurred during file download", e);
                        this.f30477h = e;
                    }
                } else {
                    this.f30477h = new IllegalStateException("Unable to open Firebase Storage stream.");
                }
            }
            m14450a.m14436b();
            if (z && this.f30477h == null && v() == 4) {
                a(128, false);
                return;
            }
            File file2 = new File(this.f30471b.getPath());
            if (file2.exists()) {
                this.f30478i = file2.length();
            } else {
                this.f30478i = 0L;
            }
            if (v() == 8) {
                a(16, false);
                return;
            }
            if (a(v() == 32 ? 256 : 64, false)) {
                return;
            }
            Log.w("FileDownloadTask", new StringBuilder(62).append("Unable to change download task to final state from ").append(v()).toString());
        } catch (RemoteException e2) {
            Log.e("FileDownloadTask", "Unable to create firebase storage network request.", e2);
            this.f30477h = e2;
            a(64, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: p */
    public void mo6945p() {
        this.f30474e.m14495a();
    }
}
