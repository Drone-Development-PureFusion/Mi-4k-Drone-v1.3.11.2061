.class Lcom/fimi/soul/biz/manager/p$a$5;
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

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/p$a$5;->a:Lcom/fimi/soul/biz/manager/p$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a$5;->a:Lcom/fimi/soul/biz/manager/p$a;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/manager/p$a;->dismiss()V

    return-void
.end method
