.class Lcom/google/android/gms/internal/apx$b;
.super Lcom/google/android/gms/internal/ape$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/apx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/apx;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/apx;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/apx$b;->a:Lcom/google/android/gms/internal/apx;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ape$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/apx;Lcom/google/android/gms/internal/apx$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/apx$b;-><init>(Lcom/google/android/gms/internal/apx;)V

    return-void
.end method


# virtual methods
.method public a(ZLjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/apx$b;->a:Lcom/google/android/gms/internal/apx;

    invoke-static {v0}, Lcom/google/android/gms/internal/apx;->e(Lcom/google/android/gms/internal/apx;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/apx$b$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/apx$b$1;-><init>(Lcom/google/android/gms/internal/apx$b;ZLjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
