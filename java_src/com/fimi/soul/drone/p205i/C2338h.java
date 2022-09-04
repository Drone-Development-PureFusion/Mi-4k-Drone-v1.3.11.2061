package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.p195d.p196a.C2197d;
import com.fimi.soul.drone.p205i.C2349j;
import org.codehaus.jackson.smile.SmileConstants;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.h */
/* loaded from: classes.dex */
public class C2338h extends AbstractC2285a {

    /* renamed from: a */
    private C2349j.EnumC2351b f7607a = C2349j.EnumC2351b.Set;

    /* renamed from: b */
    private EnumC2339a f7608b = EnumC2339a.NormalReady;

    /* renamed from: c */
    private EnumC2340b f7609c = EnumC2340b.NormalReady;

    /* renamed from: d */
    private EnumC2341c f7610d = EnumC2341c.NoWarining;

    /* renamed from: e */
    private byte f7611e;

    /* renamed from: f */
    private byte f7612f;

    /* renamed from: g */
    private byte f7613g;

    /* renamed from: h */
    private byte f7614h;

    /* renamed from: com.fimi.soul.drone.i.h$a */
    /* loaded from: classes.dex */
    public enum EnumC2339a {
        NormalReady,
        PhotoShoting,
        VideoRecording,
        Error,
        Formating,
        NoSDCard,
        FullSDCard,
        OUTSDCard,
        WIFIINIT,
        CAMERASTART,
        SAVEPHOTO,
        LOW_SPEED_CARD,
        UPDATEPRO,
        UPDATEFAILE,
        CardNoPropose,
        CardNoProposeAndParamerr,
        CardWriteLow,
        CardWriteLowAndParamerr,
        CardSetroot,
        CardFileSysError,
        CardParametersError,
        MachineException
    }

    /* renamed from: com.fimi.soul.drone.i.h$b */
    /* loaded from: classes.dex */
    public enum EnumC2340b {
        NormalReady,
        Formating,
        NoSDCard,
        Error
    }

    /* renamed from: com.fimi.soul.drone.i.h$c */
    /* loaded from: classes.dex */
    public enum EnumC2341c {
        NoWarining,
        FullSDCard
    }

    /* renamed from: a */
    private C2349j.EnumC2351b m31985a(byte b) {
        return b == 1 ? C2349j.EnumC2351b.Set : b == 2 ? C2349j.EnumC2351b.Get : this.f7607a;
    }

    /* renamed from: b */
    private EnumC2340b m31979b(byte b) {
        return b == 1 ? EnumC2340b.NormalReady : b == 2 ? EnumC2340b.Formating : b == 3 ? EnumC2340b.NoSDCard : EnumC2340b.Error;
    }

    /* renamed from: c */
    private EnumC2341c m31977c(byte b) {
        return b == 1 ? EnumC2341c.FullSDCard : EnumC2341c.NoWarining;
    }

    @Override // com.fimi.soul.drone.p195d.AbstractC2108a
    /* renamed from: a */
    public void mo31936a(C2197d c2197d) {
        c2197d.m32741c();
        byte m32739d = c2197d.m32739d();
        this.f7611e = m32739d;
        this.f7612f = c2197d.m32739d();
        this.f7613g = c2197d.m32739d();
        this.f7614h = c2197d.m32739d();
        byte b = (byte) (m32739d & 3);
        byte b2 = (byte) ((m32739d >>> 2) & 3);
        m31985a(b2);
        byte b3 = (byte) ((b2 >>> 2) & 3);
        m31979b(b3);
        m31977c((byte) ((b3 >>> 2) & 3));
    }

    /* renamed from: a */
    public void m31984a(EnumC2339a enumC2339a) {
        this.f7608b = enumC2339a;
    }

    /* renamed from: a */
    public void m31983a(EnumC2340b enumC2340b) {
        this.f7609c = enumC2340b;
    }

    /* renamed from: a */
    public void m31982a(EnumC2341c enumC2341c) {
        this.f7610d = enumC2341c;
    }

    /* renamed from: a */
    public void m31981a(C2349j.EnumC2351b enumC2351b) {
        this.f7607a = enumC2351b;
    }

    /* renamed from: b */
    public int m31980b() {
        return this.f7611e & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
    }

    /* renamed from: c */
    public C2349j.EnumC2351b m31978c() {
        return this.f7607a;
    }

    /* renamed from: d */
    public long m31976d() {
        long j = 0;
        if (this.f7611e == 1) {
            j = this.f7612f & ((this.f7613g * 16) + 255);
        }
        return this.f7611e == 2 ? (this.f7612f * 60 * 60 * 1000) + (this.f7613g * 60 * 1000) + (this.f7614h * 1000) : j;
    }

    /* renamed from: e */
    public int m31975e() {
        return this.f7612f;
    }

    /* renamed from: f */
    public EnumC2339a m31974f() {
        return this.f7611e == 0 ? EnumC2339a.NormalReady : this.f7611e == 1 ? EnumC2339a.PhotoShoting : this.f7611e == 2 ? EnumC2339a.VideoRecording : this.f7611e == 3 ? EnumC2339a.MachineException : this.f7611e == 16 ? EnumC2339a.Formating : this.f7611e == 17 ? EnumC2339a.CardNoPropose : this.f7611e == 18 ? EnumC2339a.CardNoProposeAndParamerr : this.f7611e == 19 ? EnumC2339a.CardWriteLow : this.f7611e == 20 ? EnumC2339a.CardWriteLowAndParamerr : this.f7611e == 21 ? EnumC2339a.CardSetroot : this.f7611e == 32 ? EnumC2339a.NoSDCard : this.f7611e == 48 ? EnumC2339a.CardParametersError : this.f7611e == 64 ? EnumC2339a.FullSDCard : this.f7611e == 80 ? EnumC2339a.OUTSDCard : this.f7611e == 81 ? EnumC2339a.CAMERASTART : this.f7611e == 82 ? EnumC2339a.WIFIINIT : this.f7611e == 83 ? EnumC2339a.SAVEPHOTO : this.f7611e == 84 ? EnumC2339a.LOW_SPEED_CARD : this.f7611e == 85 ? EnumC2339a.CardFileSysError : (this.f7611e & SmileConstants.BYTE_MARKER_END_OF_CONTENT) == 255 ? EnumC2339a.UPDATEPRO : (this.f7611e & SmileConstants.BYTE_MARKER_END_OF_CONTENT) == 254 ? EnumC2339a.UPDATEFAILE : EnumC2339a.Error;
    }

    /* renamed from: g */
    public EnumC2340b m31973g() {
        return this.f7609c;
    }

    /* renamed from: h */
    public EnumC2341c m31972h() {
        return this.f7610d;
    }

    public String toString() {
        return "CloudCameraStatusVariable{cameraMode=" + this.f7607a + ", cameraStatus=" + this.f7608b + ", sdCardStatus=" + this.f7609c + ", waringStatus=" + this.f7610d + ", status = " + ((int) this.f7611e) + ", time = " + m31976d() + C0494h.f735w;
    }
}
