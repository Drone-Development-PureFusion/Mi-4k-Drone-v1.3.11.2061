package com.facebook.common.util;
/* loaded from: classes.dex */
public enum TriState {
    YES,
    NO,
    UNSET;

    public static TriState fromDbValue(int i) {
        switch (i) {
            case 1:
                return YES;
            case 2:
                return NO;
            default:
                return UNSET;
        }
    }

    public static TriState valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public static TriState valueOf(boolean z) {
        return z ? YES : NO;
    }

    public boolean asBoolean() {
        switch (this) {
            case YES:
                return true;
            case NO:
                return false;
            case UNSET:
                throw new IllegalStateException("No boolean equivalent for UNSET");
            default:
                throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
    }

    public boolean asBoolean(boolean z) {
        switch (this) {
            case YES:
                return true;
            case NO:
                return false;
            case UNSET:
                return z;
            default:
                throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
    }

    public Boolean asBooleanObject() {
        switch (this) {
            case YES:
                return Boolean.TRUE;
            case NO:
                return Boolean.FALSE;
            case UNSET:
                return null;
            default:
                throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
    }

    public int getDbValue() {
        switch (this) {
            case YES:
                return 1;
            case NO:
                return 2;
            default:
                return 3;
        }
    }

    public boolean isSet() {
        return this != UNSET;
    }
}
