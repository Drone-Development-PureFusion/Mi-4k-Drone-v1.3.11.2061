package com.xiaomi.push.log;

import android.content.Context;
import android.content.SharedPreferences;
import com.fimi.soul.utils.p219a.C3070c;
import com.xiaomi.channel.commonutils.file.C10402c;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10414h;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C10630at;
import com.xiaomi.smack.util.C10750e;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.xiaomi.push.log.b */
/* loaded from: classes.dex */
public class C10559b {

    /* renamed from: c */
    private static volatile C10559b f32763c = null;

    /* renamed from: a */
    private final ConcurrentLinkedQueue<C10561b> f32764a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private Context f32765b;

    /* renamed from: com.xiaomi.push.log.b$a */
    /* loaded from: classes2.dex */
    class C10560a extends C10561b {
        C10560a() {
            super();
        }

        @Override // com.xiaomi.push.log.C10559b.C10561b, com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
        /* renamed from: b */
        public void mo3817b() {
            C10559b.this.m4719b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.log.b$b */
    /* loaded from: classes2.dex */
    public class C10561b extends C10414h.AbstractC10416b {

        /* renamed from: i */
        long f32767i = System.currentTimeMillis();

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10561b() {
        }

        @Override // com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
        /* renamed from: b */
        public void mo3817b() {
        }

        /* renamed from: d */
        public boolean mo4713d() {
            return true;
        }

        /* renamed from: e */
        final boolean m4714e() {
            return System.currentTimeMillis() - this.f32767i > 172800000;
        }
    }

    /* renamed from: com.xiaomi.push.log.b$c */
    /* loaded from: classes2.dex */
    class C10562c extends C10561b {

        /* renamed from: a */
        String f32769a;

        /* renamed from: b */
        String f32770b;

        /* renamed from: c */
        File f32771c;

        /* renamed from: d */
        int f32772d;

        /* renamed from: e */
        boolean f32773e;

        /* renamed from: f */
        boolean f32774f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10562c(String str, String str2, File file, boolean z) {
            super();
            this.f32769a = str;
            this.f32770b = str2;
            this.f32771c = file;
            this.f32774f = z;
        }

        /* renamed from: f */
        private boolean m4712f() {
            int i;
            SharedPreferences sharedPreferences = C10559b.this.f32765b.getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                currentTimeMillis = jSONObject.getLong(C3070c.C3071a.f11505i);
                i = jSONObject.getInt("times");
            } catch (JSONException e) {
                i = 0;
            }
            if (System.currentTimeMillis() - currentTimeMillis >= 86400000) {
                currentTimeMillis = System.currentTimeMillis();
                i = 0;
            } else if (i > 10) {
                return false;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C3070c.C3071a.f11505i, currentTimeMillis);
                jSONObject2.put("times", i + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e2) {
                AbstractC10404b.m5265c("JSONException on put " + e2.getMessage());
            }
            return true;
        }

        @Override // com.xiaomi.push.log.C10559b.C10561b, com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
        /* renamed from: b */
        public void mo3817b() {
            try {
                if (m4712f()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", C10630at.m4329e());
                    hashMap.put(Constants.EXTRA_KEY_TOKEN, this.f32770b);
                    hashMap.put("net", C10423d.m5206k(C10559b.this.f32765b));
                    C10423d.m5220a(this.f32769a, hashMap, this.f32771c, "file");
                }
                this.f32773e = true;
            } catch (IOException e) {
            }
        }

        @Override // com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
        /* renamed from: c */
        public void mo4323c() {
            if (!this.f32773e) {
                this.f32772d++;
                if (this.f32772d < 3) {
                    C10559b.this.f32764a.add(this);
                }
            }
            if (this.f32773e || this.f32772d >= 3) {
                this.f32771c.delete();
            }
            C10559b.this.m4724a((1 << this.f32772d) * 1000);
        }

        @Override // com.xiaomi.push.log.C10559b.C10561b
        /* renamed from: d */
        public boolean mo4713d() {
            return C10423d.m5211f(C10559b.this.f32765b) || (this.f32774f && C10423d.m5213d(C10559b.this.f32765b));
        }
    }

    private C10559b(Context context) {
        this.f32765b = context;
        this.f32764a.add(new C10560a());
        m4718b(0L);
    }

    /* renamed from: a */
    public static C10559b m4723a(Context context) {
        if (f32763c == null) {
            synchronized (C10559b.class) {
                if (f32763c == null) {
                    f32763c = new C10559b(context);
                }
            }
        }
        f32763c.f32765b = context;
        return f32763c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4724a(long j) {
        C10561b peek = this.f32764a.peek();
        if (peek == null || !peek.mo4713d()) {
            return;
        }
        m4718b(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4719b() {
        if (C10402c.m5279b() || C10402c.m5280a()) {
            return;
        }
        try {
            File file = new File(this.f32765b.getExternalFilesDir(null) + "/.logcache");
            if (!file.exists() || !file.isDirectory()) {
                return;
            }
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                file2.delete();
            }
        } catch (NullPointerException e) {
        }
    }

    /* renamed from: b */
    private void m4718b(long j) {
        if (!this.f32764a.isEmpty()) {
            C10750e.m3832a(new C10564d(this), j);
        }
    }

    /* renamed from: c */
    private void m4716c() {
        while (!this.f32764a.isEmpty()) {
            if (!this.f32764a.peek().m4714e() && this.f32764a.size() <= 6) {
                return;
            }
            AbstractC10404b.m5265c("remove Expired task");
            this.f32764a.remove();
        }
    }

    /* renamed from: a */
    public void m4725a() {
        m4716c();
        m4724a(0L);
    }

    /* renamed from: a */
    public void m4720a(String str, String str2, Date date, Date date2, int i, boolean z) {
        this.f32764a.add(new C10563c(this, i, date, date2, str, str2, z));
        m4718b(0L);
    }
}
