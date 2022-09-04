.class Lcom/fimi/soul/module/droneFragment/k$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/k;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/k;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/k;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/k$3;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;IZ)V
    .locals 5

    const-string v0, "TakePhotoView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onProgressChanged: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$3;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->i(Lcom/fimi/soul/module/droneFragment/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_0
    add-int v1, p2, v0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$3;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->k(Lcom/fimi/soul/module/droneFragment/k;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$3;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->e(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$3;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->i(Lcom/fimi/soul/module/droneFragment/k;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$3;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->j(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v4, 0x7f0b0483

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$3;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->i(Lcom/fimi/soul/module/droneFragment/k;)Z

    move-result v0

    if-eqz v0, :cond_2

    int-to-double v0, v1

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v0

    double-to-float v0, v0

    :goto_2
    invoke-virtual {v2, v0}, Lcom/fimi/soul/biz/j/d;->a(F)V

    return-void

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$3;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->j(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v4, 0x7f0b0482

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    int-to-float v0, v1

    goto :goto_2
.end method

.method public b(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$3;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/k;->h()V

    return-void
.end method
