package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.C4692o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.google.android.gms.internal.dn */
/* loaded from: classes2.dex */
public class C6852dn {

    /* renamed from: a */
    private final Context f23051a;

    /* renamed from: b */
    private final AbstractC6857a f23052b;

    /* renamed from: c */
    private final ExecutorService f23053c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.dn$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6857a {
        /* renamed from: a */
        InputStream mo16107a(String str);
    }

    public C6852dn(final Context context) {
        this(context, Executors.newSingleThreadExecutor(), new AbstractC6857a() { // from class: com.google.android.gms.internal.dn.1
            @Override // com.google.android.gms.internal.C6852dn.AbstractC6857a
            /* renamed from: a */
            public InputStream mo16107a(String str) {
                return context.getAssets().open(str);
            }
        });
    }

    C6852dn(Context context, ExecutorService executorService, AbstractC6857a abstractC6857a) {
        this.f23051a = context;
        this.f23053c = executorService;
        this.f23052b = abstractC6857a;
    }

    /* renamed from: a */
    private byte[] m16117a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                C4692o.m23122a(inputStream, byteArrayOutputStream);
            } catch (IOException e) {
                aph.m16394b("Failed to read the resource from disk");
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    aph.m16394b("Error closing stream for reading resource from disk");
                    return null;
                }
            }
            try {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e3) {
                aph.m16394b("Error closing stream for reading resource from disk");
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException e4) {
                aph.m16394b("Error closing stream for reading resource from disk");
                return null;
            }
        }
    }

    /* renamed from: c */
    private String m16108c(String str) {
        String valueOf = String.valueOf("resource_");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public long m16116a(String str) {
        File m16112b = m16112b(str);
        if (m16112b.exists()) {
            return m16112b.lastModified();
        }
        return 0L;
    }

    /* renamed from: a */
    public void m16115a(final String str, final AbstractC6840dh abstractC6840dh) {
        this.f23053c.execute(new Runnable() { // from class: com.google.android.gms.internal.dn.2
            @Override // java.lang.Runnable
            public void run() {
                C6852dn.this.m16111b(str, abstractC6840dh);
            }
        });
    }

    /* renamed from: a */
    public void m16114a(final String str, final String str2, final AbstractC6840dh abstractC6840dh) {
        this.f23053c.execute(new Runnable() { // from class: com.google.android.gms.internal.dn.3
            @Override // java.lang.Runnable
            public void run() {
                C6852dn.this.m16110b(str, str2, abstractC6840dh);
            }
        });
    }

    /* renamed from: a */
    public void m16113a(final String str, final byte[] bArr) {
        this.f23053c.execute(new Runnable() { // from class: com.google.android.gms.internal.dn.4
            @Override // java.lang.Runnable
            public void run() {
                C6852dn.this.m16109b(str, bArr);
            }
        });
    }

    /* renamed from: b */
    File m16112b(String str) {
        return new File(this.f23051a.getDir("google_tagmanager", 0), m16108c(str));
    }

    /* renamed from: b */
    void m16111b(String str, AbstractC6840dh abstractC6840dh) {
        aph.m16391d("Starting to load a saved resource file from Disk.");
        try {
            FileInputStream fileInputStream = new FileInputStream(m16112b(str));
            if (fileInputStream != null) {
                abstractC6840dh.m16145a(m16117a(fileInputStream));
            } else {
                abstractC6840dh.m16146a(0, 1);
            }
        } catch (FileNotFoundException e) {
            String valueOf = String.valueOf(m16108c(str));
            aph.m16396a(valueOf.length() != 0 ? "Saved resource not found: ".concat(valueOf) : new String("Saved resource not found: "));
            abstractC6840dh.m16146a(0, 1);
        }
    }

    /* renamed from: b */
    void m16110b(String str, String str2, AbstractC6840dh abstractC6840dh) {
        aph.m16391d("Starting to load a default asset file from Disk.");
        if (str2 == null) {
            aph.m16391d("Default asset file is not specified. Not proceeding with the loading");
            abstractC6840dh.m16146a(0, 2);
            return;
        }
        try {
            InputStream mo16107a = this.f23052b.mo16107a(str2);
            if (mo16107a != null) {
                abstractC6840dh.m16145a(m16117a(mo16107a));
            } else {
                abstractC6840dh.m16146a(0, 2);
            }
        } catch (IOException e) {
            aph.m16396a(new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(str2).length()).append("Default asset file not found. ").append(str).append(". Filename: ").append(str2).toString());
            abstractC6840dh.m16146a(0, 2);
        }
    }

    /* renamed from: b */
    void m16109b(String str, byte[] bArr) {
        File m16112b = m16112b(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m16112b);
            try {
                try {
                    fileOutputStream.write(bArr);
                } catch (IOException e) {
                    aph.m16396a("Error writing resource to disk. Removing resource from disk");
                    m16112b.delete();
                    try {
                        fileOutputStream.close();
                        aph.m16391d(new StringBuilder(String.valueOf(str).length() + 24).append("Resource ").append(str).append(" saved on Disk.").toString());
                    } catch (IOException e2) {
                        aph.m16396a("Error closing stream for writing resource to disk");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                    aph.m16391d(new StringBuilder(String.valueOf(str).length() + 24).append("Resource ").append(str).append(" saved on Disk.").toString());
                } catch (IOException e3) {
                    aph.m16396a("Error closing stream for writing resource to disk");
                }
            }
        } catch (FileNotFoundException e4) {
            aph.m16396a("Error opening resource file for writing");
        }
    }
}
