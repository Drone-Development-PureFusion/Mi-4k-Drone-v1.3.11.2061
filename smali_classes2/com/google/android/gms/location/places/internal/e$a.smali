.class public Lcom/google/android/gms/location/places/internal/e$a;
.super Lcom/google/android/gms/common/api/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/places/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/a$b",
        "<",
        "Lcom/google/android/gms/location/places/internal/e;",
        "Lcom/google/android/gms/location/places/m;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Ljava/lang/Object;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/a$f;
    .locals 7

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/location/places/m;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/location/places/internal/e$a;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/location/places/m;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/location/places/internal/e;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/location/places/m;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/location/places/internal/e;
    .locals 9

    if-nez p4, :cond_1

    new-instance v0, Lcom/google/android/gms/location/places/m$a;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/m$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/location/places/m$a;->a()Lcom/google/android/gms/location/places/m;

    move-result-object v7

    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    iget-object v0, v7, Lcom/google/android/gms/location/places/m;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v6, v7, Lcom/google/android/gms/location/places/m;->a:Ljava/lang/String;

    :cond_0
    new-instance v0, Lcom/google/android/gms/location/places/internal/e;

    const/4 v8, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/location/places/internal/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/location/places/m;Lcom/google/android/gms/location/places/internal/e$1;)V

    return-object v0

    :cond_1
    move-object v7, p4

    goto :goto_0
.end method
