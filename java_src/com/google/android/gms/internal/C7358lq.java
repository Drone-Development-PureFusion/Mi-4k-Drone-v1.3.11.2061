package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.lq */
/* loaded from: classes2.dex */
class C7358lq {

    /* renamed from: com.google.android.gms.internal.lq$a */
    /* loaded from: classes2.dex */
    static class C7359a implements AbstractC7360b {

        /* renamed from: b */
        private int f24555b = 0;

        /* renamed from: a */
        private List<byte[]> f24554a = new ArrayList();

        C7359a() {
        }

        @Override // com.google.android.gms.internal.C7358lq.AbstractC7360b
        /* renamed from: a */
        public C7373lw mo14696a() {
            byte[] bArr = new byte[this.f24555b];
            int i = 0;
            for (int i2 = 0; i2 < this.f24554a.size(); i2++) {
                byte[] bArr2 = this.f24554a.get(i2);
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                i += bArr2.length;
            }
            return new C7373lw(bArr);
        }

        @Override // com.google.android.gms.internal.C7358lq.AbstractC7360b
        /* renamed from: a */
        public boolean mo14695a(byte[] bArr) {
            this.f24554a.add(bArr);
            this.f24555b += bArr.length;
            return true;
        }
    }

    /* renamed from: com.google.android.gms.internal.lq$b */
    /* loaded from: classes2.dex */
    interface AbstractC7360b {
        /* renamed from: a */
        C7373lw mo14696a();

        /* renamed from: a */
        boolean mo14695a(byte[] bArr);
    }

    /* renamed from: com.google.android.gms.internal.lq$c */
    /* loaded from: classes2.dex */
    static class C7361c implements AbstractC7360b {

        /* renamed from: a */
        private static ThreadLocal<CharsetDecoder> f24556a = new ThreadLocal<CharsetDecoder>() { // from class: com.google.android.gms.internal.lq.c.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public CharsetDecoder initialValue() {
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                newDecoder.onMalformedInput(CodingErrorAction.REPORT);
                newDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newDecoder;
            }
        };

        /* renamed from: b */
        private static ThreadLocal<CharsetEncoder> f24557b = new ThreadLocal<CharsetEncoder>() { // from class: com.google.android.gms.internal.lq.c.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public CharsetEncoder initialValue() {
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                newEncoder.onMalformedInput(CodingErrorAction.REPORT);
                newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newEncoder;
            }
        };

        /* renamed from: c */
        private StringBuilder f24558c = new StringBuilder();

        C7361c() {
        }

        /* renamed from: b */
        private String m14694b(byte[] bArr) {
            try {
                return f24556a.get().decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException e) {
                return null;
            }
        }

        @Override // com.google.android.gms.internal.C7358lq.AbstractC7360b
        /* renamed from: a */
        public C7373lw mo14696a() {
            return new C7373lw(this.f24558c.toString());
        }

        @Override // com.google.android.gms.internal.C7358lq.AbstractC7360b
        /* renamed from: a */
        public boolean mo14695a(byte[] bArr) {
            String m14694b = m14694b(bArr);
            if (m14694b != null) {
                this.f24558c.append(m14694b);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC7360b m14697a(byte b) {
        return b == 2 ? new C7359a() : new C7361c();
    }
}
