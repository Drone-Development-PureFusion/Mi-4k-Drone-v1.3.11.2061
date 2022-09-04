.class public Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;",
            ">;"
        }
    .end annotation
.end field

.field private static final a:[I


# instance fields
.field private final b:I

.field private final c:I

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->a:[I

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/l;

    invoke-direct {v0}, Lcom/google/android/gms/awareness/snapshot/internal/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void

    :array_0
    .array-data 4
        0x2712
        0x2713
        0x2714
        0x2715
        0x2716
        0x2717
        0x2718
    .end array-data
.end method

.method constructor <init>(IILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->b:I

    iput p2, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->c:I

    iput-object p3, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->d:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;-><init>(IILjava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->c:I

    return v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p0, p1, :cond_1

    move v2, v1

    :cond_0
    :goto_0
    return v2

    :cond_1
    instance-of v0, p1, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->c:I

    invoke-virtual {p1}, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->b()I

    move-result v3

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->d:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->c()Ljava/util/ArrayList;

    move-result-object v3

    if-nez v3, :cond_4

    move v3, v1

    :goto_2
    xor-int/2addr v0, v3

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->c()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;

    invoke-virtual {p1}, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->c()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    move v3, v2

    goto :goto_2

    :cond_5
    move v2, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 4

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v2

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;

    invoke-virtual {v0}, Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl$TypeFilterImpl;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0xd

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, v2

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget v3, p0, Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/awareness/snapshot/internal/l;->a(Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;Landroid/os/Parcel;I)V

    return-void
.end method
