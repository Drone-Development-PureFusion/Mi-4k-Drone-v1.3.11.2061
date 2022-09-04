package com.fimi.soul.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3118c;
import com.fimi.soul.utils.C3129m;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Stack;
/* loaded from: classes.dex */
public class CameraSocketService extends Service {

    /* renamed from: a */
    public static final int f11339a = 26112;

    /* renamed from: b */
    public static final int f11340b = 1200;

    /* renamed from: c */
    public static final int f11341c = 32;

    /* renamed from: d */
    public static final int f11342d = 1001;

    /* renamed from: e */
    public static final int f11343e = 2001;

    /* renamed from: f */
    public static final int f11344f = 0;

    /* renamed from: g */
    public static final int f11345g = 1;

    /* renamed from: h */
    public static final int f11346h = 2;

    /* renamed from: i */
    public static final int f11347i = 3;

    /* renamed from: j */
    public static final int f11348j = 4;

    /* renamed from: k */
    public static final int f11349k = 5;

    /* renamed from: l */
    public static final int f11350l = 7;

    /* renamed from: m */
    public static final int f11351m = 8;

    /* renamed from: n */
    public static final String f11352n = "/uDiskFile.txt";

    /* renamed from: s */
    private static final int f11353s = 3000;

    /* renamed from: y */
    private static Stack<Thread> f11354y = new Stack<>();

    /* renamed from: G */
    private WifiManager.MulticastLock f11361G;

    /* renamed from: p */
    private MulticastSocket f11370p;

    /* renamed from: r */
    private InetAddress f11372r;

    /* renamed from: q */
    private String f11371q = "224.0.0.1";

    /* renamed from: t */
    private String f11373t = null;

    /* renamed from: u */
    private boolean f11374u = false;

    /* renamed from: v */
    private boolean f11375v = false;

    /* renamed from: w */
    private boolean f11376w = false;

    /* renamed from: x */
    private String f11377x = null;

    /* renamed from: z */
    private Socket f11378z = null;

    /* renamed from: A */
    private DataInputStream f11355A = null;

    /* renamed from: B */
    private DataOutputStream f11356B = null;

    /* renamed from: C */
    private ServerSocket f11357C = null;

    /* renamed from: D */
    private Handler f11358D = new Handler();

    /* renamed from: E */
    private EnumC3038b f11359E = EnumC3038b.CAMERA;

    /* renamed from: F */
    private AbstractC3044h f11360F = null;

    /* renamed from: o */
    public BinderC3039c f11369o = new BinderC3039c();

    /* renamed from: H */
    private BroadcastReceiver f11362H = new BroadcastReceiver() { // from class: com.fimi.soul.service.CameraSocketService.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || !C3103au.m29221b(context)) {
                return;
            }
            CameraSocketService.this.f11375v = false;
        }
    };

    /* renamed from: I */
    private final byte[] f11363I = {0, 102, 0, 0, -47, 7, 2, 0, 65, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: J */
    private final byte[] f11364J = new byte[65];

    /* renamed from: K */
    private final byte[] f11365K = {0, 102, 1, 0, -47, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: L */
    private final byte[] f11366L = {0, 102, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: M */
    private final byte[] f11367M = {0, 102, 1, 0, 32, 0, 32, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: N */
    private final byte[] f11368N = {0, 102, 0, 0, -47, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: com.fimi.soul.service.CameraSocketService$a */
    /* loaded from: classes.dex */
    public class RunnableC3037a implements Runnable {
        public RunnableC3037a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    C1756a.m34261a("AcceptRunnable", CameraSocketService.class);
                    Socket accept = CameraSocketService.this.f11357C.accept();
                    if (CameraSocketService.this.f11355A != null) {
                        CameraSocketService.this.f11355A.close();
                        CameraSocketService.this.f11355A = null;
                    }
                    if (CameraSocketService.this.f11356B != null) {
                        CameraSocketService.this.f11356B.close();
                        CameraSocketService.this.f11356B = null;
                    }
                    if (CameraSocketService.this.f11378z != null) {
                        CameraSocketService.this.f11378z.close();
                        CameraSocketService.this.f11378z = null;
                    }
                    CameraSocketService.this.f11376w = true;
                    Thread thread = new Thread(new RunnableC3040d(accept));
                    thread.start();
                    CameraSocketService.f11354y.add(thread);
                    CameraSocketService.this.f11377x = accept.getInetAddress().getHostAddress();
                    C1756a.m34261a("initClientSocket=Connected=ServerIp=" + CameraSocketService.this.f11377x, CameraSocketService.class);
                    while (true) {
                        if (CameraSocketService.this.f11378z != null || CameraSocketService.this.f11377x == null) {
                            break;
                        }
                        try {
                            try {
                                try {
                                    Thread.sleep(500L);
                                    CameraSocketService.this.f11378z = new Socket(CameraSocketService.this.f11377x, (int) C3118c.f11630b);
                                    C1756a.m34261a("create Server Socket=" + CameraSocketService.this.f11378z, CameraSocketService.class);
                                } catch (UnknownHostException e) {
                                    e.printStackTrace();
                                }
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        } catch (InterruptedException e3) {
                            e3.printStackTrace();
                        }
                        if (CameraSocketService.this.f11378z != null) {
                            CameraSocketService.this.f11355A = new DataInputStream(CameraSocketService.this.f11378z.getInputStream());
                            CameraSocketService.this.f11356B = new DataOutputStream(CameraSocketService.this.f11378z.getOutputStream());
                            CameraSocketService.this.f11375v = true;
                            Thread thread2 = new Thread(new RunnableC3042f());
                            thread2.start();
                            CameraSocketService.f11354y.add(thread2);
                            CameraSocketService.this.m29520a(0, CameraSocketService.this.f11375v, CameraSocketService.this.f11377x);
                            break;
                        }
                    }
                    if (CameraSocketService.this.f11378z != null) {
                        CameraSocketService.this.m29510a(CameraSocketService.this.f11378z);
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.fimi.soul.service.CameraSocketService$b */
    /* loaded from: classes.dex */
    public enum EnumC3038b {
        U_DISK,
        CAMERA
    }

    /* renamed from: com.fimi.soul.service.CameraSocketService$c */
    /* loaded from: classes.dex */
    public class BinderC3039c extends Binder {
        public BinderC3039c() {
        }

        /* renamed from: a */
        public CameraSocketService m29485a() {
            return CameraSocketService.this;
        }
    }

    /* renamed from: com.fimi.soul.service.CameraSocketService$d */
    /* loaded from: classes.dex */
    public class RunnableC3040d implements Runnable {

        /* renamed from: b */
        private DataInputStream f11390b;

        public RunnableC3040d(Socket socket) {
            this.f11390b = null;
            try {
                this.f11390b = new DataInputStream(socket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr = new byte[4096];
            while (true) {
                try {
                    int read = this.f11390b.read(bArr);
                    if (read == -1) {
                        return;
                    }
                    String str = new String(bArr, 0, read, "UTF-8");
                    if (str != null) {
                        CameraSocketService.this.m29520a(3, true, str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: com.fimi.soul.service.CameraSocketService$e */
    /* loaded from: classes.dex */
    public class RunnableC3041e implements Runnable {
        public RunnableC3041e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3118c.m29119a(CameraSocketService.this.f11366L);
            byte[] bArr = new byte[28];
            byte[] bytes = C3103au.m29201f(CameraSocketService.this).getBytes();
            for (int i = 0; i < bytes.length; i++) {
                bArr[i] = bytes[i];
            }
            bArr[20] = 5;
            bArr[21] = -26;
            bArr[22] = 0;
            bArr[23] = 0;
            bArr[24] = 1;
            bArr[25] = 0;
            bArr[26] = 0;
            bArr[27] = 0;
            C3118c.m29119a(bArr);
            try {
                Thread.sleep(3000L);
                if (CameraSocketService.this.m29497g()) {
                    return;
                }
                CameraSocketService.this.m29520a(7, CameraSocketService.this.f11375v, "refuse connect");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.fimi.soul.service.CameraSocketService$f */
    /* loaded from: classes.dex */
    public class RunnableC3042f implements Runnable {
        public RunnableC3042f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (CameraSocketService.this.f11375v) {
                try {
                    Thread.sleep(10000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!CameraSocketService.this.f11374u) {
                    CameraSocketService.this.f11375v = false;
                    C3118c.m29124a(CameraSocketService.this.f11356B, CameraSocketService.this.f11367M);
                    try {
                        Thread.sleep(3000L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    if (!CameraSocketService.this.f11375v) {
                        CameraSocketService.this.m29520a(7, true, "HEARTBEATBROADCAST disConnect....");
                        CameraSocketService.this.m29501e();
                    }
                }
            }
        }
    }

    /* renamed from: com.fimi.soul.service.CameraSocketService$g */
    /* loaded from: classes.dex */
    public class RunnableC3043g implements Runnable {
        public RunnableC3043g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 1024);
            while (true) {
                try {
                    CameraSocketService.this.f11361G.acquire();
                    CameraSocketService.this.f11370p.receive(datagramPacket);
                    CameraSocketService.this.m29520a(-1, true, new String(bArr, 0, datagramPacket.getLength()) + datagramPacket.getAddress().getHostAddress());
                    CameraSocketService.this.f11361G.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.fimi.soul.service.CameraSocketService$h */
    /* loaded from: classes.dex */
    public interface AbstractC3044h {
        /* renamed from: a */
        void m29484a(int i, boolean z, String str);
    }

    /* renamed from: a */
    private void m29512a(DataInputStream dataInputStream) {
        boolean z = false;
        byte[] bArr = new byte[68];
        try {
            if (dataInputStream.read(bArr) == -1) {
                return;
            }
            long m29117b = C3118c.m29117b(bArr, 64);
            if (m29117b <= 0) {
                return;
            }
            File file = new File(C3129m.m29057j());
            if (!file.exists()) {
                file.mkdir();
            }
            String str = C3129m.m29055l() + this.f11373t;
            if (f11352n.equalsIgnoreCase(this.f11373t)) {
                str = C3129m.m29057j() + this.f11373t;
            } else {
                z = true;
            }
            try {
                C3118c.m29124a(this.f11356B, this.f11365K);
                this.f11374u = true;
                C3118c.m29121a(str, m29117b, dataInputStream, this, z);
                this.f11374u = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006d, code lost:
        r9.f11375v = false;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29510a(Socket socket) {
        int i = 0;
        byte[] bArr = new byte[1024];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                try {
                    if (this.f11355A == null || this.f11355A.read(bArr) == -1) {
                        break;
                    }
                    this.f11375v = true;
                    if (26112 == C3118c.m29118a(bArr, 0)) {
                        i = C3118c.m29118a(bArr, 2);
                        i3 = C3118c.m29118a(bArr, 4);
                        i2 = C3118c.m29118a(bArr, 6);
                        C1756a.m34261a("mCurMsgType =" + i3, getClass());
                    }
                    if (i3 == 1200) {
                        m29512a(this.f11355A);
                    } else if (i3 == 2001) {
                        continue;
                    } else if (i3 == 1001) {
                        if (i != 1) {
                            m29520a(2, false, null);
                        } else if (i2 == 7) {
                            break;
                        } else if (i2 == 2) {
                            m29520a(2, true, this.f11373t);
                            this.f11373t = null;
                        }
                    } else if (i3 == 32) {
                        m29520a(i3, true, "connected");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    if (socket == null) {
                        return;
                    }
                    try {
                        socket.close();
                        return;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
            } catch (Throwable th) {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }

    /* renamed from: i */
    private void m29493i() {
        try {
            this.f11370p = new MulticastSocket((int) C3118c.f11629a);
            this.f11372r = InetAddress.getByName(this.f11371q);
            this.f11370p.joinGroup(this.f11372r);
            Thread thread = new Thread(new RunnableC3043g());
            thread.start();
            f11354y.add(thread);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    private void m29491j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.f11362H, intentFilter);
    }

    /* renamed from: k */
    private void m29489k() {
        if (!this.f11376w) {
            try {
                this.f11357C = new ServerSocket(C3118c.f11630b);
                new Thread(new RunnableC3037a()).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        C1756a.m34261a("startSocketServer " + this.f11376w, CameraSocketService.class);
    }

    /* renamed from: l */
    private void m29487l() {
        C3118c.m29124a(this.f11356B, this.f11368N);
    }

    /* renamed from: a */
    public void m29521a() {
        if (!this.f11375v) {
            m29520a(7, this.f11375v, "disConnect..");
            return;
        }
        this.f11373t = f11352n;
        C3118c.m29124a(this.f11356B, this.f11363I);
        this.f11364J[0] = 0;
        C3118c.m29124a(this.f11356B, this.f11364J);
        this.f11359E = EnumC3038b.U_DISK;
    }

    /* renamed from: a */
    public void m29520a(final int i, final boolean z, final String str) {
        this.f11358D.post(new Runnable() { // from class: com.fimi.soul.service.CameraSocketService.1
            @Override // java.lang.Runnable
            public void run() {
                if (CameraSocketService.this.f11360F != null) {
                    CameraSocketService.this.f11360F.m29484a(i, z, str);
                }
            }
        });
    }

    /* renamed from: a */
    public void m29519a(AbstractC3044h abstractC3044h) {
        this.f11360F = abstractC3044h;
        this.f11360F.m29484a(8, m29497g(), "chanager state");
    }

    /* renamed from: a */
    public void m29511a(String str, String str2) {
        if (this.f11359E == EnumC3038b.CAMERA) {
            m29520a(5, this.f11375v, "error mode..");
        } else if (!this.f11375v) {
            m29520a(7, this.f11375v, "disConnect..");
        } else {
            this.f11373t = str;
            C3118c.m29124a(this.f11356B, this.f11363I);
            byte[] bArr = new byte[65];
            bArr[0] = 2;
            byte[] bytes = str2.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                if (i + 1 < bArr.length) {
                    bArr[i + 1] = bytes[i];
                }
            }
            C3118c.m29124a(this.f11356B, bArr);
        }
    }

    /* renamed from: b */
    public void m29509b() {
        if (this.f11375v && this.f11359E != EnumC3038b.CAMERA) {
            C3118c.m29124a(this.f11356B, this.f11363I);
            this.f11364J[0] = 1;
            C3118c.m29124a(this.f11356B, this.f11364J);
            this.f11359E = EnumC3038b.CAMERA;
        }
        if (!this.f11375v) {
            m29520a(7, this.f11375v, "disConnect..");
        } else if (this.f11359E != EnumC3038b.CAMERA) {
        } else {
            m29520a(0, this.f11375v, "Connected..");
        }
    }

    /* renamed from: c */
    public EnumC3038b m29505c() {
        return this.f11359E;
    }

    /* renamed from: d */
    public void m29503d() {
        C1756a.m34261a("stopSocketServer", CameraSocketService.class);
        if (this.f11376w && this.f11357C != null) {
            try {
                this.f11376w = false;
                if (this.f11378z != null && !this.f11378z.isClosed()) {
                    this.f11378z.close();
                    this.f11378z = null;
                }
                if (this.f11356B != null) {
                    this.f11356B.close();
                    this.f11356B = null;
                }
                this.f11357C.close();
                this.f11357C = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int size = f11354y.size();
        for (int i = 0; i < size; i++) {
            if (f11354y.get(i) != null && !f11354y.get(i).isInterrupted()) {
                f11354y.get(i).interrupt();
            }
        }
        f11354y.clear();
        if (m29497g()) {
            m29487l();
        }
    }

    /* renamed from: e */
    public void m29501e() {
        Thread thread = new Thread(new RunnableC3041e());
        thread.start();
        f11354y.add(thread);
    }

    /* renamed from: f */
    public String m29499f() {
        return this.f11377x;
    }

    /* renamed from: g */
    public boolean m29497g() {
        return this.f11375v;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f11369o;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C1756a.m34261a("onCreate", CameraSocketService.class);
        this.f11361G = ((WifiManager) getSystemService("wifi")).createMulticastLock("multicastLock");
        m29489k();
        m29493i();
        m29491j();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m29503d();
        unregisterReceiver(this.f11362H);
    }
}
