package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.google.android.gms.common.images.C4549a;
import com.google.android.gms.vision.C9274d;
import java.lang.Thread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.google.android.gms.vision.a */
/* loaded from: classes2.dex */
public class C9236a {
    @SuppressLint({"InlinedApi"})

    /* renamed from: a */
    public static final int f29079a = 0;
    @SuppressLint({"InlinedApi"})

    /* renamed from: b */
    public static final int f29080b = 1;

    /* renamed from: c */
    private Context f29081c;

    /* renamed from: d */
    private final Object f29082d;

    /* renamed from: e */
    private Camera f29083e;

    /* renamed from: f */
    private int f29084f;

    /* renamed from: g */
    private int f29085g;

    /* renamed from: h */
    private C4549a f29086h;

    /* renamed from: i */
    private float f29087i;

    /* renamed from: j */
    private int f29088j;

    /* renamed from: k */
    private int f29089k;

    /* renamed from: l */
    private boolean f29090l;

    /* renamed from: m */
    private SurfaceView f29091m;

    /* renamed from: n */
    private SurfaceTexture f29092n;

    /* renamed from: o */
    private boolean f29093o;

    /* renamed from: p */
    private Thread f29094p;

    /* renamed from: q */
    private RunnableC9242e f29095q;

    /* renamed from: r */
    private Map<byte[], ByteBuffer> f29096r;

    /* renamed from: com.google.android.gms.vision.a$a */
    /* loaded from: classes2.dex */
    public static class C9238a {

        /* renamed from: a */
        private final AbstractC9246b<?> f29097a;

        /* renamed from: b */
        private C9236a f29098b = new C9236a();

        public C9238a(Context context, AbstractC9246b<?> abstractC9246b) {
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            }
            if (abstractC9246b == null) {
                throw new IllegalArgumentException("No detector supplied.");
            }
            this.f29097a = abstractC9246b;
            this.f29098b.f29081c = context;
        }

        /* renamed from: a */
        public C9238a m8836a(float f) {
            if (f <= 0.0f) {
                throw new IllegalArgumentException(new StringBuilder(28).append("Invalid fps: ").append(f).toString());
            }
            this.f29098b.f29087i = f;
            return this;
        }

        /* renamed from: a */
        public C9238a m8835a(int i) {
            if (i == 0 || i == 1) {
                this.f29098b.f29084f = i;
                return this;
            }
            throw new IllegalArgumentException(new StringBuilder(27).append("Invalid camera: ").append(i).toString());
        }

        /* renamed from: a */
        public C9238a m8834a(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                throw new IllegalArgumentException(new StringBuilder(45).append("Invalid preview size: ").append(i).append("x").append(i2).toString());
            }
            this.f29098b.f29088j = i;
            this.f29098b.f29089k = i2;
            return this;
        }

        /* renamed from: a */
        public C9238a m8833a(boolean z) {
            this.f29098b.f29090l = z;
            return this;
        }

        /* renamed from: a */
        public C9236a m8837a() {
            C9236a c9236a = this.f29098b;
            C9236a c9236a2 = this.f29098b;
            c9236a2.getClass();
            c9236a.f29095q = new RunnableC9242e(this.f29097a);
            return this.f29098b;
        }
    }

    /* renamed from: com.google.android.gms.vision.a$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9239b {
        /* renamed from: a */
        void m8832a(byte[] bArr);
    }

    /* renamed from: com.google.android.gms.vision.a$c */
    /* loaded from: classes2.dex */
    public interface AbstractC9240c {
        /* renamed from: a */
        void m8831a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.vision.a$d */
    /* loaded from: classes2.dex */
    public class C9241d implements Camera.PreviewCallback {
        private C9241d() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C9236a.this.f29095q.m8828a(bArr, camera);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.vision.a$e */
    /* loaded from: classes2.dex */
    public class RunnableC9242e implements Runnable {

        /* renamed from: a */
        static final /* synthetic */ boolean f29100a;

        /* renamed from: c */
        private AbstractC9246b<?> f29102c;

        /* renamed from: g */
        private long f29106g;

        /* renamed from: i */
        private ByteBuffer f29108i;

        /* renamed from: d */
        private long f29103d = SystemClock.elapsedRealtime();

        /* renamed from: e */
        private final Object f29104e = new Object();

        /* renamed from: f */
        private boolean f29105f = true;

        /* renamed from: h */
        private int f29107h = 0;

        static {
            f29100a = !C9236a.class.desiredAssertionStatus();
        }

        RunnableC9242e(AbstractC9246b<?> abstractC9246b) {
            this.f29102c = abstractC9246b;
        }

        @SuppressLint({"Assert"})
        /* renamed from: a */
        void m8830a() {
            if (f29100a || C9236a.this.f29094p.getState() == Thread.State.TERMINATED) {
                this.f29102c.mo8645a();
                this.f29102c = null;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        void m8829a(boolean z) {
            synchronized (this.f29104e) {
                this.f29105f = z;
                this.f29104e.notifyAll();
            }
        }

        /* renamed from: a */
        void m8828a(byte[] bArr, Camera camera) {
            synchronized (this.f29104e) {
                if (this.f29108i != null) {
                    camera.addCallbackBuffer(this.f29108i.array());
                    this.f29108i = null;
                }
                if (!C9236a.this.f29096r.containsKey(bArr)) {
                    Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                    return;
                }
                this.f29106g = SystemClock.elapsedRealtime() - this.f29103d;
                this.f29107h++;
                this.f29108i = (ByteBuffer) C9236a.this.f29096r.get(bArr);
                this.f29104e.notifyAll();
            }
        }

        @Override // java.lang.Runnable
        @SuppressLint({"InlinedApi"})
        public void run() {
            C9274d m8757a;
            while (true) {
                synchronized (this.f29104e) {
                    while (this.f29105f && this.f29108i == null) {
                        try {
                            this.f29104e.wait();
                        } catch (InterruptedException e) {
                            Log.d("CameraSource", "Frame processing loop terminated.", e);
                            return;
                        }
                    }
                    if (!this.f29105f) {
                        return;
                    }
                    m8757a = new C9274d.C9276a().m8753a(this.f29108i, C9236a.this.f29086h.m23759a(), C9236a.this.f29086h.m23757b(), 17).m8756a(this.f29107h).m8755a(this.f29106g).m8752b(C9236a.this.f29085g).m8757a();
                    ByteBuffer byteBuffer = this.f29108i;
                    this.f29108i = null;
                }
                try {
                    this.f29102c.mo8736b(m8757a);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.vision.a$f */
    /* loaded from: classes2.dex */
    private class C9243f implements Camera.PictureCallback {

        /* renamed from: b */
        private AbstractC9239b f29110b;

        private C9243f() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            if (this.f29110b != null) {
                this.f29110b.m8832a(bArr);
            }
            synchronized (C9236a.this.f29082d) {
                if (C9236a.this.f29083e != null) {
                    C9236a.this.f29083e.startPreview();
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.vision.a$g */
    /* loaded from: classes2.dex */
    private class C9244g implements Camera.ShutterCallback {

        /* renamed from: b */
        private AbstractC9240c f29112b;

        private C9244g() {
        }

        @Override // android.hardware.Camera.ShutterCallback
        public void onShutter() {
            if (this.f29112b != null) {
                this.f29112b.m8831a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.vision.a$h */
    /* loaded from: classes2.dex */
    public static class C9245h {

        /* renamed from: a */
        private C4549a f29113a;

        /* renamed from: b */
        private C4549a f29114b;

        public C9245h(Camera.Size size, Camera.Size size2) {
            this.f29113a = new C4549a(size.width, size.height);
            if (size2 != null) {
                this.f29114b = new C4549a(size2.width, size2.height);
            }
        }

        /* renamed from: a */
        public C4549a m8825a() {
            return this.f29113a;
        }

        /* renamed from: b */
        public C4549a m8824b() {
            return this.f29114b;
        }
    }

    private C9236a() {
        this.f29082d = new Object();
        this.f29084f = 0;
        this.f29087i = 30.0f;
        this.f29088j = 1024;
        this.f29089k = 768;
        this.f29090l = false;
        this.f29096r = new HashMap();
    }

    /* renamed from: a */
    private static int m8864a(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    static C9245h m8861a(Camera camera, int i, int i2) {
        int i3;
        C9245h c9245h;
        C9245h c9245h2 = null;
        int i4 = Integer.MAX_VALUE;
        for (C9245h c9245h3 : m8863a(camera)) {
            C4549a m8825a = c9245h3.m8825a();
            int abs = Math.abs(m8825a.m23757b() - i2) + Math.abs(m8825a.m23759a() - i);
            if (abs < i4) {
                c9245h = c9245h3;
                i3 = abs;
            } else {
                i3 = i4;
                c9245h = c9245h2;
            }
            i4 = i3;
            c9245h2 = c9245h;
        }
        return c9245h2;
    }

    /* renamed from: a */
    static List<C9245h> m8863a(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            float f = size.width / size.height;
            Iterator<Camera.Size> it2 = supportedPictureSizes.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Camera.Size next = it2.next();
                    if (Math.abs(f - (next.width / next.height)) < 0.01f) {
                        arrayList.add(new C9245h(size, next));
                        break;
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
            for (Camera.Size size2 : supportedPreviewSizes) {
                arrayList.add(new C9245h(size2, null));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m8860a(Camera camera, Camera.Parameters parameters, int i) {
        int i2;
        int i3;
        int i4;
        int rotation = ((WindowManager) this.f29081c.getSystemService("window")).getDefaultDisplay().getRotation();
        switch (rotation) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 90;
                break;
            case 2:
                i2 = Opcodes.GETFIELD;
                break;
            case 3:
                i2 = 270;
                break;
            default:
                Log.e("CameraSource", new StringBuilder(31).append("Bad rotation value: ").append(rotation).toString());
                i2 = 0;
                break;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        if (cameraInfo.facing == 1) {
            i4 = (i2 + cameraInfo.orientation) % 360;
            i3 = (360 - i4) % 360;
        } else {
            i3 = ((cameraInfo.orientation - i2) + 360) % 360;
            i4 = i3;
        }
        this.f29085g = i4 / 90;
        camera.setDisplayOrientation(i3);
        parameters.setRotation(i4);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private byte[] m8858a(C4549a c4549a) {
        byte[] bArr = new byte[((int) Math.ceil((ImageFormat.getBitsPerPixel(17) * (c4549a.m23757b() * c4549a.m23759a())) / 8.0d)) + 1];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.f29096r.put(bArr, wrap);
        return bArr;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    static int[] m8862a(Camera camera, float f) {
        int i;
        int[] iArr;
        int i2 = (int) (1000.0f * f);
        int[] iArr2 = null;
        int i3 = Integer.MAX_VALUE;
        for (int[] iArr3 : camera.getParameters().getSupportedPreviewFpsRange()) {
            int abs = Math.abs(i2 - iArr3[0]) + Math.abs(i2 - iArr3[1]);
            if (abs < i3) {
                iArr = iArr3;
                i = abs;
            } else {
                i = i3;
                iArr = iArr2;
            }
            i3 = i;
            iArr2 = iArr;
        }
        return iArr2;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: f */
    private Camera m8840f() {
        int m8864a = m8864a(this.f29084f);
        if (m8864a == -1) {
            throw new RuntimeException("Could not find requested camera.");
        }
        Camera open = Camera.open(m8864a);
        C9245h m8861a = m8861a(open, this.f29088j, this.f29089k);
        if (m8861a == null) {
            throw new RuntimeException("Could not find suitable preview size.");
        }
        C4549a m8824b = m8861a.m8824b();
        this.f29086h = m8861a.m8825a();
        int[] m8862a = m8862a(open, this.f29087i);
        if (m8862a == null) {
            throw new RuntimeException("Could not find suitable preview frames per second range.");
        }
        Camera.Parameters parameters = open.getParameters();
        if (m8824b != null) {
            parameters.setPictureSize(m8824b.m23759a(), m8824b.m23757b());
        }
        parameters.setPreviewSize(this.f29086h.m23759a(), this.f29086h.m23757b());
        parameters.setPreviewFpsRange(m8862a[0], m8862a[1]);
        parameters.setPreviewFormat(17);
        m8860a(open, parameters, m8864a);
        if (this.f29090l) {
            if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                parameters.setFocusMode("continuous-video");
            } else {
                Log.i("CameraSource", "Camera auto focus is not supported on this device.");
            }
        }
        open.setParameters(parameters);
        open.setPreviewCallbackWithBuffer(new C9241d());
        open.addCallbackBuffer(m8858a(this.f29086h));
        open.addCallbackBuffer(m8858a(this.f29086h));
        open.addCallbackBuffer(m8858a(this.f29086h));
        open.addCallbackBuffer(m8858a(this.f29086h));
        return open;
    }

    @RequiresPermission("android.permission.CAMERA")
    /* renamed from: a */
    public C9236a m8859a(SurfaceHolder surfaceHolder) {
        synchronized (this.f29082d) {
            if (this.f29083e == null) {
                this.f29083e = m8840f();
                this.f29083e.setPreviewDisplay(surfaceHolder);
                this.f29083e.startPreview();
                this.f29094p = new Thread(this.f29095q);
                this.f29095q.m8829a(true);
                this.f29094p.start();
                this.f29093o = false;
            }
        }
        return this;
    }

    /* renamed from: a */
    public void m8865a() {
        synchronized (this.f29082d) {
            m8847c();
            this.f29095q.m8830a();
        }
    }

    /* renamed from: a */
    public void m8857a(AbstractC9240c abstractC9240c, AbstractC9239b abstractC9239b) {
        synchronized (this.f29082d) {
            if (this.f29083e != null) {
                C9244g c9244g = new C9244g();
                c9244g.f29112b = abstractC9240c;
                C9243f c9243f = new C9243f();
                c9243f.f29110b = abstractC9239b;
                this.f29083e.takePicture(c9244g, null, null, c9243f);
            }
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    /* renamed from: b */
    public C9236a m8850b() {
        synchronized (this.f29082d) {
            if (this.f29083e == null) {
                this.f29083e = m8840f();
                if (Build.VERSION.SDK_INT >= 11) {
                    this.f29092n = new SurfaceTexture(100);
                    this.f29083e.setPreviewTexture(this.f29092n);
                    this.f29093o = true;
                } else {
                    this.f29091m = new SurfaceView(this.f29081c);
                    this.f29083e.setPreviewDisplay(this.f29091m.getHolder());
                    this.f29093o = false;
                }
                this.f29083e.startPreview();
                this.f29094p = new Thread(this.f29095q);
                this.f29095q.m8829a(true);
                this.f29094p.start();
            }
        }
        return this;
    }

    /* renamed from: c */
    public void m8847c() {
        synchronized (this.f29082d) {
            this.f29095q.m8829a(false);
            if (this.f29094p != null) {
                try {
                    this.f29094p.join();
                } catch (InterruptedException e) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.f29094p = null;
            }
            if (this.f29083e != null) {
                this.f29083e.stopPreview();
                this.f29083e.setPreviewCallbackWithBuffer(null);
                try {
                    if (this.f29093o) {
                        this.f29083e.setPreviewTexture(null);
                    } else {
                        this.f29083e.setPreviewDisplay(null);
                    }
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2);
                    Log.e("CameraSource", new StringBuilder(String.valueOf(valueOf).length() + 32).append("Failed to clear camera preview: ").append(valueOf).toString());
                }
                this.f29083e.release();
                this.f29083e = null;
            }
            this.f29096r.clear();
        }
    }

    /* renamed from: d */
    public C4549a m8844d() {
        return this.f29086h;
    }

    /* renamed from: e */
    public int m8842e() {
        return this.f29084f;
    }
}
