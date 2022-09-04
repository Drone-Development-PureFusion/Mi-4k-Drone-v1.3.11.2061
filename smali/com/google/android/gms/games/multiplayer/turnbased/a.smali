.class public final Lcom/google/android/gms/games/multiplayer/turnbased/a;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/games/multiplayer/a;

.field private final b:Lcom/google/android/gms/games/multiplayer/turnbased/c;

.field private final c:Lcom/google/android/gms/games/multiplayer/turnbased/c;

.field private final d:Lcom/google/android/gms/games/multiplayer/turnbased/c;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a(Landroid/os/Bundle;I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/games/multiplayer/a;

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/multiplayer/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a:Lcom/google/android/gms/games/multiplayer/a;

    :goto_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a(Landroid/os/Bundle;I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/google/android/gms/games/multiplayer/turnbased/c;

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->b:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    :goto_1
    const/4 v0, 0x2

    invoke-static {p1, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a(Landroid/os/Bundle;I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/google/android/gms/games/multiplayer/turnbased/c;

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->c:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    :goto_2
    const/4 v0, 0x3

    invoke-static {p1, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a(Landroid/os/Bundle;I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/google/android/gms/games/multiplayer/turnbased/c;

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->d:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    :goto_3
    return-void

    :cond_0
    iput-object v2, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a:Lcom/google/android/gms/games/multiplayer/a;

    goto :goto_0

    :cond_1
    iput-object v2, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->b:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    goto :goto_1

    :cond_2
    iput-object v2, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->c:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    goto :goto_2

    :cond_3
    iput-object v2, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->d:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    goto :goto_3
.end method

.method private static a(Landroid/os/Bundle;I)Lcom/google/android/gms/common/data/DataHolder;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/games/internal/b/z;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/data/DataHolder;

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/games/multiplayer/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a:Lcom/google/android/gms/games/multiplayer/a;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/games/multiplayer/turnbased/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->b:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/games/multiplayer/turnbased/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->c:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/games/multiplayer/turnbased/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->d:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    return-object v0
.end method

.method public e()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/a;->f()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a:Lcom/google/android/gms/games/multiplayer/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a:Lcom/google/android/gms/games/multiplayer/a;

    invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/a;->b()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->b:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->b:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/turnbased/c;->b()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->c:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->c:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/turnbased/c;->b()V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->d:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->d:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/turnbased/c;->b()V

    :cond_3
    return-void
.end method

.method public g()Z
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a:Lcom/google/android/gms/games/multiplayer/a;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->a:Lcom/google/android/gms/games/multiplayer/a;

    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/a;->c()I

    move-result v1

    if-lez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->b:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->b:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/turnbased/c;->c()I

    move-result v1

    if-gtz v1, :cond_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->c:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->c:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/turnbased/c;->c()I

    move-result v1

    if-gtz v1, :cond_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->d:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/a;->d:Lcom/google/android/gms/games/multiplayer/turnbased/c;

    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/turnbased/c;->c()I

    move-result v1

    if-gtz v1, :cond_0

    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method
