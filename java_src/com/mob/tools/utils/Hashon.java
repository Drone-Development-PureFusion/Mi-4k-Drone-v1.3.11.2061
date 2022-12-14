package com.mob.tools.utils;

import android.text.TextUtils;
import com.mob.tools.MobLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p006a.p007a.p008a.p020j.C0324k;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes2.dex */
public class Hashon {
    private ArrayList<?> arrayToList(Object obj) {
        int i = 0;
        if (obj instanceof byte[]) {
            ArrayList<?> arrayList = new ArrayList<>();
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            while (i < length) {
                arrayList.add(Byte.valueOf(bArr[i]));
                i++;
            }
            return arrayList;
        } else if (obj instanceof short[]) {
            ArrayList<?> arrayList2 = new ArrayList<>();
            short[] sArr = (short[]) obj;
            int length2 = sArr.length;
            while (i < length2) {
                arrayList2.add(Short.valueOf(sArr[i]));
                i++;
            }
            return arrayList2;
        } else if (obj instanceof int[]) {
            ArrayList<?> arrayList3 = new ArrayList<>();
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                arrayList3.add(Integer.valueOf(iArr[i]));
                i++;
            }
            return arrayList3;
        } else if (obj instanceof long[]) {
            ArrayList<?> arrayList4 = new ArrayList<>();
            long[] jArr = (long[]) obj;
            int length4 = jArr.length;
            while (i < length4) {
                arrayList4.add(Long.valueOf(jArr[i]));
                i++;
            }
            return arrayList4;
        } else if (obj instanceof float[]) {
            ArrayList<?> arrayList5 = new ArrayList<>();
            float[] fArr = (float[]) obj;
            int length5 = fArr.length;
            while (i < length5) {
                arrayList5.add(Float.valueOf(fArr[i]));
                i++;
            }
            return arrayList5;
        } else if (obj instanceof double[]) {
            ArrayList<?> arrayList6 = new ArrayList<>();
            double[] dArr = (double[]) obj;
            int length6 = dArr.length;
            while (i < length6) {
                arrayList6.add(Double.valueOf(dArr[i]));
                i++;
            }
            return arrayList6;
        } else if (obj instanceof char[]) {
            ArrayList<?> arrayList7 = new ArrayList<>();
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            while (i < length7) {
                arrayList7.add(Character.valueOf(cArr[i]));
                i++;
            }
            return arrayList7;
        } else if (obj instanceof boolean[]) {
            ArrayList<?> arrayList8 = new ArrayList<>();
            boolean[] zArr = (boolean[]) obj;
            int length8 = zArr.length;
            while (i < length8) {
                arrayList8.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            return arrayList8;
        } else if (!(obj instanceof String[])) {
            return null;
        } else {
            ArrayList<?> arrayList9 = new ArrayList<>();
            String[] strArr = (String[]) obj;
            int length9 = strArr.length;
            while (i < length9) {
                arrayList9.add(strArr[i]);
                i++;
            }
            return arrayList9;
        }
    }

    private String format(String str, ArrayList<Object> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[\n");
        String str2 = str + C0324k.f324b;
        int i = 0;
        Iterator<Object> it2 = arrayList.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                stringBuffer.append('\n').append(str).append(']');
                return stringBuffer.toString();
            }
            Object next = it2.next();
            if (i2 > 0) {
                stringBuffer.append(",\n");
            }
            stringBuffer.append(str2);
            if (next instanceof HashMap) {
                stringBuffer.append(format(str2, (HashMap) next));
            } else if (next instanceof ArrayList) {
                stringBuffer.append(format(str2, (ArrayList) next));
            } else if (next instanceof String) {
                stringBuffer.append('\"').append(next).append('\"');
            } else {
                stringBuffer.append(next);
            }
            i = i2 + 1;
        }
    }

    private String format(String str, HashMap<String, Object> hashMap) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{\n");
        String str2 = str + C0324k.f324b;
        int i = 0;
        Iterator<Map.Entry<String, Object>> it2 = hashMap.entrySet().iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                stringBuffer.append('\n').append(str).append(C0494h.f735w);
                return stringBuffer.toString();
            }
            Map.Entry<String, Object> next = it2.next();
            if (i2 > 0) {
                stringBuffer.append(",\n");
            }
            stringBuffer.append(str2).append('\"').append(next.getKey()).append("\":");
            Object value = next.getValue();
            if (value instanceof HashMap) {
                stringBuffer.append(format(str2, (HashMap) value));
            } else if (value instanceof ArrayList) {
                stringBuffer.append(format(str2, (ArrayList) value));
            } else if (value instanceof String) {
                stringBuffer.append('\"').append(value).append('\"');
            } else {
                stringBuffer.append(value);
            }
            i = i2 + 1;
        }
    }

    private ArrayList<Object> fromJson(JSONArray jSONArray) {
        ArrayList<Object> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONObject) {
                opt = fromJson((JSONObject) opt);
            } else if (opt instanceof JSONArray) {
                opt = fromJson((JSONArray) opt);
            }
            arrayList.add(opt);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> HashMap<String, T> fromJson(JSONObject jSONObject) {
        HashMap<String, T> hashMap = (HashMap<String, T>) new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (JSONObject.NULL.equals(opt)) {
                opt = null;
            }
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    opt = fromJson((JSONObject) opt);
                } else if (opt instanceof JSONArray) {
                    opt = fromJson((JSONArray) opt);
                }
                hashMap.put(next, opt);
            }
        }
        return hashMap;
    }

    private JSONArray getJSONArray(ArrayList<Object> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator<Object> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof HashMap) {
                next = getJSONObject((HashMap) next);
            } else if (next instanceof ArrayList) {
                next = getJSONArray((ArrayList) next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    private <T> JSONObject getJSONObject(HashMap<String, T> hashMap) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, T> entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof HashMap) {
                value = getJSONObject((HashMap) value);
            } else if (value instanceof ArrayList) {
                value = getJSONArray((ArrayList) value);
            } else if (isBasicArray(value)) {
                value = getJSONArray(arrayToList(value));
            }
            jSONObject.put(entry.getKey(), value);
        }
        return jSONObject;
    }

    private boolean isBasicArray(Object obj) {
        return (obj instanceof byte[]) || (obj instanceof short[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof char[]) || (obj instanceof boolean[]) || (obj instanceof String[]);
    }

    public String format(String str) {
        try {
            return format("", fromJson(str));
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
            return "";
        }
    }

    public <T> String fromHashMap(HashMap<String, T> hashMap) {
        try {
            JSONObject jSONObject = getJSONObject(hashMap);
            return jSONObject == null ? "" : jSONObject.toString();
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
            return "";
        }
    }

    public <T> HashMap<String, T> fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        try {
            if (str.startsWith("[") && str.endsWith("]")) {
                str = "{\"fakelist\":" + str + "}";
            }
            return fromJson(new JSONObject(str));
        } catch (Throwable th) {
            MobLog.getInstance().m6188w(str, new Object[0]);
            MobLog.getInstance().m6187w(th);
            return new HashMap<>();
        }
    }
}
