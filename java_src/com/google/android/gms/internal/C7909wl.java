package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.util.AbstractC4682e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@aaa
/* renamed from: com.google.android.gms.internal.wl */
/* loaded from: classes.dex */
public class C7909wl extends AbstractC7903wi {

    /* renamed from: d */
    private static final Set<String> f26063d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e */
    private static final DecimalFormat f26064e = new DecimalFormat("#,###");

    /* renamed from: f */
    private File f26065f;

    /* renamed from: g */
    private boolean f26066g;

    public C7909wl(acy acyVar) {
        super(acyVar);
        File cacheDir = this.f26045a.getCacheDir();
        if (cacheDir == null) {
            abr.d("Context.getCacheDir() returned null");
            return;
        }
        this.f26065f = new File(cacheDir, "admobVideoStreams");
        if (!this.f26065f.isDirectory() && !this.f26065f.mkdirs()) {
            String valueOf = String.valueOf(this.f26065f.getAbsolutePath());
            abr.d(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.f26065f = null;
        } else if (this.f26065f.setReadable(true, false) && this.f26065f.setExecutable(true, false)) {
        } else {
            String valueOf2 = String.valueOf(this.f26065f.getAbsolutePath());
            abr.d(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.f26065f = null;
        }
    }

    /* renamed from: a */
    private File m13255a(File file) {
        return new File(this.f26065f, String.valueOf(file.getName()).concat(".done"));
    }

    /* renamed from: b */
    private static void m13253b(File file) {
        if (file.isFile()) {
            file.setLastModified(System.currentTimeMillis());
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7903wi
    /* renamed from: a */
    public void mo13256a() {
        this.f26066g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x03b8, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03c0, code lost:
        if (com.google.android.gms.internal.abr.a(3) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03c2, code lost:
        r2 = com.google.android.gms.internal.C7909wl.f26064e.format(r5);
        com.google.android.gms.internal.abr.a(new java.lang.StringBuilder((java.lang.String.valueOf(r2).length() + 22) + java.lang.String.valueOf(r27).length()).append("Preloaded ").append(r2).append(" bytes from ").append(r27).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03fe, code lost:
        r12.setReadable(true, false);
        m13253b(r13);
        a(r27, r12.getAbsolutePath(), r5);
        com.google.android.gms.internal.C7909wl.f26063d.remove(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0416, code lost:
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.String] */
    @Override // com.google.android.gms.internal.AbstractC7903wi
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo13254a(String str) {
        String str2;
        String str3;
        int responseCode;
        if (this.f26065f == null) {
            a(str, null, "noCacheDir", null);
            return false;
        }
        while (m13252c() > C7788uf.f25900r.m13486c().intValue()) {
            if (!m13251d()) {
                abr.d("Unable to expire stream cache");
                a(str, null, "expireFailed", null);
                return false;
            }
        }
        File file = new File(this.f26065f, b(str));
        File m13255a = m13255a(file);
        if (file.isFile() && m13255a.isFile()) {
            int length = (int) file.length();
            String valueOf = String.valueOf(str);
            abr.a(valueOf.length() != 0 ? "Stream cache hit at ".concat(valueOf) : new String("Stream cache hit at "));
            a(str, file.getAbsolutePath(), length);
            return true;
        }
        String valueOf2 = String.valueOf(this.f26065f.getAbsolutePath());
        String valueOf3 = String.valueOf(str);
        String concat = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
        synchronized (f26063d) {
            if (f26063d.contains(concat)) {
                String valueOf4 = String.valueOf(str);
                abr.d(valueOf4.length() != 0 ? "Stream cache already in progress at ".concat(valueOf4) : new String("Stream cache already in progress at "));
                a(str, file.getAbsolutePath(), "inProgress", null);
                return false;
            }
            f26063d.add(concat);
            FileOutputStream fileOutputStream = null;
            try {
                str2 = C3779u.m26877r().m18197a(str, C7788uf.f25906x.m13486c().intValue());
                if (!(str2 instanceof HttpURLConnection) || (responseCode = str2.getResponseCode()) < 400) {
                    int contentLength = str2.getContentLength();
                    if (contentLength < 0) {
                        String valueOf5 = String.valueOf(str);
                        abr.d(valueOf5.length() != 0 ? "Stream cache aborted, missing content-length header at ".concat(valueOf5) : new String("Stream cache aborted, missing content-length header at "));
                        a(str, file.getAbsolutePath(), "contentLengthMissing", null);
                        f26063d.remove(concat);
                        return false;
                    }
                    String format = f26064e.format(contentLength);
                    int intValue = C7788uf.f25901s.m13486c().intValue();
                    if (contentLength > intValue) {
                        abr.d(new StringBuilder(String.valueOf(format).length() + 33 + String.valueOf(str).length()).append("Content length ").append(format).append(" exceeds limit at ").append(str).toString());
                        String valueOf6 = String.valueOf(format);
                        a(str, file.getAbsolutePath(), "sizeExceeded", valueOf6.length() != 0 ? "File too big for full file cache. Size: ".concat(valueOf6) : new String("File too big for full file cache. Size: "));
                        f26063d.remove(concat);
                        return false;
                    }
                    StringBuilder append = new StringBuilder(String.valueOf(format).length() + 20 + String.valueOf(str).length()).append("Caching ").append(format);
                    str3 = " bytes from ";
                    abr.a(append.append(str3).append(str).toString());
                    ReadableByteChannel newChannel = Channels.newChannel(str2.getInputStream());
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        FileChannel channel = fileOutputStream2.getChannel();
                        ByteBuffer allocate = ByteBuffer.allocate(1048576);
                        AbstractC4682e m26884k = C3779u.m26884k();
                        int i = 0;
                        long mo16434a = m26884k.mo16434a();
                        ach achVar = new ach(C7788uf.f25905w.m13486c().longValue());
                        long longValue = C7788uf.f25904v.m13486c().longValue();
                        while (true) {
                            int read = newChannel.read(allocate);
                            if (read < 0) {
                                break;
                            }
                            i += read;
                            try {
                                try {
                                    if (i > intValue) {
                                        String valueOf7 = String.valueOf(Integer.toString(i));
                                        if (valueOf7.length() != 0) {
                                            "File too big for full file cache. Size: ".concat(valueOf7);
                                        } else {
                                            new String("File too big for full file cache. Size: ");
                                        }
                                        throw new IOException("stream cache file size limit exceeded");
                                    }
                                    allocate.flip();
                                    do {
                                    } while (channel.write(allocate) > 0);
                                    allocate.clear();
                                    if (m26884k.mo16434a() - mo16434a > 1000 * longValue) {
                                        String valueOf8 = String.valueOf(Long.toString(longValue));
                                        new StringBuilder(String.valueOf(valueOf8).length() + 29).append("Timeout exceeded. Limit: ").append(valueOf8).append(" sec").toString();
                                        throw new IOException("stream cache time limit exceeded");
                                    } else if (this.f26066g) {
                                        throw new IOException("abort requested");
                                    } else {
                                        if (achVar.m18222a()) {
                                            str3 = file.getAbsolutePath();
                                            str2 = str;
                                            a(str2, str3, i, contentLength, false);
                                        }
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    str2 = null;
                                    fileOutputStream = fileOutputStream2;
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    str2 = null;
                                    fileOutputStream = fileOutputStream2;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                fileOutputStream = fileOutputStream2;
                            } catch (RuntimeException e4) {
                                e = e4;
                                fileOutputStream = fileOutputStream2;
                            }
                        }
                    } catch (IOException e5) {
                        e = e5;
                        str2 = null;
                        str3 = "error";
                        fileOutputStream = fileOutputStream2;
                    } catch (RuntimeException e6) {
                        e = e6;
                        str2 = null;
                        str3 = "error";
                        fileOutputStream = fileOutputStream2;
                    }
                } else {
                    str3 = "badUrl";
                    try {
                        String valueOf9 = String.valueOf(Integer.toString(responseCode));
                        str2 = valueOf9.length() != 0 ? "HTTP request failed. Code: ".concat(valueOf9) : new String("HTTP request failed. Code: ");
                        try {
                            throw new IOException(new StringBuilder(String.valueOf(str).length() + 32).append("HTTP status code ").append(responseCode).append(" at ").append(str).toString());
                        } catch (IOException e7) {
                            e = e7;
                        } catch (RuntimeException e8) {
                            e = e8;
                        }
                    } catch (IOException e9) {
                        e = e9;
                        str2 = null;
                    } catch (RuntimeException e10) {
                        e = e10;
                        str2 = null;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                str2 = null;
                str3 = "error";
            } catch (RuntimeException e12) {
                e = e12;
                str2 = null;
                str3 = "error";
            }
            if (e instanceof RuntimeException) {
                C3779u.m26886i().m18451a(e, "VideoStreamFullFileCache.preload");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e13) {
            } catch (NullPointerException e14) {
            }
            if (this.f26066g) {
                abr.c(new StringBuilder(String.valueOf(str).length() + 26).append("Preload aborted for URL \"").append(str).append("\"").toString());
            } else {
                abr.d(new StringBuilder(String.valueOf(str).length() + 25).append("Preload failed for URL \"").append(str).append("\"").toString(), e);
            }
            if (file.exists() && !file.delete()) {
                String valueOf10 = String.valueOf(file.getAbsolutePath());
                abr.d(valueOf10.length() != 0 ? "Could not delete partial cache file at ".concat(valueOf10) : new String("Could not delete partial cache file at "));
            }
            a(str, file.getAbsolutePath(), str3, str2);
            f26063d.remove(concat);
            return false;
        }
    }

    /* renamed from: c */
    public int m13252c() {
        int i = 0;
        if (this.f26065f != null) {
            for (File file : this.f26065f.listFiles()) {
                if (!file.getName().endsWith(".done")) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: d */
    public boolean m13251d() {
        boolean z;
        long j;
        File file;
        if (this.f26065f == null) {
            return false;
        }
        File file2 = null;
        long j2 = Long.MAX_VALUE;
        File[] listFiles = this.f26065f.listFiles();
        int length = listFiles.length;
        int i = 0;
        while (i < length) {
            File file3 = listFiles[i];
            if (!file3.getName().endsWith(".done")) {
                j = file3.lastModified();
                if (j < j2) {
                    file = file3;
                    i++;
                    file2 = file;
                    j2 = j;
                }
            }
            j = j2;
            file = file2;
            i++;
            file2 = file;
            j2 = j;
        }
        if (file2 != null) {
            z = file2.delete();
            File m13255a = m13255a(file2);
            if (m13255a.isFile()) {
                z &= m13255a.delete();
            }
        } else {
            z = false;
        }
        return z;
    }
}
