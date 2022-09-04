.class Lcom/google/android/gms/location/places/internal/j$2;
.super Lcom/google/android/gms/location/places/y$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/places/internal/j;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/places/PlaceReport;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/location/places/y$f",
        "<",
        "Lcom/google/android/gms/location/places/internal/k;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/location/places/PlaceReport;

.field final synthetic b:Lcom/google/android/gms/location/places/internal/j;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/places/internal/j;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/places/PlaceReport;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/j$2;->b:Lcom/google/android/gms/location/places/internal/j;

    iput-object p4, p0, Lcom/google/android/gms/location/places/internal/j$2;->a:Lcom/google/android/gms/location/places/PlaceReport;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/location/places/y$f;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/places/internal/k;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/internal/j$2;->a(Lcom/google/android/gms/location/places/internal/k;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/location/places/internal/k;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/y;

    invoke-direct {v0, p0}, Lcom/google/android/gms/location/places/y;-><init>(Lcom/google/android/gms/location/places/y$f;)V

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/j$2;->a:Lcom/google/android/gms/location/places/PlaceReport;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/places/internal/k;->a(Lcom/google/android/gms/location/places/y;Lcom/google/android/gms/location/places/PlaceReport;)V

    return-void
.end method
