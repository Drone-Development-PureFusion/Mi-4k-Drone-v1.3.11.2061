.class final Lcom/google/android/gms/games/internal/d$dt;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "dt"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ail$c",
        "<",
        "Lcom/google/android/gms/games/multiplayer/realtime/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:I


# direct methods
.method constructor <init>(IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/internal/d$dt;->a:I

    iput p2, p0, Lcom/google/android/gms/games/internal/d$dt;->c:I

    iput-object p3, p0, Lcom/google/android/gms/games/internal/d$dt;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/realtime/b$a;)V
    .locals 3

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/games/internal/d$dt;->a:I

    iget v1, p0, Lcom/google/android/gms/games/internal/d$dt;->c:I

    iget-object v2, p0, Lcom/google/android/gms/games/internal/d$dt;->b:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/games/multiplayer/realtime/b$a;->a(IILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/b$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/d$dt;->a(Lcom/google/android/gms/games/multiplayer/realtime/b$a;)V

    return-void
.end method
