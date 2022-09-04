package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC4565ae;
import com.google.android.gms.common.internal.AbstractC4574ah;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4690m;
import com.google.android.gms.internal.akb;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.k */
/* loaded from: classes2.dex */
public class C4649k {

    /* renamed from: a */
    private static AbstractC4574ah f17168a;

    /* renamed from: b */
    private static Context f17169b;

    /* renamed from: c */
    private static Set<AbstractC4565ae> f17170c;

    /* renamed from: d */
    private static Set<AbstractC4565ae> f17171d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.common.k$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC4650a extends AbstractC4565ae.AbstractBinderC4566a {

        /* renamed from: a */
        private int f17172a;

        protected AbstractBinderC4650a(byte[] bArr) {
            boolean z = false;
            if (bArr.length != 25) {
                int length = bArr.length;
                String valueOf = String.valueOf(C4690m.m23128a(bArr, 0, bArr.length, false));
                Log.wtf("GoogleCertificates", new StringBuilder(String.valueOf(valueOf).length() + 51).append("Cert hash data has incorrect length (").append(length).append("):\n").append(valueOf).toString(), new Exception());
                bArr = Arrays.copyOfRange(bArr, 0, 25);
                C4588d.m23618b(bArr.length == 25 ? true : z, new StringBuilder(55).append("cert hash data has incorrect length. length=").append(bArr.length).toString());
            }
            this.f17172a = Arrays.hashCode(bArr);
        }

        /* renamed from: a */
        protected static byte[] m23355a(String str) {
            try {
                return str.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC4565ae
        /* renamed from: a */
        public AbstractC4170e mo23356a() {
            return BinderC4173f.m25293a(mo23353c());
        }

        @Override // com.google.android.gms.common.internal.AbstractC4565ae
        /* renamed from: b */
        public int mo23354b() {
            return hashCode();
        }

        /* renamed from: c */
        abstract byte[] mo23353c();

        public boolean equals(Object obj) {
            AbstractC4170e mo23356a;
            if (obj == null || !(obj instanceof AbstractC4565ae)) {
                return false;
            }
            try {
                AbstractC4565ae abstractC4565ae = (AbstractC4565ae) obj;
                if (abstractC4565ae.mo23354b() == hashCode() && (mo23356a = abstractC4565ae.mo23356a()) != null) {
                    return Arrays.equals(mo23353c(), (byte[]) BinderC4173f.m25294a(mo23356a));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "iCertData failed to retrive data from remote");
                return false;
            }
        }

        public int hashCode() {
            return this.f17172a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.common.k$b */
    /* loaded from: classes2.dex */
    public static class BinderC4651b extends AbstractBinderC4650a {

        /* renamed from: a */
        private final byte[] f17173a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BinderC4651b(byte[] bArr) {
            super(Arrays.copyOfRange(bArr, 0, 25));
            this.f17173a = bArr;
        }

        @Override // com.google.android.gms.common.C4649k.AbstractBinderC4650a
        /* renamed from: c */
        byte[] mo23353c() {
            return this.f17173a;
        }
    }

    /* renamed from: com.google.android.gms.common.k$c */
    /* loaded from: classes2.dex */
    static abstract class AbstractBinderC4652c extends AbstractBinderC4650a {

        /* renamed from: b */
        private static final WeakReference<byte[]> f17174b = new WeakReference<>(null);

        /* renamed from: a */
        private WeakReference<byte[]> f17175a = f17174b;

        AbstractBinderC4652c(byte[] bArr) {
            super(bArr);
        }

        @Override // com.google.android.gms.common.C4649k.AbstractBinderC4650a
        /* renamed from: c */
        byte[] mo23353c() {
            byte[] bArr;
            synchronized (this) {
                bArr = this.f17175a.get();
                if (bArr == null) {
                    bArr = mo23352d();
                    this.f17175a = new WeakReference<>(bArr);
                }
            }
            return bArr;
        }

        /* renamed from: d */
        protected abstract byte[] mo23352d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.common.k$d */
    /* loaded from: classes2.dex */
    public static final class C4653d {

        /* renamed from: a */
        static final AbstractBinderC4650a[] f17176a = {new AbstractBinderC4652c(AbstractBinderC4650a.m23355a("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0")) { // from class: com.google.android.gms.common.k.d.1
            @Override // com.google.android.gms.common.C4649k.AbstractBinderC4652c
            /* renamed from: d */
            protected byte[] mo23352d() {
                return AbstractBinderC4650a.m23355a("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0\r\u0006\t*\u0086H\u0086÷\r\u0001\u0001\u0004\u0005\u00000t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u001e\u0017\r080821231334Z\u0017\r360107231334Z0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u0082\u0001 0\r\u0006\t*\u0086H\u0086÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0082\u0001\r\u00000\u0082\u0001\b\u0002\u0082\u0001\u0001\u0000«V.\u0000Ø;¢\b®\n\u0096o\u0012N)Ú\u0011ò«VÐ\u008fXâÌ©\u0013\u0003é·TÓrö@§\u001b\u001dË\u0013\tgbNFV§wj\u0092\u0019=²å¿·$©\u001ew\u0018\u008b\u000ejG¤;3Ù`\u009bw\u00181EÌß{.XftÉáV[\u001fLjYU¿òQ¦=«ùÅ\\'\"\"Rèuäø\u0015Jd_\u0089qhÀ±¿Æ\u0012ê¿xWi»4ªy\u0084Ü~.¢vL®\u0083\u0007ØÁqT×î_d¥\u001aD¦\u0002ÂI\u0005AWÜ\u0002Í_\\\u000eUûï\u0085\u0019ûã'ð±Q\u0016\u0092Å o\u0019Ñ\u0083\u0085õÄÛÂÖ¹?hÌ)yÇ\u000e\u0018«\u0093\u0086k;ÕÛ\u0089\u0099U*\u000e;L\u0099ßXû\u0091\u008bíÁ\u0082º5à\u0003Á´±\rÒD¨î$ÿý38r«R!\u0098^Ú°ü\r\u000b\u0014[j¡\u0092\u0085\u008ey\u0002\u0001\u0003£\u0081Ù0\u0081Ö0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014Ç}\u008cÂ!\u0017V%\u009a\u007fÓ\u0082ßkã\u0098ä×\u0086¥0\u0081¦\u0006\u0003U\u001d#\u0004\u0081\u009e0\u0081\u009b\u0080\u0014Ç}\u008cÂ!\u0017V%\u009a\u007fÓ\u0082ßkã\u0098ä×\u0086¥¡x¤v0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android\u0082\t\u0000Âà\u0087FdJ0\u008d0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*\u0086H\u0086÷\r\u0001\u0001\u0004\u0005\u0000\u0003\u0082\u0001\u0001\u0000mÒRÎï\u00850,6\nªÎ\u0093\u009bÏòÌ©\u0004»]z\u0016aø®F²\u0099B\u0004ÐÿJhÇí\u001aS\u001eÄYZb<æ\u0007c±g)zzãW\u0012Ä\u0007ò\bðË\u0010\u0094)\u0012M{\u0010b\u0019À\u0084Ê>³ù\u00ad_¸qï\u0092&\u009a\u008bâ\u008bñmDÈÙ \u008el²ð\u0005»?âË\u0096D~\u0086\u008es\u0010v\u00adE³?`\tê\u0019Áaæ&Aª\u0099'\u001dýR(ÅÅ\u0087\u0087]Û\u007fE'XÖaöÌ\fÌ·5.BLÄ6\\R52÷2Q7Y<JãAôÛAíÚ\r\u000b\u0010q§Ä@ðþ\u009e \u001c¶'ÊgCiÐ\u0084½/Ù\u0011ÿ\u0006Í¿,ú\u0010Ü\u000f\u0089:ãWb\u0091\u0090HÇïÆLqD\u0017\u0083B÷\u0005\u0081ÉÞW:õ[9\r×ý¹A\u00861\u0089]_u\u009f0\u0011&\u0087ÿb\u0014\u0010Ài0\u008a");
            }
        }, new AbstractBinderC4652c(AbstractBinderC4650a.m23355a("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0")) { // from class: com.google.android.gms.common.k.d.2
            @Override // com.google.android.gms.common.C4649k.AbstractBinderC4652c
            /* renamed from: d */
            protected byte[] mo23352d() {
                return AbstractBinderC4650a.m23355a("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0\r\u0006\t*\u0086H\u0086÷\r\u0001\u0001\u0004\u0005\u00000\u0081\u00941\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*\u0086H\u0086÷\r\u0001\t\u0001\u0016\u0013android@android.com0\u001e\u0017\r080415233656Z\u0017\r350901233656Z0\u0081\u00941\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*\u0086H\u0086÷\r\u0001\t\u0001\u0016\u0013android@android.com0\u0082\u0001 0\r\u0006\t*\u0086H\u0086÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0082\u0001\r\u00000\u0082\u0001\b\u0002\u0082\u0001\u0001\u0000ÖÎ.\b\n¿â1MÑ\u008d³ÏÓ\u0018\\´=3ú\ftá½¶ÑÛ\u0089\u0013ö,\\9ßVøF\u0081=e¾ÀóÊBk\u0007Å¨íZ9\u0090ÁgçkÉ\u0099¹'\u0089K\u008f\u000b\"\u0000\u0019\u0094©)\u0015årÅm*0\u001b£oÅü\u0011:ÖË\u009et5¡m#«}úîáeäß\u001f\n\u008d½§\n\u0086\u009dQlN\u009d\u0005\u0011\u0096Ê|\fU\u007f\u0017[ÃuùHÅj®\u0086\b\u009b¤O\u008a¦¤Ý\u009a}¿,\n5\"\u0082\u00ad\u0006¸Ì\u0018^±Uyîøm\b\u000b\u001da\u0089Àù¯\u0098±ÂëÑ\u0007êE«Ûh£Ç\u0083\u008a^T\u0088ÇlSÔ\u000b\u0012\u001dç»Ó\u000eb\f\u0018\u008aáªaÛ¼\u0087Ý<d_/UóÔÃuì@p©?qQØ6pÁj\u0097\u001a¾^òÑ\u0018\u0090á¸®ó)\u008cðf¿\u009eláD¬\u009aèm\u001c\u001b\u000f\u0002\u0001\u0003£\u0081ü0\u0081ù0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014\u008d\u001cÅ¾\u0095LC<a\u0086:\u0015°L¼\u0003òOà²0\u0081É\u0006\u0003U\u001d#\u0004\u0081Á0\u0081¾\u0080\u0014\u008d\u001cÅ¾\u0095LC<a\u0086:\u0015°L¼\u0003òOà²¡\u0081\u009a¤\u0081\u00970\u0081\u00941\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*\u0086H\u0086÷\r\u0001\t\u0001\u0016\u0013android@android.com\u0082\t\u0000Õ\u0085¸l}ÓNõ0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*\u0086H\u0086÷\r\u0001\u0001\u0004\u0005\u0000\u0003\u0082\u0001\u0001\u0000\u0019Ó\fñ\u0005ûx\u0092?L\r}Ò##=@\u0096zÏÎ\u0000\b\u001d[×ÆéÖí k\u000e\u0011 \u0095\u0006Al¢D\u0093\u0099\u0013ÒkJ àõ$ÊÒ»\\nL¡\u0001j\u0015\u0091n¡ì]ÉZ^:\u0001\u00006ô\u0092HÕ\u0010\u009b¿.\u001ea\u0081\u0086g:;åm¯\u000bw±Â)ãÂUãèL\u0090]#\u0087ïº\tËñ; +NZ\"É2cHJ#Òü)ú\u009f\u00199u\u00973¯Øª\u0016\u000fB\u0096ÂÐ\u0016>\u0081\u0082\u0085\u009cfCéÁ\u0096/ Á\u008333[À\u0090ÿ\u009ak\"ÞÑ\u00adDB)¥9©Nï\u00ad«ÐeÎÒK>QåÝ{fx{ï\u0012þ\u0097û¤\u0084Ä#ûOøÌIL\u0002ðõ\u0005\u0016\u0012ÿe)9>\u008eFêÅ»!òwÁQª_*¦'Ñè\u009d§\n¶\u00035iÞ;\u0098\u0097¿ÿ|©Ú>\u0012Cö\u000b");
            }
        }};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized Set<AbstractC4565ae> m23361a() {
        Set<AbstractC4565ae> set;
        AbstractC4170e mo23649a;
        synchronized (C4649k.class) {
            if (f17170c != null) {
                set = f17170c;
            } else if (f17168a != null || m23357c()) {
                try {
                    mo23649a = f17168a.mo23649a();
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to retrieve google certificates");
                }
                if (mo23649a == null) {
                    Log.e("GoogleCertificates", "Failed to get google certificates from remote");
                    set = Collections.EMPTY_SET;
                } else {
                    f17170c = m23359a((IBinder[]) BinderC4173f.m25294a(mo23649a));
                    for (int i = 0; i < C4653d.f17176a.length; i++) {
                        f17170c.add(C4653d.f17176a[i]);
                    }
                    f17170c = Collections.unmodifiableSet(f17170c);
                    set = f17170c;
                }
            } else {
                set = Collections.EMPTY_SET;
            }
        }
        return set;
    }

    /* renamed from: a */
    private static Set<AbstractC4565ae> m23359a(IBinder[] iBinderArr) {
        HashSet hashSet = new HashSet(iBinderArr.length);
        for (IBinder iBinder : iBinderArr) {
            AbstractC4565ae m23698a = AbstractC4565ae.AbstractBinderC4566a.m23698a(iBinder);
            if (m23698a == null) {
                Log.e("GoogleCertificates", "iCertData is null, skipping");
            } else {
                hashSet.add(m23698a);
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m23360a(Context context) {
        synchronized (C4649k.class) {
            if (f17169b != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f17169b = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized Set<AbstractC4565ae> m23358b() {
        Set<AbstractC4565ae> set;
        AbstractC4170e mo23648b;
        synchronized (C4649k.class) {
            if (f17171d != null) {
                set = f17171d;
            } else if (f17168a != null || m23357c()) {
                try {
                    mo23648b = f17168a.mo23648b();
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to retrieve google release certificates");
                }
                if (mo23648b == null) {
                    Log.d("GoogleCertificates", "Failed to get google release certificates from remote");
                    set = Collections.EMPTY_SET;
                } else {
                    f17171d = m23359a((IBinder[]) BinderC4173f.m25294a(mo23648b));
                    f17171d.add(C4653d.f17176a[0]);
                    f17171d = Collections.unmodifiableSet(f17171d);
                    set = f17171d;
                }
            } else {
                set = Collections.EMPTY_SET;
            }
        }
        return set;
    }

    /* renamed from: c */
    private static boolean m23357c() {
        C4588d.m23627a(f17169b);
        if (f17168a == null) {
            try {
                akb m17066a = akb.m17066a(f17169b, akb.f22113e, "com.google.android.gms.googlecertificates");
                Log.d("GoogleCertificates", "com.google.android.gms.googlecertificates module is loaded");
                f17168a = AbstractC4574ah.AbstractBinderC4575a.m23650a(m17066a.m17062a("com.google.android.gms.common.GoogleCertificatesImpl"));
            } catch (akb.C6444a e) {
                String valueOf = String.valueOf("Failed to load com.google.android.gms.googlecertificates: ");
                String valueOf2 = String.valueOf(e.getMessage());
                Log.e("GoogleCertificates", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                return false;
            }
        }
        return true;
    }
}
