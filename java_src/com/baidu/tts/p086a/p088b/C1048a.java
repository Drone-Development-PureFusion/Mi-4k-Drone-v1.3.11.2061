package com.baidu.tts.p086a.p088b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.tts.aop.tts.ITts;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.aop.tts.TtsFactory;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.SpeechError;
import com.baidu.tts.client.SpeechSynthesizeBag;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.SpeechSynthesizerListener;
import com.baidu.tts.client.TtsMode;
import com.baidu.tts.p097c.C1119a;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1177i;
import com.baidu.tts.p102f.EnumC1180l;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p107b.C1193b;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.p114m.C1238i;
import com.baidu.tts.tools.ResourceTools;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.baidu.tts.a.b.a */
/* loaded from: classes.dex */
public class C1048a {

    /* renamed from: b */
    private SpeechSynthesizerListener f2423b;

    /* renamed from: c */
    private ThreadPoolExecutor f2424c;

    /* renamed from: d */
    private TtsListener f2425d = new TtsListener() { // from class: com.baidu.tts.a.b.a.1
        /* renamed from: a */
        private boolean m36840a(C1237h c1237h) {
            try {
                switch (C10502.f2427a[c1237h.m36142f().getTtsErrorFlyweight().a().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        return true;
                    default:
                        return false;
                }
            } catch (Exception e) {
                LoggerProxy.m36554d("SpeechSynthesizerAdapter", "isStopped exception=" + e.toString());
                return false;
            }
        }

        @Override // com.baidu.tts.aop.ttslistener.TtsListener
        public void onError(C1237h c1237h) {
            if (C1048a.this.f2423b == null || m36840a(c1237h)) {
                return;
            }
            C1048a.this.f2423b.onError(C1048a.this.m36862a(c1237h), C1048a.this.m36851b(c1237h));
        }

        @Override // com.baidu.tts.aop.ttslistener.TtsListener
        public void onPlayFinished(C1237h c1237h) {
            if (C1048a.this.f2423b != null) {
                C1048a.this.f2423b.onSpeechFinish(C1048a.this.m36862a(c1237h));
            }
        }

        @Override // com.baidu.tts.aop.ttslistener.TtsListener
        public void onPlayProgressUpdate(C1237h c1237h) {
            if (C1048a.this.f2423b != null) {
                C1048a.this.f2423b.onSpeechProgressChanged(C1048a.this.m36862a(c1237h), c1237h.m36147c());
            }
        }

        @Override // com.baidu.tts.aop.ttslistener.TtsListener
        public void onPlayStart(C1237h c1237h) {
            if (C1048a.this.f2423b != null) {
                C1048a.this.f2423b.onSpeechStart(C1048a.this.m36862a(c1237h));
            }
        }

        @Override // com.baidu.tts.aop.ttslistener.TtsListener
        public void onSynthesizeDataArrived(C1237h c1237h) {
            if (C1048a.this.f2423b != null) {
                C1048a.this.f2423b.onSynthesizeDataArrived(C1048a.this.m36862a(c1237h), c1237h.m36145d(), c1237h.m36147c());
            }
        }

        @Override // com.baidu.tts.aop.ttslistener.TtsListener
        public void onSynthesizeFinished(C1237h c1237h) {
            if (C1048a.this.f2423b != null) {
                C1048a.this.f2423b.onSynthesizeFinish(C1048a.this.m36862a(c1237h));
            }
        }

        @Override // com.baidu.tts.aop.ttslistener.TtsListener
        public void onSynthesizeStart(C1237h c1237h) {
            if (C1048a.this.f2423b != null) {
                C1048a.this.f2423b.onSynthesizeStart(C1048a.this.m36862a(c1237h));
            }
        }
    };

    /* renamed from: a */
    private ITts f2422a = m36843g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.baidu.tts.a.b.a$2 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10502 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2427a = new int[EnumC1182n.values().length];

        static {
            try {
                f2427a[EnumC1182n.MIX_AUTH_INTERRUPTED_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f2427a[EnumC1182n.OFFLINE_AUTH_INTERRUPTED_EXCEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f2427a[EnumC1182n.ONLINE_AUTH_INTERRUPTED_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.tts.a.b.a$a */
    /* loaded from: classes.dex */
    public class CallableC1051a implements Callable<Void> {

        /* renamed from: a */
        List<SpeechSynthesizeBag> f2428a;

        public CallableC1051a(List<SpeechSynthesizeBag> list) {
            this.f2428a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            int size;
            if (this.f2428a != null && (size = this.f2428a.size()) > 0) {
                for (int i = 0; i < size; i++) {
                    SpeechSynthesizeBag speechSynthesizeBag = this.f2428a.get(i);
                    if (speechSynthesizeBag != null) {
                        String text = speechSynthesizeBag.getText();
                        String utteranceId = speechSynthesizeBag.getUtteranceId();
                        if (TextUtils.isEmpty(utteranceId)) {
                            utteranceId = String.valueOf(i);
                            speechSynthesizeBag.setUtteranceId(utteranceId);
                        }
                        String str = utteranceId;
                        if (Thread.currentThread().isInterrupted()) {
                            break;
                        }
                        C1238i c1238i = new C1238i(text, str);
                        c1238i.m36139a(EnumC1177i.SPEAK);
                        C1048a.this.f2422a.speak(c1238i);
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.tts.a.b.a$b */
    /* loaded from: classes.dex */
    public class CallableC1052b implements Callable<Void> {

        /* renamed from: b */
        private String f2431b;

        /* renamed from: c */
        private String f2432c;

        public CallableC1052b(String str, String str2) {
            this.f2431b = str;
            this.f2432c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            C1238i c1238i = new C1238i(this.f2431b, this.f2432c);
            c1238i.m36139a(EnumC1177i.SPEAK);
            C1048a.this.f2422a.speak(c1238i);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.tts.a.b.a$c */
    /* loaded from: classes.dex */
    public class CallableC1053c implements Callable<Void> {

        /* renamed from: b */
        private String f2434b;

        /* renamed from: c */
        private String f2435c;

        public CallableC1053c(String str, String str2) {
            this.f2434b = str;
            this.f2435c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            C1238i c1238i = new C1238i(this.f2434b, this.f2435c);
            c1238i.m36139a(EnumC1177i.SYNTHESIZE);
            C1048a.this.f2422a.synthesize(c1238i);
            return null;
        }
    }

    public C1048a() {
        this.f2422a.setTtsListener(this.f2425d);
    }

    /* renamed from: a */
    private int m36858a(String str, Callable<Void> callable) {
        EnumC1182n isTextValid = ResourceTools.isTextValid(str);
        return isTextValid == null ? m36856a(callable) : isTextValid.m36307b();
    }

    /* renamed from: a */
    private int m36856a(Callable<Void> callable) {
        try {
            m36842h().submit(callable);
            return 0;
        } catch (RejectedExecutionException e) {
            Log.e("bdtts-Queue", " count=" + ((ThreadPoolExecutor) m36842h()).getQueue().size());
            return SpeechSynthesizer.ERROR_QUEUE_IS_FULL;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m36862a(C1237h c1237h) {
        C1238i m36143e;
        if (c1237h == null || (m36143e = c1237h.m36143e()) == null) {
            LoggerProxy.m36554d("SpeechSynthesizerAdapter", "getUtteranceId null");
            return null;
        }
        return m36143e.m36130f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public SpeechError m36851b(C1237h c1237h) {
        if (c1237h != null) {
            TtsError m36142f = c1237h.m36142f();
            if (m36142f != null) {
                int detailCode = m36142f.getDetailCode();
                String detailMessage = m36142f.getDetailMessage();
                SpeechError speechError = new SpeechError();
                speechError.code = detailCode;
                speechError.description = detailMessage;
                return speechError;
            }
            LoggerProxy.m36554d("SpeechSynthesizerAdapter", "ttsError is null");
        }
        SpeechError speechError2 = new SpeechError();
        speechError2.code = EnumC1182n.TTS_ERROR_UNKNOW.m36307b();
        speechError2.description = EnumC1182n.TTS_ERROR_UNKNOW.m36306c();
        return speechError2;
    }

    /* renamed from: g */
    private ITts m36843g() {
        return new TtsFactory().makeProxy();
    }

    /* renamed from: h */
    private synchronized ExecutorService m36842h() {
        if (this.f2424c == null) {
            this.f2424c = new C1119a(1000, "SpeechSynthesizerPoolThread", new ThreadPoolExecutor.AbortPolicy());
        }
        return this.f2424c;
    }

    /* renamed from: i */
    private void m36841i() {
        if (this.f2424c != null) {
            if (!this.f2424c.isShutdown()) {
                this.f2424c.shutdownNow();
            }
            try {
                LoggerProxy.m36554d("SpeechSynthesizerAdapter", "isTerminated=" + this.f2424c.awaitTermination(EnumC1180l.DEFAULT.m36312a(), TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                LoggerProxy.m36554d("SpeechSynthesizerAdapter", "InterruptedException");
            }
            this.f2424c = null;
        }
    }

    /* renamed from: a */
    public int m36869a(float f, float f2) {
        return this.f2422a.setStereoVolume(f, f2);
    }

    /* renamed from: a */
    public int m36868a(int i) {
        return this.f2422a.setAudioStreamType(i);
    }

    /* renamed from: a */
    public int m36861a(String str) {
        C1234e c1234e = new C1234e();
        c1234e.m36169a(str);
        return this.f2422a.loadCustomResource(c1234e);
    }

    /* renamed from: a */
    public int m36860a(String str, String str2) {
        try {
            return this.f2422a.setParam(EnumC1175g.valueOf(str), str2);
        } catch (Exception e) {
            return EnumC1182n.TTS_PARAMETER_INVALID.m36307b();
        }
    }

    /* renamed from: a */
    public int m36859a(String str, String str2, Bundle bundle) {
        return m36858a(str, new CallableC1052b(str, str2));
    }

    /* renamed from: a */
    public int m36857a(List<SpeechSynthesizeBag> list) {
        return list.size() <= 100 ? m36856a(new CallableC1051a(list)) : SpeechSynthesizer.ERROR_LIST_IS_TOO_LONG;
    }

    /* renamed from: a */
    public TtsError m36863a(TtsMode ttsMode) {
        this.f2422a.setMode(ttsMode.getTtsEnum());
        return this.f2422a.b();
    }

    /* renamed from: a */
    public String m36870a() {
        return C1193b.m36288a().m36281j();
    }

    /* renamed from: a */
    public void m36867a(Context context) {
        this.f2422a.setContext(context);
    }

    /* renamed from: a */
    public void m36864a(SpeechSynthesizerListener speechSynthesizerListener) {
        if (this.f2423b != speechSynthesizerListener) {
            this.f2423b = speechSynthesizerListener;
        }
    }

    /* renamed from: b */
    public int m36855b() {
        if (this.f2422a != null) {
            this.f2422a.d();
            return 0;
        }
        return 0;
    }

    /* renamed from: b */
    public int m36850b(String str, String str2) {
        C1236g c1236g = new C1236g();
        c1236g.m36161b(str);
        c1236g.m36163a(str2);
        return this.f2422a.loadModel(c1236g);
    }

    /* renamed from: b */
    public int m36849b(String str, String str2, Bundle bundle) {
        return m36858a(str, new CallableC1053c(str, str2));
    }

    /* renamed from: b */
    public AuthInfo m36852b(TtsMode ttsMode) {
        return this.f2422a.auth(ttsMode.getTtsEnum());
    }

    /* renamed from: c */
    public int m36848c() {
        if (this.f2422a != null) {
            this.f2422a.c();
            return 0;
        }
        return 0;
    }

    /* renamed from: c */
    public int m36847c(String str, String str2) {
        C1235f c1235f = new C1235f();
        c1235f.m36167a(str);
        c1235f.m36165b(str2);
        return this.f2422a.loadEnglishModel(c1235f);
    }

    /* renamed from: d */
    public int m36846d() {
        m36841i();
        if (this.f2422a != null) {
            this.f2422a.e();
            return 0;
        }
        return 0;
    }

    /* renamed from: e */
    public int m36845e() {
        m36841i();
        if (this.f2422a != null) {
            this.f2422a.f();
            this.f2422a = null;
            return 0;
        }
        return 0;
    }

    /* renamed from: f */
    public int m36844f() {
        return this.f2422a.freeCustomResource(null);
    }
}
