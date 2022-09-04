package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.string.C10430a;
import com.xiaomi.xmpush.thrift.C10767aa;
import com.xiaomi.xmpush.thrift.C10769ab;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.C10779ag;
import com.xiaomi.xmpush.thrift.C10783ai;
import com.xiaomi.xmpush.thrift.C10785aj;
import com.xiaomi.xmpush.thrift.C10789al;
import com.xiaomi.xmpush.thrift.C10793an;
import com.xiaomi.xmpush.thrift.C10797ap;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.C10831u;
import com.xiaomi.xmpush.thrift.C10835w;
import com.xiaomi.xmpush.thrift.C10837x;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.codehaus.jackson.smile.SmileConstants;
import org.p286a.p321b.AbstractC11361a;
/* renamed from: com.xiaomi.mipush.sdk.q */
/* loaded from: classes2.dex */
public class C10490q {

    /* renamed from: a */
    private static final byte[] f32589a = {100, 23, 84, 114, 72, 0, 4, 97, 73, 97, 2, SmileConstants.TOKEN_KEY_LONG_STRING, 84, 102, 18, 32};

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static <T extends AbstractC11361a<T, ?>> C10769ab m4962a(Context context, T t, EnumC10766a enumC10766a) {
        return m4961a(context, t, enumC10766a, !enumC10766a.equals(EnumC10766a.Registration), context.getPackageName(), C10469a.m5034a(context).m5026c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static <T extends AbstractC11361a<T, ?>> C10769ab m4961a(Context context, T t, EnumC10766a enumC10766a, boolean z, String str, String str2) {
        byte[] m3471a = C10799aq.m3471a(t);
        if (m3471a == null) {
            AbstractC10404b.m5269a("invoke convertThriftObjectToBytes method, return null.");
            return null;
        }
        C10769ab c10769ab = new C10769ab();
        if (z) {
            String m5023f = C10469a.m5034a(context).m5023f();
            if (TextUtils.isEmpty(m5023f)) {
                AbstractC10404b.m5269a("regSecret is empty, return null");
                return null;
            }
            try {
                m3471a = m4957b(C10430a.m5187a(m5023f), m3471a);
            } catch (Exception e) {
                AbstractC10404b.m5264d("encryption error. ");
            }
        }
        C10831u c10831u = new C10831u();
        c10831u.f34542a = 5L;
        c10831u.f34543b = "fakeid";
        c10769ab.m3747a(c10831u);
        c10769ab.m3745a(ByteBuffer.wrap(m3471a));
        c10769ab.m3750a(enumC10766a);
        c10769ab.m3738c(true);
        c10769ab.m3741b(str);
        c10769ab.m3744a(z);
        c10769ab.m3746a(str2);
        return c10769ab;
    }

    /* renamed from: a */
    private static Cipher m4959a(byte[] bArr, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f32589a);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, secretKeySpec, ivParameterSpec);
        return cipher;
    }

    /* renamed from: a */
    public static AbstractC11361a m4963a(Context context, C10769ab c10769ab) {
        byte[] m3734f;
        if (c10769ab.m3739c()) {
            try {
                m3734f = m4958a(C10430a.m5187a(C10469a.m5034a(context).m5023f()), c10769ab.m3734f());
            } catch (Exception e) {
                throw new C10474c("the aes decrypt failed.", e);
            }
        } else {
            m3734f = c10769ab.m3734f();
        }
        AbstractC11361a m4960a = m4960a(c10769ab.m3751a(), c10769ab.f33668c);
        if (m4960a != null) {
            C10799aq.m3470a(m4960a, m3734f);
        }
        return m4960a;
    }

    /* renamed from: a */
    private static AbstractC11361a m4960a(EnumC10766a enumC10766a, boolean z) {
        switch (C10491r.f32590a[enumC10766a.ordinal()]) {
            case 1:
                return new C10779ag();
            case 2:
                return new C10793an();
            case 3:
                return new C10789al();
            case 4:
                return new C10797ap();
            case 5:
                return new C10785aj();
            case 6:
                return new C10835w();
            case 7:
                return new C10767aa();
            case 8:
                return new C10783ai();
            case 9:
                if (z) {
                    return new C10775ae();
                }
                C10837x c10837x = new C10837x();
                c10837x.m3195a(true);
                return c10837x;
            case 10:
                return new C10767aa();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static byte[] m4958a(byte[] bArr, byte[] bArr2) {
        return m4959a(bArr, 2).doFinal(bArr2);
    }

    /* renamed from: b */
    public static byte[] m4957b(byte[] bArr, byte[] bArr2) {
        return m4959a(bArr, 1).doFinal(bArr2);
    }
}
