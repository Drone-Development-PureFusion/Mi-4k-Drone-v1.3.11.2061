.class Lcom/xiaomi/mistatistic/sdk/controller/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/xiaomi/mistatistic/sdk/controller/e;

.field final synthetic b:Lcom/xiaomi/mistatistic/sdk/controller/b;


# direct methods
.method constructor <init>(Lcom/xiaomi/mistatistic/sdk/controller/b;Lcom/xiaomi/mistatistic/sdk/controller/e;)V
    .locals 0

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/controller/c;->b:Lcom/xiaomi/mistatistic/sdk/controller/b;

    iput-object p2, p0, Lcom/xiaomi/mistatistic/sdk/controller/c;->a:Lcom/xiaomi/mistatistic/sdk/controller/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/c;->a:Lcom/xiaomi/mistatistic/sdk/controller/e;

    invoke-interface {v0}, Lcom/xiaomi/mistatistic/sdk/controller/e;->a()V

    return-void
.end method
