.class public Lcom/google/android/gms/internal/agf;
.super Lcom/google/android/gms/cast/framework/media/a/a;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:I

.field private final c:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/view/View;I)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/agf;->a:Landroid/view/View;

    iput p2, p0, Lcom/google/android/gms/internal/agf;->b:I

    new-instance v0, Lcom/google/android/gms/internal/agf$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/agf$1;-><init>(Lcom/google/android/gms/internal/agf;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/agf;->c:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agf;)Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agf;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agf;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->o()I

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->l()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/cast/MediaStatus;->e(I)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->q()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v4, v0, :cond_2

    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lcom/google/android/gms/cast/framework/media/c;->u()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/agf;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agf;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agf;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/agf;->a:Landroid/view/View;

    iget v1, p0, Lcom/google/android/gms/internal/agf;->b:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agf;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agf;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agf;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/gms/internal/agf;->c:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/agf;->e()V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agf;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/agf;->e()V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agf;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
