.class Lcom/google/android/gms/location/places/internal/d$3;
.super Lcom/google/android/gms/location/places/y$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/places/internal/d;->a(Lcom/google/android/gms/common/api/g;[Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/location/places/y$c",
        "<",
        "Lcom/google/android/gms/location/places/internal/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/location/places/internal/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/places/internal/d;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/d$3;->b:Lcom/google/android/gms/location/places/internal/d;

    iput-object p4, p0, Lcom/google/android/gms/location/places/internal/d$3;->a:[Ljava/lang/String;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/location/places/y$c;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/places/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/internal/d$3;->a(Lcom/google/android/gms/location/places/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/location/places/internal/e;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/d$3;->a:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/location/places/y;

    invoke-direct {v1, p0}, Lcom/google/android/gms/location/places/y;-><init>(Lcom/google/android/gms/location/places/y$c;)V

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/location/places/internal/e;->a(Lcom/google/android/gms/location/places/y;Ljava/util/List;)V

    return-void
.end method
