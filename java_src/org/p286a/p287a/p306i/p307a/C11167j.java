package org.p286a.p287a.p306i.p307a;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.NTCredentials;
import org.apache.http.impl.auth.NTLMEngine;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.a.j */
/* loaded from: classes2.dex */
public class C11167j extends AbstractC11150a {

    /* renamed from: a */
    private final NTLMEngine f35949a;

    /* renamed from: b */
    private EnumC11168a f35950b;

    /* renamed from: c */
    private String f35951c;

    /* renamed from: org.a.a.i.a.j$a */
    /* loaded from: classes2.dex */
    enum EnumC11168a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    public C11167j() {
        this(new C11158h());
    }

    public C11167j(NTLMEngine nTLMEngine) {
        C11354a.m1321a(nTLMEngine, "NTLM engine");
        this.f35949a = nTLMEngine;
        this.f35950b = EnumC11168a.UNINITIATED;
        this.f35951c = null;
    }

    @Override // org.p286a.p287a.p306i.p307a.AbstractC11150a
    /* renamed from: a */
    protected void mo1809a(CharArrayBuffer charArrayBuffer, int i, int i2) {
        this.f35951c = charArrayBuffer.substringTrimmed(i, i2);
        if (this.f35951c.length() == 0) {
            if (this.f35950b == EnumC11168a.UNINITIATED) {
                this.f35950b = EnumC11168a.CHALLENGE_RECEIVED;
            } else {
                this.f35950b = EnumC11168a.FAILED;
            }
        } else if (this.f35950b.compareTo(EnumC11168a.MSG_TYPE1_GENERATED) < 0) {
            this.f35950b = EnumC11168a.FAILED;
            throw new MalformedChallengeException("Out of sequence NTLM response message");
        } else if (this.f35950b != EnumC11168a.MSG_TYPE1_GENERATED) {
        } else {
            this.f35950b = EnumC11168a.MSG_TYPE2_RECEVIED;
        }
    }

    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        String generateType3Msg;
        try {
            NTCredentials nTCredentials = (NTCredentials) credentials;
            if (this.f35950b == EnumC11168a.FAILED) {
                throw new AuthenticationException("NTLM authentication failed");
            }
            if (this.f35950b == EnumC11168a.CHALLENGE_RECEIVED) {
                generateType3Msg = this.f35949a.generateType1Msg(nTCredentials.getDomain(), nTCredentials.getWorkstation());
                this.f35950b = EnumC11168a.MSG_TYPE1_GENERATED;
            } else if (this.f35950b != EnumC11168a.MSG_TYPE2_RECEVIED) {
                throw new AuthenticationException("Unexpected state: " + this.f35950b);
            } else {
                generateType3Msg = this.f35949a.generateType3Msg(nTCredentials.getUserName(), nTCredentials.getPassword(), nTCredentials.getDomain(), nTCredentials.getWorkstation(), this.f35951c);
                this.f35950b = EnumC11168a.MSG_TYPE3_GENERATED;
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
            if (a()) {
                charArrayBuffer.append(C11086e.f35692N);
            } else {
                charArrayBuffer.append("Authorization");
            }
            charArrayBuffer.append(": NTLM ");
            charArrayBuffer.append(generateType3Msg);
            return new BufferedHeader(charArrayBuffer);
        } catch (ClassCastException e) {
            throw new InvalidCredentialsException("Credentials cannot be used for NTLM authentication: " + credentials.getClass().getName());
        }
    }

    public String getParameter(String str) {
        return null;
    }

    public String getRealm() {
        return null;
    }

    public String getSchemeName() {
        return "ntlm";
    }

    public boolean isComplete() {
        return this.f35950b == EnumC11168a.MSG_TYPE3_GENERATED || this.f35950b == EnumC11168a.FAILED;
    }

    public boolean isConnectionBased() {
        return true;
    }
}
