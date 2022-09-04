.class Lcom/google/android/gms/internal/aoq$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aoq;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aoq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aoq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aoq$2;->a:Lcom/google/android/gms/internal/aoq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$2;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->c(Lcom/google/android/gms/internal/aoq;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/aoq$d;

    iget-object v2, p0, Lcom/google/android/gms/internal/aoq$2;->a:Lcom/google/android/gms/internal/aoq;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/aoq$d;-><init>(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/aoq$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
