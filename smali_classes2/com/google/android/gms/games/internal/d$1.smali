.class Lcom/google/android/gms/games/internal/d$1;
.super Lcom/google/android/gms/games/internal/d/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/games/internal/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$1;->a:Lcom/google/android/gms/games/internal/d;

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/d/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/games/internal/d/a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/internal/d$ap;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/d$1;->a:Lcom/google/android/gms/games/internal/d;

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/internal/d$ap;-><init>(Lcom/google/android/gms/games/internal/d;)V

    return-object v0
.end method
