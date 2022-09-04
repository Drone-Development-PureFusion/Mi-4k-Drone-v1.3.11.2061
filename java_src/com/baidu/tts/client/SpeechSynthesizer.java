package com.baidu.tts.client;

import android.content.Context;
import android.os.Bundle;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.p086a.p088b.C1048a;
import com.baidu.tts.p102f.EnumC1167b;
import com.baidu.tts.p102f.EnumC1171c;
import com.baidu.tts.p102f.EnumC1172d;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p102f.EnumC1176h;
import com.baidu.tts.p102f.EnumC1178j;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.StringTool;
import java.util.List;
/* loaded from: classes.dex */
public class SpeechSynthesizer {
    public static final int MAX_LIST_SIZE = 100;
    public static final int MAX_QUEUE_SIZE = 1000;

    /* renamed from: b */
    private C1048a f2617b = new C1048a();
    public static final int ERROR_QUEUE_IS_FULL = EnumC1182n.TTS_QUEUE_IS_FULL.m36307b();
    public static final int ERROR_LIST_IS_TOO_LONG = EnumC1182n.TTS_LIST_IS_TOO_LONG.m36307b();
    public static final int ERROR_TEXT_IS_EMPTY = EnumC1182n.TEXT_IS_EMPTY.m36307b();
    public static final int ERROR_TEXT_IS_TOO_LONG = EnumC1182n.TEXT_IS_TOO_LONG.m36307b();
    public static final int ERROR_TEXT_ENCODE_IS_WRONG = EnumC1182n.TEXT_ENCODE_IS_WRONG.m36307b();
    public static final int ERROR_APP_ID_IS_INVALID = EnumC1182n.TTS_APP_ID_IS_INVALID.m36307b();
    public static final String PARAM_SPEED = EnumC1175g.m36318a(EnumC1175g.SPEED);
    public static final String PARAM_PITCH = EnumC1175g.m36318a(EnumC1175g.PITCH);
    public static final String PARAM_VOLUME = EnumC1175g.m36318a(EnumC1175g.VOLUME);
    public static final String PARAM_TTS_TEXT_MODEL_FILE = EnumC1175g.m36318a(EnumC1175g.TEXT_DAT_PATH);
    public static final String PARAM_TTS_SPEECH_MODEL_FILE = EnumC1175g.m36318a(EnumC1175g.SPEECH_DAT_PATH);
    public static final String PARAM_TTS_LICENCE_FILE = EnumC1175g.m36318a(EnumC1175g.TTS_LICENSE_FILE_PATH);
    public static final String PARAM_VOCODER_OPTIM_LEVEL = EnumC1175g.m36318a(EnumC1175g.TTS_VOCODER_OPTIMIZATION);
    public static final String PARAM_CUSTOM_SYNTH = EnumC1175g.m36318a(EnumC1175g.CUSTOM_SYNTH);
    public static final String PARAM_OPEN_XML = EnumC1175g.m36318a(EnumC1175g.OPEN_XML);
    public static final String PARAM_PRODUCT_ID = EnumC1175g.m36318a(EnumC1175g.PRODUCT_ID);
    public static final String PARAM_LANGUAGE = EnumC1175g.m36318a(EnumC1175g.LANGUAGE);
    public static final String PARAM_AUDIO_ENCODE = EnumC1175g.m36318a(EnumC1175g.AUDIO_ENCODE);
    public static final String PARAM_AUDIO_RATE = EnumC1175g.m36318a(EnumC1175g.BITRATE);
    public static final String PARAM_SPEAKER = EnumC1175g.m36318a(EnumC1175g.SPEAKER);
    public static final String PARAM_MIX_MODE = EnumC1175g.m36318a(EnumC1175g.MIX_MODE);
    public static final String MIX_MODE_DEFAULT = EnumC1178j.DEFAULT.name();
    public static final String MIX_MODE_HIGH_SPEED_NETWORK = EnumC1178j.HIGH_SPEED_NETWORK.name();
    public static final String MIX_MODE_HIGH_SPEED_SYNTHESIZE = EnumC1178j.HIGH_SPEED_SYNTHESIZE.name();
    public static final String MIX_MODE_HIGH_SPEED_SYNTHESIZE_WIFI = EnumC1178j.HIGH_SPEED_SYNTHESIZE_WIFI.name();
    public static final String LANGUAGE_ZH = EnumC1176h.ZH.m36316a();
    public static final String TEXT_ENCODE_GBK = EnumC1172d.GB18030.m36321b();
    public static final String TEXT_ENCODE_BIG5 = EnumC1172d.BIG5.m36321b();
    public static final String TEXT_ENCODE_UTF8 = EnumC1172d.UTF8.m36321b();
    public static final String AUDIO_ENCODE_BV = EnumC1167b.BV.m36327a();
    public static final String AUDIO_ENCODE_AMR = EnumC1167b.AMR.m36327a();
    public static final String AUDIO_ENCODE_OPUS = EnumC1167b.OPUS.m36327a();
    public static final String AUDIO_BITRATE_BV_16K = EnumC1171c.BV_16K.m36325a();
    public static final String AUDIO_BITRATE_AMR_6K6 = EnumC1171c.AMR_6K6.m36325a();
    public static final String AUDIO_BITRATE_AMR_8K85 = EnumC1171c.AMR_8K85.m36325a();
    public static final String AUDIO_BITRATE_AMR_12K65 = EnumC1171c.AMR_12K65.m36325a();
    public static final String AUDIO_BITRATE_AMR_14K25 = EnumC1171c.AMR_14K25.m36325a();
    public static final String AUDIO_BITRATE_AMR_15K85 = EnumC1171c.AMR_15K85.m36325a();
    public static final String AUDIO_BITRATE_AMR_18K25 = EnumC1171c.AMR_18K25.m36325a();
    public static final String AUDIO_BITRATE_AMR_19K85 = EnumC1171c.AMR_19K85.m36325a();
    public static final String AUDIO_BITRATE_AMR_23K05 = EnumC1171c.AMR_23K05.m36325a();
    public static final String AUDIO_BITRATE_AMR_23K85 = EnumC1171c.AMR_23K85.m36325a();
    public static final String AUDIO_BITRATE_OPUS_8K = EnumC1171c.OPUS_8K.m36325a();
    public static final String AUDIO_BITRATE_OPUS_16K = EnumC1171c.OPUS_16K.m36325a();
    public static final String AUDIO_BITRATE_OPUS_18K = EnumC1171c.OPUS_18K.m36325a();
    public static final String AUDIO_BITRATE_OPUS_20K = EnumC1171c.OPUS_20K.m36325a();
    public static final String AUDIO_BITRATE_OPUS_24K = EnumC1171c.OPUS_24K.m36325a();
    public static final String AUDIO_BITRATE_OPUS_32K = EnumC1171c.OPUS_32K.m36325a();

    /* renamed from: a */
    private static volatile SpeechSynthesizer f2616a = null;

    private SpeechSynthesizer() {
    }

    public static SpeechSynthesizer getInstance() {
        if (f2616a == null) {
            synchronized (SpeechSynthesizer.class) {
                if (f2616a == null) {
                    f2616a = new SpeechSynthesizer();
                }
            }
        }
        return f2616a;
    }

    public AuthInfo auth(TtsMode ttsMode) {
        return this.f2617b.m36852b(ttsMode);
    }

    public int batchSpeak(List<SpeechSynthesizeBag> list) {
        return DataTool.isListEmpty(list) ? EnumC1182n.TTS_PARAMETER_INVALID.m36307b() : this.f2617b.m36857a(list);
    }

    public int freeCustomResource() {
        return this.f2617b.m36844f();
    }

    public synchronized int initTts(TtsMode ttsMode) {
        TtsError m36863a;
        m36863a = this.f2617b.m36863a(ttsMode);
        return m36863a == null ? 0 : m36863a.getDetailCode();
    }

    public String libVersion() {
        return this.f2617b.m36870a();
    }

    public int loadCustomResource(String str) {
        return this.f2617b.m36861a(str);
    }

    public int loadEnglishModel(String str, String str2) {
        return this.f2617b.m36847c(str, str2);
    }

    public int loadModel(String str, String str2) {
        return this.f2617b.m36850b(str, str2);
    }

    public synchronized int pause() {
        return this.f2617b.m36855b();
    }

    public synchronized int release() {
        this.f2617b.m36845e();
        f2616a = null;
        return 0;
    }

    public synchronized int resume() {
        return this.f2617b.m36848c();
    }

    public int setApiKey(String str, String str2) {
        setParam(EnumC1175g.API_KEY.name(), str);
        setParam(EnumC1175g.SECRET_KEY.name(), str2);
        return 0;
    }

    public int setAppId(String str) {
        if (StringTool.isAllNumber(str)) {
            setParam(EnumC1175g.APP_CODE.name(), str);
            return 0;
        }
        return ERROR_APP_ID_IS_INVALID;
    }

    public int setAudioStreamType(int i) {
        return this.f2617b.m36868a(i);
    }

    public void setContext(Context context) {
        this.f2617b.m36867a(context);
    }

    public int setParam(String str, String str2) {
        return this.f2617b.m36860a(str, str2);
    }

    public void setSpeechSynthesizerListener(SpeechSynthesizerListener speechSynthesizerListener) {
        this.f2617b.m36864a(speechSynthesizerListener);
    }

    public int setStereoVolume(float f, float f2) {
        return this.f2617b.m36869a(f, f2);
    }

    public int speak(SpeechSynthesizeBag speechSynthesizeBag) {
        try {
            return speak(speechSynthesizeBag.getText(), speechSynthesizeBag.getUtteranceId());
        } catch (Exception e) {
            return EnumC1182n.TTS_PARAMETER_INVALID.m36307b();
        }
    }

    public int speak(String str) {
        return speak(str, null);
    }

    public int speak(String str, String str2) {
        return speak(str, str2, null);
    }

    public int speak(String str, String str2, Bundle bundle) {
        return this.f2617b.m36859a(str, str2, bundle);
    }

    public synchronized int stop() {
        return this.f2617b.m36846d();
    }

    public int synthesize(SpeechSynthesizeBag speechSynthesizeBag) {
        try {
            return synthesize(speechSynthesizeBag.getText(), speechSynthesizeBag.getUtteranceId());
        } catch (Exception e) {
            return EnumC1182n.TTS_PARAMETER_INVALID.m36307b();
        }
    }

    public int synthesize(String str) {
        return synthesize(str, null);
    }

    public int synthesize(String str, String str2) {
        return synthesize(str, str2, null);
    }

    public int synthesize(String str, String str2, Bundle bundle) {
        return this.f2617b.m36849b(str, str2, bundle);
    }
}
