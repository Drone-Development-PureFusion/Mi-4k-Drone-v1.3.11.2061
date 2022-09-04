.class Lcom/google/firebase/appindexing/internal/c$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/g/b;
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/appindexing/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/g/b",
        "<",
        "Ljava/lang/Void;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static a:I

.field public static b:J

.field public static c:D

.field public static d:D


# instance fields
.field private final e:Lcom/google/android/gms/common/api/u;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/u",
            "<*>;"
        }
    .end annotation
.end field

.field private final f:Landroid/os/Handler;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private g:Lcom/google/android/gms/g/f;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xa

    sput v0, Lcom/google/firebase/appindexing/internal/c$c;->a:I

    const-wide/16 v0, 0xfa

    sput-wide v0, Lcom/google/firebase/appindexing/internal/c$c;->b:J

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    sput-wide v0, Lcom/google/firebase/appindexing/internal/c$c;->c:D

    const-wide/high16 v0, 0x3fd0000000000000L    # 0.25

    sput-wide v0, Lcom/google/firebase/appindexing/internal/c$c;->d:D

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/u;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/common/api/u;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/u",
            "<*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/appindexing/internal/c$c;->g:Lcom/google/android/gms/g/f;

    iput-object p1, p0, Lcom/google/firebase/appindexing/internal/c$c;->e:Lcom/google/android/gms/common/api/u;

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/u;->h()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/firebase/appindexing/internal/c$c;->f:Landroid/os/Handler;

    return-void
.end method

.method static a(I)J
    .locals 8

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    sget-wide v0, Lcom/google/firebase/appindexing/internal/c$c;->b:J

    long-to-double v0, v0

    sget-wide v2, Lcom/google/firebase/appindexing/internal/c$c;->c:D

    int-to-double v4, p0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    mul-double/2addr v0, v2

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v2, v4

    sub-double/2addr v2, v6

    sget-wide v4, Lcom/google/firebase/appindexing/internal/c$c;->d:D

    mul-double/2addr v2, v4

    add-double/2addr v2, v6

    mul-double/2addr v0, v2

    double-to-long v0, v0

    return-wide v0
.end method

.method static synthetic a(Lcom/google/firebase/appindexing/internal/c$c;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/c$c;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private a(Lcom/google/firebase/appindexing/internal/c$b;Lcom/google/android/gms/g/g;I)V
    .locals 2
    .param p1    # Lcom/google/firebase/appindexing/internal/c$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/g;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/appindexing/internal/c$b;",
            "Lcom/google/android/gms/g/g",
            "<",
            "Ljava/lang/Void;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/c$c;->e:Lcom/google/android/gms/common/api/u;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/u;->b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/appindexing/internal/c$c$1;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/google/firebase/appindexing/internal/c$c$1;-><init>(Lcom/google/firebase/appindexing/internal/c$c;ILcom/google/firebase/appindexing/internal/c$b;Lcom/google/android/gms/g/g;)V

    invoke-virtual {v0, p0, v1}, Lcom/google/android/gms/g/f;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/b;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method static synthetic a(Lcom/google/firebase/appindexing/internal/c$c;Lcom/google/firebase/appindexing/internal/c$b;Lcom/google/android/gms/g/g;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/appindexing/internal/c$c;->a(Lcom/google/firebase/appindexing/internal/c$b;Lcom/google/android/gms/g/g;I)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/g/f;)Z
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/appindexing/internal/c$c;->c(Lcom/google/android/gms/g/f;)Z

    move-result v0

    return v0
.end method

.method private static c(Lcom/google/android/gms/g/f;)Z
    .locals 1
    .param p0    # Lcom/google/android/gms/g/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/g/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/g/f;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v0

    invoke-static {v0}, Lcom/google/firebase/appindexing/internal/d;->a(I)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/firebase/appindexing/internal/c$b;)Lcom/google/android/gms/g/f;
    .locals 4
    .param p1    # Lcom/google/firebase/appindexing/internal/c$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/appindexing/internal/c$b;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/g;

    invoke-direct {v0}, Lcom/google/android/gms/g/g;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v1

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/google/firebase/appindexing/internal/c$c;->g:Lcom/google/android/gms/g/f;

    iput-object v1, p0, Lcom/google/firebase/appindexing/internal/c$c;->g:Lcom/google/android/gms/g/f;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, p0, p0}, Lcom/google/android/gms/g/f;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/b;)Lcom/google/android/gms/g/f;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v2}, Lcom/google/firebase/appindexing/internal/c$c;->a(Lcom/google/firebase/appindexing/internal/c$b;Lcom/google/android/gms/g/g;I)V

    :goto_0
    return-object v1

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    new-instance v3, Lcom/google/firebase/appindexing/internal/c$c$2;

    invoke-direct {v3, p0, p1, v0}, Lcom/google/firebase/appindexing/internal/c$c$2;-><init>(Lcom/google/firebase/appindexing/internal/c$c;Lcom/google/firebase/appindexing/internal/c$b;Lcom/google/android/gms/g/g;)V

    invoke-virtual {v2, p0, v3}, Lcom/google/android/gms/g/f;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/b;)Lcom/google/android/gms/g/f;

    goto :goto_0
.end method

.method public declared-synchronized a(Lcom/google/android/gms/g/f;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/g/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/c$c;->g:Lcom/google/android/gms/g/f;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/appindexing/internal/c$c;->g:Lcom/google/android/gms/g/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/appindexing/internal/c$c;->f:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
