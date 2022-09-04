.class public Lcom/google/android/gms/internal/agk;
.super Lcom/google/android/gms/cast/framework/media/a/a;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:I


# direct methods
.method public constructor <init>(Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/agk;->a:Landroid/view/View;

    iput p2, p0, Lcom/google/android/gms/internal/agk;->b:I

    return-void
.end method

.method private e()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agk;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agk;->a:Landroid/view/View;

    iget v1, p0, Lcom/google/android/gms/internal/agk;->b:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->n()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/agk;->a:Landroid/view/View;

    iget v1, p0, Lcom/google/android/gms/internal/agk;->b:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/agk;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/agk;->e()V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agk;->a:Landroid/view/View;

    iget v1, p0, Lcom/google/android/gms/internal/agk;->b:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/agk;->e()V

    return-void
.end method
