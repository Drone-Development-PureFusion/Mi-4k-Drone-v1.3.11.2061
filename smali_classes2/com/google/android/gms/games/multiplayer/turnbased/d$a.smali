.class public final Lcom/google/android/gms/games/multiplayer/turnbased/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/multiplayer/turnbased/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field c:Landroid/os/Bundle;

.field d:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->a:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->c:Landroid/os/Bundle;

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->d:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/games/multiplayer/turnbased/d$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/games/multiplayer/turnbased/d$a;
    .locals 2

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    if-lez p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->a:I

    return-object p0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)Lcom/google/android/gms/games/multiplayer/turnbased/d$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->c:Landroid/os/Bundle;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/turnbased/d$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Ljava/util/ArrayList;)Lcom/google/android/gms/games/multiplayer/turnbased/d$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/games/multiplayer/turnbased/d$a;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/games/multiplayer/turnbased/d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/multiplayer/turnbased/e;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/multiplayer/turnbased/e;-><init>(Lcom/google/android/gms/games/multiplayer/turnbased/d$a;)V

    return-object v0
.end method
