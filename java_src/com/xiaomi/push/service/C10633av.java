package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.file.C10400a;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.channel.commonutils.string.C10433d;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C10636aw;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.C10802c;
import com.xiaomi.xmpush.thrift.C10804d;
import com.xiaomi.xmpush.thrift.EnumC10821o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: com.xiaomi.push.service.av */
/* loaded from: classes2.dex */
public class C10633av {

    /* renamed from: a */
    private static String f33078a = C10433d.m5177a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    /* renamed from: b */
    private static AtomicLong f33079b = new AtomicLong(0);

    /* renamed from: com.xiaomi.push.service.av$a */
    /* loaded from: classes2.dex */
    public static class C10634a implements C10636aw.AbstractC10638b {

        /* renamed from: a */
        private final Context f33080a;

        public C10634a(Context context) {
            this.f33080a = context;
        }

        @Override // com.xiaomi.push.service.C10636aw.AbstractC10638b
        /* renamed from: a */
        public void mo4280a(ArrayList<C10635b> arrayList) {
        }

        @Override // com.xiaomi.push.service.C10636aw.AbstractC10638b
        /* renamed from: a */
        public boolean mo4283a(C10635b c10635b) {
            return C10423d.m5213d(this.f33080a);
        }
    }

    /* renamed from: com.xiaomi.push.service.av$b */
    /* loaded from: classes2.dex */
    public static class C10635b {

        /* renamed from: a */
        public String f33081a;

        /* renamed from: b */
        public int f33082b;

        /* renamed from: c */
        public C10804d f33083c = new C10804d();

        public String toString() {
            return "TinyDataRequest:{id:" + this.f33081a + ", uploadHint:" + this.f33082b + ", channel:" + this.f33083c.f34189a + ", category:" + this.f33083c.f34195g + ", name:" + this.f33083c.f34191c + ", counter: " + this.f33083c.f34192d + ", data: " + this.f33083c.f34190b + ", fromSDK:" + this.f33083c.f34194f + ",  }";
        }
    }

    /* renamed from: a */
    public static String m4322a() {
        return f33078a + f33079b.incrementAndGet();
    }

    /* renamed from: a */
    public static ArrayList<C10775ae> m4320a(ArrayList<C10635b> arrayList, String str, String str2) {
        if (arrayList == null) {
            AbstractC10404b.m5264d("requests can not be null in TinyDataHelper.transToThriftObj().");
            return null;
        } else if (arrayList.size() == 0) {
            AbstractC10404b.m5264d("requests.length is 0 in TinyDataHelper.transToThriftObj().");
            return null;
        } else {
            ArrayList<C10775ae> arrayList2 = new ArrayList<>();
            int i = 0;
            C10802c c10802c = new C10802c();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C10635b c10635b = arrayList.get(i2);
                if (c10635b != null && c10635b.f33083c != null) {
                    int length = C10799aq.m3471a(c10635b.f33083c).length;
                    if (length > 30720) {
                        AbstractC10404b.m5264d("TinyData is too big, ignore upload request." + c10635b.toString());
                    } else {
                        if (i + length > 30720) {
                            C10775ae c10775ae = new C10775ae(m4322a(), false);
                            c10775ae.m3693d(str);
                            c10775ae.m3698b(str2);
                            c10775ae.m3695c(EnumC10821o.UploadTinyData.f34418N);
                            c10775ae.m3701a(C10400a.m5282a(C10799aq.m3471a(c10802c)));
                            arrayList2.add(c10775ae);
                            c10802c = new C10802c();
                            i = 0;
                        }
                        c10802c.m3456a(c10635b.f33083c);
                        i += length;
                    }
                }
            }
            if (c10802c.m3458a() != 0) {
                C10775ae c10775ae2 = new C10775ae(m4322a(), false);
                c10775ae2.m3693d(str);
                c10775ae2.m3698b(str2);
                c10775ae2.m3695c(EnumC10821o.UploadTinyData.f34418N);
                c10775ae2.m3701a(C10400a.m5282a(C10799aq.m3471a(c10802c)));
                arrayList2.add(c10775ae2);
            }
            return arrayList2;
        }
    }

    /* renamed from: a */
    public static boolean m4321a(String str, String str2, long j, String str3) {
        if (str == null) {
            AbstractC10404b.m5269a("Value of parameter category can not be null.");
            return true;
        } else if (str2 == null) {
            AbstractC10404b.m5269a("Value of parameter Name can not be null");
            return true;
        } else if (!C10433d.m5170d(str)) {
            AbstractC10404b.m5269a("Value of parameter catetory invalid, can only contain ascii char.");
            return true;
        } else if (!C10433d.m5170d(str2)) {
            AbstractC10404b.m5269a("Value of parameter name invalid, can only contain ascii char.");
            return true;
        } else if (str3 == null || str3.length() <= 10240) {
            return false;
        } else {
            AbstractC10404b.m5269a("Parameter data is too large(" + str3.length() + "), max size for data is 10240");
            return true;
        }
    }
}
