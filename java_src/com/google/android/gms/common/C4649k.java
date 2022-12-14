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
        static final AbstractBinderC4650a[] f17176a = {new AbstractBinderC4652c(AbstractBinderC4650a.m23355a("0\u0082\u0004C0\u0082\u0003+??\u0003\u0002\u0001\u0002\u0002\t\u0000????\u0087FdJ0\u008d0")) { // from class: com.google.android.gms.common.k.d.1
            @Override // com.google.android.gms.common.C4649k.AbstractBinderC4652c
            /* renamed from: d */
            protected byte[] mo23352d() {
                return AbstractBinderC4650a.m23355a("0\u0082\u0004C0\u0082\u0003+??\u0003\u0002\u0001\u0002\u0002\t\u0000????\u0087FdJ0\u008d0\r\u0006\t*\u0086H\u0086??\r\u0001\u0001\u0004\u0005\u00000t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u001e\u0017\r080821231334Z\u0017\r360107231334Z0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u0082\u0001 0\r\u0006\t*\u0086H\u0086??\r\u0001\u0001\u0001\u0005\u0000\u0003\u0082\u0001\r\u00000\u0082\u0001\b\u0002\u0082\u0001\u0001\u0000??V.\u0000??;??\b??\n\u0096o\u0012N)??\u0011????V??\u008fX??????\u0013\u0003????T??r??@??\u001b\u001d??\u0013\tgbNFV??wj\u0092\u0019=????????$??\u001ew\u0018\u008b\u000ejG??;3??`\u009bw\u00181E????{.Xft????V[\u001fLjYU????Q??=??????\\'\"\"R??u????\u0015Jd_\u0089qh????????\u0012????xWi??4??y\u0084??~.??vL??\u0083\u0007????qT????_d??\u001aD??\u0002??I\u0005AW??\u0002??_\\\u000eU????\u0085\u0019????'????Q\u0016\u0092????o\u0019??\u0083\u0085?????????????h??)y??\u000e\u0018??\u0093\u0086k;????\u0089\u0099U*\u000e;L\u0099??X??\u0091\u008b????\u0082??5??\u0003??????\r??D????$????38r??R!\u0098^??????\r\u000b\u0014[j??\u0092\u0085\u008ey\u0002\u0001\u0003??\u0081??0\u0081??0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014??}\u008c??!\u0017V%\u009a\u007f??\u0082??k??\u0098????\u0086??0\u0081??\u0006\u0003U\u001d#\u0004\u0081\u009e0\u0081\u009b\u0080\u0014??}\u008c??!\u0017V%\u009a\u007f??\u0082??k??\u0098????\u0086????x??v0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android\u0082\t\u0000????\u0087FdJ0\u008d0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001??0\r\u0006\t*\u0086H\u0086??\r\u0001\u0001\u0004\u0005\u0000\u0003\u0082\u0001\u0001\u0000m??R????\u00850,6\n????\u0093\u009b????????\u0004??]z\u0016a????F??\u0099B\u0004????Jh????\u001aS\u001e??YZb<??\u0007c??g)zz??W\u0012??\u0007??\b????\u0010\u0094)\u0012M{\u0010b\u0019??\u0084??>????\u00ad_??q??\u0092&\u009a\u008b??\u008b??mD??????\u008el????\u0005???????\u0096D~\u0086\u008es\u0010v\u00adE???`\t??\u0019??a??&A??\u0099'\u001d??R(????\u0087\u0087]??\u007fE'X??a????\f????5.BL??6\\R52??2Q7Y<J??A????A????\r\u000b\u0010q????@????\u009e??\u001c??'??gCi??\u0084??/??\u0011??\u0006????,??\u0010??\u000f\u0089:??Wb\u0091\u0090H??????LqD\u0017\u0083B??\u0005\u0081????W:??[9\r??????A\u00861\u0089]_u\u009f0\u0011&\u0087??b\u0014\u0010??i0\u008a");
            }
        }, new AbstractBinderC4652c(AbstractBinderC4650a.m23355a("0\u0082\u0004??0\u0082\u0003\u0090??\u0003\u0002\u0001\u0002\u0002\t\u0000??\u0085??l}??N??0")) { // from class: com.google.android.gms.common.k.d.2
            @Override // com.google.android.gms.common.C4649k.AbstractBinderC4652c
            /* renamed from: d */
            protected byte[] mo23352d() {
                return AbstractBinderC4650a.m23355a("0\u0082\u0004??0\u0082\u0003\u0090??\u0003\u0002\u0001\u0002\u0002\t\u0000??\u0085??l}??N??0\r\u0006\t*\u0086H\u0086??\r\u0001\u0001\u0004\u0005\u00000\u0081\u00941\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*\u0086H\u0086??\r\u0001\t\u0001\u0016\u0013android@android.com0\u001e\u0017\r080415233656Z\u0017\r350901233656Z0\u0081\u00941\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*\u0086H\u0086??\r\u0001\t\u0001\u0016\u0013android@android.com0\u0082\u0001 0\r\u0006\t*\u0086H\u0086??\r\u0001\u0001\u0001\u0005\u0000\u0003\u0082\u0001\r\u00000\u0082\u0001\b\u0002\u0082\u0001\u0001\u0000????.\b\n????1M??\u008d??????\u0018\\??=3??\ft??????????\u0089\u0013??,\\9??V??F\u0081=e????????Bk\u0007??????Z9\u0090??g??k??\u0099??'\u0089K\u008f\u000b\"\u0000\u0019\u0094??)\u0015??r??m*0\u001b??o????\u0011:????\u009et5??m#??}??????e????\u001f\n\u008d????\n\u0086\u009dQlN\u009d\u0005\u0011\u0096??|\fU\u007f\u0017[??u??H??j??\u0086\b\u009b??O\u008a??????\u009a}??,\n5\"\u0082\u00ad\u0006????\u0018^??Uy????m\b\u000b\u001da\u0089??????\u0098????????\u0007??E????h????\u0083\u008a^T\u0088??lS??\u000b\u0012\u001d??????\u000eb\f\u0018\u008a????a????\u0087??<d_/U??????u??@p???qQ??6p??j\u0097\u001a??^????\u0018\u0090????????)\u008c??f??\u009el??D??\u009a??m\u001c\u001b\u000f\u0002\u0001\u0003??\u0081??0\u0081??0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014\u008d\u001c????\u0095LC<a\u0086:\u0015??L??\u0003??O????0\u0081??\u0006\u0003U\u001d#\u0004\u0081??0\u0081??\u0080\u0014\u008d\u001c????\u0095LC<a\u0086:\u0015??L??\u0003??O??????\u0081\u009a??\u0081\u00970\u0081\u00941\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*\u0086H\u0086??\r\u0001\t\u0001\u0016\u0013android@android.com\u0082\t\u0000??\u0085??l}??N??0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001??0\r\u0006\t*\u0086H\u0086??\r\u0001\u0001\u0004\u0005\u0000\u0003\u0082\u0001\u0001\u0000\u0019??\f??\u0005??x\u0092?L\r}??##=@\u0096z????\u0000\b\u001d[?????????? k\u000e\u0011 \u0095\u0006Al??D\u0093\u0099\u0013??kJ??????$??????\\nL??\u0001j\u0015\u0091n????]??Z^:\u0001\u00006??\u0092H??\u0010\u009b??.\u001ea\u0081\u0086g:;??m??\u000bw????)????U????L\u0090]#\u0087????\t????; +NZ\"??2cHJ#????)??\u009f\u00199u\u00973??????\u0016\u000fB\u0096????\u0016>\u0081\u0082\u0085\u009cfC????\u0096/????\u008333[??\u0090??\u009ak\"????\u00adDB)??9??N??\u00ad????e????K>Q????{fx{??\u0012??\u0097????\u0084??#??O????IL\u0002????\u0005\u0016\u0012??e)9>\u008eF??????!??w??Q??_*??'????\u009d??\n??\u00035i??;\u0098\u0097????|????>\u0012C??\u000b");
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
