.class Lcom/fimi/soul/module/droneFragment/f$5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/f;-><init>(Landroid/view/View;Lcom/fimi/soul/drone/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/f;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/f;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->c(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/MyEditView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v0, v0, Lcom/fimi/soul/module/droneFragment/f;->f:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v0, v0, Lcom/fimi/soul/module/droneFragment/f;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->D(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v0, v0, Lcom/fimi/soul/module/droneFragment/f;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->D(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v0, v0, Lcom/fimi/soul/module/droneFragment/f;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->D(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->A(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$5;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/fimi/soul/module/droneFragment/f;->f:Ljava/lang/String;

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
