.class Lcom/fimi/soul/biz/r/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/m/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/r/a;->a(Lcom/fimi/soul/entity/FlyModeLog;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/entity/FlyModeLog;

.field final synthetic b:Lcom/fimi/soul/biz/r/a;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/r/a;Lcom/fimi/soul/entity/FlyModeLog;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/r/a$1;->b:Lcom/fimi/soul/biz/r/a;

    iput-object p2, p0, Lcom/fimi/soul/biz/r/a$1;->a:Lcom/fimi/soul/entity/FlyModeLog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/entity/PlaneMsg;Ljava/io/File;)V
    .locals 2

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->isSuccess()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/r/a$1;->b:Lcom/fimi/soul/biz/r/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/r/a;->a(Lcom/fimi/soul/biz/r/a;)Lcom/fimi/soul/utils/y;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/r/a$1;->a:Lcom/fimi/soul/entity/FlyModeLog;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/utils/y;->a(Lcom/fimi/soul/entity/FlyModeLog;)J

    :cond_0
    return-void
.end method
