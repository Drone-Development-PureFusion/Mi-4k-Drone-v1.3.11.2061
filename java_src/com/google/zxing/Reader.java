package com.google.zxing;

import java.util.Hashtable;
/* loaded from: classes2.dex */
public interface Reader {
    Result decode(BinaryBitmap binaryBitmap);

    Result decode(BinaryBitmap binaryBitmap, Hashtable hashtable);

    void reset();
}
