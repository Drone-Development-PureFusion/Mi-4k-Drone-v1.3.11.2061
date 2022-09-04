.class Lcom/google/android/gms/internal/fk$b;
.super Lcom/google/android/gms/internal/fk;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/fk;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fk$b;->a:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/fk$a;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/fk$b;->a:Landroid/os/Handler;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/fk$a;->b()Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
