.class public Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/api/m;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Lcom/google/android/gms/common/data/DataHolder;

.field private final c:Lcom/google/android/gms/common/api/Status;

.field private final d:Lcom/google/android/gms/location/places/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/places/u;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/u;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;->a:I

    iput-object p2, p0, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;->c:Lcom/google/android/gms/common/api/Status;

    iput-object p3, p0, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;->b:Lcom/google/android/gms/common/data/DataHolder;

    if-nez p3, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;->d:Lcom/google/android/gms/location/places/j;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/location/places/j;

    iget-object v1, p0, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;->b:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1}, Lcom/google/android/gms/location/places/j;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;->d:Lcom/google/android/gms/location/places/j;

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;-><init>(ILcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;->c:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/location/places/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;->d:Lcom/google/android/gms/location/places/j;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/places/u;->a(Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;Landroid/os/Parcel;I)V

    return-void
.end method
