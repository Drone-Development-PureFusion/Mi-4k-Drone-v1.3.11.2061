.class public Lcom/google/android/gms/awareness/c;
.super Lcom/google/android/gms/common/api/f;


# static fields
.field public static final a:I = 0x1d4f

.field public static final b:I = 0x1d50

.field public static final c:I = 0x1d52

.field public static final d:I = 0x1d53

.field public static final e:I = 0x1d56

.field public static final f:I = 0x1d57

.field public static final g:I = 0x1d58

.field public static final h:I = 0x1d59

.field public static final i:I = 0x1d5a

.field public static final j:I = 0x1d5b


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/f;-><init>()V

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    sparse-switch p0, :sswitch_data_0

    invoke-static {p0}, Lcom/google/android/gms/common/api/f;->b(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :sswitch_0
    const-string v0, "MISSING_MODULE_ID"

    goto :goto_0

    :sswitch_1
    const-string v0, "EMPTY_CONTEXT_DATA_FILTER"

    goto :goto_0

    :sswitch_2
    const-string v0, "EMPTY_TRANSITION_FILTER"

    goto :goto_0

    :sswitch_3
    const-string v0, "ACL_ACCESS_DENIED"

    goto :goto_0

    :sswitch_4
    const-string v0, "BAD_ACCOUNT"

    goto :goto_0

    :sswitch_5
    const-string v0, "SUCCESS_INJECTED_ONLY"

    goto :goto_0

    :sswitch_6
    const-string v0, "SUCCESS_WROTE_INJECTED"

    goto :goto_0

    :sswitch_7
    const-string v0, "WRITE_FAILED"

    goto :goto_0

    :sswitch_8
    const-string v0, "BLUETOOTH_OFF"

    goto :goto_0

    :sswitch_9
    const-string v0, "INTERNAL_API_CLIENT_CONNECTION_FAILED"

    goto :goto_0

    :sswitch_a
    const-string v0, "PLACES_API_CALL_FAILED"

    goto :goto_0

    :sswitch_b
    const-string v0, "UNRESOLVED_PLACE_ALIAS"

    goto :goto_0

    :sswitch_c
    const-string v0, "INCONSISTENT_ACCOUNT"

    goto :goto_0

    :sswitch_d
    const-string v0, "INCONSISTENT_MODULE_ID"

    goto :goto_0

    :sswitch_e
    const-string v0, "API_NOT_AVAILABLE"

    goto :goto_0

    :sswitch_f
    const-string v0, "INCONSISTENT_UID"

    goto :goto_0

    :sswitch_10
    const-string v0, "FENCE_NOT_AVAILABLE"

    goto :goto_0

    :sswitch_11
    const-string v0, "MAX_LIMIT_OF_FENCE_REGISTRATIONS_EXCEEDED"

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x1d4d -> :sswitch_6
        -0x1d4c -> :sswitch_5
        0x1d4c -> :sswitch_0
        0x1d4d -> :sswitch_1
        0x1d4e -> :sswitch_2
        0x1d4f -> :sswitch_3
        0x1d50 -> :sswitch_4
        0x1d51 -> :sswitch_7
        0x1d52 -> :sswitch_8
        0x1d53 -> :sswitch_9
        0x1d54 -> :sswitch_a
        0x1d55 -> :sswitch_b
        0x1d56 -> :sswitch_c
        0x1d57 -> :sswitch_d
        0x1d58 -> :sswitch_e
        0x1d59 -> :sswitch_f
        0x1d5a -> :sswitch_10
        0x1d5b -> :sswitch_11
    .end sparse-switch
.end method
