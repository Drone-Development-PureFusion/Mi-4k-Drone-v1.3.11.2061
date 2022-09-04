.class Lcom/google/android/gms/location/places/internal/d$4;
.super Lcom/google/android/gms/location/places/y$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/places/internal/d;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/location/places/AutocompleteFilter;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/location/places/y$a",
        "<",
        "Lcom/google/android/gms/location/places/internal/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/maps/model/LatLngBounds;

.field final synthetic c:Lcom/google/android/gms/location/places/AutocompleteFilter;

.field final synthetic d:Lcom/google/android/gms/location/places/internal/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/places/internal/d;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/location/places/AutocompleteFilter;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/d$4;->d:Lcom/google/android/gms/location/places/internal/d;

    iput-object p4, p0, Lcom/google/android/gms/location/places/internal/d$4;->a:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/location/places/internal/d$4;->b:Lcom/google/android/gms/maps/model/LatLngBounds;

    iput-object p6, p0, Lcom/google/android/gms/location/places/internal/d$4;->c:Lcom/google/android/gms/location/places/AutocompleteFilter;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/location/places/y$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/places/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/internal/d$4;->a(Lcom/google/android/gms/location/places/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/location/places/internal/e;)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/location/places/y;

    invoke-direct {v0, p0}, Lcom/google/android/gms/location/places/y;-><init>(Lcom/google/android/gms/location/places/y$a;)V

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/d$4;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/d$4;->b:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v3, p0, Lcom/google/android/gms/location/places/internal/d$4;->c:Lcom/google/android/gms/location/places/AutocompleteFilter;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/google/android/gms/location/places/internal/e;->a(Lcom/google/android/gms/location/places/y;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/location/places/AutocompleteFilter;)V

    return-void
.end method
