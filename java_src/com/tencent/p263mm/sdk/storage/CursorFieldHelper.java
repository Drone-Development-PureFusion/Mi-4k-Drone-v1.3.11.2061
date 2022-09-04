package com.tencent.p263mm.sdk.storage;

import android.content.ContentValues;
import android.database.Cursor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.tencent.mm.sdk.storage.CursorFieldHelper */
/* loaded from: classes2.dex */
class CursorFieldHelper {

    /* renamed from: bI */
    private static final Map<Class<?>, Method> f31699bI = new HashMap();

    /* renamed from: bJ */
    private static final Map<Class<?>, Method> f31700bJ = new HashMap();

    /* renamed from: bK */
    private static final Map<Class<?>, String> f31701bK = new HashMap();

    static {
        try {
            f31699bI.put(byte[].class, CursorFieldHelper.class.getMethod("keep_setBlob", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Short.TYPE, CursorFieldHelper.class.getMethod("keep_setShort", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Short.class, CursorFieldHelper.class.getMethod("keep_setShort", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Boolean.TYPE, CursorFieldHelper.class.getMethod("keep_setBoolean", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Boolean.class, CursorFieldHelper.class.getMethod("keep_setBoolean", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Integer.TYPE, CursorFieldHelper.class.getMethod("keep_setInt", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Integer.class, CursorFieldHelper.class.getMethod("keep_setInt", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Float.TYPE, CursorFieldHelper.class.getMethod("keep_setFloat", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Float.class, CursorFieldHelper.class.getMethod("keep_setFloat", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Double.TYPE, CursorFieldHelper.class.getMethod("keep_setDouble", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Double.class, CursorFieldHelper.class.getMethod("keep_setDouble", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Long.TYPE, CursorFieldHelper.class.getMethod("keep_setLong", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(Long.class, CursorFieldHelper.class.getMethod("keep_setLong", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31699bI.put(String.class, CursorFieldHelper.class.getMethod("keep_setString", Field.class, Object.class, Cursor.class, Integer.TYPE));
            f31700bJ.put(byte[].class, CursorFieldHelper.class.getMethod("keep_getBlob", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Short.TYPE, CursorFieldHelper.class.getMethod("keep_getShort", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Short.class, CursorFieldHelper.class.getMethod("keep_getShort", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Boolean.TYPE, CursorFieldHelper.class.getMethod("keep_getBoolean", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Boolean.class, CursorFieldHelper.class.getMethod("keep_getBoolean", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Integer.TYPE, CursorFieldHelper.class.getMethod("keep_getInt", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Integer.class, CursorFieldHelper.class.getMethod("keep_getInt", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Float.TYPE, CursorFieldHelper.class.getMethod("keep_getFloat", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Float.class, CursorFieldHelper.class.getMethod("keep_getFloat", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Double.TYPE, CursorFieldHelper.class.getMethod("keep_getDouble", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Double.class, CursorFieldHelper.class.getMethod("keep_getDouble", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Long.TYPE, CursorFieldHelper.class.getMethod("keep_getLong", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(Long.class, CursorFieldHelper.class.getMethod("keep_getLong", Field.class, Object.class, ContentValues.class));
            f31700bJ.put(String.class, CursorFieldHelper.class.getMethod("keep_getString", Field.class, Object.class, ContentValues.class));
            f31701bK.put(byte[].class, "BLOB");
            f31701bK.put(Short.TYPE, "SHORT");
            f31701bK.put(Short.class, "SHORT");
            f31701bK.put(Boolean.TYPE, "INTEGER");
            f31701bK.put(Boolean.class, "INTEGER");
            f31701bK.put(Integer.TYPE, "INTEGER");
            f31701bK.put(Integer.class, "INTEGER");
            f31701bK.put(Float.TYPE, "FLOAT");
            f31701bK.put(Float.class, "FLOAT");
            f31701bK.put(Double.TYPE, "DOUBLE");
            f31701bK.put(Double.class, "DOUBLE");
            f31701bK.put(Long.TYPE, "LONG");
            f31701bK.put(Long.class, "LONG");
            f31701bK.put(String.class, "TEXT");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    CursorFieldHelper() {
    }

    public static Method get(Class<?> cls, boolean z) {
        return z ? f31700bJ.get(cls) : f31699bI.get(cls);
    }

    public static void keep_getBlob(Field field, Object obj, ContentValues contentValues) {
        try {
            contentValues.put(field.getName().substring(6), (byte[]) field.get(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_getBoolean(Field field, Object obj, ContentValues contentValues) {
        try {
            contentValues.put(field.getName().substring(6), Integer.valueOf(field.getBoolean(obj) ? 1 : 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_getDouble(Field field, Object obj, ContentValues contentValues) {
        try {
            if (!field.getType().equals(Double.TYPE)) {
                contentValues.put(field.getName().substring(6), (Double) field.get(obj));
            } else {
                contentValues.put(field.getName().substring(6), Double.valueOf(field.getDouble(obj)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_getFloat(Field field, Object obj, ContentValues contentValues) {
        try {
            if (!field.getType().equals(Float.TYPE)) {
                contentValues.put(field.getName().substring(6), (Float) field.get(obj));
            } else {
                contentValues.put(field.getName().substring(6), Float.valueOf(field.getFloat(obj)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_getInt(Field field, Object obj, ContentValues contentValues) {
        try {
            if (!field.getType().equals(Integer.TYPE)) {
                contentValues.put(field.getName().substring(6), (Integer) field.get(obj));
            } else {
                contentValues.put(field.getName().substring(6), Integer.valueOf(field.getInt(obj)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_getLong(Field field, Object obj, ContentValues contentValues) {
        try {
            if (!field.getType().equals(Long.TYPE)) {
                contentValues.put(field.getName().substring(6), (Long) field.get(obj));
            } else {
                contentValues.put(field.getName().substring(6), Long.valueOf(field.getLong(obj)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_getShort(Field field, Object obj, ContentValues contentValues) {
        try {
            contentValues.put(field.getName().substring(6), Short.valueOf(field.getShort(obj)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_getString(Field field, Object obj, ContentValues contentValues) {
        try {
            contentValues.put(field.getName().substring(6), (String) field.get(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_setBlob(Field field, Object obj, Cursor cursor, int i) {
        try {
            field.set(obj, cursor.getBlob(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_setBoolean(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Boolean.TYPE)) {
                field.setBoolean(obj, cursor.getInt(i) != 0);
            } else {
                field.set(obj, Integer.valueOf(cursor.getInt(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_setDouble(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Double.TYPE)) {
                field.setDouble(obj, cursor.getDouble(i));
            } else {
                field.set(obj, Double.valueOf(cursor.getDouble(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_setFloat(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Float.TYPE)) {
                field.setFloat(obj, cursor.getFloat(i));
            } else {
                field.set(obj, Float.valueOf(cursor.getFloat(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_setInt(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Integer.TYPE)) {
                field.setInt(obj, cursor.getInt(i));
            } else {
                field.set(obj, Integer.valueOf(cursor.getInt(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_setLong(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Long.TYPE)) {
                field.setLong(obj, cursor.getLong(i));
            } else {
                field.set(obj, Long.valueOf(cursor.getLong(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_setShort(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Short.TYPE)) {
                field.setShort(obj, cursor.getShort(i));
            } else {
                field.set(obj, Short.valueOf(cursor.getShort(i)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keep_setString(Field field, Object obj, Cursor cursor, int i) {
        try {
            field.set(obj, cursor.getString(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String type(Class<?> cls) {
        return f31701bK.get(cls);
    }
}
