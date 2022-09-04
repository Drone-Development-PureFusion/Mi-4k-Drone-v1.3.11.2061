.class public Lcom/google/android/gms/internal/agi;
.super Lcom/google/android/gms/cast/framework/media/a/a;

# interfaces
.implements Lcom/google/android/gms/cast/framework/media/c$d;


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/agi;->a:Landroid/widget/TextView;

    iput-object p2, p0, Lcom/google/android/gms/internal/agi;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/agi;->c:Landroid/view/View;

    return-void
.end method

.method private a(JZ)V
    .locals 5

    const/4 v4, 0x4

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agi;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->k()Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz p3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->f()J

    move-result-wide p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->a:Landroid/widget/TextView;

    const-wide/16 v2, 0x3e8

    div-long v2, p1, v2

    invoke-static {v2, v3}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->c:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->c:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/google/android/gms/internal/agi;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->c:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->c:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/google/android/gms/internal/agi;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->c:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->c:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public a(JJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p3, p4, v0}, Lcom/google/android/gms/internal/agi;->a(JZ)V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agi;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agi;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, p0, v2, v3}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$d;J)Z

    :cond_0
    const-wide/16 v0, -0x1

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/agi;->a(JZ)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agi;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/google/android/gms/internal/agi;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agi;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agi;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$d;)V

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public c()V
    .locals 3

    const-wide/16 v0, -0x1

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/agi;->a(JZ)V

    return-void
.end method
