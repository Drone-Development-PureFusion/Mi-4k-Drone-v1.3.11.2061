.class final Lcom/google/android/gms/wearable/r$1;
.super Lcom/google/android/gms/common/api/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/a$b",
        "<",
        "Lcom/google/android/gms/wearable/internal/ar;",
        "Lcom/google/android/gms/wearable/r$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Ljava/lang/Object;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/a$f;
    .locals 7

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/wearable/r$a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/wearable/r$1;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/wearable/r$a;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/wearable/internal/ar;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/wearable/r$a;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/wearable/internal/ar;
    .locals 6

    if-eqz p4, :cond_0

    :goto_0
    new-instance v0, Lcom/google/android/gms/wearable/internal/ar;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move-object v4, p6

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/wearable/internal/ar;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Lcom/google/android/gms/common/internal/s;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/wearable/r$a;

    new-instance v1, Lcom/google/android/gms/wearable/r$a$a;

    invoke-direct {v1}, Lcom/google/android/gms/wearable/r$a$a;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/r$a;-><init>(Lcom/google/android/gms/wearable/r$a$a;Lcom/google/android/gms/wearable/r$1;)V

    goto :goto_0
.end method
