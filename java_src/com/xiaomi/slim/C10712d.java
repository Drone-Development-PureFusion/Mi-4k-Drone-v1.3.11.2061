package com.xiaomi.slim;

import android.os.Build;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.protobuf.C10570b;
import com.xiaomi.push.service.C10630at;
import com.xiaomi.smack.AbstractC10716a;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.xiaomi.slim.d */
/* loaded from: classes2.dex */
public class C10712d {

    /* renamed from: a */
    ByteBuffer f33386a = ByteBuffer.allocate(2048);

    /* renamed from: b */
    private ByteBuffer f33387b = ByteBuffer.allocate(4);

    /* renamed from: c */
    private Adler32 f33388c = new Adler32();

    /* renamed from: d */
    private AbstractC10716a f33389d;

    /* renamed from: e */
    private OutputStream f33390e;

    /* renamed from: f */
    private int f33391f;

    /* renamed from: g */
    private int f33392g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10712d(OutputStream outputStream, AbstractC10716a abstractC10716a) {
        this.f33390e = new BufferedOutputStream(outputStream);
        this.f33389d = abstractC10716a;
        TimeZone timeZone = TimeZone.getDefault();
        this.f33391f = timeZone.getRawOffset() / C0494h.f704Y;
        this.f33392g = timeZone.useDaylightTime() ? 1 : 0;
    }

    /* renamed from: a */
    public int m4001a(C10710b c10710b) {
        int m4011l = c10710b.m4011l();
        if (m4011l > 32768) {
            AbstractC10404b.m5269a("Blob size=" + m4011l + " should be less than 32768 Drop blob chid=" + c10710b.m4023c() + " id=" + c10710b.m4015h());
            return 0;
        }
        if (this.f33386a.capacity() > 4096) {
            this.f33386a = ByteBuffer.allocate(2048);
        }
        this.f33386a.clear();
        this.f33386a = c10710b.m4029a(this.f33386a);
        this.f33388c.reset();
        this.f33388c.update(this.f33386a.array(), 0, this.f33386a.position());
        this.f33387b.putInt(0, (int) this.f33388c.getValue());
        this.f33390e.write(this.f33386a.array(), 0, this.f33386a.position());
        this.f33390e.write(this.f33387b.array(), 0, 4);
        this.f33390e.flush();
        int position = this.f33386a.position() + 4;
        AbstractC10404b.m5265c("[Slim] Wrote {cmd=" + c10710b.m4035a() + ";chid=" + c10710b.m4023c() + ";len=" + position + "}");
        return position;
    }

    /* renamed from: a */
    public void m4002a() {
        C10570b.C10575e c10575e = new C10570b.C10575e();
        c10575e.m4607a(106);
        c10575e.m4605a(Build.MODEL);
        c10575e.m4602b(Build.VERSION.INCREMENTAL);
        c10575e.m4600c(C10630at.m4329e());
        c10575e.m4604b(26);
        c10575e.m4598d(this.f33389d.m3978e());
        c10575e.m4596e(this.f33389d.mo3931d());
        c10575e.m4594f(Locale.getDefault().toString());
        c10575e.m4601c(Build.VERSION.SDK_INT);
        byte[] mo3964a = this.f33389d.m3979c().mo3964a();
        if (mo3964a != null) {
            c10575e.m4606a(C10570b.C10572b.m4650b(mo3964a));
        }
        C10710b c10710b = new C10710b();
        c10710b.m4034a(0);
        c10710b.m4030a("CONN", (String) null);
        c10710b.m4033a(0L, "xiaomi.com", null);
        c10710b.m4027a(c10575e.c(), (String) null);
        m4001a(c10710b);
        AbstractC10404b.m5269a("[slim] open conn: andver=" + Build.VERSION.SDK_INT + " sdk=26 hash=" + C10630at.m4329e() + " tz=" + this.f33391f + ":" + this.f33392g + " Model=" + Build.MODEL + " os=" + Build.VERSION.INCREMENTAL);
    }

    /* renamed from: b */
    public void m4000b() {
        C10710b c10710b = new C10710b();
        c10710b.m4030a("CLOSE", (String) null);
        m4001a(c10710b);
        this.f33390e.close();
    }
}
