package com.fimi.soul.drone.p195d;

import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2198e;
/* renamed from: com.fimi.soul.drone.d.b */
/* loaded from: classes.dex */
public class C2199b {

    /* renamed from: b */
    static boolean f6925b;

    /* renamed from: a */
    EnumC2201a f6926a = EnumC2201a.MILINK_PARSE_STATE_UNINIT;

    /* renamed from: c */
    public C2198e f6927c = new C2198e();

    /* renamed from: d */
    private C2196c f6928d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.drone.d.b$a */
    /* loaded from: classes.dex */
    public enum EnumC2201a {
        MILINK_PARSE_STATE_GOT_COMPID,
        MILINK_PARSE_STATE_UNINIT,
        MILINK_PARSE_STATE_IDLE,
        MILINK_PARSE_STATE_GOT_STX,
        MILINK_PARSE_STATE_GOT_LENGTH,
        MILINK_PARSE_STATE_GOT_MSGID,
        MILINK_PARSE_STATE_GOT_CRC1,
        MILINK_PARSE_STATE_GOT_PAYLOAD
    }

    /* renamed from: a */
    public C2196c m32724a(int i) {
        f6925b = false;
        switch (this.f6926a) {
            case MILINK_PARSE_STATE_UNINIT:
            case MILINK_PARSE_STATE_IDLE:
                if (i == 254) {
                    this.f6926a = EnumC2201a.MILINK_PARSE_STATE_GOT_STX;
                    this.f6928d = new C2196c();
                    break;
                }
                break;
            case MILINK_PARSE_STATE_GOT_STX:
                if (!f6925b) {
                    this.f6928d.f6912b = i;
                    this.f6926a = EnumC2201a.MILINK_PARSE_STATE_GOT_LENGTH;
                    break;
                } else {
                    f6925b = false;
                    this.f6926a = EnumC2201a.MILINK_PARSE_STATE_IDLE;
                    break;
                }
            case MILINK_PARSE_STATE_GOT_LENGTH:
                this.f6928d.f6913c = i;
                this.f6926a = EnumC2201a.MILINK_PARSE_STATE_GOT_MSGID;
                break;
            case MILINK_PARSE_STATE_GOT_MSGID:
                this.f6928d.f6914d.m32752a((byte) i);
                if (this.f6928d.m32761a()) {
                    this.f6926a = EnumC2201a.MILINK_PARSE_STATE_GOT_PAYLOAD;
                    break;
                }
                break;
            case MILINK_PARSE_STATE_GOT_PAYLOAD:
                this.f6928d.m32759b();
                if (i == this.f6928d.f6915e.m32876c()) {
                    this.f6926a = EnumC2201a.MILINK_PARSE_STATE_GOT_CRC1;
                    break;
                } else {
                    f6925b = false;
                    this.f6926a = EnumC2201a.MILINK_PARSE_STATE_IDLE;
                    if (i == 254) {
                        this.f6926a = EnumC2201a.MILINK_PARSE_STATE_GOT_STX;
                        this.f6928d.f6915e.m32880a();
                    }
                    this.f6927c.m32729a();
                    break;
                }
            case MILINK_PARSE_STATE_GOT_CRC1:
                if (i == this.f6928d.f6915e.m32878b()) {
                    this.f6927c.m32727a(this.f6928d);
                    f6925b = true;
                    this.f6926a = EnumC2201a.MILINK_PARSE_STATE_IDLE;
                    break;
                } else {
                    f6925b = false;
                    this.f6926a = EnumC2201a.MILINK_PARSE_STATE_IDLE;
                    if (i == 254) {
                        this.f6926a = EnumC2201a.MILINK_PARSE_STATE_GOT_STX;
                        this.f6928d.f6915e.m32880a();
                    }
                    this.f6927c.m32729a();
                    break;
                }
        }
        if (f6925b) {
            return this.f6928d;
        }
        return null;
    }
}
