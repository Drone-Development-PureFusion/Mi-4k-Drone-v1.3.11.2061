package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.TextureView;
import android.view.View;
import com.fimi.soul.media.player.IMediaPlayer;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@aaa
@TargetApi(14)
/* renamed from: com.google.android.gms.ads.internal.overlay.c */
/* loaded from: classes.dex */
public class TextureView$SurfaceTextureListenerC3641c extends AbstractC3661i implements AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* renamed from: a */
    private static final Map<Integer, String> f14270a = new HashMap();

    /* renamed from: b */
    private final C3680x f14271b;

    /* renamed from: c */
    private final boolean f14272c;

    /* renamed from: f */
    private MediaPlayer f14275f;

    /* renamed from: g */
    private Uri f14276g;

    /* renamed from: h */
    private int f14277h;

    /* renamed from: i */
    private int f14278i;

    /* renamed from: j */
    private int f14279j;

    /* renamed from: k */
    private int f14280k;

    /* renamed from: l */
    private int f14281l;

    /* renamed from: n */
    private boolean f14283n;

    /* renamed from: o */
    private boolean f14284o;

    /* renamed from: p */
    private C3679w f14285p;

    /* renamed from: q */
    private boolean f14286q;

    /* renamed from: r */
    private int f14287r;

    /* renamed from: s */
    private AbstractC3660h f14288s;

    /* renamed from: d */
    private int f14273d = 0;

    /* renamed from: e */
    private int f14274e = 0;

    /* renamed from: m */
    private float f14282m = 1.0f;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f14270a.put(Integer.valueOf((int) IMediaPlayer.MEDIA_ERROR_IO), "MEDIA_ERROR_IO");
            f14270a.put(Integer.valueOf((int) IMediaPlayer.MEDIA_ERROR_MALFORMED), "MEDIA_ERROR_MALFORMED");
            f14270a.put(Integer.valueOf((int) IMediaPlayer.MEDIA_ERROR_UNSUPPORTED), "MEDIA_ERROR_UNSUPPORTED");
            f14270a.put(Integer.valueOf((int) IMediaPlayer.MEDIA_ERROR_TIMED_OUT), "MEDIA_ERROR_TIMED_OUT");
            f14270a.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f14270a.put(100, "MEDIA_ERROR_SERVER_DIED");
        f14270a.put(1, "MEDIA_ERROR_UNKNOWN");
        f14270a.put(1, "MEDIA_INFO_UNKNOWN");
        f14270a.put(Integer.valueOf((int) IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f14270a.put(Integer.valueOf((int) IMediaPlayer.MEDIA_INFO_BUFFERING_START), "MEDIA_INFO_BUFFERING_START");
        f14270a.put(Integer.valueOf((int) IMediaPlayer.MEDIA_INFO_BUFFERING_END), "MEDIA_INFO_BUFFERING_END");
        f14270a.put(Integer.valueOf((int) IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING), "MEDIA_INFO_BAD_INTERLEAVING");
        f14270a.put(Integer.valueOf((int) IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE), "MEDIA_INFO_NOT_SEEKABLE");
        f14270a.put(Integer.valueOf((int) IMediaPlayer.MEDIA_INFO_METADATA_UPDATE), "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            f14270a.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f14270a.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public TextureView$SurfaceTextureListenerC3641c(Context context, boolean z, boolean z2, C3680x c3680x) {
        super(context);
        setSurfaceTextureListener(this);
        this.f14271b = c3680x;
        this.f14286q = z;
        this.f14272c = z2;
        this.f14271b.m27128a((AbstractC3661i) this);
    }

    /* renamed from: a */
    private void m27246a(boolean z) {
        abr.m18409e("AdMediaPlayerView release");
        if (this.f14285p != null) {
            this.f14285p.m27142b();
            this.f14285p = null;
        }
        if (this.f14275f != null) {
            this.f14275f.reset();
            this.f14275f.release();
            this.f14275f = null;
            m27244b(0);
            if (z) {
                this.f14274e = 0;
                m27243c(0);
            }
            m27239j();
        }
    }

    /* renamed from: b */
    private void m27245b(float f) {
        if (this.f14275f == null) {
            abr.d("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
        try {
            this.f14275f.setVolume(f, f);
        } catch (IllegalStateException e) {
        }
    }

    /* renamed from: b */
    private void m27244b(int i) {
        if (i == 3) {
            this.f14271b.m27125c();
        } else if (this.f14273d == 3) {
            this.f14271b.m27123d();
        }
        this.f14273d = i;
    }

    /* renamed from: c */
    private void m27243c(int i) {
        this.f14274e = i;
    }

    /* renamed from: g */
    private void m27242g() {
        SurfaceTexture surfaceTexture;
        abr.m18409e("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f14276g == null || surfaceTexture2 == null) {
            return;
        }
        m27246a(false);
        try {
            this.f14275f = C3779u.m26873v().m27169a();
            this.f14275f.setOnBufferingUpdateListener(this);
            this.f14275f.setOnCompletionListener(this);
            this.f14275f.setOnErrorListener(this);
            this.f14275f.setOnInfoListener(this);
            this.f14275f.setOnPreparedListener(this);
            this.f14275f.setOnVideoSizeChangedListener(this);
            this.f14279j = 0;
            if (this.f14286q) {
                this.f14285p = new C3679w(getContext());
                this.f14285p.m27148a(surfaceTexture2, getWidth(), getHeight());
                this.f14285p.start();
                surfaceTexture = this.f14285p.m27140c();
                if (surfaceTexture == null) {
                    this.f14285p.m27142b();
                    this.f14285p = null;
                }
                this.f14275f.setDataSource(getContext(), this.f14276g);
                this.f14275f.setSurface(C3779u.m26872w().m27168a(surfaceTexture));
                this.f14275f.setAudioStreamType(3);
                this.f14275f.setScreenOnWhilePlaying(true);
                this.f14275f.prepareAsync();
                m27244b(1);
            }
            surfaceTexture = surfaceTexture2;
            this.f14275f.setDataSource(getContext(), this.f14276g);
            this.f14275f.setSurface(C3779u.m26872w().m27168a(surfaceTexture));
            this.f14275f.setAudioStreamType(3);
            this.f14275f.setScreenOnWhilePlaying(true);
            this.f14275f.prepareAsync();
            m27244b(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String valueOf = String.valueOf(this.f14276g);
            abr.d(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
            onError(this.f14275f, 1, 0);
        }
    }

    /* renamed from: h */
    private void m27241h() {
        if (this.f14272c && m27238k() && this.f14275f.getCurrentPosition() > 0 && this.f14274e != 3) {
            abr.m18409e("AdMediaPlayerView nudging MediaPlayer");
            m27245b(0.0f);
            this.f14275f.start();
            int currentPosition = this.f14275f.getCurrentPosition();
            long mo16434a = C3779u.m26884k().mo16434a();
            while (m27238k() && this.f14275f.getCurrentPosition() == currentPosition && C3779u.m26884k().mo16434a() - mo16434a <= 250) {
            }
            this.f14275f.pause();
            m27235n();
        }
    }

    /* renamed from: i */
    private void m27240i() {
        AudioManager m27234o = m27234o();
        if (m27234o == null || this.f14284o) {
            return;
        }
        if (m27234o.requestAudioFocus(this, 3, 2) == 1) {
            m27237l();
        } else {
            abr.d("AdMediaPlayerView audio focus request failed");
        }
    }

    /* renamed from: j */
    private void m27239j() {
        abr.m18409e("AdMediaPlayerView abandon audio focus");
        AudioManager m27234o = m27234o();
        if (m27234o == null || !this.f14284o) {
            return;
        }
        if (m27234o.abandonAudioFocus(this) == 1) {
            this.f14284o = false;
        } else {
            abr.d("AdMediaPlayerView abandon audio focus failed");
        }
    }

    /* renamed from: k */
    private boolean m27238k() {
        return (this.f14275f == null || this.f14273d == -1 || this.f14273d == 0 || this.f14273d == 1) ? false : true;
    }

    /* renamed from: l */
    private void m27237l() {
        abr.m18409e("AdMediaPlayerView audio focus gained");
        this.f14284o = true;
        m27235n();
    }

    /* renamed from: m */
    private void m27236m() {
        abr.m18409e("AdMediaPlayerView audio focus lost");
        this.f14284o = false;
        m27235n();
    }

    /* renamed from: n */
    private void m27235n() {
        if (this.f14283n || !this.f14284o) {
            m27245b(0.0f);
        } else {
            m27245b(this.f14282m);
        }
    }

    /* renamed from: o */
    private AudioManager m27234o() {
        return (AudioManager) getContext().getSystemService("audio");
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    /* renamed from: a */
    public String mo27210a() {
        String valueOf = String.valueOf(this.f14286q ? " spherical" : "");
        return valueOf.length() != 0 ? "MediaPlayer".concat(valueOf) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    /* renamed from: a */
    public void mo27209a(float f) {
        this.f14282m = f;
        m27235n();
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    /* renamed from: a */
    public void mo27208a(float f, float f2) {
        if (this.f14285p != null) {
            this.f14285p.m27151a(f, f2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    /* renamed from: a */
    public void mo27207a(int i) {
        abr.m18409e(new StringBuilder(34).append("AdMediaPlayerView seek ").append(i).toString());
        if (!m27238k()) {
            this.f14287r = i;
            return;
        }
        this.f14275f.seekTo(i);
        this.f14287r = 0;
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    /* renamed from: a */
    public void mo27206a(AbstractC3660h abstractC3660h) {
        this.f14288s = abstractC3660h;
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    /* renamed from: b */
    public void mo27205b() {
        abr.m18409e("AdMediaPlayerView stop");
        if (this.f14275f != null) {
            this.f14275f.stop();
            this.f14275f.release();
            this.f14275f = null;
            m27244b(0);
            m27243c(0);
            m27239j();
        }
        this.f14271b.m27127b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    /* renamed from: c */
    public void mo27204c() {
        abr.m18409e("AdMediaPlayerView play");
        if (m27238k()) {
            this.f14275f.start();
            m27244b(3);
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.c.6
                @Override // java.lang.Runnable
                public void run() {
                    if (TextureView$SurfaceTextureListenerC3641c.this.f14288s != null) {
                        TextureView$SurfaceTextureListenerC3641c.this.f14288s.mo27186c();
                    }
                }
            });
        }
        m27243c(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    /* renamed from: d */
    public void mo27203d() {
        abr.m18409e("AdMediaPlayerView pause");
        if (m27238k() && this.f14275f.isPlaying()) {
            this.f14275f.pause();
            m27244b(4);
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.c.7
                @Override // java.lang.Runnable
                public void run() {
                    if (TextureView$SurfaceTextureListenerC3641c.this.f14288s != null) {
                        TextureView$SurfaceTextureListenerC3641c.this.f14288s.mo27185d();
                    }
                }
            });
        }
        m27243c(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    /* renamed from: e */
    public void mo27202e() {
        this.f14283n = true;
        m27235n();
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    /* renamed from: f */
    public void mo27201f() {
        this.f14283n = false;
        m27235n();
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    public int getCurrentPosition() {
        if (m27238k()) {
            return this.f14275f.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    public int getDuration() {
        if (m27238k()) {
            return this.f14275f.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    public int getVideoHeight() {
        if (this.f14275f != null) {
            return this.f14275f.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    public int getVideoWidth() {
        if (this.f14275f != null) {
            return this.f14275f.getVideoWidth();
        }
        return 0;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i > 0) {
            m27237l();
        } else if (i >= 0) {
        } else {
            m27236m();
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f14279j = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        abr.m18409e("AdMediaPlayerView completion");
        m27244b(5);
        m27243c(5);
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (TextureView$SurfaceTextureListenerC3641c.this.f14288s != null) {
                    TextureView$SurfaceTextureListenerC3641c.this.f14288s.mo27184e();
                }
            }
        });
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        final String str = f14270a.get(Integer.valueOf(i));
        final String str2 = f14270a.get(Integer.valueOf(i2));
        abr.d(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer error: ").append(str).append(":").append(str2).toString());
        m27244b(-1);
        m27243c(-1);
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.c.3
            @Override // java.lang.Runnable
            public void run() {
                if (TextureView$SurfaceTextureListenerC3641c.this.f14288s != null) {
                    TextureView$SurfaceTextureListenerC3641c.this.f14288s.mo27189a(str, str2);
                }
            }
        });
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f14270a.get(Integer.valueOf(i));
        String str2 = f14270a.get(Integer.valueOf(i2));
        abr.m18409e(new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer info: ").append(str).append(":").append(str2).toString());
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.f14277h, i);
        int defaultSize2 = getDefaultSize(this.f14278i, i2);
        if (this.f14277h > 0 && this.f14278i > 0 && this.f14285p == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            defaultSize2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.f14277h * defaultSize2 < this.f14278i * size) {
                    defaultSize = (this.f14277h * defaultSize2) / this.f14278i;
                } else if (this.f14277h * defaultSize2 > this.f14278i * size) {
                    defaultSize2 = (this.f14278i * size) / this.f14277h;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                int i3 = (this.f14278i * size) / this.f14277h;
                if (mode2 != Integer.MIN_VALUE || i3 <= defaultSize2) {
                    defaultSize2 = i3;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.f14277h * defaultSize2) / this.f14278i;
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i4 = this.f14277h;
                int i5 = this.f14278i;
                if (mode2 != Integer.MIN_VALUE || i5 <= defaultSize2) {
                    defaultSize2 = i5;
                    defaultSize = i4;
                } else {
                    defaultSize = (this.f14277h * defaultSize2) / this.f14278i;
                }
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize2 = (this.f14278i * size) / this.f14277h;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        if (this.f14285p != null) {
            this.f14285p.m27150a(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            if ((this.f14280k > 0 && this.f14280k != defaultSize) || (this.f14281l > 0 && this.f14281l != defaultSize2)) {
                m27241h();
            }
            this.f14280k = defaultSize;
            this.f14281l = defaultSize2;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        abr.m18409e("AdMediaPlayerView prepared");
        m27244b(2);
        this.f14271b.m27130a();
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (TextureView$SurfaceTextureListenerC3641c.this.f14288s != null) {
                    TextureView$SurfaceTextureListenerC3641c.this.f14288s.mo27187b();
                }
            }
        });
        this.f14277h = mediaPlayer.getVideoWidth();
        this.f14278i = mediaPlayer.getVideoHeight();
        if (this.f14287r != 0) {
            mo27207a(this.f14287r);
        }
        m27241h();
        int i = this.f14277h;
        abr.c(new StringBuilder(62).append("AdMediaPlayerView stream dimensions: ").append(i).append(" x ").append(this.f14278i).toString());
        if (this.f14274e == 3) {
            mo27204c();
        }
        m27240i();
        m27235n();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        abr.m18409e("AdMediaPlayerView surface created");
        m27242g();
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.c.4
            @Override // java.lang.Runnable
            public void run() {
                if (TextureView$SurfaceTextureListenerC3641c.this.f14288s != null) {
                    TextureView$SurfaceTextureListenerC3641c.this.f14288s.mo27198a();
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        abr.m18409e("AdMediaPlayerView surface destroyed");
        if (this.f14275f != null && this.f14287r == 0) {
            this.f14287r = this.f14275f.getCurrentPosition();
        }
        if (this.f14285p != null) {
            this.f14285p.m27142b();
        }
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.c.5
            @Override // java.lang.Runnable
            public void run() {
                if (TextureView$SurfaceTextureListenerC3641c.this.f14288s != null) {
                    TextureView$SurfaceTextureListenerC3641c.this.f14288s.mo27185d();
                    TextureView$SurfaceTextureListenerC3641c.this.f14288s.mo27183f();
                }
            }
        });
        m27246a(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        boolean z = true;
        abr.m18409e("AdMediaPlayerView surface changed");
        boolean z2 = this.f14274e == 3;
        if (this.f14277h != i || this.f14278i != i2) {
            z = false;
        }
        if (this.f14275f != null && z2 && z) {
            if (this.f14287r != 0) {
                mo27207a(this.f14287r);
            }
            mo27204c();
        }
        if (this.f14285p != null) {
            this.f14285p.m27150a(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f14271b.m27126b(this);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        abr.m18409e(new StringBuilder(57).append("AdMediaPlayerView size changed: ").append(i).append(" x ").append(i2).toString());
        this.f14277h = mediaPlayer.getVideoWidth();
        this.f14278i = mediaPlayer.getVideoHeight();
        if (this.f14277h == 0 || this.f14278i == 0) {
            return;
        }
        requestLayout();
    }

    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3661i
    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.f14276g = uri;
        this.f14287r = 0;
        m27242g();
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public String toString() {
        String valueOf = String.valueOf(getClass().getName());
        String valueOf2 = String.valueOf(Integer.toHexString(hashCode()));
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("@").append(valueOf2).toString();
    }
}
