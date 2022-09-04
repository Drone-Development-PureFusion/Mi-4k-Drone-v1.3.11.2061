.class Lcom/fimi/soul/biz/manager/p$a$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/manager/p$a;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/manager/p$a;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/manager/p$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/p$a$2;->a:Lcom/fimi/soul/biz/manager/p$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a$2;->a:Lcom/fimi/soul/biz/manager/p$a;

    iget-object v0, v0, Lcom/fimi/soul/biz/manager/p$a;->e:Lcom/fimi/soul/biz/manager/p;

    iget-object v1, p0, Lcom/fimi/soul/biz/manager/p$a$2;->a:Lcom/fimi/soul/biz/manager/p$a;

    invoke-static {v1}, Lcom/fimi/soul/biz/manager/p$a;->a(Lcom/fimi/soul/biz/manager/p$a;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcn/sharesdk/twitter/Twitter;->NAME:Ljava/lang/String;

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/fimi/soul/biz/manager/p$a$2;->a:Lcom/fimi/soul/biz/manager/p$a;

    invoke-static {v4}, Lcom/fimi/soul/biz/manager/p$a;->b(Lcom/fimi/soul/biz/manager/p$a;)Lcom/fimi/soul/entity/ShareInfo;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/fimi/soul/biz/manager/p;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/fimi/soul/entity/ShareInfo;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a$2;->a:Lcom/fimi/soul/biz/manager/p$a;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/manager/p$a;->dismiss()V

    return-void
.end method
