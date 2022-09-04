.class Lcom/fimi/g/c$1;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/g/c;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/d/b/c;

.field final synthetic b:Lcom/fimi/g/c;


# direct methods
.method constructor <init>(Lcom/fimi/g/c;Lcom/fimi/d/b/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/g/c$1;->b:Lcom/fimi/g/c;

    iput-object p2, p0, Lcom/fimi/g/c$1;->a:Lcom/fimi/d/b/c;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/g/c$1;->a:Lcom/fimi/d/b/c;

    invoke-virtual {v0}, Lcom/fimi/d/b/c;->g()Lcom/fimi/a/e/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/a/e/c;->f()[B

    move-result-object v0

    invoke-static {}, Lcom/fimi/e/d;->b()Lcom/fimi/e/d;

    move-result-object v1

    array-length v2, v0

    invoke-virtual {v1, v0, v2}, Lcom/fimi/e/d;->a([BI)V

    iget-object v0, p0, Lcom/fimi/g/c$1;->b:Lcom/fimi/g/c;

    invoke-static {v0}, Lcom/fimi/g/c;->a(Lcom/fimi/g/c;)I

    move-result v0

    const/16 v1, 0x2d

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/g/c$1;->b:Lcom/fimi/g/c;

    invoke-virtual {v0}, Lcom/fimi/g/c;->o()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/g/c$1;->b:Lcom/fimi/g/c;

    invoke-static {v0}, Lcom/fimi/g/c;->b(Lcom/fimi/g/c;)I

    return-void
.end method
