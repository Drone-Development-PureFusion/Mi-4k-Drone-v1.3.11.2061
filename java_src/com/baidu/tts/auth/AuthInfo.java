package com.baidu.tts.auth;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.C1068b;
import com.baidu.tts.auth.C1070c;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p102f.EnumC1181m;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
/* loaded from: classes.dex */
public class AuthInfo {

    /* renamed from: a */
    private EnumC1181m f2457a;

    /* renamed from: b */
    private C1070c.C1071a f2458b;

    /* renamed from: c */
    private C1068b.C1069a f2459c;

    /* renamed from: d */
    private TtsError f2460d;

    public int getLeftValidDays() {
        return this.f2459c.m36776a();
    }

    public TtsError getMixTtsError() {
        TtsError onlineTtsError = getOnlineTtsError();
        TtsError offlineTtsError = getOfflineTtsError();
        TtsError ttsError = null;
        if (onlineTtsError != null && offlineTtsError != null) {
            ttsError = C1191c.m36299a().m36292b(EnumC1182n.MIX_ENGINE_AUTH_FAILURE);
        } else if (onlineTtsError == null && offlineTtsError != null) {
            ttsError = C1191c.m36299a().m36292b(EnumC1182n.OFFLINE_ENGINE_AUTH_FAILURE);
        } else if (onlineTtsError != null && offlineTtsError == null) {
            ttsError = C1191c.m36299a().m36292b(EnumC1182n.ONLINE_ENGINE_AUTH_FAILURE);
        }
        return ttsError != null ? ttsError : this.f2460d;
    }

    public String getNotifyMessage() {
        return this.f2459c.m36770c();
    }

    public C1068b.C1069a getOfflineResult() {
        return this.f2459c;
    }

    public TtsError getOfflineTtsError() {
        return this.f2459c != null ? this.f2459c.m36772b() : this.f2460d;
    }

    public C1070c.C1071a getOnlineResult() {
        return this.f2458b;
    }

    public TtsError getOnlineTtsError() {
        return this.f2458b != null ? this.f2458b.m36752b() : this.f2460d;
    }

    public EnumC1181m getTtsEnum() {
        return this.f2457a;
    }

    public TtsError getTtsError() {
        if (this.f2460d == null) {
            switch (this.f2457a) {
                case ONLINE:
                    return this.f2458b.m36752b();
                case OFFLINE:
                    return this.f2459c.m36772b();
                case MIX:
                    return getMixTtsError();
                default:
                    return null;
            }
        }
        return this.f2460d;
    }

    public boolean isMixSuccess() {
        return isOnlineSuccess() || isOfflineSuccess();
    }

    public boolean isOfflineSuccess() {
        if (this.f2459c != null) {
            return this.f2459c.mo36249g();
        }
        return false;
    }

    public boolean isOnlineSuccess() {
        if (this.f2458b != null) {
            return this.f2458b.mo36249g();
        }
        return false;
    }

    public boolean isSuccess() {
        if (this.f2460d != null) {
            LoggerProxy.m36554d("AuthInfo", "cause=" + this.f2460d.getThrowable().getMessage());
            return false;
        } else if (this.f2457a == null) {
            return false;
        } else {
            switch (this.f2457a) {
                case ONLINE:
                    return isOnlineSuccess();
                case OFFLINE:
                    return isOfflineSuccess();
                case MIX:
                    return isMixSuccess();
                default:
                    return false;
            }
        }
    }

    public void setOfflineResult(C1068b.C1069a c1069a) {
        this.f2459c = c1069a;
    }

    public void setOnlineResult(C1070c.C1071a c1071a) {
        this.f2458b = c1071a;
    }

    public void setTtsEnum(EnumC1181m enumC1181m) {
        this.f2457a = enumC1181m;
    }

    public void setTtsError(TtsError ttsError) {
        this.f2460d = ttsError;
    }
}
