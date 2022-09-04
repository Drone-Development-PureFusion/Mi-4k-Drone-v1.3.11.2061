.class Lcom/google/android/gms/internal/ahy$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ahy;->i()Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic d:Lcom/google/android/gms/internal/aiu;

.field final synthetic e:Lcom/google/android/gms/internal/ahy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ahy;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/aiu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ahy$2;->e:Lcom/google/android/gms/internal/ahy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ahy$2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lcom/google/android/gms/internal/ahy$2;->d:Lcom/google/android/gms/internal/aiu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy$2;->e:Lcom/google/android/gms/internal/ahy;

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy$2;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/g;

    iget-object v2, p0, Lcom/google/android/gms/internal/ahy$2;->d:Lcom/google/android/gms/internal/aiu;

    const/4 v3, 0x1

    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/internal/ahy;->a(Lcom/google/android/gms/internal/ahy;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/aiu;Z)V

    return-void
.end method
