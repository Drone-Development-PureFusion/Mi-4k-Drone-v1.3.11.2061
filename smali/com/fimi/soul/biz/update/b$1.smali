.class Lcom/fimi/soul/biz/update/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/xiaomi/market/sdk/XiaomiUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/update/b;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/fimi/soul/biz/update/b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/update/b;I)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/b$1;->b:Lcom/fimi/soul/biz/update/b;

    iput p2, p0, Lcom/fimi/soul/biz/update/b$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onUpdateReturned(ILcom/xiaomi/market/sdk/UpdateResponse;)V
    .locals 3

    const/16 v2, 0x7d0

    const/4 v1, 0x1

    packed-switch p1, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$1;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->a(Lcom/fimi/soul/biz/update/b;)Lcom/fimi/soul/biz/update/b$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$1;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->a(Lcom/fimi/soul/biz/update/b;)Lcom/fimi/soul/biz/update/b$b;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/fimi/soul/biz/update/b$b;->a(Lcom/xiaomi/market/sdk/UpdateResponse;)V

    goto :goto_0

    :pswitch_2
    iget v0, p0, Lcom/fimi/soul/biz/update/b$1;->a:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$1;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0b02fc

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :pswitch_3
    iget v0, p0, Lcom/fimi/soul/biz/update/b$1;->a:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$1;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0b0510

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
