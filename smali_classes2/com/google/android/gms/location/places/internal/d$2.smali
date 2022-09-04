.class Lcom/google/android/gms/location/places/internal/d$2;
.super Lcom/google/android/gms/location/places/s$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/places/internal/d;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/location/places/s$b",
        "<",
        "Lcom/google/android/gms/location/places/internal/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/location/places/internal/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/places/internal/d;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/d$2;->b:Lcom/google/android/gms/location/places/internal/d;

    iput-object p4, p0, Lcom/google/android/gms/location/places/internal/d$2;->a:Ljava/lang/String;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/location/places/s$b;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/places/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/internal/d$2;->a(Lcom/google/android/gms/location/places/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/location/places/internal/e;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/s;

    invoke-direct {v0, p0}, Lcom/google/android/gms/location/places/s;-><init>(Lcom/google/android/gms/location/places/s$b;)V

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/d$2;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/places/internal/e;->a(Lcom/google/android/gms/location/places/s;Ljava/lang/String;)V

    return-void
.end method
