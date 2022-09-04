.class public Lcom/google/firebase/auth/api/model/GetTokenResponse;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/firebase/auth/api/model/GetTokenResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I
    .annotation runtime Lcom/google/android/gms/internal/gc;
    .end annotation
.end field

.field private b:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "refresh_token"
    .end annotation
.end field

.field private c:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "access_token"
    .end annotation
.end field

.field private d:Ljava/lang/Long;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "expires_in"
    .end annotation
.end field

.field private e:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "token_type"
    .end annotation
.end field

.field private f:Ljava/lang/Long;
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "issued_at"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/api/model/d;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/d;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->a:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->f:Ljava/lang/Long;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->a:I

    iput-object p2, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->d:Ljava/lang/Long;

    iput-object p5, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->f:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->b:Ljava/lang/String;

    return-void
.end method

.method public a()Z
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->f:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->d:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    invoke-static {}, Lcom/google/android/gms/common/util/h;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    const-wide/32 v4, 0x493e0

    add-long/2addr v2, v4

    cmp-long v0, v2, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->d:Ljava/lang/Long;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->d:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0
.end method

.method public e()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetTokenResponse;->f:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/auth/api/model/d;->a(Lcom/google/firebase/auth/api/model/GetTokenResponse;Landroid/os/Parcel;I)V

    return-void
.end method
