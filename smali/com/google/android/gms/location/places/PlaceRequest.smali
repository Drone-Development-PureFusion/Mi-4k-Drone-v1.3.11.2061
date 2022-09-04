.class public final Lcom/google/android/gms/location/places/PlaceRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/location/places/PlaceRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private final b:Lcom/google/android/gms/location/places/PlaceFilter;

.field private final c:J

.field private final d:I

.field private final e:J

.field private final f:Z

.field private final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/places/x;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/x;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/places/PlaceRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/location/places/PlaceFilter;JIJZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/places/PlaceRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->b:Lcom/google/android/gms/location/places/PlaceFilter;

    iput-wide p3, p0, Lcom/google/android/gms/location/places/PlaceRequest;->c:J

    iput p5, p0, Lcom/google/android/gms/location/places/PlaceRequest;->d:I

    iput-wide p6, p0, Lcom/google/android/gms/location/places/PlaceRequest;->e:J

    iput-boolean p8, p0, Lcom/google/android/gms/location/places/PlaceRequest;->f:Z

    iput-boolean p9, p0, Lcom/google/android/gms/location/places/PlaceRequest;->g:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/location/places/PlaceFilter;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/places/PlaceRequest;->b:Lcom/google/android/gms/location/places/PlaceFilter;

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/location/places/PlaceRequest;->c:J

    return-wide v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/places/PlaceRequest;->d:I

    return v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/location/places/PlaceRequest;->e:J

    return-wide v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/places/PlaceRequest;->f:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/location/places/PlaceRequest;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/location/places/PlaceRequest;

    iget-object v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->b:Lcom/google/android/gms/location/places/PlaceFilter;

    iget-object v3, p1, Lcom/google/android/gms/location/places/PlaceRequest;->b:Lcom/google/android/gms/location/places/PlaceFilter;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-wide v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->c:J

    iget-wide v4, p1, Lcom/google/android/gms/location/places/PlaceRequest;->c:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->d:I

    iget v3, p1, Lcom/google/android/gms/location/places/PlaceRequest;->d:I

    if-ne v2, v3, :cond_3

    iget-wide v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->e:J

    iget-wide v4, p1, Lcom/google/android/gms/location/places/PlaceRequest;->e:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->f:Z

    iget-boolean v3, p1, Lcom/google/android/gms/location/places/PlaceRequest;->f:Z

    if-eq v2, v3, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/places/PlaceRequest;->g:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->b:Lcom/google/android/gms/location/places/PlaceFilter;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->f:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "filter"

    iget-object v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->b:Lcom/google/android/gms/location/places/PlaceFilter;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "interval"

    iget-wide v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "priority"

    iget v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "expireAt"

    iget-wide v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "receiveFailures"

    iget-boolean v2, p0, Lcom/google/android/gms/location/places/PlaceRequest;->f:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/places/x;->a(Lcom/google/android/gms/location/places/PlaceRequest;Landroid/os/Parcel;I)V

    return-void
.end method
