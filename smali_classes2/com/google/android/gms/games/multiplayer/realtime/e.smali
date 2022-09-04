.class public final Lcom/google/android/gms/games/multiplayer/realtime/e;
.super Lcom/google/android/gms/games/multiplayer/realtime/d;


# instance fields
.field private final a:Lcom/google/android/gms/games/multiplayer/realtime/h;

.field private final b:Lcom/google/android/gms/games/multiplayer/realtime/g;

.field private final c:Lcom/google/android/gms/games/multiplayer/realtime/a;

.field private final d:Ljava/lang/String;

.field private final e:I

.field private final f:[Ljava/lang/String;

.field private final g:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/multiplayer/realtime/d$a;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/games/multiplayer/realtime/d;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->a:Lcom/google/android/gms/games/multiplayer/realtime/h;

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->a:Lcom/google/android/gms/games/multiplayer/realtime/h;

    iget-object v0, p1, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->b:Lcom/google/android/gms/games/multiplayer/realtime/g;

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->b:Lcom/google/android/gms/games/multiplayer/realtime/g;

    iget-object v0, p1, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->c:Lcom/google/android/gms/games/multiplayer/realtime/a;

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->c:Lcom/google/android/gms/games/multiplayer/realtime/a;

    iget-object v0, p1, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->d:Ljava/lang/String;

    iget v0, p1, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->e:I

    iput v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->e:I

    iget-object v0, p1, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->g:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->g:Landroid/os/Bundle;

    iget-object v0, p1, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p1, Lcom/google/android/gms/games/multiplayer/realtime/d$a;->f:Ljava/util/ArrayList;

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->f:[Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->c:Lcom/google/android/gms/games/multiplayer/realtime/a;

    const-string v1, "Must specify a message listener"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/games/multiplayer/realtime/h;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->a:Lcom/google/android/gms/games/multiplayer/realtime/h;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/games/multiplayer/realtime/g;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->b:Lcom/google/android/gms/games/multiplayer/realtime/g;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/games/multiplayer/realtime/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->c:Lcom/google/android/gms/games/multiplayer/realtime/a;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->e:I

    return v0
.end method

.method public f()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->f:[Ljava/lang/String;

    return-object v0
.end method

.method public g()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/e;->g:Landroid/os/Bundle;

    return-object v0
.end method
