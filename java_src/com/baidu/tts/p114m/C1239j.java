package com.baidu.tts.p114m;

import com.baidu.tts.p090b.p091a.p093b.C1092e;
import com.baidu.tts.p090b.p091a.p093b.C1096f;
import com.baidu.tts.p090b.p094b.p096b.C1116b;
import com.baidu.tts.p102f.EnumC1167b;
import com.baidu.tts.p102f.EnumC1171c;
import com.baidu.tts.p102f.EnumC1172d;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1178j;
import com.baidu.tts.p115n.AbstractC1241a;
/* renamed from: com.baidu.tts.m.j */
/* loaded from: classes.dex */
public class C1239j extends AbstractC1241a<C1239j> {

    /* renamed from: a */
    private C1231b f3088a = new C1231b();

    /* renamed from: b */
    private C1230a f3089b = new C1230a();

    /* renamed from: b */
    private int m36125b(EnumC1175g enumC1175g, String str) {
        EnumC1178j enumC1178j;
        C1092e.C1094b m36196b = this.f3088a.m36196b();
        C1096f.C1098b m36199a = this.f3088a.m36199a();
        C1116b.C1117a m36201a = this.f3089b.m36201a();
        switch (enumC1175g) {
            case SPEED:
                this.f3088a.m36197a(str);
                break;
            case VOLUME:
                this.f3088a.m36195b(str);
                break;
            case PITCH:
                this.f3088a.m36193c(str);
                break;
            case TEXT_DAT_PATH:
                m36196b.m36677d(str);
                break;
            case SPEECH_DAT_PATH:
                m36196b.m36675e(str);
                break;
            case TTS_LICENSE_FILE_PATH:
                m36196b.m36673f(str);
                break;
            case APP_CODE:
                m36196b.m36671g(str);
                break;
            case TEXT_ENCODE:
                m36199a.a(EnumC1172d.m36322a(str));
                break;
            case NOTIFICATION_COUNT_PER_SECOND:
                m36201a.a(str);
                break;
            case PRODUCT_ID:
                m36199a.m36647c(str);
                break;
            case AUDIO_ENCODE:
                return m36199a.m36655a(EnumC1167b.m36326a(str));
            case BITRATE:
                m36199a.m36654a(EnumC1171c.m36324a(str));
                break;
            case BACKGROUND:
                m36199a.m36641f(str);
                break;
            case CUSTOM_SYNTH:
                return m36196b.m36679c(str);
            case LANGUAGE:
                m36199a.i(str);
                m36196b.i(str);
                break;
            case OPEN_XML:
                return this.f3088a.m36192d(str);
            case PUNCTUATION:
                m36199a.m36637h(str);
                break;
            case SPEAKER:
                m36199a.m36645d(str);
                break;
            case STYLE:
                m36199a.m36643e(str);
                break;
            case TERRITORY:
                m36199a.m36639g(str);
                break;
            case TTS_VOCODER_OPTIMIZATION:
                return m36196b.m36683a(str);
            case API_KEY:
                m36199a.m36653a(str);
                break;
            case SECRET_KEY:
                m36199a.m36650b(str);
                break;
            case STREAM_TYPE:
                this.f3089b.m36200a(Integer.parseInt(str));
                break;
            case MIX_MODE:
                try {
                    enumC1178j = EnumC1178j.valueOf(str);
                } catch (Exception e) {
                    enumC1178j = EnumC1178j.DEFAULT;
                }
                this.f3088a.m36198a(enumC1178j);
                break;
            case SAMPLE_RATE:
                m36196b.m36681b(str);
                break;
        }
        return 0;
    }

    /* renamed from: a */
    public int m36127a(EnumC1175g enumC1175g, String str) {
        return m36125b(enumC1175g, str);
    }

    /* renamed from: a */
    public C1231b m36128a() {
        return this.f3088a;
    }

    /* renamed from: b */
    public C1230a m36126b() {
        return this.f3089b;
    }

    /* renamed from: c */
    public C1096f.C1098b m36124c() {
        return this.f3088a.m36199a();
    }

    /* renamed from: d */
    public C1092e.C1094b m36123d() {
        return this.f3088a.m36196b();
    }

    /* renamed from: e */
    public C1116b.C1117a m36122e() {
        return this.f3089b.m36201a();
    }
}
