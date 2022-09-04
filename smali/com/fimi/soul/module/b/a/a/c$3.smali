.class Lcom/fimi/soul/module/b/a/a/c$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/b/a/a/c;->onCancel(Lcn/sharesdk/framework/Platform;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/b/a/a/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/b/a/a/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/c$3;->a:Lcom/fimi/soul/module/b/a/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c$3;->a:Lcom/fimi/soul/module/b/a/a/c;

    invoke-static {v0}, Lcom/fimi/soul/module/b/a/a/c;->c(Lcom/fimi/soul/module/b/a/a/c;)Lcom/fimi/soul/module/b/a/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/a/a/e;->finish()V

    const/4 v0, 0x0

    return v0
.end method
