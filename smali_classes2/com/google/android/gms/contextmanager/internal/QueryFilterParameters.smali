.class public Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/n;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/internal/n;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(III[I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->a:I

    iput p2, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->b:I

    iput p3, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->c:I

    iput-object p4, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->d:[I

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->c:I

    return v0
.end method

.method public d()[I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->d:[I

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->d:[I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 10

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;

    iget v2, p1, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->c:I

    iget v3, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->c:I

    if-eq v2, v3, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    iget v2, p1, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->b:I

    iget v3, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->b:I

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    iget v2, p1, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->a:I

    iget v3, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->a:I

    if-eq v2, v3, :cond_5

    move v0, v1

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->e()Z

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->e()Z

    move-result v3

    if-eq v2, v3, :cond_6

    move v0, v1

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->d:[I

    array-length v2, v2

    iget-object v3, p1, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->d:[I

    array-length v3, v3

    if-eq v2, v3, :cond_7

    move v0, v1

    goto :goto_0

    :cond_7
    iget-object v4, p1, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->d:[I

    array-length v5, v4

    move v3, v1

    :goto_1
    if-ge v3, v5, :cond_0

    aget v6, v4, v3

    iget-object v7, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->d:[I

    array-length v8, v7

    move v2, v1

    :goto_2
    if-ge v2, v8, :cond_a

    aget v9, v7, v2

    if-ne v9, v6, :cond_8

    move v2, v0

    :goto_3
    if-nez v2, :cond_9

    move v0, v1

    goto :goto_0

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    :cond_a
    move v2, v1

    goto :goto_3
.end method

.method public hashCode()I
    .locals 6

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->d:[I

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->d:[I

    array-length v5, v4

    move v2, v1

    move v0, v1

    :goto_0
    if-ge v2, v5, :cond_1

    aget v3, v4, v2

    mul-int/lit8 v3, v3, 0xd

    add-int/2addr v3, v0

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v1

    :cond_1
    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v1

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v0

    const/4 v0, 0x3

    iget v1, p0, Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v0

    invoke-static {v2}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/n;->a(Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;Landroid/os/Parcel;I)V

    return-void
.end method
