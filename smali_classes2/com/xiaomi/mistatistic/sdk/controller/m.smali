.class public abstract Lcom/xiaomi/mistatistic/sdk/controller/m;
.super Ljava/lang/Object;


# direct methods
.method public static a(Lcom/xiaomi/mistatistic/sdk/data/a;)V
    .locals 2

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/b;->a()Lcom/xiaomi/mistatistic/sdk/controller/b;

    move-result-object v0

    new-instance v1, Lcom/xiaomi/mistatistic/sdk/controller/n;

    invoke-direct {v1, p0}, Lcom/xiaomi/mistatistic/sdk/controller/n;-><init>(Lcom/xiaomi/mistatistic/sdk/data/a;)V

    invoke-virtual {v0, v1}, Lcom/xiaomi/mistatistic/sdk/controller/b;->a(Lcom/xiaomi/mistatistic/sdk/controller/e;)V

    return-void
.end method
