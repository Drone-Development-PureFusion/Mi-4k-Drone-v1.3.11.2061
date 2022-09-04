.class final Lcom/google/android/gms/games/internal/d$du;
.super Lcom/google/android/gms/games/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "du"
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ail;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/b$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$du;->a:Lcom/google/android/gms/internal/ail;

    return-void
.end method


# virtual methods
.method public a(IILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$du;->a:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$du;->a:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$dt;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/android/gms/games/internal/d$dt;-><init>(IILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method
