.class Lcom/google/android/gms/location/places/internal/p$1;
.super Lcom/google/android/gms/location/places/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/places/internal/p;->a(Lcom/google/android/gms/common/api/g;II)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/location/places/s$a",
        "<",
        "Lcom/google/android/gms/location/places/internal/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/google/android/gms/location/places/internal/p;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/places/internal/p;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/p$1;->c:Lcom/google/android/gms/location/places/internal/p;

    iput p4, p0, Lcom/google/android/gms/location/places/internal/p$1;->a:I

    iput p5, p0, Lcom/google/android/gms/location/places/internal/p$1;->b:I

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/location/places/s$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/places/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/internal/p$1;->a(Lcom/google/android/gms/location/places/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/location/places/internal/e;)V
    .locals 6

    new-instance v1, Lcom/google/android/gms/location/places/s;

    invoke-direct {v1, p0}, Lcom/google/android/gms/location/places/s;-><init>(Lcom/google/android/gms/location/places/s$a;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/p$1;->c:Lcom/google/android/gms/location/places/internal/p;

    invoke-static {v0}, Lcom/google/android/gms/location/places/internal/p;->a(Lcom/google/android/gms/location/places/internal/p;)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/location/places/internal/p$1;->a:I

    iget v4, p0, Lcom/google/android/gms/location/places/internal/p$1;->b:I

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/p$1;->c:Lcom/google/android/gms/location/places/internal/p;

    invoke-static {v0}, Lcom/google/android/gms/location/places/internal/p;->b(Lcom/google/android/gms/location/places/internal/p;)I

    move-result v5

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/location/places/internal/e;->a(Lcom/google/android/gms/location/places/s;Ljava/lang/String;III)V

    return-void
.end method
