package com.baidu.tts.p090b.p091a.p093b;

import android.text.TextUtils;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.C1062a;
import com.baidu.tts.auth.C1068b;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.p101e.C1163c;
import com.baidu.tts.p102f.EnumC1166a;
import com.baidu.tts.p102f.EnumC1172d;
import com.baidu.tts.p102f.EnumC1174f;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p105h.p107b.C1193b;
import com.baidu.tts.p114m.C1233d;
import com.baidu.tts.p114m.C1234e;
import com.baidu.tts.p114m.C1235f;
import com.baidu.tts.p114m.C1236g;
import com.baidu.tts.p114m.C1237h;
import com.baidu.tts.p114m.C1238i;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.ResourceTools;
import java.util.concurrent.Callable;
/* renamed from: com.baidu.tts.b.a.b.e */
/* loaded from: classes.dex */
public class C1092e extends AbstractC1085a {

    /* renamed from: b */
    private C1094b f2517b;

    /* renamed from: c */
    private long[] f2518c = new long[1];

    /* renamed from: d */
    private C1163c f2519d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.tts.b.a.b.e$a */
    /* loaded from: classes.dex */
    public class C1093a extends Thread {

        /* renamed from: b */
        private int f2521b;

        public C1093a(int i) {
            this.f2521b = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                synchronized (C1092e.this.f2519d) {
                    if (!C1092e.this.f2519d.m36346d()) {
                        C1092e.this.f2519d.m36351a(System.currentTimeMillis(), this.f2521b, 0, 0, "");
                    }
                }
            } catch (Exception e) {
                LoggerProxy.m36554d("OfflineSynthesizer", "AddPVResultsToDB exception=" + e.toString());
            }
        }
    }

    /* renamed from: com.baidu.tts.b.a.b.e$b */
    /* loaded from: classes.dex */
    public static class C1094b extends C1233d<C1094b> {

        /* renamed from: a */
        private String f2522a = "0";

        /* renamed from: b */
        private String f2523b = "0";

        /* renamed from: c */
        private String f2524c = "0";

        /* renamed from: d */
        private String f2525d;

        /* renamed from: e */
        private String f2526e;

        /* renamed from: f */
        private String f2527f;

        /* renamed from: g */
        private String f2528g;

        /* renamed from: a */
        public int m36683a(String str) {
            if (DataTool.isLong(str)) {
                this.f2522a = str;
                return 0;
            }
            return EnumC1182n.TTS_PARAMETER_INVALID.m36307b();
        }

        /* renamed from: a */
        public long m36684a() {
            try {
                return Long.parseLong(this.f2522a);
            } catch (Exception e) {
                return 0L;
            }
        }

        /* renamed from: b */
        public long m36682b() {
            try {
                return Long.parseLong(this.f2523b);
            } catch (Exception e) {
                return 0L;
            }
        }

        /* renamed from: b */
        public void m36681b(String str) {
            this.f2523b = str;
        }

        /* renamed from: c */
        public int m36679c(String str) {
            if (DataTool.isLong(str)) {
                this.f2524c = str;
                return 0;
            }
            return EnumC1182n.TTS_PARAMETER_INVALID.m36307b();
        }

        /* renamed from: c */
        public long m36680c() {
            try {
                return Long.parseLong(this.f2524c);
            } catch (Exception e) {
                return 0L;
            }
        }

        /* renamed from: d */
        public String m36678d() {
            return this.f2525d;
        }

        /* renamed from: d */
        public void m36677d(String str) {
            this.f2525d = str;
        }

        /* renamed from: e */
        public String m36676e() {
            return this.f2526e;
        }

        /* renamed from: e */
        public void m36675e(String str) {
            this.f2526e = str;
        }

        /* renamed from: f */
        public String m36674f() {
            return this.f2527f;
        }

        /* renamed from: f */
        public void m36673f(String str) {
            this.f2527f = str;
        }

        /* renamed from: g */
        public String m36672g() {
            return this.f2528g;
        }

        /* renamed from: g */
        public void m36671g(String str) {
            this.f2528g = str;
        }
    }

    /* renamed from: com.baidu.tts.b.a.b.e$c */
    /* loaded from: classes.dex */
    private class CallableC1095c implements EmbeddedSynthesizerEngine.OnNewDataListener, Callable<TtsError> {

        /* renamed from: b */
        private C1238i f2530b;

        /* renamed from: c */
        private int f2531c = 0;

        public CallableC1095c(C1238i c1238i) {
            this.f2530b = c1238i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public TtsError call() {
            C1068b.C1069a m36794a = C1062a.m36796a().m36794a(C1092e.this.f2517b);
            if (m36794a != null) {
                if (!m36794a.mo36249g()) {
                    return m36794a.m36772b();
                }
                LoggerProxy.m36554d("OfflineSynthesizer", "engineResult = " + EmbeddedSynthesizerEngine.bdTTSSetParam(C1092e.this.f2518c[0], 0, 0L));
                EmbeddedSynthesizerEngine.bdTTSSetParam(C1092e.this.f2518c[0], 5, C1092e.this.f2517b.x());
                EmbeddedSynthesizerEngine.bdTTSSetParam(C1092e.this.f2518c[0], 6, C1092e.this.f2517b.y());
                EmbeddedSynthesizerEngine.bdTTSSetParam(C1092e.this.f2518c[0], 7, C1092e.this.f2517b.z());
                EmbeddedSynthesizerEngine.bdTTSSetParam(C1092e.this.f2518c[0], 17, C1092e.this.f2517b.m36684a());
                EmbeddedSynthesizerEngine.bdTTSSetParam(C1092e.this.f2518c[0], 18, C1092e.this.f2517b.m36682b());
                EmbeddedSynthesizerEngine.bdTTSSetParam(C1092e.this.f2518c[0], 19, C1092e.this.f2517b.m36680c());
                EmbeddedSynthesizerEngine.bdTTSSetParam(C1092e.this.f2518c[0], 9, C1092e.this.f2517b.t());
                EmbeddedSynthesizerEngine.setOnNewDataListener(this);
                this.f2530b.m36134c(EnumC1172d.GBK.m36323a());
                byte[] m36131e = this.f2530b.m36131e();
                LoggerProxy.m36554d("OfflineSynthesizer", "before bdttssynthesis");
                int bdTTSSynthesis = EmbeddedSynthesizerEngine.bdTTSSynthesis(C1092e.this.f2518c[0], m36131e, m36131e.length);
                LoggerProxy.m36554d("OfflineSynthesizer", "after bdttssynthesis result = " + bdTTSSynthesis);
                try {
                    new C1093a(bdTTSSynthesis).start();
                } catch (Exception e) {
                    LoggerProxy.m36554d("OfflineSynthesizer", "AddPVResultsToDB start exception=" + e.toString());
                }
                if (bdTTSSynthesis != 0) {
                    return C1191c.m36299a().m36297a(EnumC1182n.OFFLINE_ENGINE_SYNTHESIZE_ERROR, bdTTSSynthesis);
                }
                return null;
            }
            return C1191c.m36299a().m36292b(EnumC1182n.OFFLINE_ENGINE_AUTH_NULL);
        }

        @Override // com.baidu.tts.jni.EmbeddedSynthesizerEngine.OnNewDataListener
        public int onNewData(byte[] bArr, int i) {
            C1237h m36148b = C1237h.m36148b(this.f2530b);
            m36148b.m36144d(EnumC1174f.OFFLINE.m36320a());
            m36148b.m36157a(EnumC1166a.PCM);
            m36148b.m36152a(bArr);
            m36148b.m36146c(i);
            this.f2531c++;
            m36148b.m36150b(this.f2531c);
            C1092e.this.a(m36148b);
            if (Thread.currentThread().isInterrupted()) {
                LoggerProxy.m36554d("OfflineSynthesizer", "interrupted to interrupt syn");
                return -1;
            }
            return 0;
        }
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public int mo36665a(C1234e c1234e) {
        return EmbeddedSynthesizerEngine.bdTTSDomainDataInit(ResourceTools.stringToByteArrayAddNull(c1234e.m36170a()), this.f2518c[0]);
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public int mo36664a(C1235f c1235f) {
        String m36166b = c1235f.m36166b();
        String m36168a = c1235f.m36168a();
        boolean isEmpty = TextUtils.isEmpty(m36166b);
        if (TextUtils.isEmpty(m36168a) || isEmpty) {
            return EnumC1182n.TTS_PARAMETER_INVALID.m36307b();
        }
        int loadEnglishEngine = EmbeddedSynthesizerEngine.loadEnglishEngine(ResourceTools.stringToByteArrayAddNull(m36168a), ResourceTools.stringToByteArrayAddNull(m36166b), this.f2518c[0]);
        LoggerProxy.m36554d("OfflineSynthesizer", "loadEnglishModel ret=" + loadEnglishEngine);
        return loadEnglishEngine;
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public int mo36663a(C1236g c1236g) {
        int i = 0;
        String m36162b = c1236g.m36162b();
        String m36164a = c1236g.m36164a();
        boolean isEmpty = TextUtils.isEmpty(m36162b);
        boolean isEmpty2 = TextUtils.isEmpty(m36164a);
        if (!isEmpty || !isEmpty2) {
            int bdTTSReInitData = !isEmpty ? EmbeddedSynthesizerEngine.bdTTSReInitData(ResourceTools.stringToByteArrayAddNull(m36162b), this.f2518c[0]) : 0;
            if (!isEmpty2) {
                i = EmbeddedSynthesizerEngine.bdTTSReInitData(ResourceTools.stringToByteArrayAddNull(m36164a), this.f2518c[0]);
            }
            return i + bdTTSReInitData;
        }
        return EnumC1182n.TTS_PARAMETER_INVALID.m36307b();
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public TtsError mo36689a() {
        try {
            this.f2519d = C1163c.m36350a(C1193b.m36288a().m36283h());
            this.f2519d.m36352a();
        } catch (Exception e) {
            LoggerProxy.m36554d("OfflineSynthesizer", "embedded statistics open exception=" + e.toString());
        }
        if (this.f2517b == null) {
            this.f2517b = new C1094b();
        }
        C1068b.C1069a m36794a = C1062a.m36796a().m36794a(this.f2517b);
        if (m36794a.mo36249g()) {
            String m36678d = this.f2517b.m36678d();
            String m36676e = this.f2517b.m36676e();
            byte[] stringToByteArrayAddNull = ResourceTools.stringToByteArrayAddNull(m36678d);
            byte[] stringToByteArrayAddNull2 = ResourceTools.stringToByteArrayAddNull(m36676e);
            LoggerProxy.m36554d("OfflineSynthesizer", "before bdTTSEngineInit");
            int bdTTSEngineInit = EmbeddedSynthesizerEngine.bdTTSEngineInit(stringToByteArrayAddNull, stringToByteArrayAddNull2, this.f2518c);
            LoggerProxy.m36554d("OfflineSynthesizer", "engine init ret = " + bdTTSEngineInit);
            if (bdTTSEngineInit != 0) {
                return C1191c.m36299a().m36296a(EnumC1182n.OFFLINE_ENGINE_INIT_FAILED, bdTTSEngineInit, "bdTTSEngineInit result not 0");
            }
            return null;
        }
        return m36794a.m36772b();
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public TtsError mo36662a(C1238i c1238i) {
        try {
            return new CallableC1095c(c1238i).call();
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            return C1191c.m36299a().m36293a(EnumC1182n.OFFLINE_ENGINE_CALL_EXCEPTION, e2);
        }
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: a */
    public <OfflineSynthesizerParams> void mo36661a(OfflineSynthesizerParams offlinesynthesizerparams) {
        this.f2517b = (C1094b) offlinesynthesizerparams;
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: b */
    public int mo36660b(C1234e c1234e) {
        return EmbeddedSynthesizerEngine.bdTTSDomainDataUninit(this.f2518c[0]);
    }

    @Override // com.baidu.tts.p090b.p091a.p093b.AbstractC1085a, com.baidu.tts.p090b.p091a.p093b.AbstractC1086b
    /* renamed from: b */
    public TtsError mo36687b() {
        EmbeddedSynthesizerEngine.bdTTSEngineUninit(this.f2518c[0]);
        try {
            synchronized (this.f2519d) {
                if (!this.f2519d.m36346d()) {
                    this.f2519d.m36347c();
                    C1163c.m36345e();
                }
            }
            return null;
        } catch (Exception e) {
            LoggerProxy.m36554d("OfflineSynthesizer", "embedded statistics release exception=" + e.toString());
            return null;
        }
    }
}
