package com.fimi.soul.drone.droneconnection.connection.p200c;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.util.Log;
import com.fimi.soul.drone.droneconnection.connection.p200c.C2218b;
import com.hoho.android.usbserial.driver.CdcAcmSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialProber;
import java.io.IOException;
import java.lang.reflect.Array;
/* renamed from: com.fimi.soul.drone.droneconnection.connection.c.a */
/* loaded from: classes.dex */
class C2217a extends C2218b.AbstractC2220a {

    /* renamed from: g */
    private static final String f6987g = C2217a.class.getSimpleName();

    /* renamed from: h */
    private static UsbSerialDriver f6988h = null;

    /* renamed from: a */
    protected Context f6989a;

    /* renamed from: d */
    UsbDeviceConnection f6992d;

    /* renamed from: i */
    private UsbDevice f6993i = null;

    /* renamed from: b */
    UsbInterface[] f6990b = null;

    /* renamed from: c */
    UsbEndpoint[][] f6991c = (UsbEndpoint[][]) Array.newInstance(UsbEndpoint.class, 20, 20);

    /* JADX INFO: Access modifiers changed from: protected */
    public C2217a(Context context, int i) {
        super(context, i);
        this.f6989a = context;
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.p200c.C2218b.AbstractC2220a
    /* renamed from: a */
    protected int mo32673a(byte[] bArr) {
        try {
            int read = f6988h.read(bArr, 200);
            if (read != 0) {
                return read;
            }
            return -1;
        } catch (NullPointerException e) {
            String str = "Error Reading: " + e.getMessage() + "\nAssuming inaccessible USB device.  Closing connection.";
            Log.e(f6987g, str, e);
            throw new IOException(str, e);
        }
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.p200c.C2218b.AbstractC2220a
    /* renamed from: a */
    protected void mo32674a() {
        UsbManager usbManager = (UsbManager) this.f7001f.getSystemService("usb");
        f6988h = UsbSerialProber.findFirstDevice(usbManager);
        if (f6988h != null) {
            m32680a(f6988h);
            return;
        }
        if (usbManager != null) {
            for (UsbDevice usbDevice : usbManager.getDeviceList().values()) {
                this.f6993i = usbDevice;
                if (this.f6993i.getVendorId() == 1155 && this.f6993i.getProductId() == 22336) {
                    break;
                }
            }
        }
        if (this.f6993i != null && this.f6993i.getVendorId() == 1155 && this.f6993i.getProductId() == 22336) {
            this.f6990b = new UsbInterface[this.f6993i.getInterfaceCount()];
            for (int i = 0; i < this.f6993i.getInterfaceCount(); i++) {
                this.f6990b[i] = this.f6993i.getInterface(i);
                for (int i2 = 0; i2 < this.f6990b[i].getEndpointCount(); i2++) {
                    this.f6991c[i][i2] = this.f6990b[i].getEndpoint(i2);
                }
            }
            this.f6992d = usbManager.openDevice(this.f6993i);
        }
        if (this.f6992d != null) {
            f6988h = new CdcAcmSerialDriver(this.f6993i, this.f6992d);
        }
        if (f6988h == null) {
            return;
        }
        m32680a(f6988h);
    }

    /* renamed from: a */
    public void m32680a(UsbSerialDriver usbSerialDriver) {
        try {
            usbSerialDriver.open();
            usbSerialDriver.setParameters(this.f7000e, 8, 1, 0);
        } catch (IOException e) {
            if (usbSerialDriver != null) {
                usbSerialDriver.close();
            }
            throw new IOException();
        }
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.p200c.C2218b.AbstractC2220a
    /* renamed from: b */
    protected void mo32672b() {
        if (f6988h != null) {
            try {
                f6988h.close();
            } catch (IOException e) {
            }
            f6988h = null;
        }
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.p200c.C2218b.AbstractC2220a
    /* renamed from: b */
    protected void mo32671b(byte[] bArr) {
        if (f6988h != null) {
            try {
                f6988h.write(bArr, 500);
            } catch (IOException e) {
                Log.e("USB", "Error Sending: " + e.getMessage(), e);
            }
        }
    }

    public String toString() {
        return f6987g;
    }
}
