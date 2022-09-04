.class public Lcom/google/android/gms/location/places/internal/j;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/location/places/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/places/PlaceFilter;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/location/places/PlaceFilter;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/location/places/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/location/places/internal/j$1;

    sget-object v1, Lcom/google/android/gms/location/places/l;->d:Lcom/google/android/gms/common/api/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/location/places/internal/j$1;-><init>(Lcom/google/android/gms/location/places/internal/j;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/places/PlaceFilter;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/places/PlaceReport;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/location/places/PlaceReport;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/location/places/internal/j$2;

    sget-object v1, Lcom/google/android/gms/location/places/l;->d:Lcom/google/android/gms/common/api/a;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/location/places/internal/j$2;-><init>(Lcom/google/android/gms/location/places/internal/j;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/places/PlaceReport;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
