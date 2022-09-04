.class Lcom/google/android/gms/internal/apu$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/apu$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/apu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/apu;

.field private b:Landroid/os/Handler;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/apu;)V
    .locals 3

    iput-object p1, p0, Lcom/google/android/gms/internal/apu$b;->a:Lcom/google/android/gms/internal/apu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/apu$b;->a:Lcom/google/android/gms/internal/apu;

    invoke-static {v1}, Lcom/google/android/gms/internal/apu;->a(Lcom/google/android/gms/internal/apu;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/apu$b$1;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/apu$b$1;-><init>(Lcom/google/android/gms/internal/apu$b;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/apu$b;->b:Landroid/os/Handler;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/apu;Lcom/google/android/gms/internal/apu$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/apu$b;-><init>(Lcom/google/android/gms/internal/apu;)V

    return-void
.end method

.method private c()Landroid/os/Message;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/apu$b;->b:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-static {}, Lcom/google/android/gms/internal/apu;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/apu$b;->b:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-static {}, Lcom/google/android/gms/internal/apu;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/apu$b;->b:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/google/android/gms/internal/apu$b;->c()Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public a(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/apu$b;->b:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-static {}, Lcom/google/android/gms/internal/apu;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/apu$b;->b:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/google/android/gms/internal/apu$b;->c()Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/apu$b;->b:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-static {}, Lcom/google/android/gms/internal/apu;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    return-void
.end method
