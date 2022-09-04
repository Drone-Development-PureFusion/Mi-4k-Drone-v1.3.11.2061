.class Lcom/google/android/gms/internal/gu$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/gu;->b(Lcom/google/android/gms/internal/hy$b;)Lcom/google/firebase/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hy$b;

.field final synthetic b:Lcom/google/android/gms/internal/gu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gu;Lcom/google/android/gms/internal/hy$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gu$3;->b:Lcom/google/android/gms/internal/gu;

    iput-object p2, p0, Lcom/google/android/gms/internal/gu$3;->a:Lcom/google/android/gms/internal/hy$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/mr;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/internal/mr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/gu$3;->b:Lcom/google/android/gms/internal/gu;

    invoke-static {v0}, Lcom/google/android/gms/internal/gu;->a(Lcom/google/android/gms/internal/gu;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/gu$3$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/gu$3$1;-><init>(Lcom/google/android/gms/internal/gu$3;Lcom/google/android/gms/internal/mr;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
