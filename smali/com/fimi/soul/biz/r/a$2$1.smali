.class Lcom/fimi/soul/biz/r/a$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/m/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/r/a$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/r/a$2;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/r/a$2;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/r/a$2$1;->a:Lcom/fimi/soul/biz/r/a$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/entity/PlaneMsg;Ljava/io/File;)V
    .locals 1

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/r/a$2$1;->a:Lcom/fimi/soul/biz/r/a$2;

    iget-object v0, v0, Lcom/fimi/soul/biz/r/a$2;->a:Lcom/fimi/soul/biz/r/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/r/a;->a(Lcom/fimi/soul/biz/r/a;)Lcom/fimi/soul/utils/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/y;->b()Z

    :cond_0
    return-void
.end method
