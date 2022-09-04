package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.Vector;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes2.dex */
final class AddressBookAUResultParser extends ResultParser {
    AddressBookAUResultParser() {
    }

    private static String[] matchMultipleValuePrefix(String str, int i, String str2, boolean z) {
        Vector vector = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String matchSinglePrefixedField = matchSinglePrefixedField(new StringBuffer().append(str).append(i2).append(C0494h.f680A).toString(), str2, C11125l.f35803a, z);
            if (matchSinglePrefixedField == null) {
                break;
            }
            if (vector == null) {
                vector = new Vector(i);
            }
            vector.addElement(matchSinglePrefixedField);
        }
        if (vector == null) {
            return null;
        }
        return toStringArray(vector);
    }

    public static AddressBookParsedResult parse(Result result) {
        String text = result.getText();
        if (text == null || text.indexOf("MEMORY") < 0 || text.indexOf("\r\n") < 0) {
            return null;
        }
        String matchSinglePrefixedField = matchSinglePrefixedField("NAME1:", text, C11125l.f35803a, true);
        String matchSinglePrefixedField2 = matchSinglePrefixedField("NAME2:", text, C11125l.f35803a, true);
        String[] matchMultipleValuePrefix = matchMultipleValuePrefix("TEL", 3, text, true);
        String[] matchMultipleValuePrefix2 = matchMultipleValuePrefix("MAIL", 3, text, true);
        String matchSinglePrefixedField3 = matchSinglePrefixedField("MEMORY:", text, C11125l.f35803a, false);
        String matchSinglePrefixedField4 = matchSinglePrefixedField("ADD:", text, C11125l.f35803a, true);
        return new AddressBookParsedResult(maybeWrap(matchSinglePrefixedField), matchSinglePrefixedField2, matchMultipleValuePrefix, matchMultipleValuePrefix2, matchSinglePrefixedField3, matchSinglePrefixedField4 == null ? null : new String[]{matchSinglePrefixedField4}, null, null, null, null);
    }
}
