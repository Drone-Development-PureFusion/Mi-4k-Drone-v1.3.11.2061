package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.C1514f;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.entity.CameraMountState;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.widget.FimiVideoView;
import com.fimi.soul.module.setting.C2918f;
import com.fimi.soul.utils.C3123g;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.utils.C3137t;
import com.fimi.soul.utils.C3144w;
import com.fimi.soul.view.WriteCamera9Grid;
import java.io.File;
/* renamed from: com.fimi.soul.module.droneFragment.b */
/* loaded from: classes.dex */
public class View$OnTouchListenerC2622b implements View.OnTouchListener, FimiVideoView.OnFimiPreviewCallBackListener {

    /* renamed from: b */
    private FimiVideoView f8779b;

    /* renamed from: c */
    private View f8780c;

    /* renamed from: d */
    private Activity f8781d;

    /* renamed from: e */
    private int f8782e;

    /* renamed from: f */
    private int f8783f;

    /* renamed from: g */
    private View f8784g;

    /* renamed from: h */
    private TextView f8785h;

    /* renamed from: k */
    private WriteCamera9Grid f8788k;

    /* renamed from: p */
    private SharedPreferences f8793p;

    /* renamed from: r */
    private boolean f8795r;

    /* renamed from: s */
    private boolean f8796s;

    /* renamed from: t */
    private boolean f8797t;

    /* renamed from: u */
    private int f8798u;

    /* renamed from: w */
    private C2626a f8800w;

    /* renamed from: x */
    private boolean f8801x;

    /* renamed from: z */
    private boolean f8803z;

    /* renamed from: l */
    private EnumC2627b f8789l = EnumC2627b.IDLE;

    /* renamed from: m */
    private String f8790m = null;

    /* renamed from: n */
    private CameraMountState f8791n = CameraMountState.IDLE;

    /* renamed from: o */
    private CameraMountState f8792o = CameraMountState.IDLE;

    /* renamed from: a */
    DisplayMetrics f8778a = new DisplayMetrics();

    /* renamed from: q */
    private int f8794q = -1;

    /* renamed from: v */
    private final int f8799v = 30;

    /* renamed from: y */
    private long f8802y = System.currentTimeMillis();

    /* renamed from: A */
    private long f8777A = System.currentTimeMillis();

    /* renamed from: i */
    private float f8786i = this.f8778a.widthPixels;

    /* renamed from: j */
    private float f8787j = this.f8778a.heightPixels;

    /* renamed from: com.fimi.soul.module.droneFragment.b$a */
    /* loaded from: classes.dex */
    public class C2626a extends Thread {
        public C2626a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!View$OnTouchListenerC2622b.this.f8801x) {
                if (View$OnTouchListenerC2622b.this.f8798u != 0 && View$OnTouchListenerC2622b.this.f8791n == CameraMountState.MOUNT) {
                    C3123g.m29090a().m29089a(" 进入自动拉流线程----");
                    View$OnTouchListenerC2622b.this.f8779b.restart();
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.fimi.soul.module.droneFragment.b$b */
    /* loaded from: classes.dex */
    public enum EnumC2627b {
        IDLE,
        START,
        STOP
    }

    /* renamed from: com.fimi.soul.module.droneFragment.b$c */
    /* loaded from: classes.dex */
    public interface AbstractC2628c {
        /* renamed from: a */
        void mo30957a(int i, int i2, int i3);
    }

    public View$OnTouchListenerC2622b(Activity activity, View view) {
        ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRealMetrics(this.f8778a);
        m30994a(view);
        this.f8781d = activity;
        this.f8784g = view;
        m30985b();
        if (this.f8793p == null && activity != null) {
            this.f8793p = C1681v.m34543a(activity).m34546a();
        }
        this.f8800w = new C2626a();
        this.f8800w.start();
    }

    /* renamed from: a */
    private void m30994a(View view) {
        this.f8779b = (FimiVideoView) view.findViewById(C1704R.C1706id.ids_video_view);
        this.f8779b.setKeepScreenOn(true);
        this.f8779b.setZOrderMediaOverlay(true);
        this.f8779b.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: com.fimi.soul.module.droneFragment.b.1
            @Override // com.fimi.soul.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                return false;
            }
        });
        this.f8780c = view.findViewById(C1704R.C1706id.control_cantairn);
        this.f8780c.setVisibility(0);
        view.setOnTouchListener(this);
        this.f8785h = (TextView) view.findViewById(C1704R.C1706id.gc_error_text);
        this.f8788k = (WriteCamera9Grid) view.findViewById(C1704R.C1706id.gridviewCamera);
        this.f8779b.setOnPreviewCallBackListener(this);
    }

    /* renamed from: u */
    private void m30958u() {
        this.f8779b.startLiveVideo(this.f8790m);
        this.f8796s = false;
    }

    /* renamed from: a */
    public Activity m30995a() {
        return this.f8781d;
    }

    /* renamed from: a */
    public void m30993a(CameraMountState cameraMountState) {
        this.f8791n = cameraMountState;
        C3123g.m29090a().m29089a("---stopPreview-----CoordinatorState-" + this.f8789l);
        if (this.f8789l == EnumC2627b.IDLE) {
            return;
        }
        this.f8780c.setVisibility(0);
        C3123g.m29090a().m29089a("---stopPreview----1");
        this.f8798u = 0;
        this.f8779b.clearUri();
        this.f8779b.stopPlay();
        this.f8779b.stopFlightVideo();
        if (this.f8790m == null) {
            return;
        }
        this.f8779b.stopLiveVideo();
    }

    /* renamed from: a */
    public void m30992a(CameraMountState cameraMountState, boolean z, boolean z2) {
        this.f8798u = 0;
        this.f8791n = cameraMountState;
        if (this.f8789l == EnumC2627b.IDLE) {
            return;
        }
        if (cameraMountState != CameraMountState.MOUNT) {
            this.f8779b.clearUri();
        } else {
            this.f8779b.setVideoPath(C1831e.m33974d());
        }
        C3123g.m29090a().m29089a("---startPreview---CoordinatorState-" + this.f8789l);
        this.f8779b.startPreview();
    }

    /* renamed from: a */
    public void m30991a(AbstractC2628c abstractC2628c) {
        this.f8779b.setLiveVideoCallBackListener(abstractC2628c);
    }

    /* renamed from: a */
    public void m30988a(String str) {
        this.f8796s = true;
        this.f8790m = str;
    }

    /* renamed from: a */
    public void m30987a(String str, int i) {
        File[] m29016a = new C3144w().m29016a(C3129m.m29052o(), C2918f.f10429a);
        File[] fileArr = new File[i];
        if (m29016a != null) {
            for (int i2 = 0; i2 < i && i2 < m29016a.length; i2++) {
                fileArr[i2] = m29016a[i2];
            }
        }
        new C3137t(fileArr, str).m29027a();
    }

    /* renamed from: a */
    public void m30986a(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f8784g.getLayoutParams();
        if (this.f8782e <= 10 || this.f8783f <= 10) {
            layoutParams.height = this.f8778a.heightPixels;
            layoutParams.width = this.f8778a.widthPixels;
        } else {
            layoutParams.height = this.f8783f;
            layoutParams.width = this.f8782e;
        }
        this.f8779b.setDecodeType(0);
        if (this.f8791n != CameraMountState.MOUNT) {
            C3123g.m29090a().m29089a("clearUri");
            this.f8779b.clearUri();
        } else {
            C3123g.m29090a().m29089a("X11CmdConstants.getX11_RTSP_ADDR() " + C1831e.m33974d());
            this.f8779b.setVideoPath(C1831e.m33974d());
        }
        this.f8784g.setLayoutParams(layoutParams);
        if (!z || this.f8791n != CameraMountState.MOUNT || !this.f8779b.isPlaying()) {
            this.f8780c.setVisibility(0);
        } else {
            this.f8780c.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void m30985b() {
        ViewGroup.LayoutParams layoutParams = this.f8784g.getLayoutParams();
        this.f8783f = layoutParams.height;
        this.f8782e = layoutParams.width;
        layoutParams.height = 10;
        layoutParams.width = 10;
        this.f8784g.setLayoutParams(layoutParams);
        this.f8780c.setVisibility(0);
    }

    /* renamed from: b */
    public void m30984b(CameraMountState cameraMountState) {
        this.f8791n = cameraMountState;
        if (cameraMountState == CameraMountState.DISMOUNT) {
            this.f8792o = this.f8791n;
        }
        if (cameraMountState == CameraMountState.MOUNT) {
            this.f8779b.setUri(C1831e.m33974d());
        }
        if (this.f8794q == 1 && cameraMountState == CameraMountState.MOUNT) {
            C3123g.m29090a().m29089a("onCameraState startPreview");
            CameraValue.isFindFirmware = false;
            CameraValue.isUpdate = false;
            m30992a(CameraMountState.MOUNT, true, true);
        }
    }

    /* renamed from: b */
    public void m30982b(String str) {
        if (str == null) {
            this.f8785h.setVisibility(8);
            return;
        }
        this.f8785h.setVisibility(0);
        this.f8785h.setText(str);
    }

    /* renamed from: b */
    public void m30981b(String str, int i) {
        C3144w c3144w = new C3144w();
        File[] m29014c = c3144w.m29014c(C3129m.m29051p() + "/" + str);
        if (m29014c == null || m29014c.length <= i) {
            return;
        }
        while (i < m29014c.length) {
            c3144w.m29018a(m29014c[i]);
            i++;
        }
    }

    /* renamed from: c */
    public String m30978c(String str) {
        C3144w c3144w;
        String m29017a;
        String m29015b;
        if (!this.f8779b.isPlaying() || (m29017a = (c3144w = new C3144w()).m29017a(C3129m.m29054m())) == null || (m29015b = c3144w.m29015b(m29017a + "/DroneData")) == null) {
            return null;
        }
        File file = new File(C3129m.m29051p() + "/" + str + "/" + m29015b);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* renamed from: c */
    public void m30980c() {
    }

    /* renamed from: d */
    public void m30977d() {
        if (this.f8789l != EnumC2627b.IDLE) {
            return;
        }
        this.f8789l = EnumC2627b.START;
        this.f8779b.setVisibility(0);
        this.f8779b.start();
        this.f8779b.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: com.fimi.soul.module.droneFragment.b.2
            @Override // com.fimi.soul.media.player.IMediaPlayer.OnPreparedListener
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                C3123g.m29090a().m29089a("onPrepared=====playerErrorCount " + View$OnTouchListenerC2622b.this.f8798u);
            }

            @Override // com.fimi.soul.media.player.IMediaPlayer.OnPreparedListener
            public void onStartStream() {
                View$OnTouchListenerC2622b.this.f8798u = 0;
                View$OnTouchListenerC2622b.this.f8780c.setVisibility(8);
                C3123g.m29090a().m29089a("onPrepared=====onStartStream ");
            }
        });
        this.f8779b.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: com.fimi.soul.module.droneFragment.b.3
            @Override // com.fimi.soul.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                View$OnTouchListenerC2622b.this.f8779b.toggleAspectRatio();
                return false;
            }
        });
    }

    /* renamed from: e */
    public void m30975e() {
        this.f8779b.stopLiveVideo();
        this.f8790m = null;
    }

    /* renamed from: f */
    public void m30973f() {
        this.f8789l = EnumC2627b.STOP;
        this.f8780c.setVisibility(0);
        if (this.f8779b.isPlaying()) {
        }
    }

    /* renamed from: g */
    public void m30972g() {
        this.f8780c.setVisibility(0);
        this.f8779b.setVisibility(8);
    }

    /* renamed from: h */
    public void m30971h() {
        if (this.f8793p == null || !C1642c.m34885e().m34503n() || this.f8788k == null || this.f8788k.isShown()) {
            return;
        }
        this.f8788k.setVisibility(0);
    }

    /* renamed from: i */
    public void m30970i() {
        if (this.f8788k == null || !this.f8788k.isShown()) {
            return;
        }
        this.f8788k.setVisibility(8);
    }

    /* renamed from: j */
    public void m30969j() {
        if (!C1772d.m34208a().m34187k() || System.currentTimeMillis() - this.f8802y <= 1000) {
            return;
        }
        this.f8802y = System.currentTimeMillis();
        C3123g.m29090a().m29089a("4K拍照断流 restart release");
        this.f8779b.restart();
    }

    /* renamed from: k */
    public void m30968k() {
        this.f8803z = true;
    }

    /* renamed from: l */
    public void m30967l() {
        if (this.f8803z) {
            return;
        }
        if (this.f8789l == EnumC2627b.IDLE) {
            CameraValue.isCameraParameterChange = false;
            return;
        }
        if (CameraValue.isCameraParameterChange) {
            C3123g.m29090a().m29089a("restartByCameraParameter restart");
            this.f8779b.restart();
        }
        CameraValue.isCameraParameterChange = false;
    }

    /* renamed from: m */
    public void m30966m() {
        if (this.f8789l == EnumC2627b.IDLE) {
            return;
        }
        this.f8780c.setVisibility(0);
        C3123g.m29090a().m29089a("---stopPreview----2");
        this.f8779b.stopPlay();
        this.f8779b.stopFlightVideo();
        if (this.f8790m == null) {
            return;
        }
        this.f8779b.stopLiveVideo();
    }

    /* renamed from: n */
    public void m30965n() {
        this.f8797t = true;
        m30966m();
    }

    /* renamed from: o */
    public void m30964o() {
        if (this.f8779b != null && System.currentTimeMillis() - this.f8777A > 5000) {
            this.f8777A = System.currentTimeMillis();
            String m30978c = m30978c(C3129m.m29050q());
            if (m30978c != null && this.f8779b.isPlaying()) {
                m30987a(m30978c, 2);
            }
        }
        m30981b(C3129m.m29050q(), 5);
    }

    @Override // com.fimi.soul.media.player.widget.FimiVideoView.OnFimiPreviewCallBackListener
    public void onCompletion(int i) {
        C3123g.m29090a().m29089a("--- playerErrorCount " + this.f8798u + " code = " + i);
        if (i != 100 || this.f8791n != CameraMountState.MOUNT || CameraValue.isFindFirmware || this.f8798u >= 30 || CameraValue.isCameraParameterChange) {
            return;
        }
        C3123g.m29090a().m29089a("---onCompletion----restart playerErrorCount " + this.f8798u);
        if (this.f8790m != null) {
            this.f8779b.stopLiveVideo();
        }
        this.f8779b.restart();
        this.f8798u++;
    }

    @Override // com.fimi.soul.media.player.widget.FimiVideoView.OnFimiPreviewCallBackListener
    public void onSurfaceState(int i) {
        this.f8794q = i;
        C3123g.m29090a().m29089a("onSurfaceState 22222222222 " + i + " " + this.f8791n + " " + this.f8795r);
        if (i == 1 && CameraMountState.MOUNT == this.f8791n) {
            CameraValue.isFindFirmware = false;
            CameraValue.isUpdate = false;
            if (this.f8792o != CameraMountState.MOUNT) {
                C3123g.m29090a().m29089a("onSurfaceState 1 " + i + " " + this.f8791n + " " + this.f8795r);
                this.f8792o = this.f8791n;
                if (this.f8798u != 0) {
                    this.f8779b.restart();
                } else if (!this.f8803z || !CameraValue.isCameraParameterChange) {
                    m30992a(CameraMountState.MOUNT, true, true);
                } else {
                    this.f8803z = false;
                    m30967l();
                }
                if (!this.f8796s) {
                    this.f8803z = false;
                    return;
                }
                m30958u();
                this.f8797t = false;
            } else if (this.f8795r) {
                C3123g.m29090a().m29089a("onSurfaceState 2 " + i + " " + this.f8791n + " " + this.f8795r);
                m30992a(CameraMountState.MOUNT, true, true);
                this.f8795r = false;
                this.f8803z = false;
            } else if (this.f8796s) {
                C3123g.m29090a().m29089a("onSurfaceState 3 " + i + " " + this.f8791n + " ");
                m30992a(CameraMountState.MOUNT, true, true);
                m30958u();
                this.f8797t = false;
            } else if (this.f8797t) {
                C3123g.m29090a().m29089a("onSurfaceState 4 " + i + " " + this.f8791n + " ");
                m30992a(CameraMountState.MOUNT, true, true);
                this.f8797t = false;
            } else {
                if (this.f8803z && CameraValue.isCameraParameterChange) {
                    C3123g.m29090a().m29089a("onSurfaceState 555555555555 " + i + " " + this.f8791n + " " + this.f8795r);
                    if (C1514f.m35431a().m35429b() == EnumC1495b.X1BH) {
                        this.f8803z = false;
                    }
                    m30967l();
                }
                this.f8803z = false;
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x < this.f8786i / 3.0f || x > (this.f8786i * 2.0f) / 3.0f || y < this.f8787j / 3.0f || y > (this.f8787j * 2.0f) / 3.0f;
    }

    /* renamed from: p */
    public void m30963p() {
        if (this.f8779b != null && System.currentTimeMillis() - this.f8777A > 5000) {
            this.f8777A = System.currentTimeMillis();
            String m30978c = m30978c(C3129m.m29048s());
            if (m30978c != null && this.f8779b.isPlaying()) {
                m30987a(m30978c, 5);
            }
        }
        m30981b(C3129m.m29048s(), 5);
    }

    /* renamed from: q */
    public void m30962q() {
        if (this.f8779b != null && System.currentTimeMillis() - this.f8777A > 5000) {
            this.f8777A = System.currentTimeMillis();
            String m30978c = m30978c(C3129m.m29049r());
            if (m30978c != null && this.f8779b.isPlaying()) {
                m30987a(m30978c, 4);
            }
        }
        m30981b(C3129m.m29049r(), 3);
    }

    /* renamed from: r */
    public void m30961r() {
        this.f8795r = true;
    }

    /* renamed from: s */
    public void m30960s() {
        m30959t();
        this.f8779b.release(true);
    }

    /* renamed from: t */
    public void m30959t() {
        if (this.f8800w != null) {
            this.f8801x = true;
            this.f8800w.isInterrupted();
        }
    }
}
