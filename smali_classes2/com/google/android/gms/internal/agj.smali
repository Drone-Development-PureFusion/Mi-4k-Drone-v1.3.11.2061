.class public Lcom/google/android/gms/internal/agj;
.super Lcom/google/android/gms/cast/framework/media/a/a;

# interfaces
.implements Lcom/google/android/gms/cast/framework/media/c$d;


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:J

.field private final c:Ljava/lang/String;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;JLjava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/agj;->d:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/agj;->a:Landroid/widget/TextView;

    iput-wide p2, p0, Lcom/google/android/gms/internal/agj;->b:J

    iput-object p4, p0, Lcom/google/android/gms/internal/agj;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/agj;->a:Landroid/widget/TextView;

    const-wide/16 v2, 0x3e8

    div-long v2, p1, v2

    invoke-static {v2, v3}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a(JJ)V
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agj;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agj;->a:Landroid/widget/TextView;

    const-wide/16 v2, 0x3e8

    div-long v2, p1, v2

    invoke-static {v2, v3}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 6

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agj;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/agj;->b:J

    invoke-virtual {v0, p0, v2, v3}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$d;J)Z

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/agj;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->e()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/agj;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/google/android/gms/internal/agj;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/agj;->d:Z

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agj;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/google/android/gms/internal/agj;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agj;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agj;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$d;)V

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/agj;->d:Z

    return v0
.end method
