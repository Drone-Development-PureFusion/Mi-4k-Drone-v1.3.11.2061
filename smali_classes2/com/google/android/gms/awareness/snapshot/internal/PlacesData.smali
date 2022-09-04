.class public final Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/g;

    invoke-direct {v0}, Lcom/google/android/gms/awareness/snapshot/internal/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;->a:I

    iput-object p2, p0, Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/location/places/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;->a:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/awareness/snapshot/internal/g;->a(Lcom/google/android/gms/awareness/snapshot/internal/PlacesData;Landroid/os/Parcel;I)V

    return-void
.end method
