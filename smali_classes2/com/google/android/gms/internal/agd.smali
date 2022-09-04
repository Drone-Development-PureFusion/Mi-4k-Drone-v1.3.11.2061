.class public Lcom/google/android/gms/internal/agd;
.super Lcom/google/android/gms/cast/framework/media/a/a;

# interfaces
.implements Lcom/google/android/gms/cast/framework/media/c$d;


# instance fields
.field private final a:Landroid/widget/SeekBar;

.field private final b:J

.field private final c:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/widget/SeekBar;JLandroid/widget/SeekBar$OnSeekBarChangeListener;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/agd;->d:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    iput-wide p2, p0, Lcom/google/android/gms/internal/agd;->b:J

    new-instance v0, Lcom/google/android/gms/internal/agd$1;

    invoke-direct {v0, p0, p4}, Lcom/google/android/gms/internal/agd$1;-><init>(Lcom/google/android/gms/internal/agd;Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/agd;->c:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agd;)Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agd;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(JJ)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agd;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    long-to-int v1, p3

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    long-to-int v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/google/android/gms/internal/agd;->c:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agd;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/agd;->b:J

    invoke-virtual {v0, p0, v2, v3}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$d;J)Z

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->e()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->f()J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->setMax(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/agd;->d:Z

    return-void
.end method

.method public b()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agd;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agd;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$d;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agd;->a:Landroid/widget/SeekBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/agd;->d:Z

    return v0
.end method
