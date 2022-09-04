.class public final Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private final b:Lcom/google/android/gms/nearby/internal/connection/dev/v;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/nearby/internal/connection/dev/q;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final d:Ljava/lang/String;

.field private final e:[B
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/internal/connection/dev/a;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/internal/connection/dev/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Landroid/os/IBinder;Ljava/lang/String;[B)V
    .locals 1
    .param p2    # Landroid/os/IBinder;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/IBinder;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->a:I

    invoke-static {p2}, Lcom/google/android/gms/nearby/internal/connection/dev/v$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/internal/connection/dev/v;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->b:Lcom/google/android/gms/nearby/internal/connection/dev/v;

    invoke-static {p3}, Lcom/google/android/gms/nearby/internal/connection/dev/q$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/internal/connection/dev/q;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->c:Lcom/google/android/gms/nearby/internal/connection/dev/q;

    iput-object p4, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->e:[B

    return-void
.end method


# virtual methods
.method public a()Landroid/os/IBinder;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->b:Lcom/google/android/gms/nearby/internal/connection/dev/v;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->b:Lcom/google/android/gms/nearby/internal/connection/dev/v;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/internal/connection/dev/v;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public b()Landroid/os/IBinder;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->c:Lcom/google/android/gms/nearby/internal/connection/dev/q;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->c:Lcom/google/android/gms/nearby/internal/connection/dev/q;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/internal/connection/dev/q;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()[B
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->e:[B

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;

    if-eqz v2, :cond_3

    check-cast p1, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;

    iget v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->a:I

    iget v3, p1, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->a:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->b:Lcom/google/android/gms/nearby/internal/connection/dev/v;

    iget-object v3, p1, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->b:Lcom/google/android/gms/nearby/internal/connection/dev/v;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->c:Lcom/google/android/gms/nearby/internal/connection/dev/q;

    iget-object v3, p1, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->c:Lcom/google/android/gms/nearby/internal/connection/dev/q;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->e:[B

    iget-object v3, p1, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->e:[B

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->b:Lcom/google/android/gms/nearby/internal/connection/dev/v;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->c:Lcom/google/android/gms/nearby/internal/connection/dev/q;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->d:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;->e:[B

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/internal/connection/dev/a;->a(Lcom/google/android/gms/nearby/internal/connection/dev/AcceptConnectionRequestParams;Landroid/os/Parcel;I)V

    return-void
.end method
