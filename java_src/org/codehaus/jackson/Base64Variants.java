package org.codehaus.jackson;

import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.p356d.AbstractC11759f;
/* loaded from: classes2.dex */
public final class Base64Variants {
    public static final Base64Variant MODIFIED_FOR_URL;
    static final String STD_BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    public static final Base64Variant MIME = new Base64Variant("MIME", STD_BASE64_ALPHABET, true, (char) SignatureVisitor.INSTANCEOF, 76);
    public static final Base64Variant MIME_NO_LINEFEEDS = new Base64Variant(MIME, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
    public static final Base64Variant PEM = new Base64Variant(MIME, "PEM", true, (char) SignatureVisitor.INSTANCEOF, 64);

    static {
        StringBuffer stringBuffer = new StringBuffer(STD_BASE64_ALPHABET);
        stringBuffer.setCharAt(stringBuffer.indexOf(AbstractC11759f.f37105b), '-');
        stringBuffer.setCharAt(stringBuffer.indexOf("/"), '_');
        MODIFIED_FOR_URL = new Base64Variant("MODIFIED-FOR-URL", stringBuffer.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static Base64Variant getDefaultVariant() {
        return MIME_NO_LINEFEEDS;
    }
}
