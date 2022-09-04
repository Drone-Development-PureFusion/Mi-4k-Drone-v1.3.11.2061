.class public Lcom/google/android/gms/internal/hn;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private final b:Lcom/google/android/gms/internal/hm;

.field private final c:Lcom/google/android/gms/internal/kt;

.field private final d:Z

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/kt;Lcom/google/android/gms/internal/hm;Ljava/util/concurrent/ScheduledExecutorService;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/hn;->c:Lcom/google/android/gms/internal/kt;

    iput-object p2, p0, Lcom/google/android/gms/internal/hn;->b:Lcom/google/android/gms/internal/hm;

    iput-object p3, p0, Lcom/google/android/gms/internal/hn;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/hn;->d:Z

    iput-object p5, p0, Lcom/google/android/gms/internal/hn;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/hn;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/kt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hn;->c:Lcom/google/android/gms/internal/kt;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/internal/hm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hn;->b:Lcom/google/android/gms/internal/hm;

    return-object v0
.end method

.method public c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hn;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hn;->d:Z

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hn;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hn;->f:Ljava/lang/String;

    return-object v0
.end method
