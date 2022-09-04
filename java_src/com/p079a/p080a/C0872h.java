package com.p079a.p080a;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.a.a.h */
/* loaded from: classes.dex */
public class C0872h implements AbstractC0887u {

    /* renamed from: a */
    private final Charset f1828a;

    public C0872h(Charset charset) {
        this.f1828a = charset;
    }

    @Override // com.p079a.p080a.AbstractC0887u
    /* renamed from: a */
    public String mo37520a(byte[] bArr) {
        return this.f1828a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString();
    }

    @Override // com.p079a.p080a.AbstractC0887u
    /* renamed from: a */
    public boolean mo37521a(String str) {
        CharsetEncoder newEncoder = this.f1828a.newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.REPORT);
        newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        return newEncoder.canEncode(str);
    }

    @Override // com.p079a.p080a.AbstractC0887u
    /* renamed from: b */
    public ByteBuffer mo37519b(String str) {
        CharsetEncoder newEncoder = this.f1828a.newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.REPORT);
        newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        CharBuffer wrap = CharBuffer.wrap(str);
        ByteBuffer allocate = ByteBuffer.allocate(str.length() + ((str.length() + 1) / 2));
        while (true) {
            if (wrap.remaining() <= 0) {
                break;
            }
            CoderResult encode = newEncoder.encode(wrap, allocate, true);
            if (encode.isUnmappable() || encode.isMalformed()) {
                if (encode.length() * 6 > allocate.remaining()) {
                    allocate = AbstractC0888v.m37516a(allocate, allocate.position() + (encode.length() * 6));
                }
                for (int i = 0; i < encode.length(); i++) {
                    AbstractC0888v.m37517a(allocate, wrap.get());
                }
            } else if (encode.isOverflow()) {
                allocate = AbstractC0888v.m37516a(allocate, 0);
            } else if (encode.isUnderflow()) {
                newEncoder.flush(allocate);
                break;
            }
        }
        allocate.limit(allocate.position());
        allocate.rewind();
        return allocate;
    }
}
