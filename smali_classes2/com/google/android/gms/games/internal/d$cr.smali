.class final Lcom/google/android/gms/games/internal/d$cr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cr"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ail$c",
        "<",
        "Lcom/google/android/gms/games/multiplayer/turnbased/b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$cr;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/turnbased/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cr;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/turnbased/b;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/d$cr;->a(Lcom/google/android/gms/games/multiplayer/turnbased/b;)V

    return-void
.end method
