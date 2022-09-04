.class Lcom/xiaomi/mistatistic/sdk/controller/u;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/xiaomi/mistatistic/sdk/controller/a/c;


# instance fields
.field final synthetic a:Lcom/xiaomi/mistatistic/sdk/controller/t;


# direct methods
.method constructor <init>(Lcom/xiaomi/mistatistic/sdk/controller/t;)V
    .locals 0

    iput-object p1, p0, Lcom/xiaomi/mistatistic/sdk/controller/u;->a:Lcom/xiaomi/mistatistic/sdk/controller/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;J)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/u;->a:Lcom/xiaomi/mistatistic/sdk/controller/t;

    invoke-static {v0, p2, p3}, Lcom/xiaomi/mistatistic/sdk/controller/t;->a(Lcom/xiaomi/mistatistic/sdk/controller/t;J)J

    iget-object v0, p0, Lcom/xiaomi/mistatistic/sdk/controller/u;->a:Lcom/xiaomi/mistatistic/sdk/controller/t;

    invoke-static {v0, p1}, Lcom/xiaomi/mistatistic/sdk/controller/t;->a(Lcom/xiaomi/mistatistic/sdk/controller/t;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/xiaomi/mistatistic/sdk/controller/t;->a(Z)Z

    goto :goto_0
.end method
