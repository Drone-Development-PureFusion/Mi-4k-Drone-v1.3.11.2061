package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.overlay.C3676v;
import com.google.android.gms.internal.AbstractC7779ub;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
@aaa
@TargetApi(14)
/* renamed from: com.google.android.gms.ads.internal.overlay.w */
/* loaded from: classes.dex */
public class C3679w extends Thread implements SurfaceTexture.OnFrameAvailableListener, C3676v.AbstractC3678a {

    /* renamed from: a */
    private static final float[] f14353a = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private volatile boolean f14354A;

    /* renamed from: B */
    private volatile boolean f14355B;

    /* renamed from: b */
    private final C3676v f14356b;

    /* renamed from: k */
    private float f14365k;

    /* renamed from: l */
    private float f14366l;

    /* renamed from: m */
    private int f14367m;

    /* renamed from: n */
    private int f14368n;

    /* renamed from: o */
    private SurfaceTexture f14369o;

    /* renamed from: p */
    private SurfaceTexture f14370p;

    /* renamed from: q */
    private int f14371q;

    /* renamed from: r */
    private int f14372r;

    /* renamed from: s */
    private int f14373s;

    /* renamed from: w */
    private EGL10 f14377w;

    /* renamed from: x */
    private EGLDisplay f14378x;

    /* renamed from: y */
    private EGLContext f14379y;

    /* renamed from: z */
    private EGLSurface f14380z;

    /* renamed from: t */
    private FloatBuffer f14374t = ByteBuffer.allocateDirect(f14353a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: c */
    private final float[] f14357c = new float[9];

    /* renamed from: d */
    private final float[] f14358d = new float[9];

    /* renamed from: e */
    private final float[] f14359e = new float[9];

    /* renamed from: f */
    private final float[] f14360f = new float[9];

    /* renamed from: g */
    private final float[] f14361g = new float[9];

    /* renamed from: h */
    private final float[] f14362h = new float[9];

    /* renamed from: i */
    private final float[] f14363i = new float[9];

    /* renamed from: j */
    private float f14364j = Float.NaN;

    /* renamed from: u */
    private final CountDownLatch f14375u = new CountDownLatch(1);

    /* renamed from: v */
    private final Object f14376v = new Object();

    public C3679w(Context context) {
        super("SphericalVideoProcessor");
        this.f14374t.put(f14353a).position(0);
        this.f14356b = new C3676v(context);
        this.f14356b.m27157a(this);
    }

    /* renamed from: a */
    private float m27146a(float[] fArr) {
        float[] m27144a = m27144a(fArr, new float[]{0.0f, 1.0f, 0.0f});
        return ((float) Math.atan2(m27144a[1], m27144a[0])) - 1.5707964f;
    }

    /* renamed from: a */
    private int m27149a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m27147a("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            m27147a("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            m27147a("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            m27147a("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", new StringBuilder(37).append("Could not compile shader ").append(i).append(":").toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                m27147a("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    /* renamed from: a */
    private void m27147a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", new StringBuilder(String.valueOf(str).length() + 21).append(str).append(": glError ").append(glGetError).toString());
        }
    }

    /* renamed from: a */
    private void m27145a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = (float) Math.cos(f);
        fArr[5] = (float) (-Math.sin(f));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(f);
        fArr[8] = (float) Math.cos(f);
    }

    /* renamed from: a */
    private void m27143a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: a */
    private float[] m27144a(float[] fArr, float[] fArr2) {
        return new float[]{(fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]), (fArr[3] * fArr2[0]) + (fArr[4] * fArr2[1]) + (fArr[5] * fArr2[2]), (fArr[6] * fArr2[0]) + (fArr[7] * fArr2[1]) + (fArr[8] * fArr2[2])};
    }

    /* renamed from: b */
    private void m27141b(float[] fArr, float f) {
        fArr[0] = (float) Math.cos(f);
        fArr[1] = (float) (-Math.sin(f));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(f);
        fArr[4] = (float) Math.cos(f);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: h */
    private void m27135h() {
        GLES20.glViewport(0, 0, this.f14368n, this.f14367m);
        m27147a("viewport");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f14371q, "uFOVx");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f14371q, "uFOVy");
        if (this.f14368n > this.f14367m) {
            GLES20.glUniform1f(glGetUniformLocation, 0.87266463f);
            GLES20.glUniform1f(glGetUniformLocation2, (this.f14367m * 0.87266463f) / this.f14368n);
            return;
        }
        GLES20.glUniform1f(glGetUniformLocation, (this.f14368n * 0.87266463f) / this.f14367m);
        GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
    }

    /* renamed from: i */
    private int m27134i() {
        int m27149a;
        int m27149a2 = m27149a(35633, m27132k());
        if (m27149a2 == 0 || (m27149a = m27149a(35632, m27131l())) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        m27147a("createProgram");
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, m27149a2);
            m27147a("attachShader");
            GLES20.glAttachShader(glCreateProgram, m27149a);
            m27147a("attachShader");
            GLES20.glLinkProgram(glCreateProgram);
            m27147a("linkProgram");
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            m27147a("getProgramiv");
            if (iArr[0] != 1) {
                Log.e("SphericalVideoRenderer", "Could not link program: ");
                Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                m27147a("deleteProgram");
                return 0;
            }
            GLES20.glValidateProgram(glCreateProgram);
            m27147a("validateProgram");
        }
        return glCreateProgram;
    }

    @Nullable
    /* renamed from: j */
    private EGLConfig m27133j() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (this.f14377w.eglChooseConfig(this.f14378x, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) {
            return eGLConfigArr[0];
        }
        return null;
    }

    /* renamed from: k */
    private String m27132k() {
        AbstractC7779ub<String> abstractC7779ub = C7788uf.f25746aD;
        return !abstractC7779ub.m13486c().equals(abstractC7779ub.m13488b()) ? abstractC7779ub.m13486c() : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
    }

    /* renamed from: l */
    private String m27131l() {
        AbstractC7779ub<String> abstractC7779ub = C7788uf.f25747aE;
        return !abstractC7779ub.m13486c().equals(abstractC7779ub.m13488b()) ? abstractC7779ub.m13486c() : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
    }

    @Override // com.google.android.gms.ads.internal.overlay.C3676v.AbstractC3678a
    /* renamed from: a */
    public void mo27152a() {
        synchronized (this.f14376v) {
            this.f14376v.notifyAll();
        }
    }

    /* renamed from: a */
    public void m27151a(float f, float f2) {
        float f3;
        float f4;
        if (this.f14368n > this.f14367m) {
            f3 = (1.7453293f * f) / this.f14368n;
            f4 = (1.7453293f * f2) / this.f14368n;
        } else {
            f3 = (1.7453293f * f) / this.f14367m;
            f4 = (1.7453293f * f2) / this.f14367m;
        }
        this.f14365k -= f3;
        this.f14366l -= f4;
        if (this.f14366l < -1.5707964f) {
            this.f14366l = -1.5707964f;
        }
        if (this.f14366l > 1.5707964f) {
            this.f14366l = 1.5707964f;
        }
    }

    /* renamed from: a */
    public void m27150a(int i, int i2) {
        synchronized (this.f14376v) {
            this.f14368n = i;
            this.f14367m = i2;
            this.f14354A = true;
            this.f14376v.notifyAll();
        }
    }

    /* renamed from: a */
    public void m27148a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f14368n = i;
        this.f14367m = i2;
        this.f14370p = surfaceTexture;
    }

    /* renamed from: b */
    public void m27142b() {
        synchronized (this.f14376v) {
            this.f14355B = true;
            this.f14370p = null;
            this.f14376v.notifyAll();
        }
    }

    /* renamed from: c */
    public SurfaceTexture m27140c() {
        if (this.f14370p == null) {
            return null;
        }
        try {
            this.f14375u.await();
        } catch (InterruptedException e) {
        }
        return this.f14369o;
    }

    /* renamed from: d */
    void m27139d() {
        while (this.f14373s > 0) {
            this.f14369o.updateTexImage();
            this.f14373s--;
        }
        if (this.f14356b.m27154b(this.f14357c)) {
            if (Float.isNaN(this.f14364j)) {
                this.f14364j = -m27146a(this.f14357c);
            }
            m27141b(this.f14362h, this.f14364j + this.f14365k);
        } else {
            m27145a(this.f14357c, -1.5707964f);
            m27141b(this.f14362h, this.f14365k);
        }
        m27145a(this.f14358d, 1.5707964f);
        m27143a(this.f14359e, this.f14362h, this.f14358d);
        m27143a(this.f14360f, this.f14357c, this.f14359e);
        m27145a(this.f14361g, this.f14366l);
        m27143a(this.f14363i, this.f14361g, this.f14360f);
        GLES20.glUniformMatrix3fv(this.f14372r, 1, false, this.f14363i, 0);
        GLES20.glDrawArrays(5, 0, 4);
        m27147a("drawArrays");
        GLES20.glFinish();
        this.f14377w.eglSwapBuffers(this.f14378x, this.f14380z);
    }

    /* renamed from: e */
    int m27138e() {
        this.f14371q = m27134i();
        GLES20.glUseProgram(this.f14371q);
        m27147a("useProgram");
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f14371q, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f14374t);
        m27147a("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        m27147a("enableVertexAttribArray");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m27147a("genTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        m27147a("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        m27147a("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        m27147a("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        m27147a("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        m27147a("texParameteri");
        this.f14372r = GLES20.glGetUniformLocation(this.f14371q, "uVMat");
        GLES20.glUniformMatrix3fv(this.f14372r, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        return i;
    }

    /* renamed from: f */
    boolean m27137f() {
        EGLConfig m27133j;
        this.f14377w = (EGL10) EGLContext.getEGL();
        this.f14378x = this.f14377w.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.f14378x == EGL10.EGL_NO_DISPLAY) {
            return false;
        }
        if (this.f14377w.eglInitialize(this.f14378x, new int[2]) && (m27133j = m27133j()) != null) {
            this.f14379y = this.f14377w.eglCreateContext(this.f14378x, m27133j, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            if (this.f14379y == null || this.f14379y == EGL10.EGL_NO_CONTEXT) {
                return false;
            }
            this.f14380z = this.f14377w.eglCreateWindowSurface(this.f14378x, m27133j, this.f14370p, null);
            if (this.f14380z == null || this.f14380z == EGL10.EGL_NO_SURFACE) {
                return false;
            }
            return this.f14377w.eglMakeCurrent(this.f14378x, this.f14380z, this.f14380z, this.f14379y);
        }
        return false;
    }

    /* renamed from: g */
    boolean m27136g() {
        boolean z = false;
        if (this.f14380z != null && this.f14380z != EGL10.EGL_NO_SURFACE) {
            z = this.f14377w.eglMakeCurrent(this.f14378x, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false | this.f14377w.eglDestroySurface(this.f14378x, this.f14380z);
            this.f14380z = null;
        }
        if (this.f14379y != null) {
            z |= this.f14377w.eglDestroyContext(this.f14378x, this.f14379y);
            this.f14379y = null;
        }
        if (this.f14378x != null) {
            boolean eglTerminate = z | this.f14377w.eglTerminate(this.f14378x);
            this.f14378x = null;
            return eglTerminate;
        }
        return z;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f14373s++;
        synchronized (this.f14376v) {
            this.f14376v.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.SurfaceTexture, android.graphics.SurfaceTexture$OnFrameAvailableListener] */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean z = true;
        if (this.f14370p == null) {
            abr.b("SphericalVideoProcessor started with no output texture.");
            this.f14375u.countDown();
            return;
        }
        boolean m27137f = m27137f();
        int m27138e = m27138e();
        if (this.f14371q == 0) {
            z = false;
        }
        if (!m27137f || !z) {
            String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.f14377w.eglGetError()));
            String concat = valueOf.length() != 0 ? "EGL initialization failed: ".concat(valueOf) : new String("EGL initialization failed: ");
            abr.b(concat);
            C3779u.m26886i().m18451a(new Throwable(concat), "SphericalVideoProcessor.run.1");
            m27136g();
            this.f14375u.countDown();
            return;
        }
        this.f14369o = new SurfaceTexture(m27138e);
        this.f14369o.setOnFrameAvailableListener(this);
        this.f14375u.countDown();
        this.f14356b.m27155b();
        try {
            this.f14354A = true;
            while (!this.f14355B) {
                m27139d();
                if (this.f14354A) {
                    m27135h();
                    this.f14354A = false;
                }
                try {
                    synchronized (this.f14376v) {
                        if (!this.f14355B && !this.f14354A && this.f14373s == 0) {
                            this.f14376v.wait();
                        }
                    }
                } catch (InterruptedException e) {
                }
            }
        } catch (IllegalStateException e2) {
            abr.d("SphericalVideoProcessor halted unexpectedly.");
        } catch (Throwable th) {
            abr.b("SphericalVideoProcessor died.", th);
            C3779u.m26886i().m18451a(th, "SphericalVideoProcessor.run.2");
        } finally {
            this.f14356b.m27153c();
            this.f14369o.setOnFrameAvailableListener(null);
            this.f14369o = null;
            m27136g();
        }
    }
}
