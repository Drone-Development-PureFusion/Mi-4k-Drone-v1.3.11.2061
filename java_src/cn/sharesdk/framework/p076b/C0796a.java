package cn.sharesdk.framework.p076b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.p076b.p077a.C0799c;
import cn.sharesdk.framework.p076b.p077a.C0801e;
import cn.sharesdk.framework.p076b.p078b.AbstractC0805c;
import cn.sharesdk.framework.p076b.p078b.C0804b;
import cn.sharesdk.framework.p076b.p078b.C0808f;
import cn.sharesdk.framework.utils.C0831d;
import com.facebook.common.util.UriUtil;
import com.google.firebase.p251a.C9654a;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ResHelper;
import com.xiaomi.market.sdk.C10445j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
/* renamed from: cn.sharesdk.framework.b.a */
/* loaded from: classes.dex */
public class C0796a {

    /* renamed from: a */
    private static C0796a f1530a;

    /* renamed from: b */
    private C0811c f1531b;

    /* renamed from: c */
    private DeviceHelper f1532c;

    /* renamed from: d */
    private C0801e f1533d;

    /* renamed from: e */
    private boolean f1534e;

    private C0796a(Context context, String str) {
        this.f1531b = new C0811c(context, str);
        this.f1533d = C0801e.m37936a(context);
        this.f1532c = DeviceHelper.getInstance(context);
    }

    /* renamed from: a */
    public static C0796a m37967a(Context context, String str) {
        if (f1530a == null) {
            f1530a = new C0796a(context, str);
        }
        return f1530a;
    }

    /* renamed from: a */
    private String m37965a(Bitmap bitmap, EnumC0802b enumC0802b) {
        File createTempFile = File.createTempFile("bm_tmp", ".png");
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return m37959a(createTempFile.getAbsolutePath(), enumC0802b);
    }

    /* renamed from: a */
    private String m37959a(String str, EnumC0802b enumC0802b) {
        int ceil;
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return null;
        }
        String networkType = this.f1532c.getNetworkType();
        if ("none".equals(networkType) || TextUtils.isEmpty(networkType)) {
            return null;
        }
        Bitmap.CompressFormat bmpFormat = BitmapHelper.getBmpFormat(str);
        float f = 200.0f;
        if (enumC0802b == EnumC0802b.BEFORE_SHARE) {
            f = 600.0f;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i >= i2 && i2 > f) {
            ceil = (int) Math.ceil(options.outHeight / f);
        } else if (i >= i2 || i <= f) {
            return m37951c(str);
        } else {
            ceil = (int) Math.ceil(options.outWidth / f);
        }
        if (ceil <= 0) {
            ceil = 1;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = ceil;
        options2.inPurgeable = true;
        options2.inInputShareable = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options2);
        decodeFile.getHeight();
        decodeFile.getWidth();
        File createTempFile = File.createTempFile("bm_tmp2", "." + bmpFormat.name().toLowerCase());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        decodeFile.compress(bmpFormat, 80, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return m37951c(createTempFile.getAbsolutePath());
    }

    /* renamed from: a */
    private String m37958a(String str, String str2, int i, String str3) {
        HashMap<String, Object> m37900a;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Pattern compile = Pattern.compile(str2);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (group != null && group.length() > 0) {
                arrayList.add(group);
            }
        }
        if (arrayList.size() == 0 || (m37900a = this.f1531b.m37900a(str, arrayList, i, str3)) == null || m37900a.size() <= 0 || !m37900a.containsKey(UriUtil.DATA_SCHEME)) {
            return str;
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = ((ArrayList) m37900a.get(UriUtil.DATA_SCHEME)).iterator();
        while (it2.hasNext()) {
            HashMap hashMap2 = (HashMap) it2.next();
            hashMap.put(String.valueOf(hashMap2.get("source")), String.valueOf(hashMap2.get("surl")));
        }
        Matcher matcher2 = compile.matcher(str);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (matcher2.find()) {
            sb.append(str.substring(i2, matcher2.start()));
            sb.append((String) hashMap.get(matcher2.group()));
            i2 = matcher2.end();
        }
        sb.append(str.substring(i2, str.length()));
        String sb2 = sb.toString();
        C0831d.m37772a().m6194i("> SERVER_SHORT_LINK_URL content after replace link ===  %s", sb2);
        return sb2;
    }

    /* renamed from: a */
    private void m37964a(C0804b c0804b) {
        boolean m37925c = this.f1533d.m37925c();
        String str = c0804b.f1554c;
        if (m37925c && !TextUtils.isEmpty(str)) {
            c0804b.f1554c = Data.Base64AES(str, c0804b.f1557f.substring(0, 16));
            return;
        }
        c0804b.f1555d = null;
        c0804b.f1554c = null;
    }

    /* renamed from: a */
    private void m37962a(C0808f c0808f) {
        int m37921e = this.f1533d.m37921e();
        boolean m37925c = this.f1533d.m37925c();
        C0808f.C0809a c0809a = c0808f.f1578d;
        if (m37921e == 1 || (m37921e == 0 && this.f1534e)) {
            int size = (c0809a == null || c0809a.f1585e == null) ? 0 : c0809a.f1585e.size();
            for (int i = 0; i < size; i++) {
                String m37959a = m37959a(c0809a.f1585e.get(i), EnumC0802b.FINISH_SHARE);
                if (!TextUtils.isEmpty(m37959a)) {
                    c0809a.f1584d.add(m37959a);
                }
            }
            int size2 = (c0809a == null || c0809a.f1586f == null) ? 0 : c0809a.f1586f.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String m37965a = m37965a(c0809a.f1586f.get(i2), EnumC0802b.FINISH_SHARE);
                if (!TextUtils.isEmpty(m37965a)) {
                    c0809a.f1584d.add(m37965a);
                }
            }
        } else {
            c0808f.f1578d = null;
        }
        if (!m37925c) {
            c0808f.f1579n = null;
        }
    }

    /* renamed from: a */
    private boolean m37957a(String str, boolean z) {
        return this.f1531b.m37899a(str, z);
    }

    /* renamed from: c */
    private String m37951c(String str) {
        HashMap<String, Object> m37895b = this.f1531b.m37895b(str);
        if (m37895b == null || m37895b.size() <= 0 || !m37895b.containsKey("status") || ResHelper.parseInt(String.valueOf(m37895b.get("status"))) != 200 || !m37895b.containsKey("url")) {
            return null;
        }
        return (String) m37895b.get("url");
    }

    /* renamed from: d */
    private String m37949d(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = byteArrayInputStream.read(bArr, 0, 1024);
            if (read == -1) {
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byteArrayInputStream.close();
                return Base64.encodeToString(byteArray, 2);
            }
            gZIPOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    public String m37966a(Bitmap bitmap) {
        if (!this.f1533d.m37917g()) {
            return null;
        }
        try {
            return m37965a(bitmap, EnumC0802b.BEFORE_SHARE);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return null;
        }
    }

    /* renamed from: a */
    public String m37961a(String str) {
        if (!this.f1533d.m37917g()) {
            return null;
        }
        try {
            return m37959a(str, EnumC0802b.BEFORE_SHARE);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return null;
        }
    }

    /* renamed from: a */
    public String m37960a(String str, int i, boolean z, String str2) {
        String m37958a;
        try {
            if (!this.f1533d.m37917g() || !this.f1533d.m37923d()) {
                return str;
            }
            String networkType = this.f1532c.getNetworkType();
            if ("none".equals(networkType) || TextUtils.isEmpty(networkType)) {
                return str;
            }
            if (z && (m37958a = m37958a(str, "<a[^>]*?href[\\s]*=[\\s]*[\"']?([^'\">]+?)['\"]?>", i, str2)) != null && !m37958a.equals(str)) {
                return m37958a;
            }
            String m37958a2 = m37958a(str, "(http://|https://){1}[\\w\\.\\-/:\\?&%=,;\\[\\]\\{\\}`~!@#\\$\\^\\*\\(\\)_\\+\\\\\\|]+", i, str2);
            return m37958a2 != null ? !m37958a2.equals(str) ? m37958a2 : str : str;
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return str;
        }
    }

    /* renamed from: a */
    public void m37968a() {
        try {
            String networkType = this.f1532c.getNetworkType();
            if ("none".equals(networkType) || TextUtils.isEmpty(networkType)) {
                return;
            }
            long longValue = this.f1533d.m37915h().longValue();
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(longValue);
            int i = calendar.get(5);
            calendar.setTimeInMillis(currentTimeMillis);
            int i2 = calendar.get(5);
            if (currentTimeMillis - longValue < 86400000 && i == i2) {
                return;
            }
            HashMap<String, Object> m37903a = this.f1531b.m37903a();
            this.f1533d.m37930a(m37903a.containsKey(UriUtil.LOCAL_RESOURCE_SCHEME) ? "true".equals(String.valueOf(m37903a.get(UriUtil.LOCAL_RESOURCE_SCHEME))) : true);
            if (m37903a == null || m37903a.size() <= 0) {
                return;
            }
            this.f1533d.m37928b(System.currentTimeMillis());
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
    }

    /* renamed from: a */
    public void m37963a(AbstractC0805c abstractC0805c) {
        try {
            if (!this.f1533d.m37917g()) {
                return;
            }
            if (abstractC0805c instanceof C0804b) {
                m37964a((C0804b) abstractC0805c);
            } else if (abstractC0805c instanceof C0808f) {
                m37962a((C0808f) abstractC0805c);
            }
            if (!this.f1533d.m37929b()) {
                abstractC0805c.f1564m = null;
            }
            long m37938a = this.f1533d.m37938a();
            if (m37938a == 0) {
                m37938a = this.f1531b.m37896b();
            }
            abstractC0805c.f1556e = System.currentTimeMillis() - m37938a;
            this.f1531b.m37902a(abstractC0805c);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
    }

    /* renamed from: a */
    public void m37956a(HashMap<String, Object> hashMap) {
        try {
            this.f1531b.m37894b(hashMap);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
    }

    /* renamed from: a */
    public void m37955a(boolean z) {
        this.f1534e = z;
    }

    /* renamed from: b */
    public HashMap<String, Object> m37953b(String str) {
        try {
            return this.f1531b.m37892c(str);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return new HashMap<>();
        }
    }

    /* renamed from: b */
    public void m37954b() {
        HashMap hashMap;
        HashMap hashMap2;
        try {
            String networkType = this.f1532c.getNetworkType();
            if ("none".equals(networkType) || TextUtils.isEmpty(networkType) || !this.f1533d.m37917g()) {
                return;
            }
            this.f1533d.m37937a(System.currentTimeMillis());
            HashMap<String, Object> m37893c = this.f1531b.m37893c();
            if (m37893c.containsKey("status") && ResHelper.parseInt(String.valueOf(m37893c.get("status"))) == -200) {
                C0831d.m37772a().m6200d((String) m37893c.get("error"), new Object[0]);
                return;
            }
            if (m37893c.containsKey("timestamp")) {
                this.f1533d.m37933a("service_time", Long.valueOf(System.currentTimeMillis() - ResHelper.parseLong(String.valueOf(m37893c.get("timestamp")))));
            }
            if (m37893c.containsKey("switchs") && (hashMap2 = (HashMap) m37893c.get("switchs")) != null) {
                String valueOf = String.valueOf(hashMap2.get("device"));
                String valueOf2 = String.valueOf(hashMap2.get(C9654a.C9655a.f30201q));
                String valueOf3 = String.valueOf(hashMap2.get("auth"));
                String valueOf4 = String.valueOf(hashMap2.get("backflow"));
                this.f1533d.m37927b(valueOf);
                this.f1533d.m37922d(valueOf2);
                this.f1533d.m37924c(valueOf3);
                this.f1533d.m37935a(valueOf4);
            }
            if (!m37893c.containsKey("serpaths") || (hashMap = (HashMap) m37893c.get("serpaths")) == null) {
                return;
            }
            String valueOf5 = String.valueOf(hashMap.get("defhost"));
            String valueOf6 = String.valueOf(hashMap.get("defport"));
            if (!TextUtils.isEmpty(valueOf5) && !TextUtils.isEmpty(valueOf6)) {
                this.f1531b.m37901a("http://" + valueOf5 + ":" + valueOf6);
            }
            HashMap<String, String> hashMap3 = new HashMap<>();
            if (!hashMap.containsKey("assigns")) {
                return;
            }
            HashMap hashMap4 = (HashMap) hashMap.get("assigns");
            if (hashMap4 == null || hashMap4.size() == 0) {
                this.f1531b.m37897a((HashMap<String, String>) null);
                return;
            }
            for (String str : hashMap4.keySet()) {
                HashMap hashMap5 = (HashMap) hashMap4.get(str);
                String valueOf7 = String.valueOf(hashMap5.get(C10445j.HOST));
                String valueOf8 = String.valueOf(hashMap5.get("port"));
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(valueOf7) && !TextUtils.isEmpty(valueOf8)) {
                    hashMap3.put(str, "http://" + valueOf7 + ":" + valueOf8);
                }
            }
            this.f1531b.m37897a(hashMap3);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
    }

    /* renamed from: c */
    public void m37952c() {
        try {
            String networkType = this.f1532c.getNetworkType();
            if ("none".equals(networkType) || TextUtils.isEmpty(networkType) || !this.f1533d.m37917g()) {
                return;
            }
            ArrayList<C0799c> m37889e = this.f1531b.m37889e();
            for (int i = 0; i < m37889e.size(); i++) {
                C0799c c0799c = m37889e.get(i);
                if (c0799c.f1539b.size() == 1 ? m37957a(c0799c.f1538a, false) : m37957a(m37949d(c0799c.f1538a), true)) {
                    this.f1531b.m37898a(c0799c.f1539b);
                }
            }
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
    }

    /* renamed from: d */
    public HashMap<String, Object> m37950d() {
        try {
            return this.f1531b.m37888f();
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return new HashMap<>();
        }
    }

    /* renamed from: e */
    public HashMap<String, Object> m37948e() {
        if (this.f1533d.m37917g() || !this.f1533d.m37913i()) {
            try {
                HashMap<String, Object> m37891d = this.f1531b.m37891d();
                this.f1533d.m37926b(true);
                return m37891d;
            } catch (Throwable th) {
                this.f1533d.m37926b(false);
                C0831d.m37772a().m6199d(th);
                return new HashMap<>();
            }
        }
        return new HashMap<>();
    }
}
