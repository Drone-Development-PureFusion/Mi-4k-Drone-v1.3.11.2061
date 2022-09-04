package com.google.zxing.client.result;

import com.google.zxing.Result;
import org.p286a.p287a.p299f.p302c.C11125l;
/* loaded from: classes2.dex */
final class AddressBookDoCoMoResultParser extends AbstractDoCoMoResultParser {
    AddressBookDoCoMoResultParser() {
    }

    public static AddressBookParsedResult parse(Result result) {
        String[] matchDoCoMoPrefixedField;
        String text = result.getText();
        if (text == null || !text.startsWith("MECARD:") || (matchDoCoMoPrefixedField = matchDoCoMoPrefixedField("N:", text, true)) == null) {
            return null;
        }
        String parseName = parseName(matchDoCoMoPrefixedField[0]);
        String matchSingleDoCoMoPrefixedField = matchSingleDoCoMoPrefixedField("SOUND:", text, true);
        String[] matchDoCoMoPrefixedField2 = matchDoCoMoPrefixedField("TEL:", text, true);
        String[] matchDoCoMoPrefixedField3 = matchDoCoMoPrefixedField("EMAIL:", text, true);
        String matchSingleDoCoMoPrefixedField2 = matchSingleDoCoMoPrefixedField("NOTE:", text, false);
        String[] matchDoCoMoPrefixedField4 = matchDoCoMoPrefixedField("ADR:", text, true);
        String matchSingleDoCoMoPrefixedField3 = matchSingleDoCoMoPrefixedField("BDAY:", text, true);
        if (matchSingleDoCoMoPrefixedField3 != null && !isStringOfDigits(matchSingleDoCoMoPrefixedField3, 8)) {
            matchSingleDoCoMoPrefixedField3 = null;
        }
        return new AddressBookParsedResult(maybeWrap(parseName), matchSingleDoCoMoPrefixedField, matchDoCoMoPrefixedField2, matchDoCoMoPrefixedField3, matchSingleDoCoMoPrefixedField2, matchDoCoMoPrefixedField4, matchSingleDoCoMoPrefixedField("ORG:", text, true), matchSingleDoCoMoPrefixedField3, null, matchSingleDoCoMoPrefixedField("URL:", text, true));
    }

    private static String parseName(String str) {
        int indexOf = str.indexOf(44);
        return indexOf >= 0 ? new StringBuffer().append(str.substring(indexOf + 1)).append(C11125l.f35805c).append(str.substring(0, indexOf)).toString() : str;
    }
}
