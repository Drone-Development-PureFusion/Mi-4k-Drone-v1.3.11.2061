.class public final Lcom/google/android/gms/auth/api/signin/c;
.super Lcom/google/android/gms/common/api/f;


# static fields
.field public static final a:I = 0x30d4

.field public static final b:I = 0x30d5


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/f;-><init>()V

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    invoke-static {p0}, Lcom/google/android/gms/common/api/f;->b(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "A non-recoverable sign in failure occurred"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x30d4
        :pswitch_0
    .end packed-switch
.end method
