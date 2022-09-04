.class public final Lcom/google/android/gms/games/multiplayer/realtime/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/multiplayer/realtime/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/games/multiplayer/realtime/h;

.field b:Lcom/google/android/gms/games/multiplayer/realtime/g;

.field c:Lcom/google/android/gms/games/multiplayer/realtime/a;

.field d:Ljava/lang/String;

.field e:I

.field f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field g:Landroid/os/Bundle;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/games/multiplayer/realtime/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->d:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->e:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->f:Ljava/util/ArrayList;

    const-string v0, "Must provide a RoomUpdateListener"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/h;

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->a:Lcom/google/android/gms/games/multiplayer/realtime/h;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/games/multiplayer/realtime/h;Lcom/google/android/gms/games/multiplayer/realtime/d$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/multiplayer/realtime/d$a;-><init>(Lcom/google/android/gms/games/multiplayer/realtime/h;)V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/games/multiplayer/realtime/d$a;
    .locals 2

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    if-lez p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->e:I

    return-object p0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)Lcom/google/android/gms/games/multiplayer/realtime/d$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->g:Landroid/os/Bundle;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/realtime/a;)Lcom/google/android/gms/games/multiplayer/realtime/d$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->c:Lcom/google/android/gms/games/multiplayer/realtime/a;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/realtime/g;)Lcom/google/android/gms/games/multiplayer/realtime/d$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->b:Lcom/google/android/gms/games/multiplayer/realtime/g;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/d$a;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/ArrayList;)Lcom/google/android/gms/games/multiplayer/realtime/d$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/games/multiplayer/realtime/d$a;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public varargs a([Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/d$a;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->f:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/games/multiplayer/realtime/d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/multiplayer/realtime/e;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/multiplayer/realtime/e;-><init>(Lcom/google/android/gms/games/multiplayer/realtime/d$a;)V

    return-object v0
.end method
