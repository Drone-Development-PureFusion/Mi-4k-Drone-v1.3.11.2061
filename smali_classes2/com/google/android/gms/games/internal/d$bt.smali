.class final Lcom/google/android/gms/games/internal/d$bt;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "bt"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ail$c",
        "<",
        "Lcom/google/android/gms/games/multiplayer/realtime/h;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/internal/d$bt;->a:I

    iput-object p2, p0, Lcom/google/android/gms/games/internal/d$bt;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/realtime/h;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/games/internal/d$bt;->a:I

    iget-object v1, p0, Lcom/google/android/gms/games/internal/d$bt;->b:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/games/multiplayer/realtime/h;->a(ILjava/lang/String;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/h;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/d$bt;->a(Lcom/google/android/gms/games/multiplayer/realtime/h;)V

    return-void
.end method
