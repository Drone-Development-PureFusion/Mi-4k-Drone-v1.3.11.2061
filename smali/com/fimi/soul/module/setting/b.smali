.class public Lcom/fimi/soul/module/setting/b;
.super Lcom/fimi/soul/module/setting/a;


# instance fields
.field a:Lcom/fimi/soul/drone/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/setting/a;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/fimi/soul/module/setting/b;->a:Lcom/fimi/soul/drone/a;

    return-void
.end method

.method private g()V
    .locals 4

    const/4 v3, 0x0

    const v0, 0x7f0b0232

    const-string v1, ""

    new-instance v2, Lcom/fimi/soul/module/setting/b$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/b$1;-><init>(Lcom/fimi/soul/module/setting/b;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/setting/b;->a(ILjava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/Button;

    const v0, 0x7f0b0233

    const-string v1, ""

    invoke-virtual {p0, v0, v1, v3}, Lcom/fimi/soul/module/setting/b;->a(ILjava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/Button;

    const v0, 0x7f0b0231

    const-string v1, ""

    invoke-virtual {p0, v0, v1, v3}, Lcom/fimi/soul/module/setting/b;->a(ILjava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/Button;

    const v0, 0x7f0b0521

    const-string v1, ""

    invoke-virtual {p0, v0, v1, v3}, Lcom/fimi/soul/module/setting/b;->a(ILjava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/Button;

    const v0, 0x7f0b00b1

    const-string v1, ""

    invoke-virtual {p0, v0, v1, v3}, Lcom/fimi/soul/module/setting/b;->a(ILjava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/Button;

    const v0, 0x7f0b0399

    const-string v1, ""

    invoke-virtual {p0, v0, v1, v3}, Lcom/fimi/soul/module/setting/b;->a(ILjava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/Button;

    const v0, 0x7f0b0148

    const-string v1, ""

    invoke-virtual {p0, v0, v1, v3}, Lcom/fimi/soul/module/setting/b;->a(ILjava/lang/String;Landroid/view/View$OnClickListener;)Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public a(ZLcom/fimi/soul/biz/camera/entity/X11RespCmd;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic a(ZLjava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;

    invoke-virtual {p0, p1, p2}, Lcom/fimi/soul/module/setting/b;->a(ZLcom/fimi/soul/biz/camera/entity/X11RespCmd;)V

    return-void
.end method

.method public c()Landroid/view/View;
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/b;->g()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/b;->b()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
