.class public Lcom/tencent/open/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/c$a;
    }
.end annotation


# instance fields
.field private a:Lcom/tencent/open/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/tencent/open/c$a;)V
    .locals 2

    new-instance v0, Lcom/tencent/open/d;

    invoke-direct {v0, p2}, Lcom/tencent/open/d;-><init>(Lcom/tencent/open/c$a;)V

    iput-object v0, p0, Lcom/tencent/open/c;->a:Lcom/tencent/open/d;

    invoke-static {}, Lcom/tencent/map/a/a/a;->a()Lcom/tencent/map/a/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/c;->a:Lcom/tencent/open/d;

    invoke-virtual {v0, p1, v1}, Lcom/tencent/map/a/a/a;->a(Landroid/content/Context;Lcom/tencent/map/a/a/b;)Z

    return-void
.end method

.method public a()Z
    .locals 3

    invoke-static {}, Lcom/tencent/map/a/a/a;->a()Lcom/tencent/map/a/a/a;

    move-result-object v0

    const-string v1, "OpenSdk"

    const-string v2, "WQMPF-XMH66-ISQXP-OIGMM-BNL7M"

    invoke-virtual {v0, v1, v2}, Lcom/tencent/map/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    invoke-static {}, Lcom/tencent/map/a/a/a;->a()Lcom/tencent/map/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/map/a/a/a;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/c;->a:Lcom/tencent/open/d;

    return-void
.end method
