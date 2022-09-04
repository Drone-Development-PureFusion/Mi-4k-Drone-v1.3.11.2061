.class Lcom/xiaomi/mistatistic/sdk/controller/v;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/xiaomi/mistatistic/sdk/controller/a/e;


# instance fields
.field final synthetic a:Lcom/xiaomi/mistatistic/sdk/controller/t;


# direct methods
.method constructor <init>(Lcom/xiaomi/mistatistic/sdk/controller/t;)V
    .locals 0

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/controller/v;->a:Lcom/xiaomi/mistatistic/sdk/controller/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/v;->a:Lcom/xiaomi/mistatistic/sdk/controller/t;

    invoke-static {v0}, Lcom/xiaomi/mistatistic/sdk/controller/t;->a(Lcom/xiaomi/mistatistic/sdk/controller/t;)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/xiaomi/mistatistic/sdk/controller/t;->a(Z)Z

    goto :goto_0
.end method
