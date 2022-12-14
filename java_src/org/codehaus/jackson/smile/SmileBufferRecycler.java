package org.codehaus.jackson.smile;

import java.util.Arrays;
/* loaded from: classes3.dex */
public class SmileBufferRecycler<T> {
    public static final int DEFAULT_NAME_BUFFER_LENGTH = 64;
    public static final int DEFAULT_STRING_VALUE_BUFFER_LENGTH = 64;
    protected T[] _seenNamesBuffer;
    protected T[] _seenStringValuesBuffer;

    public T[] allocSeenNamesBuffer() {
        T[] tArr = this._seenNamesBuffer;
        if (tArr != null) {
            this._seenNamesBuffer = null;
            Arrays.fill(tArr, (Object) null);
        }
        return tArr;
    }

    public T[] allocSeenStringValuesBuffer() {
        T[] tArr = this._seenStringValuesBuffer;
        if (tArr != null) {
            this._seenStringValuesBuffer = null;
            Arrays.fill(tArr, (Object) null);
        }
        return tArr;
    }

    public void releaseSeenNamesBuffer(T[] tArr) {
        this._seenNamesBuffer = tArr;
    }

    public void releaseSeenStringValuesBuffer(T[] tArr) {
        this._seenStringValuesBuffer = tArr;
    }
}
