package com.google.zxing.qrcode.decoder;
/* loaded from: classes2.dex */
public final class ErrorCorrectionLevel {
    private final int bits;
    private final String name;
    private final int ordinal;

    /* renamed from: L */
    public static final ErrorCorrectionLevel f30889L = new ErrorCorrectionLevel(0, 1, "L");

    /* renamed from: M */
    public static final ErrorCorrectionLevel f30890M = new ErrorCorrectionLevel(1, 0, "M");

    /* renamed from: Q */
    public static final ErrorCorrectionLevel f30891Q = new ErrorCorrectionLevel(2, 3, "Q");

    /* renamed from: H */
    public static final ErrorCorrectionLevel f30888H = new ErrorCorrectionLevel(3, 2, "H");
    private static final ErrorCorrectionLevel[] FOR_BITS = {f30890M, f30889L, f30888H, f30891Q};

    private ErrorCorrectionLevel(int i, int i2, String str) {
        this.ordinal = i;
        this.bits = i2;
        this.name = str;
    }

    public static ErrorCorrectionLevel forBits(int i) {
        if (i < 0 || i >= FOR_BITS.length) {
            throw new IllegalArgumentException();
        }
        return FOR_BITS[i];
    }

    public int getBits() {
        return this.bits;
    }

    public String getName() {
        return this.name;
    }

    public int ordinal() {
        return this.ordinal;
    }

    public String toString() {
        return this.name;
    }
}
