package com.fimi.kernel.p165d;

import android.content.Context;
import android.media.AudioManager;
import android.os.Environment;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.client.SpeechError;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.SpeechSynthesizerListener;
import com.baidu.tts.client.TtsMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.fimi.kernel.d.b */
/* loaded from: classes.dex */
public class C1648b implements SpeechSynthesizerListener {

    /* renamed from: d */
    private static final String f4066d = "baiduTTS";

    /* renamed from: e */
    private static final String f4067e = "bd_etts_ch_speech_female.dat";

    /* renamed from: f */
    private static final String f4068f = "bd_etts_ch_text.dat";

    /* renamed from: g */
    private static final String f4069g = "temp_license";

    /* renamed from: h */
    private static final String f4070h = "bd_etts_speech_female_en.dat";

    /* renamed from: i */
    private static final String f4071i = "bd_etts_text_en.dat";

    /* renamed from: k */
    private static C1648b f4073k;

    /* renamed from: l */
    private static Context f4074l;

    /* renamed from: b */
    private SpeechSynthesizer f4075b;

    /* renamed from: c */
    private String f4076c;

    /* renamed from: m */
    private boolean f4077m;

    /* renamed from: n */
    private AudioManager f4078n;

    /* renamed from: o */
    private int f4079o;

    /* renamed from: p */
    private int f4080p;

    /* renamed from: q */
    private boolean f4081q;

    /* renamed from: r */
    private AbstractC1649a f4082r;

    /* renamed from: a */
    private static boolean f4065a = false;

    /* renamed from: j */
    private static boolean f4072j = false;

    /* renamed from: com.fimi.kernel.d.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC1649a {
        /* renamed from: a */
        void m34851a(boolean z);
    }

    private C1648b() {
        if (f4074l != null) {
            this.f4078n = (AudioManager) f4074l.getSystemService("audio");
            this.f4079o = this.f4078n.getStreamVolume(3);
            this.f4080p = this.f4078n.getStreamMaxVolume(3);
        }
    }

    /* renamed from: a */
    public static C1648b m34869a(Context context) {
        f4074l = context;
        if (f4073k == null) {
            synchronized (C1648b.class) {
                if (f4073k == null) {
                    f4073k = new C1648b();
                }
            }
        }
        return f4073k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m34865a(boolean z, String str, String str2) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3 = null;
        fileOutputStream3 = 0;
        InputStream inputStream2 = null;
        fileOutputStream3 = 0;
        fileOutputStream3 = null;
        File file = new File(str2);
        if (z || (!z && !file.exists())) {
            try {
                try {
                    inputStream = f4074l.getResources().getAssets().open(str);
                    try {
                        fileOutputStream2 = new FileOutputStream(str2);
                    } catch (FileNotFoundException e) {
                        e = e;
                        fileOutputStream = null;
                        inputStream2 = inputStream;
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        fileOutputStream3 = inputStream.read(bArr, 0, 1024);
                        if (fileOutputStream3 < 0) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, fileOutputStream3);
                    }
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                } catch (FileNotFoundException e5) {
                    e = e5;
                    inputStream2 = inputStream;
                    fileOutputStream = fileOutputStream2;
                    try {
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (inputStream2 == null) {
                            return;
                        }
                        try {
                            inputStream2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        fileOutputStream3 = fileOutputStream;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream3 = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream3 != 0) {
                        try {
                            fileOutputStream3.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream3 = fileOutputStream2;
                    if (fileOutputStream3 != null) {
                    }
                    if (inputStream != null) {
                    }
                    throw th;
                }
            } catch (FileNotFoundException e13) {
                e = e13;
                fileOutputStream = null;
            } catch (IOException e14) {
                e = e14;
                inputStream = null;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        }
    }

    /* renamed from: b */
    public static C1648b m34863b(Context context) {
        f4074l = context;
        return f4073k;
    }

    /* renamed from: e */
    private void m34855e(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: g */
    private void m34853g() {
        if (this.f4076c == null) {
            this.f4076c = Environment.getExternalStorageDirectory().toString() + "/" + f4066d;
        }
        m34855e(this.f4076c);
        m34865a(false, f4067e, this.f4076c + "/" + f4067e);
        m34865a(false, f4068f, this.f4076c + "/" + f4068f);
        m34865a(false, f4069g, this.f4076c + "/" + f4069g);
        m34865a(false, "english/bd_etts_speech_female_en.dat", this.f4076c + "/" + f4070h);
        m34865a(false, "english/bd_etts_text_en.dat", this.f4076c + "/" + f4071i);
    }

    /* renamed from: h */
    private void m34852h() {
        this.f4075b = SpeechSynthesizer.getInstance();
        this.f4075b.setContext(f4074l);
        this.f4075b.setSpeechSynthesizerListener(this);
        this.f4075b.setParam(SpeechSynthesizer.PARAM_TTS_TEXT_MODEL_FILE, this.f4076c + "/" + f4068f);
        this.f4075b.setParam(SpeechSynthesizer.PARAM_TTS_SPEECH_MODEL_FILE, this.f4076c + "/" + f4067e);
        this.f4075b.setAppId(C1647a.f4062a);
        this.f4075b.setApiKey(C1647a.f4063b, C1647a.f4064c);
        AuthInfo auth = this.f4075b.auth(TtsMode.MIX);
        if (!auth.isSuccess()) {
            this.f4077m = false;
            auth.getTtsError().getDetailMessage();
            return;
        }
        this.f4077m = true;
        this.f4075b.setParam(SpeechSynthesizer.PARAM_SPEAKER, "0");
        this.f4075b.setParam(SpeechSynthesizer.PARAM_MIX_MODE, SpeechSynthesizer.MIX_MODE_HIGH_SPEED_SYNTHESIZE_WIFI);
        this.f4075b.initTts(TtsMode.MIX);
        this.f4075b.loadEnglishModel(this.f4076c + "/" + f4071i, this.f4076c + "/" + f4070h);
    }

    /* renamed from: a */
    public void m34870a() {
        if (!this.f4077m) {
            m34853g();
            m34852h();
        }
    }

    /* renamed from: a */
    public void m34868a(AbstractC1649a abstractC1649a) {
        this.f4082r = abstractC1649a;
    }

    /* renamed from: a */
    public void m34867a(String str) {
        if (str == null || this.f4075b == null) {
            return;
        }
        if (this.f4078n != null && this.f4079o <= this.f4080p && !this.f4081q) {
            this.f4081q = true;
            this.f4078n.setStreamVolume(3, this.f4078n.getStreamMaxVolume(3), 4);
        }
        try {
            if (f4065a) {
                this.f4075b.stop();
            }
            this.f4075b.speak(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m34866a(boolean z) {
        this.f4077m = z;
    }

    /* renamed from: b */
    public void m34864b() {
        if (this.f4075b != null) {
            this.f4075b.stop();
        }
    }

    /* renamed from: b */
    public void m34862b(String str) {
        this.f4075b.setParam(SpeechSynthesizer.PARAM_SPEAKER, str);
    }

    /* renamed from: b */
    public void m34861b(boolean z) {
        this.f4081q = z;
    }

    /* renamed from: c */
    public void m34860c() {
        this.f4075b.release();
    }

    /* renamed from: c */
    public void m34859c(String str) {
        this.f4075b.setParam(SpeechSynthesizer.PARAM_VOLUME, str);
    }

    /* renamed from: d */
    public void m34857d(String str) {
        this.f4075b.setParam(SpeechSynthesizer.PARAM_PITCH, str);
    }

    /* renamed from: d */
    public boolean m34858d() {
        return this.f4077m;
    }

    /* renamed from: e */
    public void m34856e() {
        if (f4065a) {
            this.f4075b.stop();
        }
    }

    /* renamed from: f */
    public boolean m34854f() {
        return this.f4081q;
    }

    @Override // com.baidu.tts.client.SpeechSynthesizerListener
    public void onError(String str, SpeechError speechError) {
    }

    @Override // com.baidu.tts.client.SpeechSynthesizerListener
    public void onSpeechFinish(String str) {
        f4065a = false;
        if (this.f4082r != null) {
            this.f4082r.m34851a(true);
        }
    }

    @Override // com.baidu.tts.client.SpeechSynthesizerListener
    public void onSpeechProgressChanged(String str, int i) {
    }

    @Override // com.baidu.tts.client.SpeechSynthesizerListener
    public void onSpeechStart(String str) {
        f4065a = true;
        if (this.f4082r != null) {
            this.f4082r.m34851a(false);
        }
    }

    @Override // com.baidu.tts.client.SpeechSynthesizerListener
    public void onSynthesizeDataArrived(String str, byte[] bArr, int i) {
    }

    @Override // com.baidu.tts.client.SpeechSynthesizerListener
    public void onSynthesizeFinish(String str) {
    }

    @Override // com.baidu.tts.client.SpeechSynthesizerListener
    public void onSynthesizeStart(String str) {
    }
}
