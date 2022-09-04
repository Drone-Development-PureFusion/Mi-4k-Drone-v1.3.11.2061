.class Lcom/fimi/soul/biz/h/d$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/utils/aq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/h/d;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/h/d;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/h/d;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/h/d$3;->a:Lcom/fimi/soul/biz/h/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/h/d$3;->a:Lcom/fimi/soul/biz/h/d;

    invoke-static {v0}, Lcom/fimi/soul/biz/h/d;->f(Lcom/fimi/soul/biz/h/d;)Lcom/fimi/soul/utils/aq;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/h/d$3;->a:Lcom/fimi/soul/biz/h/d;

    invoke-static {v0}, Lcom/fimi/soul/biz/h/d;->f(Lcom/fimi/soul/biz/h/d;)Lcom/fimi/soul/utils/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/aq;->dismiss()V

    iget-object v0, p0, Lcom/fimi/soul/biz/h/d$3;->a:Lcom/fimi/soul/biz/h/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/fimi/soul/biz/h/d;->a(Lcom/fimi/soul/biz/h/d;Lcom/fimi/soul/utils/aq;)Lcom/fimi/soul/utils/aq;

    :cond_0
    return-void
.end method
