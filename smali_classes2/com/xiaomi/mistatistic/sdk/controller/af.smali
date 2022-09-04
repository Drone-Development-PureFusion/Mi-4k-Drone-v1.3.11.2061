.class Lcom/xiaomi/mistatistic/sdk/controller/af;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/xiaomi/mistatistic/sdk/controller/e;


# instance fields
.field final synthetic a:Lcom/xiaomi/mistatistic/sdk/controller/ab;


# direct methods
.method constructor <init>(Lcom/xiaomi/mistatistic/sdk/controller/ab;)V
    .locals 0

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/controller/af;->a:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/af;->a:Lcom/xiaomi/mistatistic/sdk/controller/ab;

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/controller/ab;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/controller/t;

    invoke-direct {v0}, Lcom/xiaomi/mistatistic/sdk/controller/t;-><init>()V

    invoke-virtual {v0}, Lcom/xiaomi/mistatistic/sdk/controller/t;->a()V

    :cond_0
    return-void
.end method
