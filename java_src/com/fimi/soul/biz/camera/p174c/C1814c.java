package com.fimi.soul.biz.camera.p174c;

import android.util.Log;
import com.fimi.kernel.utils.C1673n;
import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11DeviceInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.biz.camera.entity.X11SystemConfigOption;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3025e;
import com.google.gson.internal.LinkedTreeMap;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.fimi.soul.biz.camera.c.c */
/* loaded from: classes.dex */
public class C1814c extends AbstractC1808a {

    /* renamed from: b */
    long f4728b;

    /* renamed from: c */
    private String f4729c;

    /* renamed from: f */
    private String f4732f;

    /* renamed from: g */
    private String f4733g;

    /* renamed from: d */
    private EnumC1818c f4730d = EnumC1818c.Max;

    /* renamed from: e */
    private EnumC1816a f4731e = EnumC1816a.Total;

    /* renamed from: a */
    int f4727a = 0;

    /* renamed from: com.fimi.soul.biz.camera.c.c$a */
    /* loaded from: classes.dex */
    public enum EnumC1816a {
        Total,
        Photo,
        Video
    }

    /* renamed from: com.fimi.soul.biz.camera.c.c$b */
    /* loaded from: classes.dex */
    public enum EnumC1817b {
        PowerStandby,
        PowerOff
    }

    /* renamed from: com.fimi.soul.biz.camera.c.c$c */
    /* loaded from: classes.dex */
    public enum EnumC1818c {
        Max,
        Current,
        Status
    }

    /* renamed from: com.fimi.soul.biz.camera.c.c$d */
    /* loaded from: classes.dex */
    public enum EnumC1819d {
        Jump,
        Fast,
        Normal,
        Slow
    }

    public C1814c(AbstractC1794c abstractC1794c) {
        super(abstractC1794c);
    }

    /* renamed from: a */
    private void m34053a(Map<String, String> map, X11SystemConfig x11SystemConfig) {
        x11SystemConfig.setAe_bias(map.get("ae_bias"));
        x11SystemConfig.setSaturation(map.get(C1831e.f4879bZ));
        x11SystemConfig.setContrast(map.get(C1831e.f4932ca));
        x11SystemConfig.setSharpness(map.get(C1831e.f4933cb));
        x11SystemConfig.setAwb(map.get(C1831e.f4934cc));
        x11SystemConfig.setSystemType(map.get(C1831e.f4876bW));
        x11SystemConfig.setCameraTimeLock(map.get(C1831e.f4855bB));
        x11SystemConfig.setVideoStandard(map.get(C1831e.f4858bE));
        x11SystemConfig.setAppStatus(map.get(C1831e.f4859bF));
        x11SystemConfig.setStreamOutType(map.get(C1831e.f4860bG));
        x11SystemConfig.setSaveLowResolution(m34042f(map.get(C1831e.f4861bH)));
        x11SystemConfig.setVideoResolution(map.get(C1831e.f4862bI));
        x11SystemConfig.setVideoQuality(map.get(C1831e.f4864bK));
        x11SystemConfig.setTimelapseVideo(m34042f(map.get(C1831e.f4865bL)));
        x11SystemConfig.setCaptureMode(map.get(C1831e.f4866bM));
        x11SystemConfig.setPhotoSize(map.get(C1831e.f4867bN));
        x11SystemConfig.setPhotoStamp(map.get(C1831e.f4868bO));
        x11SystemConfig.setPhotoQuality(map.get(C1831e.f4869bP));
        x11SystemConfig.setTimelapsePhoto(m34042f(map.get(C1831e.f4870bQ)));
        x11SystemConfig.setVideoStamp(map.get(C1831e.f4863bJ));
        x11SystemConfig.setVideoSrt(map.get(C1831e.f4871bR));
        x11SystemConfig.setVideoLoopBack(map.get(C1831e.f4872bS));
        x11SystemConfig.setVideoMode(map.get(C1831e.f4873bT));
        x11SystemConfig.setSDState(map.get(C1831e.f4874bU));
        x11SystemConfig.setImage_format(map.get(C1831e.f4875bV));
        x11SystemConfig.setRavl(Integer.parseInt(map.get(C1831e.f4856bC)));
        x11SystemConfig.setCur_time(Long.parseLong(map.get(C1831e.f4857bD)));
    }

    /* renamed from: f */
    private boolean m34042f(String str) {
        return C1831e.f4911cE.equals(str);
    }

    /* renamed from: a */
    public void m34060a(EnumC1816a enumC1816a) {
        String str;
        this.f4731e = enumC1816a;
        switch (enumC1816a) {
            case Total:
                str = "total";
                break;
            case Photo:
                str = C1831e.f4914cH;
                break;
            case Video:
                str = "video";
                break;
            default:
                str = null;
                break;
        }
        a(6, (String) null, str);
    }

    /* renamed from: a */
    public void m34059a(EnumC1817b enumC1817b) {
        String str = null;
        switch (enumC1817b) {
            case PowerStandby:
                str = "cam_stb";
                break;
            case PowerOff:
                str = "cam_off";
                break;
        }
        a(12, str);
    }

    /* renamed from: a */
    public void m34058a(EnumC1818c enumC1818c) {
        String str;
        this.f4730d = enumC1818c;
        switch (enumC1818c) {
            case Max:
                str = "max";
                break;
            case Current:
                str = "current";
                break;
            case Status:
                str = "status";
                break;
            default:
                str = null;
                break;
        }
        a(15, (String) null, str);
    }

    /* renamed from: a */
    public void m34057a(EnumC1819d enumC1819d, int i) {
        String str = null;
        switch (enumC1819d) {
            case Jump:
                str = "jump";
                break;
            case Fast:
                str = "fast";
                break;
            case Normal:
                str = "normal";
                break;
            case Slow:
                str = "slow";
                break;
        }
        a(14, i + "", str);
    }

    /* renamed from: a */
    public void m34056a(String str) {
        a(1, (String) null, str);
    }

    /* renamed from: a */
    public void m34054a(String str, String str2) {
        this.f4732f = str;
        this.f4733g = str2;
        a(2, str2, str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fimi.soul.biz.camera.p174c.AbstractC1808a, com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        super.mo28055a(z, x11RespCmd);
        if (z) {
            X11SystemConfig m34095j = a().m34095j();
            switch (x11RespCmd.getMsg_id()) {
                case 2:
                    if (C1831e.f4866bM.equals(this.f4732f)) {
                        m34095j.setCaptureMode(this.f4733g);
                    }
                    long cur_time = m34095j.getCur_time();
                    if ((m34095j.getRavl() == 0 && Math.abs(cur_time - this.f4728b) <= 5000) || this.f4727a >= 3) {
                        return;
                    }
                    m34035m();
                    this.f4727a++;
                    return;
                case 3:
                    if (x11RespCmd.getParam() == null) {
                        return;
                    }
                    try {
                        Map<String, String> hashMap = new HashMap<>();
                        for (LinkedTreeMap linkedTreeMap : (List) x11RespCmd.getParam()) {
                            for (String str : linkedTreeMap.keySet()) {
                                hashMap.put(str, linkedTreeMap.get(str));
                            }
                        }
                        m34053a(hashMap, m34095j);
                        if (C1831e.f4913cG.contains(m34095j.getAppStatus())) {
                            a().m34137a(AbstractC1794c.EnumC1804a.Recoding);
                        }
                        if (C1831e.f4914cH.contains(m34095j.getAppStatus())) {
                            a().m34137a(AbstractC1794c.EnumC1804a.ContinueCapturing);
                        }
                        if (C1831e.f4912cF.contains(m34095j.getAppStatus())) {
                            a().m34137a(AbstractC1794c.EnumC1804a.IDLE);
                        }
                        if (!C1831e.f4915cI.contains(m34095j.getAppStatus())) {
                            return;
                        }
                        a().m34137a(AbstractC1794c.EnumC1804a.Normal);
                        return;
                    } catch (Exception e) {
                        return;
                    }
                case 5:
                    try {
                        long parseLong = Long.parseLong(x11RespCmd.getParam().toString());
                        if (C1831e.f4927cU.equals(this.f4729c)) {
                            m34095j.setFreeKBSpace(parseLong);
                        }
                        if (!C1831e.f4928cV.equals(this.f4729c)) {
                            return;
                        }
                        m34095j.setTotalKBSpace(parseLong);
                        m34046d(C1831e.f4927cU);
                        return;
                    } catch (Exception e2) {
                        return;
                    }
                case 6:
                    int parseInt = Integer.parseInt(x11RespCmd.getParam().toString());
                    switch (this.f4731e) {
                        case Total:
                            m34095j.setTotalFileNumbers(parseInt);
                            return;
                        case Photo:
                            m34095j.setPhotoFileNumbers(parseInt);
                            return;
                        case Video:
                            m34095j.setVideoFileNumbers(parseInt);
                            return;
                        default:
                            return;
                    }
                case 9:
                    if (x11RespCmd.getParam() == null) {
                        return;
                    }
                    String obj = x11RespCmd.getParam().toString();
                    X11SystemConfigOption x11SystemConfigOption = new X11SystemConfigOption();
                    x11SystemConfigOption.setType(obj);
                    x11SystemConfigOption.setPermission(x11RespCmd.getPermission());
                    x11SystemConfigOption.setOptions(x11RespCmd.getOptions());
                    m34095j.getSystemConfigOptions().put(obj, x11SystemConfigOption);
                    return;
                case 11:
                    X11DeviceInfo x11DeviceInfo = m34095j.getX11DeviceInfo();
                    x11DeviceInfo.setBrand(x11RespCmd.getBrand());
                    x11DeviceInfo.setApiVersion(x11RespCmd.getApi_ver());
                    x11DeviceInfo.setModel(x11RespCmd.getModel());
                    x11DeviceInfo.setFirmwareVersion(x11RespCmd.getFw_ver());
                    x11DeviceInfo.setAppType(x11RespCmd.getApp_type());
                    x11DeviceInfo.setLogo(x11RespCmd.getLogo());
                    x11DeviceInfo.setChip(x11RespCmd.getChip());
                    x11DeviceInfo.setHttp(x11RespCmd.getHttp());
                    m34037k();
                    return;
                case 13:
                    m34095j.setBatteryLevel(Integer.parseInt(x11RespCmd.getParam().toString()));
                    m34095j.setPowerSourceType(x11RespCmd.getType());
                    return;
                case 15:
                    int parseInt2 = Integer.parseInt(x11RespCmd.getParam().toString());
                    switch (this.f4730d) {
                        case Max:
                            m34095j.setMaxZoomInfo(parseInt2);
                            return;
                        case Current:
                            m34095j.setCurrentZoomInfo(parseInt2);
                            return;
                        default:
                            return;
                    }
                case 18:
                    C3021a.m29616a().m29614a(13, C1673n.m34639n(x11RespCmd.getParam().toString()));
                    C3021a.m29616a().m29613a(new C3025e("", 13, C1673n.m34639n(x11RespCmd.getParam().toString())));
                    Log.d("moweiru", "resp.getParam().toString():" + x11RespCmd.getParam().toString());
                    m34095j.setDvVersion(C1673n.m34639n(x11RespCmd.getParam().toString()) + "");
                    m34045e();
                    return;
                case 19:
                    String[] split = x11RespCmd.getParam().toString().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    int parseInt3 = Integer.parseInt(split[0]);
                    int parseInt4 = Integer.parseInt(split[1]);
                    m34095j.setRemainVideoRecordMinutes(parseInt3);
                    m34095j.setRemainPhotoTakeNumbers(parseInt4);
                    return;
                case 259:
                    this.f4727a = 0;
                    m34035m();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public void m34052b() {
        a(3);
    }

    /* renamed from: b */
    public void m34051b(int i) {
        a(16, i + "");
    }

    /* renamed from: b */
    public void m34050b(String str) {
        a(9, str);
    }

    /* renamed from: c */
    public void m34049c() {
        a(4, "D:");
    }

    /* renamed from: c */
    public void m34048c(String str) {
        a(4, str);
    }

    /* renamed from: d */
    public void m34047d() {
        a(11);
    }

    /* renamed from: d */
    public void m34046d(String str) {
        this.f4729c = str;
        a(5, (String) null, str);
    }

    /* renamed from: e */
    public void m34045e() {
        a(259, "none_force");
    }

    /* renamed from: e */
    public void m34044e(String str) {
        a(261, str, "TCP");
    }

    /* renamed from: f */
    public void m34043f() {
        a(260);
    }

    /* renamed from: g */
    public void m34041g() {
        a(2, "live", "dv_mode");
    }

    /* renamed from: h */
    public void m34040h() {
        a(2, C1831e.f4913cG, "dv_mode");
    }

    /* renamed from: i */
    public void m34039i() {
    }

    /* renamed from: j */
    public void m34038j() {
        a(17);
    }

    /* renamed from: k */
    public void m34037k() {
        a(18);
    }

    /* renamed from: l */
    public void m34036l() {
        a(19);
    }

    /* renamed from: m */
    public void m34035m() {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.f4728b = new Date().getTime();
        m34054a(C1831e.f4855bB, format);
    }
}
