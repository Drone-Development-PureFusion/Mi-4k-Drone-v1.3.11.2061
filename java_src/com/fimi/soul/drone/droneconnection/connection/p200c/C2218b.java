package com.fimi.soul.drone.droneconnection.connection.p200c;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.util.Log;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.drone.droneconnection.connection.AbstractC2202a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.fimi.soul.drone.droneconnection.connection.c.b */
/* loaded from: classes.dex */
public class C2218b extends AbstractC2202a {

    /* renamed from: j */
    private static final String f6994j = C2218b.class.getSimpleName();

    /* renamed from: k */
    private static final int f6995k = 1027;

    /* renamed from: i */
    protected int f6996i = 256000;

    /* renamed from: l */
    private AbstractC2220a f6997l;

    /* renamed from: com.fimi.soul.drone.droneconnection.connection.c.b$a */
    /* loaded from: classes.dex */
    static abstract class AbstractC2220a {

        /* renamed from: e */
        protected final int f7000e;

        /* renamed from: f */
        protected final Context f7001f;

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC2220a(Context context, int i) {
            this.f7001f = context;
            this.f7000e = i;
        }

        /* renamed from: a */
        protected abstract int mo32673a(byte[] bArr);

        /* renamed from: a */
        protected abstract void mo32674a();

        /* renamed from: b */
        protected abstract void mo32672b();

        /* renamed from: b */
        protected abstract void mo32671b(byte[] bArr);
    }

    public C2218b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static boolean m32678a(Context context) {
        HashMap<String, UsbDevice> deviceList = ((UsbManager) context.getSystemService("usb")).getDeviceList();
        if (deviceList == null || deviceList.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, UsbDevice> entry : deviceList.entrySet()) {
            if (entry.getValue().getVendorId() == 1027) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2202a
    /* renamed from: a */
    protected int mo32676a(byte[] bArr) {
        if (this.f6997l == null) {
            throw new IOException("Uninitialized usb connection.");
        }
        return this.f6997l.mo32673a(bArr);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2202a
    /* renamed from: a */
    protected void mo32679a() {
        if (this.f6997l != null) {
            this.f6997l.mo32672b();
        }
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2202a
    /* renamed from: b */
    protected void mo32675b() {
        if (this.f6997l != null) {
            try {
                this.f6997l.mo32674a();
                Log.d(f6994j, "Reusing previous usb connection.");
                return;
            } catch (IOException e) {
                Log.e(f6994j, "Previous usb connection is not usable.", e);
                this.f6997l = null;
            }
        }
        if (this.f6997l == null) {
            C2217a c2217a = new C2217a(this.f6940a, this.f6996i);
            c2217a.mo32674a();
            this.f6997l = c2217a;
            Log.d(f6994j, "Using open-source usb connection.");
        }
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: d */
    protected void mo32625d(final byte[] bArr) {
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.c.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (C2218b.this.f6997l == null) {
                    return;
                }
                C2218b.this.f6997l.mo32671b(bArr);
            }
        });
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: j */
    public int mo32616j() {
        return 1;
    }

    public String toString() {
        return this.f6997l == null ? f6994j : this.f6997l.toString();
    }
}
