package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.C10633av;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.xiaomi.push.service.aw */
/* loaded from: classes.dex */
public class C10636aw {

    /* renamed from: a */
    private static C10636aw f33084a = new C10636aw();

    /* renamed from: b */
    private static ExecutorService f33085b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    private Context f33086c;

    /* renamed from: e */
    private String f33088e;

    /* renamed from: d */
    private Map<String, AbstractC10638b> f33087d = new HashMap();

    /* renamed from: f */
    private final ArrayList<C10633av.C10635b> f33089f = new ArrayList<>();

    /* renamed from: com.xiaomi.push.service.aw$a */
    /* loaded from: classes2.dex */
    public class RunnableC10637a implements Runnable {

        /* renamed from: a */
        AbstractC10638b f33090a;

        /* renamed from: b */
        String f33091b;

        public RunnableC10637a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C10636aw.this.f33087d.put(this.f33091b, this.f33090a);
            C10636aw.this.m4302c("Add uploader, provider is " + this.f33091b);
        }
    }

    /* renamed from: com.xiaomi.push.service.aw$b */
    /* loaded from: classes.dex */
    public interface AbstractC10638b {
        /* renamed from: a */
        void mo4280a(ArrayList<C10633av.C10635b> arrayList);

        /* renamed from: a */
        boolean mo4283a(C10633av.C10635b c10635b);
    }

    /* renamed from: com.xiaomi.push.service.aw$c */
    /* loaded from: classes2.dex */
    public class RunnableC10639c implements Runnable {

        /* renamed from: b */
        private Context f33094b;

        public RunnableC10639c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C10636aw.this.f33086c != null) {
                AbstractC10404b.m5264d("[TinyDataManager]: please do not init TinyDataManager repeatly.");
                return;
            }
            C10636aw.this.f33086c = this.f33094b;
            C10636aw.this.m4314a(new C10633av.C10634a(this.f33094b), "SHORT_UPLOADER_FROM_SELF");
            C10636aw.this.m4302c("Init");
        }
    }

    /* renamed from: com.xiaomi.push.service.aw$d */
    /* loaded from: classes2.dex */
    private class RunnableC10640d implements Runnable {

        /* renamed from: a */
        String f33095a;

        public RunnableC10640d(String str) {
            this.f33095a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10636aw.this.m4302c(this.f33095a);
        }
    }

    /* renamed from: com.xiaomi.push.service.aw$e */
    /* loaded from: classes2.dex */
    private class RunnableC10641e implements Runnable {

        /* renamed from: a */
        String f33097a;

        private RunnableC10641e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(C10636aw.this.f33088e)) {
                AbstractC10404b.m5264d("[TinyDataManager]:channel is not null, please do not set repeatly.");
                return;
            }
            C10636aw.this.f33088e = this.f33097a;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= C10636aw.this.f33089f.size()) {
                    C10636aw.this.m4302c("Set channel to " + this.f33097a);
                    return;
                }
                C10633av.C10635b c10635b = (C10633av.C10635b) C10636aw.this.f33089f.get(i2);
                if (!c10635b.f33083c.f34194f && c10635b.f33083c.f34189a == null) {
                    c10635b.f33083c.f34189a = this.f33097a;
                }
                i = i2 + 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.xiaomi.push.service.aw$f */
    /* loaded from: classes2.dex */
    public class RunnableC10642f implements Runnable {

        /* renamed from: a */
        C10633av.C10635b f33099a;

        private RunnableC10642f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            boolean z = true;
            if (this.f33099a.f33083c.f34194f) {
                this.f33099a.f33083c.f34189a = "push_sdk_channel";
            } else {
                this.f33099a.f33083c.f34189a = C10636aw.this.f33088e;
            }
            this.f33099a.f33081a = C10633av.m4322a();
            AbstractC10638b m4304c = C10636aw.this.m4304c();
            String str2 = null;
            boolean z2 = false;
            if (m4304c == null) {
                str2 = "uploader is null";
                z2 = true;
            }
            if (!z2 && C10636aw.this.m4308b()) {
                str2 = "TinyDataManager need init";
                z2 = true;
            }
            if (!z2 && this.f33099a.f33083c.f34189a == null) {
                str2 = "request channel is null";
                z2 = true;
            }
            if (z2 || m4304c.mo4283a(this.f33099a)) {
                z = z2;
                str = str2;
            } else {
                str = "uploader refuse upload";
            }
            if (z) {
                AbstractC10404b.m5265c(this.f33099a.toString() + " is added to pending list. Pending Reason is " + str);
                C10636aw.this.f33089f.add(this.f33099a);
                return;
            }
            AbstractC10404b.m5265c(this.f33099a.toString() + " is uploaded immediately.");
            ArrayList<C10633av.C10635b> arrayList = new ArrayList<>();
            arrayList.add(this.f33099a);
            m4304c.mo4280a(arrayList);
        }
    }

    private C10636aw() {
    }

    /* renamed from: a */
    public static C10636aw m4319a() {
        return f33084a;
    }

    /* renamed from: a */
    private void m4315a(C10633av.C10635b c10635b) {
        RunnableC10642f runnableC10642f = new RunnableC10642f();
        runnableC10642f.f33099a = c10635b;
        f33085b.execute(runnableC10642f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public AbstractC10638b m4304c() {
        AbstractC10638b abstractC10638b = this.f33087d.get("UPLOADER_FROM_MIPUSHCLIENT");
        if (abstractC10638b != null) {
            return abstractC10638b;
        }
        AbstractC10638b abstractC10638b2 = this.f33087d.get("UPLOADER_FROM_XMPUSHSERVICE");
        if (abstractC10638b2 != null) {
            return abstractC10638b2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m4302c(String str) {
        AbstractC10638b m4304c;
        AbstractC10404b.m5265c("TinyDataManager is checking and uploading tiny data, reason is " + str + ", the size of pending list is " + this.f33089f.size());
        if (!m4308b() && (m4304c = m4304c()) != null) {
            ArrayList<C10633av.C10635b> arrayList = new ArrayList<>();
            Iterator<C10633av.C10635b> it2 = this.f33089f.iterator();
            while (it2.hasNext()) {
                C10633av.C10635b next = it2.next();
                if (next.f33083c.f34189a != null && m4304c.mo4283a(next)) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() != 0) {
                m4304c.mo4280a(arrayList);
                Iterator<C10633av.C10635b> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C10633av.C10635b next2 = it3.next();
                    AbstractC10404b.m5265c("Pending Data " + next2.toString() + " uploaded by TinyDataManager, reason is " + str);
                    this.f33089f.remove(next2);
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m4316a(Context context) {
        if (context == null) {
            AbstractC10404b.m5264d("[TinyDataManager]:context is null, TinyDataManager.init(Context, TinyDataUploader) failed.");
            return;
        }
        RunnableC10639c runnableC10639c = new RunnableC10639c();
        runnableC10639c.f33094b = context;
        f33085b.execute(runnableC10639c);
    }

    /* renamed from: a */
    public void m4314a(AbstractC10638b abstractC10638b, String str) {
        if (abstractC10638b == null) {
            AbstractC10404b.m5264d("[TinyDataManager]: please do not add null uploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            AbstractC10404b.m5264d("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            RunnableC10637a runnableC10637a = new RunnableC10637a();
            runnableC10637a.f33091b = str;
            runnableC10637a.f33090a = abstractC10638b;
            f33085b.execute(runnableC10637a);
        }
    }

    /* renamed from: a */
    public void m4310a(String str) {
        if (!TextUtils.isEmpty(this.f33088e)) {
            AbstractC10404b.m5264d("[TinyDataManager]:channel is not null, please do not set repeatly.");
            return;
        }
        RunnableC10641e runnableC10641e = new RunnableC10641e();
        runnableC10641e.f33097a = str;
        f33085b.execute(runnableC10641e);
    }

    /* renamed from: a */
    public boolean m4318a(int i, String str, String str2, long j, String str3) {
        return m4317a(i, str, str2, j, str3, true);
    }

    /* renamed from: a */
    public boolean m4317a(int i, String str, String str2, long j, String str3, boolean z) {
        if (C10633av.m4321a(str, str2, j, str3)) {
            return false;
        }
        C10633av.C10635b c10635b = new C10633av.C10635b();
        c10635b.f33082b = i;
        c10635b.f33083c.f34195g = str;
        c10635b.f33083c.f34191c = str2;
        c10635b.f33083c.f34192d = j;
        c10635b.f33083c.f34190b = str3;
        c10635b.f33083c.f34194f = z;
        c10635b.f33083c.f34193e = System.currentTimeMillis();
        m4315a(c10635b);
        return true;
    }

    /* renamed from: a */
    public boolean m4309a(String str, String str2, long j, String str3) {
        return m4318a(0, str, str2, j, str3);
    }

    /* renamed from: b */
    public void m4305b(String str) {
        f33085b.execute(new RunnableC10640d(str));
    }

    /* renamed from: b */
    public boolean m4308b() {
        return this.f33086c == null;
    }
}
