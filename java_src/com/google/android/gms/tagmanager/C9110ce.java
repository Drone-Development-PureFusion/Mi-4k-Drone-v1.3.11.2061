package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.AbstractC6896el;
import com.google.android.gms.internal.AbstractC7030gi;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.C6899en;
import com.google.android.gms.internal.C7648rc;
import com.google.android.gms.tagmanager.AbstractC9063av;
import com.google.android.gms.tagmanager.C9092bs;
import com.google.android.gms.tagmanager.C9170dm;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.ce */
/* loaded from: classes2.dex */
public class C9110ce implements C9170dm.AbstractC9179f {

    /* renamed from: a */
    private final Context f28797a;

    /* renamed from: b */
    private final String f28798b;

    /* renamed from: c */
    private final ExecutorService f28799c = Executors.newSingleThreadExecutor();

    /* renamed from: d */
    private AbstractC9063av<AbstractC6896el.C6897a> f28800d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9110ce(Context context, String str) {
        this.f28797a = context;
        this.f28798b = str;
    }

    /* renamed from: a */
    private C6899en.C6903c m9233a(ByteArrayOutputStream byteArrayOutputStream) {
        try {
            return C9056ap.m9305a(byteArrayOutputStream.toString("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            C9065aw.m9296d("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
            return null;
        } catch (JSONException e2) {
            C9065aw.m9299b("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
            return null;
        }
    }

    /* renamed from: a */
    private C6899en.C6903c m9232a(byte[] bArr) {
        try {
            C6899en.C6903c m16012a = C6899en.m16012a(AbstractC7030gi.C7036f.m15734a(bArr));
            if (m16012a == null) {
                return m16012a;
            }
            C9065aw.m9295e("The container was successfully loaded from the resource (using binary file)");
            return m16012a;
        } catch (C6899en.C6907g e) {
            C9065aw.m9299b("The resource file is invalid. The container from the binary file is invalid");
            return null;
        } catch (C7648rc e2) {
            C9065aw.m9301a("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        }
    }

    /* renamed from: c */
    private void m9229c(AbstractC6896el.C6897a c6897a) {
        if (c6897a.f23265b == null && c6897a.f23266c == null) {
            throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
        }
    }

    @Override // com.google.android.gms.tagmanager.C9170dm.AbstractC9179f
    /* renamed from: a */
    public C6899en.C6903c mo9019a(int i) {
        try {
            InputStream openRawResource = this.f28797a.getResources().openRawResource(i);
            String valueOf = String.valueOf(this.f28797a.getResources().getResourceName(i));
            C9065aw.m9295e(new StringBuilder(String.valueOf(valueOf).length() + 66).append("Attempting to load a container from the resource ID ").append(i).append(" (").append(valueOf).append(")").toString());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C6899en.m16009a(openRawResource, byteArrayOutputStream);
                C6899en.C6903c m9233a = m9233a(byteArrayOutputStream);
                if (m9233a != null) {
                    C9065aw.m9295e("The container was successfully loaded from the resource (using JSON file format)");
                } else {
                    m9233a = m9232a(byteArrayOutputStream.toByteArray());
                }
                return m9233a;
            } catch (IOException e) {
                String valueOf2 = String.valueOf(this.f28797a.getResources().getResourceName(i));
                C9065aw.m9299b(new StringBuilder(String.valueOf(valueOf2).length() + 67).append("Error reading the default container with resource ID ").append(i).append(" (").append(valueOf2).append(")").toString());
                return null;
            }
        } catch (Resources.NotFoundException e2) {
            C9065aw.m9299b(new StringBuilder(98).append("Failed to load the container. No default container resource found with the resource ID ").append(i).toString());
            return null;
        }
    }

    @Override // com.google.android.gms.tagmanager.C9170dm.AbstractC9179f
    /* renamed from: a */
    public void mo9020a() {
        this.f28799c.execute(new Runnable() { // from class: com.google.android.gms.tagmanager.ce.1
            @Override // java.lang.Runnable
            public void run() {
                C9110ce.this.m9230c();
            }
        });
    }

    @Override // com.google.android.gms.tagmanager.C9170dm.AbstractC9179f
    /* renamed from: a */
    public void mo9018a(final AbstractC6896el.C6897a c6897a) {
        this.f28799c.execute(new Runnable() { // from class: com.google.android.gms.tagmanager.ce.2
            @Override // java.lang.Runnable
            public void run() {
                C9110ce.this.m9231b(c6897a);
            }
        });
    }

    @Override // com.google.android.gms.tagmanager.C9170dm.AbstractC9179f
    /* renamed from: a */
    public void mo9017a(AbstractC9063av<AbstractC6896el.C6897a> abstractC9063av) {
        this.f28800d = abstractC9063av;
    }

    @Override // com.google.android.gms.common.api.AbstractC4500k
    /* renamed from: b */
    public synchronized void mo7804b() {
        this.f28799c.shutdown();
    }

    /* renamed from: b */
    boolean m9231b(AbstractC6896el.C6897a c6897a) {
        File m9228d = m9228d();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m9228d);
            try {
                try {
                    fileOutputStream.write(AbstractC7649rd.m13857a(c6897a));
                    return true;
                } catch (IOException e) {
                    C9065aw.m9299b("Error writing resource to disk. Removing resource from disk.");
                    m9228d.delete();
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e2) {
                        C9065aw.m9299b("error closing stream for writing resource to disk");
                        return false;
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    C9065aw.m9299b("error closing stream for writing resource to disk");
                }
            }
        } catch (FileNotFoundException e4) {
            C9065aw.m9301a("Error opening resource file for writing");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r0 == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m9230c() {
        FileInputStream fileInputStream;
        if (this.f28800d == null) {
            throw new IllegalStateException("Callback must be set before execute");
        }
        this.f28800d.mo9030a();
        C9065aw.m9295e("Attempting to load resource from disk");
        if (C9092bs.m9265a().m9262b() != C9092bs.EnumC9093a.CONTAINER) {
            C9092bs.EnumC9093a m9262b = C9092bs.m9265a().m9262b();
            C9092bs.EnumC9093a enumC9093a = C9092bs.EnumC9093a.CONTAINER_DEBUG;
            fileInputStream = enumC9093a;
        }
        String str = this.f28798b;
        String m9259d = C9092bs.m9265a().m9259d();
        boolean equals = str.equals(m9259d);
        fileInputStream = m9259d;
        if (equals) {
            this.f28800d.mo9028a(AbstractC9063av.EnumC9064a.NOT_AVAILABLE);
            return;
        }
        try {
            try {
                fileInputStream = new FileInputStream(m9228d());
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C6899en.m16009a(fileInputStream, byteArrayOutputStream);
                    AbstractC6896el.C6897a m16017a = AbstractC6896el.C6897a.m16017a(byteArrayOutputStream.toByteArray());
                    m9229c(m16017a);
                    this.f28800d.mo9027a((AbstractC9063av<AbstractC6896el.C6897a>) m16017a);
                } catch (IOException e) {
                    this.f28800d.mo9028a(AbstractC9063av.EnumC9064a.IO_ERROR);
                    C9065aw.m9299b("Failed to read the resource from disk");
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        C9065aw.m9299b("Error closing stream for reading resource from disk");
                    }
                } catch (IllegalArgumentException e3) {
                    this.f28800d.mo9028a(AbstractC9063av.EnumC9064a.IO_ERROR);
                    C9065aw.m9299b("Failed to read the resource from disk. The resource is inconsistent");
                    try {
                        fileInputStream.close();
                    } catch (IOException e4) {
                        C9065aw.m9299b("Error closing stream for reading resource from disk");
                    }
                }
                C9065aw.m9295e("The Disk resource was successfully read.");
            } catch (FileNotFoundException e5) {
                C9065aw.m9296d("Failed to find the resource in the disk");
                this.f28800d.mo9028a(AbstractC9063av.EnumC9064a.NOT_AVAILABLE);
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e6) {
                C9065aw.m9299b("Error closing stream for reading resource from disk");
            }
        }
    }

    /* renamed from: d */
    File m9228d() {
        String valueOf = String.valueOf("resource_");
        String valueOf2 = String.valueOf(this.f28798b);
        return new File(this.f28797a.getDir("google_tagmanager", 0), valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }
}
