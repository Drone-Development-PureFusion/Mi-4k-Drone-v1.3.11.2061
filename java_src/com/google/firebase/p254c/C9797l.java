package com.google.firebase.p254c;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.tts.loopj.RequestParams;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7434nb;
import com.google.android.gms.internal.C7439ng;
import com.google.android.gms.internal.C7446nj;
import com.google.android.gms.internal.C7447nk;
import com.google.firebase.p254c.C9776h;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.firebase.c.l */
/* loaded from: classes2.dex */
public class C9797l extends AbstractC9785j<C9799a> {

    /* renamed from: b */
    private final C9779i f30569b;

    /* renamed from: c */
    private final Uri f30570c;

    /* renamed from: d */
    private final byte[] f30571d;

    /* renamed from: e */
    private final byte[] f30572e;

    /* renamed from: f */
    private final long f30573f;

    /* renamed from: g */
    private final AtomicLong f30574g;

    /* renamed from: h */
    private C7434nb f30575h;

    /* renamed from: i */
    private InputStream f30576i;

    /* renamed from: j */
    private volatile C9776h f30577j;

    /* renamed from: k */
    private volatile Uri f30578k;

    /* renamed from: l */
    private volatile Exception f30579l;

    /* renamed from: m */
    private volatile Exception f30580m;

    /* renamed from: n */
    private volatile int f30581n;

    /* renamed from: o */
    private volatile String f30582o;

    /* renamed from: com.google.firebase.c.l$a */
    /* loaded from: classes2.dex */
    public class C9799a extends AbstractC9785j<C9799a>.C9792b {

        /* renamed from: c */
        private final long f30586c;

        /* renamed from: d */
        private final Uri f30587d;

        /* renamed from: e */
        private final C9776h f30588e;

        C9799a(Exception exc, long j, Uri uri, C9776h c9776h) {
            super(exc);
            this.f30586c = j;
            this.f30587d = uri;
            this.f30588e = c9776h;
        }

        /* renamed from: a */
        public long m6942a() {
            return this.f30586c;
        }

        /* renamed from: b */
        public long m6941b() {
            return C9797l.this.m6950k();
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
        public /* bridge */ /* synthetic */ AbstractC9785j<C9799a> mo6938e() {
            return super.mo6938e();
        }

        @Nullable
        /* renamed from: f */
        public Uri m6937f() {
            return this.f30587d;
        }

        @Nullable
        /* renamed from: g */
        public C9776h m6936g() {
            return this.f30588e;
        }

        @Nullable
        /* renamed from: h */
        public Uri m6935h() {
            C9776h m6936g = m6936g();
            if (m6936g != null) {
                return m6936g.m7082l();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9797l(C9779i c9779i, C9776h c9776h, Uri uri, Uri uri2) {
        FileNotFoundException fileNotFoundException;
        InputStream inputStream;
        InputStream inputStream2;
        long j;
        long j2;
        InputStream bufferedInputStream;
        long j3;
        long j4 = -1;
        this.f30572e = new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START];
        this.f30574g = new AtomicLong(0L);
        this.f30578k = null;
        this.f30579l = null;
        this.f30580m = null;
        this.f30581n = 0;
        C4588d.m23627a(c9779i);
        C4588d.m23627a(uri);
        this.f30571d = null;
        this.f30569b = c9779i;
        this.f30577j = c9776h;
        this.f30570c = uri;
        this.f30575h = new C7434nb(this.f30569b.m7045g(), this.f30569b.m7046f().m7128c());
        try {
            ContentResolver contentResolver = this.f30569b.m7046f().m7124f().m7224a().getContentResolver();
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(this.f30570c, "r");
                if (openFileDescriptor != null) {
                    j3 = openFileDescriptor.getStatSize();
                    try {
                        openFileDescriptor.close();
                    } catch (FileNotFoundException e) {
                        fileNotFoundException = e;
                        j4 = j3;
                        inputStream = null;
                        String valueOf = String.valueOf(this.f30570c.toString());
                        Log.e("UploadTask", valueOf.length() != 0 ? "could not locate file for uploading:".concat(valueOf) : new String("could not locate file for uploading:"));
                        this.f30579l = fileNotFoundException;
                        long j5 = j4;
                        inputStream2 = inputStream;
                        j = j5;
                        this.f30573f = j;
                        this.f30576i = inputStream2;
                        this.f30578k = uri2;
                    } catch (IOException e2) {
                        j4 = j3;
                        String valueOf2 = String.valueOf(this.f30570c.toString());
                        Log.w("UploadTask", valueOf2.length() != 0 ? "could not retrieve file size for upload ".concat(valueOf2) : new String("could not retrieve file size for upload "));
                        inputStream = contentResolver.openInputStream(this.f30570c);
                        if (inputStream != null) {
                        }
                        long j6 = j4;
                        inputStream2 = bufferedInputStream;
                        j = j6;
                        this.f30573f = j;
                        this.f30576i = inputStream2;
                        this.f30578k = uri2;
                    } catch (NullPointerException e3) {
                        j2 = j3;
                        e = e3;
                        try {
                            Log.w("UploadTask", "NullPointerException during file size calculation.", e);
                            inputStream = contentResolver.openInputStream(this.f30570c);
                            if (inputStream != null) {
                            }
                            long j62 = j4;
                            inputStream2 = bufferedInputStream;
                            j = j62;
                        } catch (FileNotFoundException e4) {
                            j4 = j2;
                            inputStream = null;
                            fileNotFoundException = e4;
                            String valueOf3 = String.valueOf(this.f30570c.toString());
                            Log.e("UploadTask", valueOf3.length() != 0 ? "could not locate file for uploading:".concat(valueOf3) : new String("could not locate file for uploading:"));
                            this.f30579l = fileNotFoundException;
                            long j52 = j4;
                            inputStream2 = inputStream;
                            j = j52;
                            this.f30573f = j;
                            this.f30576i = inputStream2;
                            this.f30578k = uri2;
                        }
                        this.f30573f = j;
                        this.f30576i = inputStream2;
                        this.f30578k = uri2;
                    }
                } else {
                    j3 = -1;
                }
                j4 = j3;
            } catch (IOException e5) {
            } catch (NullPointerException e6) {
                e = e6;
                j2 = -1;
            }
            inputStream = contentResolver.openInputStream(this.f30570c);
            if (inputStream != null) {
                try {
                    bufferedInputStream = new BufferedInputStream(inputStream);
                } catch (FileNotFoundException e7) {
                    fileNotFoundException = e7;
                    String valueOf32 = String.valueOf(this.f30570c.toString());
                    Log.e("UploadTask", valueOf32.length() != 0 ? "could not locate file for uploading:".concat(valueOf32) : new String("could not locate file for uploading:"));
                    this.f30579l = fileNotFoundException;
                    long j522 = j4;
                    inputStream2 = inputStream;
                    j = j522;
                    this.f30573f = j;
                    this.f30576i = inputStream2;
                    this.f30578k = uri2;
                }
            } else {
                bufferedInputStream = inputStream;
            }
            long j622 = j4;
            inputStream2 = bufferedInputStream;
            j = j622;
        } catch (FileNotFoundException e8) {
            fileNotFoundException = e8;
            inputStream = null;
        }
        this.f30573f = j;
        this.f30576i = inputStream2;
        this.f30578k = uri2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9797l(C9779i c9779i, C9776h c9776h, InputStream inputStream) {
        this.f30572e = new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START];
        this.f30574g = new AtomicLong(0L);
        this.f30578k = null;
        this.f30579l = null;
        this.f30580m = null;
        this.f30581n = 0;
        C4588d.m23627a(c9779i);
        C4588d.m23627a(inputStream);
        this.f30573f = -1L;
        this.f30571d = null;
        this.f30569b = c9779i;
        this.f30577j = c9776h;
        this.f30576i = new BufferedInputStream(inputStream, AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        this.f30570c = null;
        this.f30575h = new C7434nb(this.f30569b.m7045g(), this.f30569b.m7046f().m7128c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9797l(C9779i c9779i, C9776h c9776h, byte[] bArr) {
        this.f30572e = new byte[AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START];
        this.f30574g = new AtomicLong(0L);
        this.f30578k = null;
        this.f30579l = null;
        this.f30580m = null;
        this.f30581n = 0;
        C4588d.m23627a(c9779i);
        C4588d.m23627a(bArr);
        this.f30571d = bArr;
        this.f30573f = this.f30571d.length;
        this.f30569b = c9779i;
        this.f30577j = c9776h;
        this.f30570c = null;
        this.f30576i = new BufferedInputStream(new ByteArrayInputStream(this.f30571d), AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        this.f30575h = new C7434nb(this.f30569b.m7045g(), this.f30569b.m7046f().m7128c());
    }

    /* renamed from: E */
    private void m6960E() {
        JSONObject jSONObject = null;
        String m7110a = this.f30577j != null ? this.f30577j.m7110a() : null;
        if (this.f30570c != null && TextUtils.isEmpty(m7110a)) {
            m7110a = this.f30569b.m7046f().m7124f().m7224a().getContentResolver().getType(this.f30570c);
        }
        if (TextUtils.isEmpty(m7110a)) {
            m7110a = RequestParams.APPLICATION_OCTET_STREAM;
        }
        try {
            C7446nj m7044h = this.f30569b.m7044h();
            Uri m7037o = this.f30569b.m7037o();
            if (this.f30577j != null) {
                jSONObject = this.f30577j.m7073s();
            }
            C7447nk m14446a = m7044h.m14446a(m7037o, jSONObject, m7110a);
            if (!m6952b(m14446a)) {
                return;
            }
            String m14438a = m14446a.m14438a("X-Goog-Upload-URL");
            if (TextUtils.isEmpty(m14438a)) {
                return;
            }
            this.f30578k = Uri.parse(m14438a);
        } catch (RemoteException | JSONException e) {
            Log.e("UploadTask", "Unable to create a network request from metadata", e);
            this.f30579l = e;
        }
    }

    /* renamed from: F */
    private boolean m6959F() {
        if (v() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f30579l = new InterruptedException();
            a(64, false);
            return false;
        } else if (v() == 32) {
            a(256, false);
            return false;
        } else if (v() == 8) {
            a(16, false);
            return false;
        } else if (!m6958G()) {
            return false;
        } else {
            if (this.f30578k == null) {
                if (this.f30579l == null) {
                    this.f30579l = new IllegalStateException("Unable to obtain an upload URL.");
                }
                a(64, false);
                return false;
            } else if (this.f30579l != null) {
                a(64, false);
                return false;
            } else {
                if (!(this.f30580m != null || this.f30581n < 200 || this.f30581n >= 300) || m6953a(true)) {
                    return true;
                }
                if (!m6958G()) {
                    return false;
                }
                a(64, false);
                return false;
            }
        }
    }

    /* renamed from: G */
    private boolean m6958G() {
        if ("final".equals(this.f30582o)) {
            if (this.f30579l == null) {
                this.f30579l = new IOException("The server has terminated the upload session");
            }
            a(64, false);
            return false;
        }
        return true;
    }

    /* renamed from: H */
    private void m6957H() {
        this.f30576i.mark(this.f30572e.length + 1);
        try {
            int read = this.f30576i.read(this.f30572e);
            try {
                C7447nk m14448a = this.f30569b.m7044h().m14448a(this.f30569b.m7037o(), this.f30578k.toString(), this.f30572e, this.f30574g.get(), read, ((long) read) != 262144);
                if (!m6955a(m14448a)) {
                    try {
                        this.f30576i.reset();
                        return;
                    } catch (IOException e) {
                        Log.w("UploadTask", "Unable to reset the stream for error recovery.", e);
                        this.f30579l = e;
                        return;
                    }
                }
                if (read != -1) {
                    this.f30574g.getAndAdd(read);
                }
                if (read == 262144) {
                    return;
                }
                try {
                    this.f30577j = new C9776h.C9778a(m14448a.m14433d(), this.f30569b).m7072a();
                    a(4, false);
                    a(128, false);
                } catch (RemoteException | JSONException e2) {
                    String valueOf = String.valueOf(m14448a.m14432e());
                    Log.e("UploadTask", valueOf.length() != 0 ? "Unable to parse resulting metadata from upload:".concat(valueOf) : new String("Unable to parse resulting metadata from upload:"), e2);
                    this.f30579l = e2;
                }
            } catch (RemoteException e3) {
                Log.e("UploadTask", "Unable to create chunk upload request", e3);
                this.f30579l = e3;
            }
        } catch (IOException e4) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e4);
            this.f30579l = e4;
        }
    }

    /* renamed from: a */
    private boolean m6956a(int i) {
        return i == 308 || (i >= 200 && i < 300);
    }

    /* renamed from: a */
    private boolean m6955a(C7447nk c7447nk) {
        c7447nk.m14437a(C7439ng.m14485a(this.f30569b.m7045g()), this.f30569b.m7045g().m7224a());
        return m6951c(c7447nk);
    }

    /* renamed from: a */
    private boolean m6953a(boolean z) {
        boolean z2;
        try {
            C7447nk m14443b = this.f30569b.m7044h().m14443b(this.f30569b.m7037o(), this.f30578k.toString());
            if ("final".equals(this.f30582o)) {
                return false;
            }
            if (z) {
                if (!m6952b(m14443b)) {
                    return false;
                }
            } else if (!m6955a(m14443b)) {
                return false;
            }
            if ("final".equals(m14443b.m14438a("X-Goog-Upload-Status"))) {
                this.f30579l = new IOException("The server has terminated the upload session");
                return false;
            }
            String m14438a = m14443b.m14438a("X-Goog-Upload-Size-Received");
            long parseLong = !TextUtils.isEmpty(m14438a) ? Long.parseLong(m14438a) : 0L;
            long j = this.f30574g.get();
            if (j > parseLong) {
                this.f30579l = new IOException("Unexpected error. The server lost a chunk update.");
                return false;
            }
            if (j < parseLong) {
                try {
                    if (this.f30576i.skip(parseLong - j) != parseLong - j) {
                        this.f30579l = new IOException("Unexpected end of stream encountered.");
                        z2 = false;
                    } else if (!this.f30574g.compareAndSet(j, parseLong)) {
                        Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                        this.f30579l = new IllegalStateException("uploaded bytes changed unexpectedly.");
                        z2 = false;
                    }
                    return z2;
                } catch (IOException e) {
                    Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
                    this.f30579l = e;
                    return false;
                }
            }
            z2 = true;
            return z2;
        } catch (RemoteException e2) {
            Log.e("UploadTask", "Unable to recover status during resumable upload", e2);
            this.f30579l = e2;
            return false;
        }
    }

    /* renamed from: b */
    private boolean m6952b(C7447nk c7447nk) {
        this.f30575h.m14493a(c7447nk);
        return m6951c(c7447nk);
    }

    /* renamed from: c */
    private boolean m6951c(C7447nk c7447nk) {
        int m14430g = c7447nk.m14430g();
        if (this.f30575h.m14494a(m14430g)) {
            m14430g = -2;
        }
        this.f30581n = m14430g;
        this.f30580m = c7447nk.m14431f();
        this.f30582o = c7447nk.m14438a("X-Goog-Upload-Status");
        return m6956a(this.f30581n) && this.f30580m == null;
    }

    /* renamed from: k */
    long m6950k() {
        return this.f30573f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: l */
    public C9779i mo6949l() {
        return this.f30569b;
    }

    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: m */
    protected void mo6948m() {
        C9803p.m6929a().m6927b(D());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.p254c.AbstractC9785j
    @NonNull
    /* renamed from: n */
    public C9799a mo6944q() {
        return new C9799a(C9774g.m7116a(this.f30579l != null ? this.f30579l : this.f30580m, this.f30581n), this.f30574g.get(), this.f30578k, this.f30577j);
    }

    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: o */
    void mo6946o() {
        this.f30575h.m14491b();
        if (this.f30569b.m7064a() == null) {
            this.f30579l = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.f30579l != null) {
            a(64, false);
            return;
        }
        if (this.f30578k == null) {
            m6960E();
        } else {
            m6953a(false);
        }
        while (m6959F()) {
            a(4, false);
            m6957H();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: p */
    public void mo6945p() {
        final C7447nk c7447nk;
        this.f30575h.m14495a();
        try {
            c7447nk = this.f30569b.m7044h().m14449a(this.f30569b.m7037o(), this.f30578k.toString());
        } catch (RemoteException e) {
            Log.e("UploadTask", "Unable to create chunk upload request", e);
            c7447nk = null;
        }
        if (c7447nk != null) {
            C9803p.m6929a().m6928a(new Runnable() { // from class: com.google.firebase.c.l.1
                @Override // java.lang.Runnable
                public void run() {
                    c7447nk.m14437a(C7439ng.m14485a(C9797l.this.f30569b.m7045g()), C9797l.this.f30569b.m7045g().m7224a());
                }
            });
        }
        this.f30579l = C9774g.m7118a(Status.f16790e);
        super.mo6945p();
    }

    @Override // com.google.firebase.p254c.AbstractC9785j
    /* renamed from: s */
    protected void mo6943s() {
        this.f30579l = null;
        this.f30580m = null;
        this.f30581n = 0;
        this.f30582o = null;
    }
}
