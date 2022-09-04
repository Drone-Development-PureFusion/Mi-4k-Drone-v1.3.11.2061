.class Lcom/google/android/gms/games/internal/a/l$4;
.super Lcom/google/android/gms/games/internal/a/l$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/a/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/l$4;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 7

    const/4 v4, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v3, v2

    move-object v5, v2

    move v6, v4

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;[Ljava/lang/String;I[BI)V

    return-void
.end method
