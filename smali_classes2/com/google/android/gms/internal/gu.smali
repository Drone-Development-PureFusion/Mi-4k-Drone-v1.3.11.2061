.class public Lcom/google/android/gms/internal/gu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hy;


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private final b:Lcom/google/firebase/b;


# direct methods
.method public constructor <init>(Lcom/google/firebase/b;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0
    .param p1    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gu;->b:Lcom/google/firebase/b;

    iput-object p2, p0, Lcom/google/android/gms/internal/gu;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/gu;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gu;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method private b(Lcom/google/android/gms/internal/hy$b;)Lcom/google/firebase/b$a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/gu$3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/gu$3;-><init>(Lcom/google/android/gms/internal/gu;Lcom/google/android/gms/internal/hy$b;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/hy$b;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gu;->b(Lcom/google/android/gms/internal/hy$b;)Lcom/google/firebase/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/gu;->b:Lcom/google/firebase/b;

    invoke-virtual {v1, v0}, Lcom/google/firebase/b;->a(Lcom/google/firebase/b$a;)V

    return-void
.end method

.method public a(ZLcom/google/android/gms/internal/hy$a;)V
    .locals 3
    .param p2    # Lcom/google/android/gms/internal/hy$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/gu;->b:Lcom/google/firebase/b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/b;->b(Z)Lcom/google/android/gms/g/f;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/gu;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/google/android/gms/internal/gu$2;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/gu$2;-><init>(Lcom/google/android/gms/internal/gu;Lcom/google/android/gms/internal/hy$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/g/f;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/gu;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/google/android/gms/internal/gu$1;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/gu$1;-><init>(Lcom/google/android/gms/internal/gu;Lcom/google/android/gms/internal/hy$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/g/f;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;

    return-void
.end method
