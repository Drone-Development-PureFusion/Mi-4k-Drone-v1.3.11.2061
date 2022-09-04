.class Lcom/fimi/soul/module/droneFragment/f$13;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


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

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 7

    if-nez p2, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->h(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->t(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/f;->f(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/f;->u(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f0b019e

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_0
    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_0
    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f0b019f

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$13;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->h(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/view/MyEditView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1
.end method
