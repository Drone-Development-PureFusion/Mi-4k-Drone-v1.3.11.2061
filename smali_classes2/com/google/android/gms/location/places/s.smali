.class public Lcom/google/android/gms/location/places/s;
.super Lcom/google/android/gms/location/places/internal/h$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/s$a;,
        Lcom/google/android/gms/location/places/s$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/location/places/s$b;

.field private final b:Lcom/google/android/gms/location/places/s$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/location/places/s$a;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/h$a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/places/s;->a:Lcom/google/android/gms/location/places/s$b;

    iput-object p1, p0, Lcom/google/android/gms/location/places/s;->b:Lcom/google/android/gms/location/places/s$a;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/s$b;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/h$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/location/places/s;->a:Lcom/google/android/gms/location/places/s$b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/places/s;->b:Lcom/google/android/gms/location/places/s$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/s;->a:Lcom/google/android/gms/location/places/s$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/places/s$b;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/location/places/PlacePhotoResult;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/s;->b:Lcom/google/android/gms/location/places/s$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/places/s$a;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
