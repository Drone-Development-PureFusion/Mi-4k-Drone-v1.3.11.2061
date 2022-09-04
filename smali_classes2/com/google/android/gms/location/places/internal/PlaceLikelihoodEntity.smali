.class public Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/location/places/g;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Lcom/google/android/gms/location/places/internal/PlaceEntity;

.field final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/places/internal/m;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/internal/m;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/location/places/internal/PlaceEntity;F)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->a:I

    iput-object p2, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->b:Lcom/google/android/gms/location/places/internal/PlaceEntity;

    iput p3, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->c:F

    return-void
.end method

.method public static a(Lcom/google/android/gms/location/places/internal/PlaceEntity;F)Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;
    .locals 3

    new-instance v1, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;

    const/4 v2, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/internal/PlaceEntity;

    invoke-direct {v1, v2, v0, p1}, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;-><init>(ILcom/google/android/gms/location/places/internal/PlaceEntity;F)V

    return-object v1
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->e()Lcom/google/android/gms/location/places/g;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->c:F

    return v0
.end method

.method public d()Lcom/google/android/gms/location/places/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->b:Lcom/google/android/gms/location/places/internal/PlaceEntity;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/location/places/g;
    .locals 0

    return-object p0
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
    instance-of v2, p1, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->b:Lcom/google/android/gms/location/places/internal/PlaceEntity;

    iget-object v3, p1, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->b:Lcom/google/android/gms/location/places/internal/PlaceEntity;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/location/places/internal/PlaceEntity;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget v2, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->c:F

    iget v3, p1, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->c:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->b:Lcom/google/android/gms/location/places/internal/PlaceEntity;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->c:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "place"

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->b:Lcom/google/android/gms/location/places/internal/PlaceEntity;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "likelihood"

    iget v2, p0, Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;->c:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/places/internal/m;->a(Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;Landroid/os/Parcel;I)V

    return-void
.end method
