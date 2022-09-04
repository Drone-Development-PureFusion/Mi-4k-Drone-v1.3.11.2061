.class Lcom/google/android/gms/games/internal/a/p$9;
.super Lcom/google/android/gms/games/internal/a/p$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/p;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;[B[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:[B

.field final synthetic c:[Lcom/google/android/gms/games/multiplayer/ParticipantResult;

.field final synthetic d:Lcom/google/android/gms/games/internal/a/p;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/p;Lcom/google/android/gms/common/api/g;Ljava/lang/String;[B[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/p$9;->d:Lcom/google/android/gms/games/internal/a/p;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/a/p$9;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/games/internal/a/p$9;->b:[B

    iput-object p5, p0, Lcom/google/android/gms/games/internal/a/p$9;->c:[Lcom/google/android/gms/games/multiplayer/ParticipantResult;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/games/internal/a/p$f;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/p$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/p$9;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/p$9;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/a/p$9;->b:[B

    iget-object v2, p0, Lcom/google/android/gms/games/internal/a/p$9;->c:[Lcom/google/android/gms/games/multiplayer/ParticipantResult;

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;[B[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)V

    return-void
.end method
