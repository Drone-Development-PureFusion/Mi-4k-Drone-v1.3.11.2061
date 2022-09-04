package com.fimi.soul.drone.droneconnection.connection;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.fimi.soul.biz.p177e.C1835b;
import com.fimi.soul.drone.p195d.C2199b;
import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.utils.C3143v;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.codehaus.jackson.smile.SmileConstants;
import org.p356d.AbstractC11747c;
import org.p356d.C11751d;
/* renamed from: com.fimi.soul.drone.droneconnection.connection.e */
/* loaded from: classes.dex */
public abstract class AbstractC2224e {

    /* renamed from: a */
    private static final String f7020a = AbstractC2224e.class.getSimpleName();

    /* renamed from: b */
    public static final int f7021b = 0;

    /* renamed from: c */
    public static final int f7022c = 1;

    /* renamed from: d */
    public static final int f7023d = 2;

    /* renamed from: j */
    private static final int f7024j = 4096;

    /* renamed from: f */
    BufferedWriter f7026f;

    /* renamed from: i */
    private File f7029i;

    /* renamed from: p */
    private Thread f7035p;

    /* renamed from: q */
    private long f7036q;

    /* renamed from: r */
    private long f7037r;

    /* renamed from: k */
    private List<Integer> f7030k = new ArrayList();

    /* renamed from: e */
    protected volatile boolean f7025e = false;

    /* renamed from: l */
    private final ConcurrentHashMap<String, AbstractC2228f> f7031l = new ConcurrentHashMap<>();

    /* renamed from: m */
    private C1835b f7032m = C1835b.m33961a();

    /* renamed from: n */
    private final AtomicInteger f7033n = new AtomicInteger(0);

    /* renamed from: o */
    private final Runnable f7034o = new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.e.1
        /* renamed from: a */
        private void m32614a(C2199b c2199b, int i, byte[] bArr) {
            if (i < 1) {
                return;
            }
            if (AbstractC2224e.this.f7039t) {
                System.arraycopy(bArr, 0, new byte[i], 0, i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                C2196c m32724a = c2199b.m32724a(bArr[i2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
                if (m32724a != null) {
                    C2221d m32670a = C2221d.m32670a();
                    m32670a.m32662a(AbstractC2224e.this.f7025e);
                    AbstractC2224e.this.f7032m.m33953b(AbstractC2224e.this.f7025e);
                    AbstractC2224e.this.m32634b(m32724a.f6913c);
                    if (m32724a.f6913c == 211) {
                        AbstractC2224e.this.f7032m.m33957a(m32724a);
                    } else {
                        if (AbstractC2224e.this.f7025e) {
                            if (m32670a.m32656f()) {
                                m32670a.m32655g();
                            }
                            if (!m32670a.m32657e()) {
                                m32670a.m32661b();
                            } else {
                                m32670a.m32669a(m32724a);
                            }
                        } else {
                            if (!m32670a.m32656f()) {
                                m32670a.m32659c();
                            } else if (m32670a.m32651k()) {
                                m32670a.m32655g();
                                return;
                            } else {
                                m32670a.m32669a(m32724a);
                            }
                            if (m32670a.m32657e()) {
                                m32670a.m32658d();
                            }
                        }
                        AbstractC2224e.this.m32647a(m32724a.m32754g());
                    }
                }
            }
        }

        /* renamed from: a */
        public String m32613a(byte[] bArr) {
            StringBuilder sb = new StringBuilder("");
            if (bArr == null || bArr.length <= 0) {
                return "";
            }
            for (byte b : bArr) {
                String hexString = Integer.toHexString(b & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString);
                sb.append(" ");
            }
            return sb.toString().toUpperCase();
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            Thread thread = null;
            try {
                try {
                    AbstractC2224e.this.mo32627d();
                    AbstractC2224e.this.f7033n.set(2);
                    AbstractC2224e.this.m32649a();
                    C2199b c2199b = new C2199b();
                    c2199b.f6927c.m32726b();
                    byte[] bArr = new byte[4096];
                    AbstractC2224e.this.f7036q = SystemClock.uptimeMillis();
                    AbstractC2224e.this.f7037r = SystemClock.uptimeMillis();
                    while (AbstractC2224e.this.f7033n.get() == 2) {
                        int mo32630b = AbstractC2224e.this.mo32630b(bArr);
                        if (mo32630b > 0) {
                            try {
                                m32614a(c2199b, mo32630b, bArr);
                            } catch (Exception e) {
                                AbstractC2224e.this.m32636a(bArr, e.toString());
                            }
                        }
                    }
                    if (0 != 0 && thread.isAlive()) {
                        thread.interrupt();
                    }
                    AbstractC2224e.this.m32618h();
                } catch (Throwable th) {
                    if (0 != 0 && thread.isAlive()) {
                        thread.interrupt();
                    }
                    AbstractC2224e.this.m32618h();
                    throw th;
                }
            } catch (IOException e2) {
                C2204b.m32706b(false);
                if (AbstractC2224e.this.f7033n.get() != 0) {
                    AbstractC2224e.this.m32631b(e2.getMessage());
                }
                if (0 != 0 && thread.isAlive()) {
                    thread.interrupt();
                }
                AbstractC2224e.this.m32618h();
            }
            Looper.loop();
        }
    };

    /* renamed from: g */
    boolean f7027g = true;

    /* renamed from: s */
    private EnumC2227a f7038s = EnumC2227a.IDLE;

    /* renamed from: t */
    private boolean f7039t = false;

    /* renamed from: u */
    private boolean f7040u = true;

    /* renamed from: h */
    AbstractC11747c f7028h = C11751d.m48a("log_linkconntect");

    /* renamed from: v */
    private final Runnable f7041v = new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.e.2
        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!AbstractC2224e.this.f7031l.isEmpty()) {
                    if (SystemClock.uptimeMillis() - AbstractC2224e.this.f7036q > 3000) {
                        for (AbstractC2228f abstractC2228f : AbstractC2224e.this.f7031l.values()) {
                            abstractC2228f.mo32561b(false);
                            abstractC2228f.mo32563a(false);
                        }
                    } else if (SystemClock.uptimeMillis() - AbstractC2224e.this.f7037r > 3000) {
                        AbstractC2224e.this.f7038s = EnumC2227a.DISCONNECT;
                        for (AbstractC2228f abstractC2228f2 : AbstractC2224e.this.f7031l.values()) {
                            abstractC2228f2.mo32561b(true);
                            abstractC2228f2.mo32563a(false);
                        }
                    } else {
                        for (AbstractC2228f abstractC2228f3 : AbstractC2224e.this.f7031l.values()) {
                            abstractC2228f3.mo32561b(true);
                            abstractC2228f3.mo32563a(true);
                        }
                    }
                }
            }
        }
    };

    /* renamed from: com.fimi.soul.drone.droneconnection.connection.e$a */
    /* loaded from: classes.dex */
    public enum EnumC2227a {
        IDLE,
        CONNECTED,
        DISCONNECT
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m32649a() {
        for (AbstractC2228f abstractC2228f : this.f7031l.values()) {
            abstractC2228f.mo32566a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m32647a(AbstractC2195b abstractC2195b) {
        if (this.f7031l.isEmpty()) {
            return;
        }
        if (this.f7027g) {
            this.f7027g = false;
            new Thread(this.f7041v).start();
        }
        for (AbstractC2228f abstractC2228f : this.f7031l.values()) {
            abstractC2228f.mo32565a(abstractC2195b);
        }
    }

    /* renamed from: b */
    private void m32635b() {
        if (this.f7031l.isEmpty()) {
            return;
        }
        for (AbstractC2228f abstractC2228f : this.f7031l.values()) {
            abstractC2228f.mo32562b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m32634b(int i) {
        if (m32648a(i)) {
            if (!this.f7039t || SystemClock.uptimeMillis() - this.f7037r <= 2000) {
            }
            this.f7036q = SystemClock.uptimeMillis();
            this.f7037r = SystemClock.uptimeMillis();
        } else if (i == 99 || i == 98 || i == 100 || i == 105) {
            if (EnumC2227a.CONNECTED != this.f7038s) {
                this.f7038s = EnumC2227a.CONNECTED;
                for (AbstractC2228f abstractC2228f : this.f7031l.values()) {
                    abstractC2228f.mo32561b(true);
                }
            }
            this.f7036q = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m32631b(String str) {
        if (this.f7031l.isEmpty()) {
            return;
        }
        for (AbstractC2228f abstractC2228f : this.f7031l.values()) {
            abstractC2228f.mo32564a(str);
        }
    }

    /* renamed from: a */
    public void m32646a(C2196c c2196c) {
        byte[] m32757d;
        if (c2196c == null || (m32757d = c2196c.m32757d()) == null) {
            return;
        }
        try {
            mo32625d(m32757d);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m32645a(C2196c c2196c, boolean z) {
        Log.d("zhej1", "savetoSend: ");
        byte[] m32760a = c2196c.m32760a(z);
        try {
            if (c2196c.f6913c == 18) {
                return;
            }
            if (c2196c.f6913c != 129 && c2196c.f6913c != 131 && c2196c.f6913c != 133 && c2196c.f6913c != 147 && c2196c.f6913c != 130 && c2196c.f6913c != 132 && c2196c.f6913c != 134 && c2196c.f6913c != 291 && c2196c.f6913c != 148 && c2196c.f6913c != 149) {
                return;
            }
            if (this.f7026f == null) {
                this.f7026f = m32622f();
            }
            if (this.f7026f == null) {
                return;
            }
            this.f7026f.write(C3143v.m29020a());
            if (z) {
                this.f7026f.write("  send  ");
            } else {
                this.f7026f.write("  read  ");
            }
            StringBuffer stringBuffer = new StringBuffer(m32760a.length * 2);
            for (int i = 0; i < m32760a.length; i++) {
                stringBuffer.append(Character.forDigit((m32760a[i] & 240) >> 4, 16));
                stringBuffer.append(Character.forDigit(m32760a[i] & 15, 16));
                stringBuffer.append(" ");
            }
            this.f7026f.write(stringBuffer.toString());
            this.f7026f.write("\n");
            this.f7026f.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m32638a(String str) {
        this.f7031l.remove(str);
    }

    /* renamed from: a */
    public void m32637a(String str, AbstractC2228f abstractC2228f) {
        this.f7031l.put(str, abstractC2228f);
        if (m32617i() == 2) {
            abstractC2228f.mo32566a();
        }
    }

    /* renamed from: a */
    public void m32636a(byte[] bArr, String str) {
    }

    /* renamed from: a */
    public boolean m32648a(int i) {
        return i == 2 || i == 3 || i == 4 || i == 5 || i == 11 || i == 7 || i == 9 || i == 10 || i == 134 || i == 135 || i == 49 || i == 52 || i == 50 || i == 51 || i == 106 || i == 16 || i == 122 || i == 128 || i == 129 || i == 130 || i == 131 || i == 132 || i == 133 || i == 136 || i == 137 || i == 144 || i == 145 || i == 146 || i == 147 || i == 148 || i == 152 || i == 153 || i == 154 || i == 51 || i == 106 || i == 193 || i == 194 || i == 198 || i == 199 || i == 201 || i == 202 || i == 203 || i == 12 || i == 211 || i == 8;
    }

    /* renamed from: b */
    protected abstract int mo32630b(byte[] bArr);

    /* renamed from: c */
    public void m32628c(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            mo32625d(bArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    protected abstract void mo32627d();

    /* renamed from: d */
    protected abstract void mo32625d(byte[] bArr);

    /* renamed from: e */
    protected abstract void mo32624e();

    /* renamed from: f */
    public BufferedWriter m32622f() {
        File file = new File(C3129m.m29070a() + "/updateLog/");
        file.mkdirs();
        File file2 = new File(file, C3143v.m29020a() + ".txt");
        if (file2.exists()) {
            file2.delete();
        }
        new BufferedOutputStream(new FileOutputStream(file2));
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
    }

    /* renamed from: g */
    public void m32620g() {
        if (this.f7033n.compareAndSet(0, 1)) {
            this.f7035p = new Thread(this.f7034o, "MiLinkConnection-Connecting Thread");
            this.f7035p.start();
        }
    }

    /* renamed from: h */
    public void m32618h() {
        if (this.f7033n.get() == 0 || this.f7035p == null) {
            return;
        }
        try {
            this.f7033n.set(0);
            if (this.f7035p.isAlive() && !this.f7035p.isInterrupted()) {
                this.f7035p.interrupt();
            }
            mo32624e();
            m32635b();
        } catch (IOException e) {
            m32631b(e.getMessage());
        }
    }

    /* renamed from: i */
    public int m32617i() {
        return this.f7033n.get();
    }

    /* renamed from: j */
    public abstract int mo32616j();

    /* renamed from: k */
    public void m32615k() {
        this.f7033n.set(0);
    }
}
