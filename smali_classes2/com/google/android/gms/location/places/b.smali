.class public Lcom/google/android/gms/location/places/b;
.super Lcom/google/android/gms/common/data/a;

# interfaces
.implements Lcom/google/android/gms/common/api/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/a",
        "<",
        "Lcom/google/android/gms/location/places/a;",
        ">;",
        "Lcom/google/android/gms/common/api/m;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/data/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/b;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->e()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/location/places/n;->c(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/b;->b(I)Lcom/google/android/gms/location/places/a;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/location/places/a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/internal/b;

    iget-object v1, p0, Lcom/google/android/gms/location/places/b;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/location/places/internal/b;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/b;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
