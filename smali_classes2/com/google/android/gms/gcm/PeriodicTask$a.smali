.class public Lcom/google/android/gms/gcm/PeriodicTask$a;
.super Lcom/google/android/gms/gcm/Task$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/gcm/PeriodicTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private i:J

.field private j:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-direct {p0}, Lcom/google/android/gms/gcm/Task$a;-><init>()V

    iput-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->i:J

    iput-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->j:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->e:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/gcm/PeriodicTask$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->i:J

    return-wide v0
.end method

.method static synthetic b(Lcom/google/android/gms/gcm/PeriodicTask$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->j:J

    return-wide v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/gcm/PeriodicTask$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->a:I

    return-object p0
.end method

.method public a(J)Lcom/google/android/gms/gcm/PeriodicTask$a;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->i:J

    return-object p0
.end method

.method public a(Landroid/os/Bundle;)Lcom/google/android/gms/gcm/PeriodicTask$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->h:Landroid/os/Bundle;

    return-object p0
.end method

.method public a(Ljava/lang/Class;)Lcom/google/android/gms/gcm/PeriodicTask$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/gcm/GcmTaskService;",
            ">;)",
            "Lcom/google/android/gms/gcm/PeriodicTask$a;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/gcm/PeriodicTask$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/gcm/PeriodicTask$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->f:Z

    return-object p0
.end method

.method protected a()V
    .locals 6

    const-wide/16 v4, -0x1

    invoke-super {p0}, Lcom/google/android/gms/gcm/Task$a;->a()V

    iget-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->i:J

    cmp-long v0, v0, v4

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must call setPeriod(long) to establish an execution interval for this periodic task."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->i:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    iget-wide v2, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->i:J

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v4, 0x42

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Period set cannot be less than or equal to 0: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->j:J

    cmp-long v0, v0, v4

    if-nez v0, :cond_3

    iget-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->i:J

    long-to-float v0, v0

    const v1, 0x3dcccccd    # 0.1f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    iput-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->j:J

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->j:J

    iget-wide v2, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->i:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->i:J

    iput-wide v0, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->j:J

    goto :goto_0
.end method

.method public b(J)Lcom/google/android/gms/gcm/PeriodicTask$a;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->j:J

    return-object p0
.end method

.method public b(Z)Lcom/google/android/gms/gcm/PeriodicTask$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->e:Z

    return-object p0
.end method

.method public b()Lcom/google/android/gms/gcm/PeriodicTask;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/gcm/PeriodicTask$a;->a()V

    new-instance v0, Lcom/google/android/gms/gcm/PeriodicTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/gcm/PeriodicTask;-><init>(Lcom/google/android/gms/gcm/PeriodicTask$a;Lcom/google/android/gms/gcm/PeriodicTask$1;)V

    return-object v0
.end method

.method public synthetic b(I)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/PeriodicTask$a;->a(I)Lcom/google/android/gms/gcm/PeriodicTask$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Landroid/os/Bundle;)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/PeriodicTask$a;->a(Landroid/os/Bundle;)Lcom/google/android/gms/gcm/PeriodicTask$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/lang/Class;)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/PeriodicTask$a;->a(Ljava/lang/Class;)Lcom/google/android/gms/gcm/PeriodicTask$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/lang/String;)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/PeriodicTask$a;->a(Ljava/lang/String;)Lcom/google/android/gms/gcm/PeriodicTask$a;

    move-result-object v0

    return-object v0
.end method

.method public c(Z)Lcom/google/android/gms/gcm/PeriodicTask$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/gcm/PeriodicTask$a;->d:Z

    return-object p0
.end method

.method public synthetic c()Lcom/google/android/gms/gcm/Task;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/gcm/PeriodicTask$a;->b()Lcom/google/android/gms/gcm/PeriodicTask;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Z)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/PeriodicTask$a;->b(Z)Lcom/google/android/gms/gcm/PeriodicTask$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic e(Z)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/PeriodicTask$a;->c(Z)Lcom/google/android/gms/gcm/PeriodicTask$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic f(Z)Lcom/google/android/gms/gcm/Task$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/gcm/PeriodicTask$a;->a(Z)Lcom/google/android/gms/gcm/PeriodicTask$a;

    move-result-object v0

    return-object v0
.end method
