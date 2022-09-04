.class public Lcom/google/android/gms/internal/age;
.super Lcom/google/android/gms/cast/framework/media/a/a;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/view/View;J)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/age;->a:Landroid/view/View;

    new-instance v0, Lcom/google/android/gms/internal/age$1;

    invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/age$1;-><init>(Lcom/google/android/gms/internal/age;J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/age;->b:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/age;)Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/age;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/age;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->k()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/age;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/age;->a:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/age;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/gms/internal/age;->b:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/age;->e()V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/age;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/age;->e()V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/age;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
