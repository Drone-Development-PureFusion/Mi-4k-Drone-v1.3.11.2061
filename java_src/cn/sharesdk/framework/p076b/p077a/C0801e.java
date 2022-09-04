package cn.sharesdk.framework.p076b.p077a;

import android.content.Context;
import android.text.TextUtils;
import com.mob.tools.utils.SharePrefrenceHelper;
/* renamed from: cn.sharesdk.framework.b.a.e */
/* loaded from: classes.dex */
public class C0801e {

    /* renamed from: c */
    private static C0801e f1540c;

    /* renamed from: a */
    private Context f1541a;

    /* renamed from: b */
    private SharePrefrenceHelper f1542b;

    private C0801e(Context context) {
        this.f1541a = context.getApplicationContext();
        this.f1542b = new SharePrefrenceHelper(this.f1541a);
        this.f1542b.open("share_sdk", 1);
    }

    /* renamed from: a */
    public static C0801e m37936a(Context context) {
        if (f1540c == null) {
            f1540c = new C0801e(context.getApplicationContext());
        }
        return f1540c;
    }

    /* renamed from: a */
    public long m37938a() {
        return this.f1542b.getLong("service_time");
    }

    /* renamed from: a */
    public void m37937a(long j) {
        this.f1542b.putLong("device_time", Long.valueOf(j));
    }

    /* renamed from: a */
    public void m37935a(String str) {
        this.f1542b.putString("trans_short_link", str);
    }

    /* renamed from: a */
    public void m37934a(String str, int i) {
        this.f1542b.putInt(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m37933a(String str, Long l) {
        this.f1542b.putLong(str, l);
    }

    /* renamed from: a */
    public void m37932a(String str, Object obj) {
        this.f1542b.put(str, obj);
    }

    /* renamed from: a */
    public void m37931a(String str, String str2) {
        this.f1542b.putString("buffered_snsconf_" + str, str2);
    }

    /* renamed from: a */
    public void m37930a(boolean z) {
        this.f1542b.putBoolean("connect_server", Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void m37928b(long j) {
        this.f1542b.putLong("connect_server_time", Long.valueOf(j));
    }

    /* renamed from: b */
    public void m37927b(String str) {
        this.f1542b.putString("upload_device_info", str);
    }

    /* renamed from: b */
    public void m37926b(boolean z) {
        this.f1542b.putBoolean("sns_info_buffered", Boolean.valueOf(z));
    }

    /* renamed from: b */
    public boolean m37929b() {
        String string = this.f1542b.getString("upload_device_info");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }

    /* renamed from: c */
    public void m37924c(String str) {
        this.f1542b.putString("upload_user_info", str);
    }

    /* renamed from: c */
    public boolean m37925c() {
        String string = this.f1542b.getString("upload_user_info");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }

    /* renamed from: d */
    public void m37922d(String str) {
        this.f1542b.putString("upload_share_content", str);
    }

    /* renamed from: d */
    public boolean m37923d() {
        String string = this.f1542b.getString("trans_short_link");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    /* renamed from: e */
    public int m37921e() {
        String string = this.f1542b.getString("upload_share_content");
        if ("true".equals(string)) {
            return 1;
        }
        return "false".equals(string) ? -1 : 0;
    }

    /* renamed from: e */
    public String m37920e(String str) {
        return this.f1542b.getString("buffered_snsconf_" + str);
    }

    /* renamed from: f */
    public long m37918f(String str) {
        return this.f1542b.getLong(str);
    }

    /* renamed from: f */
    public Long m37919f() {
        return Long.valueOf(this.f1542b.getLong("device_time"));
    }

    /* renamed from: g */
    public int m37916g(String str) {
        return this.f1542b.getInt(str);
    }

    /* renamed from: g */
    public boolean m37917g() {
        return this.f1542b.getBoolean("connect_server");
    }

    /* renamed from: h */
    public Long m37915h() {
        return Long.valueOf(this.f1542b.getLong("connect_server_time"));
    }

    /* renamed from: h */
    public Object m37914h(String str) {
        return this.f1542b.get(str);
    }

    /* renamed from: i */
    public boolean m37913i() {
        return this.f1542b.getBoolean("sns_info_buffered");
    }
}
