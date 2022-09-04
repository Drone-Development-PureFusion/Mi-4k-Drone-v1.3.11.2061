.class Lcom/google/android/gms/internal/sv$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/sv;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/abd;

.field final synthetic b:Lcom/google/android/gms/internal/sv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/sv;Lcom/google/android/gms/internal/abd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/sv$1;->b:Lcom/google/android/gms/internal/sv;

    iput-object p2, p0, Lcom/google/android/gms/internal/sv$1;->a:Lcom/google/android/gms/internal/abd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/sv$1;->b:Lcom/google/android/gms/internal/sv;

    invoke-static {v0}, Lcom/google/android/gms/internal/sv;->a(Lcom/google/android/gms/internal/sv;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/sv$1;->a:Lcom/google/android/gms/internal/abd;

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
