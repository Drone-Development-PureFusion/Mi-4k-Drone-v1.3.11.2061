.class public final Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/internal/connection/dev/ag;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/internal/connection/dev/ag;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;->a:I

    iput p2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;->b:I

    return v0
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
    instance-of v2, p1, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;

    if-eqz v2, :cond_3

    check-cast p1, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;

    iget v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;->a:I

    iget v3, p1, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;->a:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

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

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/internal/connection/dev/ag;->a(Lcom/google/android/gms/nearby/internal/connection/dev/OnStoppedDiscoveryParams;Landroid/os/Parcel;I)V

    return-void
.end method
