.class public Lcom/google/android/gms/location/places/n;
.super Lcom/google/android/gms/common/api/f;


# static fields
.field public static final a:I = 0x2329

.field public static final b:I = 0x232a

.field public static final c:I = 0x232b

.field public static final d:I = 0x232c

.field public static final e:I = 0x232d

.field public static final f:I = 0x232e

.field public static final g:I = 0x232f

.field public static final h:I = 0x2330


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/f;-><init>()V

    return-void
.end method

.method public static a(ILjava/lang/String;)Lcom/google/android/gms/common/api/Status;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    sparse-switch p0, :sswitch_data_0

    invoke-static {p0}, Lcom/google/android/gms/common/api/f;->b(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :sswitch_0
    const-string v0, "PLACES_API_QUOTA_FAILED"

    goto :goto_0

    :sswitch_1
    const-string v0, "PLACES_API_USAGE_LIMIT_EXCEEDED"

    goto :goto_0

    :sswitch_2
    const-string v0, "PLACES_API_KEY_INVALID"

    goto :goto_0

    :sswitch_3
    const-string v0, "PLACES_API_ACCESS_NOT_CONFIGURED"

    goto :goto_0

    :sswitch_4
    const-string v0, "PLACES_API_INVALID_ARGUMENT"

    goto :goto_0

    :sswitch_5
    const-string v0, "PLACES_API_RATE_LIMIT_EXCEEDED"

    goto :goto_0

    :sswitch_6
    const-string v0, "PLACES_API_DEVICE_RATE_LIMIT_EXCEEDED"

    goto :goto_0

    :sswitch_7
    const-string v0, "PLACES_API_KEY_EXPIRED"

    goto :goto_0

    :sswitch_8
    const-string v0, "PLACE_ALIAS_NOT_FOUND"

    goto :goto_0

    :sswitch_9
    const-string v0, "PLACE_PROXIMITY_UNKNOWN"

    goto :goto_0

    :sswitch_a
    const-string v0, "NEARBY_ALERTS_NOT_AVAILABLE"

    goto :goto_0

    :sswitch_b
    const-string v0, "PLACES_API_INVALID_APP"

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x2328 -> :sswitch_0
        0x2329 -> :sswitch_1
        0x232a -> :sswitch_2
        0x232b -> :sswitch_3
        0x232c -> :sswitch_4
        0x232d -> :sswitch_5
        0x232e -> :sswitch_6
        0x232f -> :sswitch_7
        0x2330 -> :sswitch_b
        0x235b -> :sswitch_8
        0x238d -> :sswitch_9
        0x238e -> :sswitch_a
    .end sparse-switch
.end method

.method public static c(I)Lcom/google/android/gms/common/api/Status;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/location/places/n;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/location/places/n;->a(ILjava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
