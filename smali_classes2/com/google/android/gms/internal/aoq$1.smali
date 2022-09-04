.class Lcom/google/android/gms/internal/aoq$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aoq;->a()V
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

    iput-object p1, p0, Lcom/google/android/gms/internal/aoq$1;->a:Lcom/google/android/gms/internal/aoq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$1;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$1;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->b(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/app;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/app;->a()V

    :cond_0
    return-void
.end method
