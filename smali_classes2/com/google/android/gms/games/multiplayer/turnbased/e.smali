.class public final Lcom/google/android/gms/games/multiplayer/turnbased/e;
.super Lcom/google/android/gms/games/multiplayer/turnbased/d;


# instance fields
.field private final a:I

.field private final b:[Ljava/lang/String;

.field private final c:Landroid/os/Bundle;

.field private final d:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/multiplayer/turnbased/d$a;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/d;-><init>()V

    iget v0, p1, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->a:I

    iput v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/e;->a:I

    iget v0, p1, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->d:I

    iput v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/e;->d:I

    iget-object v0, p1, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->c:Landroid/os/Bundle;

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/e;->c:Landroid/os/Bundle;

    iget-object v0, p1, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p1, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;->b:Ljava/util/ArrayList;

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/e;->b:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/e;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/e;->d:I

    return v0
.end method

.method public c()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/e;->b:[Ljava/lang/String;

    return-object v0
.end method

.method public d()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/e;->c:Landroid/os/Bundle;

    return-object v0
.end method
