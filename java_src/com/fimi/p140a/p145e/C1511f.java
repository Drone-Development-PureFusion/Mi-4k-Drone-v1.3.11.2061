package com.fimi.p140a.p145e;
/* renamed from: com.fimi.a.e.f */
/* loaded from: classes.dex */
public class C1511f {

    /* renamed from: b */
    static boolean f3628b;

    /* renamed from: a */
    EnumC1513a f3629a = EnumC1513a.UNINIT;

    /* renamed from: c */
    public C1510e f3630c = new C1510e();

    /* renamed from: d */
    private C1508c f3631d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.a.e.f$a */
    /* loaded from: classes.dex */
    public enum EnumC1513a {
        UNINIT,
        IDLE,
        STX,
        LENGHT,
        TARGETID,
        SOURCEID,
        SEQ,
        MSGID,
        PAYLOAD,
        CRC1
    }

    /* renamed from: a */
    public C1508c m35432a(int i) {
        f3628b = false;
        switch (this.f3629a) {
            case UNINIT:
            case IDLE:
                if (i == 254) {
                    this.f3629a = EnumC1513a.STX;
                    this.f3631d = new C1508c();
                    break;
                }
                break;
            case STX:
                if (!f3628b) {
                    this.f3631d.m35473a(1, i);
                    this.f3629a = EnumC1513a.LENGHT;
                    break;
                } else {
                    f3628b = false;
                    this.f3629a = EnumC1513a.IDLE;
                    break;
                }
            case LENGHT:
                this.f3631d.m35473a(2, i);
                this.f3629a = EnumC1513a.TARGETID;
                break;
            case TARGETID:
                this.f3631d.m35473a(3, i);
                this.f3629a = EnumC1513a.SOURCEID;
                break;
            case SOURCEID:
                this.f3631d.m35473a(4, i);
                this.f3629a = EnumC1513a.SEQ;
                break;
            case SEQ:
                this.f3631d.m35473a(5, i);
                this.f3629a = EnumC1513a.MSGID;
                if (this.f3631d.m35470b() == 4) {
                    this.f3629a = EnumC1513a.PAYLOAD;
                    break;
                }
                break;
            case MSGID:
                this.f3631d.f3613b.m35461a((byte) i);
                if (this.f3631d.m35466d()) {
                    this.f3629a = EnumC1513a.PAYLOAD;
                    break;
                }
                break;
            case PAYLOAD:
                this.f3631d.m35465e();
                if (i == this.f3631d.f3614c.m35486c()) {
                    this.f3629a = EnumC1513a.CRC1;
                    break;
                } else {
                    f3628b = false;
                    this.f3629a = EnumC1513a.IDLE;
                    if (i == 254) {
                        this.f3629a = EnumC1513a.STX;
                        this.f3631d.f3614c.m35490a();
                    }
                    this.f3630c.m35437a();
                    break;
                }
            case CRC1:
                if (i == this.f3631d.f3614c.m35488b()) {
                    this.f3630c.m35435a(this.f3631d);
                    f3628b = true;
                    this.f3629a = EnumC1513a.IDLE;
                    break;
                } else {
                    f3628b = false;
                    this.f3629a = EnumC1513a.IDLE;
                    if (i == 254) {
                        this.f3629a = EnumC1513a.STX;
                        this.f3631d.f3614c.m35490a();
                    }
                    this.f3630c.m35437a();
                    break;
                }
        }
        if (f3628b) {
            return this.f3631d;
        }
        return null;
    }
}
