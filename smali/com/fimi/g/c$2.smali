.class Lcom/fimi/g/c$2;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/g/c;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/g/c;


# direct methods
.method constructor <init>(Lcom/fimi/g/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/g/c$2;->a:Lcom/fimi/g/c;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/g/c$2;->a:Lcom/fimi/g/c;

    invoke-virtual {v0}, Lcom/fimi/g/c;->l()V

    return-void
.end method
