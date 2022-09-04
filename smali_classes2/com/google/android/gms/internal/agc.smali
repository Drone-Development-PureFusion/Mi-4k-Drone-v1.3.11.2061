.class public Lcom/google/android/gms/internal/agc;
.super Lcom/google/android/gms/cast/framework/media/a/a;

# interfaces
.implements Lcom/google/android/gms/cast/framework/media/c$d;


# instance fields
.field private final a:Landroid/widget/ProgressBar;

.field private final b:J


# direct methods
.method public constructor <init>(Landroid/widget/ProgressBar;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    iput-wide p2, p0, Lcom/google/android/gms/internal/agc;->b:J

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    long-to-int v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    long-to-int v1, p3

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agc;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/agc;->b:J

    invoke-virtual {v0, p0, v2, v3}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$d;J)Z

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->e()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->f()J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    goto :goto_0
.end method

.method public b()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agc;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agc;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$d;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public c()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agc;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agc;->a:Landroid/widget/ProgressBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    :cond_1
    return-void
.end method
