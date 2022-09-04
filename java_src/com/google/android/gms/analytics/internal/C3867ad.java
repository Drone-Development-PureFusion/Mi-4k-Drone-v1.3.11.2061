package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C4588d;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* renamed from: com.google.android.gms.analytics.internal.ad */
/* loaded from: classes2.dex */
public class C3867ad extends AbstractC3920t {

    /* renamed from: a */
    private volatile String f14997a;

    /* renamed from: b */
    private Future<String> f14998b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3867ad(C3922v c3922v) {
        super(c3922v);
    }

    /* renamed from: a */
    private boolean m26402a(Context context, String str) {
        C4588d.m23625a(str);
        C4588d.m23616c("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    a("Storing clientId", str);
                    fileOutputStream = context.openFileOutput("gaClientId", 0);
                    fileOutputStream.write(str.getBytes());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e) {
                            e("Failed to close clientId writing stream", e);
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            e("Failed to close clientId writing stream", e2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e("Error writing to clientId file", e3);
                if (fileOutputStream == null) {
                    return false;
                }
                try {
                    fileOutputStream.close();
                    return false;
                } catch (IOException e4) {
                    e("Failed to close clientId writing stream", e4);
                    return false;
                }
            }
        } catch (FileNotFoundException e5) {
            e("Error creating clientId file", e5);
            if (fileOutputStream == null) {
                return false;
            }
            try {
                fileOutputStream.close();
                return false;
            } catch (IOException e6) {
                e("Failed to close clientId writing stream", e6);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public String m26396f() {
        String m26397e = m26397e();
        try {
            return !m26402a(r().m25963c(), m26397e) ? "0" : m26397e;
        } catch (Exception e) {
            e("Error saving clientId file", e);
            return "0";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x008c -> B:10:0x002f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x008e -> B:10:0x002f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0093 -> B:10:0x002f). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected String m26403a(Context context) {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2;
        FileInputStream openFileInput;
        String str = null;
        C4588d.m23616c("ClientId should be loaded from worker thread");
        try {
            try {
                openFileInput = context.openFileInput("gaClientId");
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e("Failed to close client id reading stream", e);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e2) {
            fileInputStream2 = null;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e3) {
                    e("Failed to close client id reading stream", e3);
                }
            }
            return str;
        } catch (IOException e4) {
            e = e4;
            fileInputStream = null;
            e("Error reading client id file, deleting it", e);
            context.deleteFile("gaClientId");
            fileInputStream = fileInputStream;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                    fileInputStream = fileInputStream;
                } catch (IOException e5) {
                    String str2 = "Failed to close client id reading stream";
                    e(str2, e5);
                    fileInputStream = str2;
                }
            }
            return str;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            if (fileInputStream != null) {
            }
            throw th;
        }
        try {
            byte[] bArr = new byte[36];
            int read = openFileInput.read(bArr, 0, 36);
            if (openFileInput.available() > 0) {
                t("clientId file seems corrupted, deleting it.");
                openFileInput.close();
                context.deleteFile("gaClientId");
                fileInputStream = openFileInput;
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                        fileInputStream = openFileInput;
                    } catch (IOException e6) {
                        String str3 = "Failed to close client id reading stream";
                        e(str3, e6);
                        fileInputStream = str3;
                    }
                }
            } else if (read < 14) {
                t("clientId file is empty, deleting it.");
                openFileInput.close();
                context.deleteFile("gaClientId");
                fileInputStream = openFileInput;
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                        fileInputStream = openFileInput;
                    } catch (IOException e7) {
                        String str4 = "Failed to close client id reading stream";
                        e(str4, e7);
                        fileInputStream = str4;
                    }
                }
            } else {
                openFileInput.close();
                String str5 = new String(bArr, 0, read);
                a("Read client id from disk", str5);
                FileInputStream fileInputStream3 = openFileInput;
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                        fileInputStream3 = openFileInput;
                    } catch (IOException e8) {
                        String str6 = "Failed to close client id reading stream";
                        e(str6, e8);
                        fileInputStream3 = str6;
                    }
                }
                str = str5;
                fileInputStream = fileInputStream3;
            }
        } catch (FileNotFoundException e9) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
            }
            return str;
        } catch (IOException e10) {
            e = e10;
            e("Error reading client id file, deleting it", e);
            context.deleteFile("gaClientId");
            fileInputStream = fileInputStream;
            if (fileInputStream != null) {
            }
            return str;
        }
        return str;
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
    }

    /* renamed from: b */
    public String m26400b() {
        String str;
        D();
        synchronized (this) {
            if (this.f14997a == null) {
                this.f14998b = r().m25967a(new Callable<String>() { // from class: com.google.android.gms.analytics.internal.ad.1
                    @Override // java.util.concurrent.Callable
                    /* renamed from: a */
                    public String call() {
                        return C3867ad.this.m26398d();
                    }
                });
            }
            if (this.f14998b != null) {
                try {
                    this.f14997a = this.f14998b.get();
                } catch (InterruptedException e) {
                    d("ClientId loading or generation was interrupted", e);
                    this.f14997a = "0";
                } catch (ExecutionException e2) {
                    e("Failed to load or generate client id", e2);
                    this.f14997a = "0";
                }
                if (this.f14997a == null) {
                    this.f14997a = "0";
                }
                a("Loaded clientId", this.f14997a);
                this.f14998b = null;
            }
            str = this.f14997a;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m26399c() {
        synchronized (this) {
            this.f14997a = null;
            this.f14998b = r().m25967a(new Callable<String>() { // from class: com.google.android.gms.analytics.internal.ad.2
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public String call() {
                    return C3867ad.this.m26396f();
                }
            });
        }
        return m26400b();
    }

    /* renamed from: d */
    String m26398d() {
        String m26403a = m26403a(r().m25963c());
        return m26403a == null ? m26396f() : m26403a;
    }

    /* renamed from: e */
    protected String m26397e() {
        return UUID.randomUUID().toString().toLowerCase();
    }
}
