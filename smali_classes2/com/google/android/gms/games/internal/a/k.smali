.class public final Lcom/google/android/gms/games/internal/a/k;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/multiplayer/realtime/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/common/api/g;",
            "T",
            "L;",
            ")",
            "Lcom/google/android/gms/internal/ail",
            "<T",
            "L;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/multiplayer/realtime/b$a;[BLjava/lang/String;Ljava/lang/String;)I
    .locals 2

    invoke-static {p1, p2}, Lcom/google/android/gms/games/internal/a/k;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v1

    invoke-virtual {v1, v0, p3, p4, p5}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ail;[BLjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;[BLjava/lang/String;)I
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/games/internal/d;->a([BLjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;[BLjava/lang/String;Ljava/lang/String;)I
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p4, v1, v2

    invoke-virtual {v0, p2, p3, v1}, Lcom/google/android/gms/games/internal/d;->a([BLjava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;[BLjava/lang/String;Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[B",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v1

    invoke-virtual {v1, p2, p3, v0}, Lcom/google/android/gms/games/internal/d;->a([BLjava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;II)Landroid/content/Intent;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p3, v1}, Lcom/google/android/gms/games/internal/d;->b(IIZ)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;IIZ)Landroid/content/Intent;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lcom/google/android/gms/games/internal/d;->b(IIZ)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/multiplayer/realtime/d;)V
    .locals 4

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/d;->a()Lcom/google/android/gms/games/multiplayer/realtime/h;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/d;->c()Lcom/google/android/gms/games/multiplayer/realtime/g;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/google/android/gms/games/internal/a/k;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/d;->d()Lcom/google/android/gms/games/multiplayer/realtime/a;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/google/android/gms/games/internal/a/k;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/games/multiplayer/realtime/d;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/multiplayer/realtime/h;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ail;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 2

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2, v1}, Lcom/google/android/gms/games/internal/d;->c(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/multiplayer/realtime/d;)V
    .locals 4

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/d;->a()Lcom/google/android/gms/games/multiplayer/realtime/h;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/d;->c()Lcom/google/android/gms/games/multiplayer/realtime/g;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/google/android/gms/games/internal/a/k;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/realtime/d;->d()Lcom/google/android/gms/games/multiplayer/realtime/a;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/google/android/gms/games/internal/a/k;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/google/android/gms/games/internal/d;->b(Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/games/multiplayer/realtime/d;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 2

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2, v1}, Lcom/google/android/gms/games/internal/d;->b(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method
