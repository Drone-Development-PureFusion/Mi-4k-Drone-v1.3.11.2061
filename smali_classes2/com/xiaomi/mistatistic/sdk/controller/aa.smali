.class Lcom/xiaomi/mistatistic/sdk/controller/aa;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/xiaomi/mistatistic/sdk/controller/e;


# instance fields
.field final synthetic a:Lcom/xiaomi/mistatistic/sdk/controller/x;


# direct methods
.method constructor <init>(Lcom/xiaomi/mistatistic/sdk/controller/x;)V
    .locals 0

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/controller/aa;->a:Lcom/xiaomi/mistatistic/sdk/controller/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    invoke-static {}, Lcom/xiaomi/mistatistic/sdk/controller/a;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "last_deactivate"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/xiaomi/mistatistic/sdk/controller/s;->b(Landroid/content/Context;Ljava/lang/String;J)V

    return-void
.end method
