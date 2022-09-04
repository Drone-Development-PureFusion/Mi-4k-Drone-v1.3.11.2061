.class Lcom/fimi/soul/module/droneFragment/k$7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


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

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/k$7;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    const/4 v4, 0x2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$7;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->e(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/MyEditView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$7;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->o(Lcom/fimi/soul/module/droneFragment/k;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$7;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->m(Lcom/fimi/soul/module/droneFragment/k;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$7;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->m(Lcom/fimi/soul/module/droneFragment/k;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$7;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->m(Lcom/fimi/soul/module/droneFragment/k;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$7;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/k;->c(Lcom/fimi/soul/module/droneFragment/k;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
