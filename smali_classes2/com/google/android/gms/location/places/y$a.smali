.class public abstract Lcom/google/android/gms/location/places/y$a;
.super Lcom/google/android/gms/location/places/y$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/places/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lcom/google/android/gms/common/api/a$f;",
        ">",
        "Lcom/google/android/gms/location/places/y$b",
        "<",
        "Lcom/google/android/gms/location/places/b;",
        "TA;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/location/places/y$b;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/places/b;
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/b;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/common/data/DataHolder;->b(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/location/places/b;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/y$a;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/places/b;

    move-result-object v0

    return-object v0
.end method
