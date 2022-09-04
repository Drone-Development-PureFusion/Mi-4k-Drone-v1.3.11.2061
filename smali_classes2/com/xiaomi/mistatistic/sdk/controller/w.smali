.class Lcom/xiaomi/mistatistic/sdk/controller/w;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/xiaomi/mistatistic/sdk/controller/e;


# instance fields
.field final synthetic a:Lcom/xiaomi/mistatistic/sdk/controller/t;


# direct methods
.method constructor <init>(Lcom/xiaomi/mistatistic/sdk/controller/t;)V
    .locals 0

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/controller/w;->a:Lcom/xiaomi/mistatistic/sdk/controller/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    new-instance v0, Lcom/xiaomi/mistatistic/sdk/controller/i;

    invoke-direct {v0}, Lcom/xiaomi/mistatistic/sdk/controller/i;-><init>()V

    iget-object v1, p0, Lcom/xiaomi/mistatistic/sdk/controller/w;->a:Lcom/xiaomi/mistatistic/sdk/controller/t;

    invoke-static {v1}, Lcom/xiaomi/mistatistic/sdk/controller/t;->b(Lcom/xiaomi/mistatistic/sdk/controller/t;)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/i;->a(J)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/xiaomi/mistatistic/sdk/controller/t;->a(Z)Z

    return-void
.end method
