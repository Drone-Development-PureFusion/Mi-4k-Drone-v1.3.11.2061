.class Lcom/google/android/gms/games/internal/a/f$3;
.super Lcom/google/android/gms/games/internal/a/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/a/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/f$3;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 8

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v3, v2

    move v5, v4

    move v6, v4

    move v7, v4

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/games/internal/d;->b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Ljava/lang/String;IIIZ)V

    return-void
.end method
