.class Lcom/fimi/soul/module/setting/newhand/c$12;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/setting/newhand/c;->c(ILcom/fimi/soul/module/setting/newhand/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/setting/newhand/e;

.field final synthetic b:Lcom/fimi/soul/module/setting/newhand/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/setting/newhand/c;Lcom/fimi/soul/module/setting/newhand/e;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/newhand/c$12;->b:Lcom/fimi/soul/module/setting/newhand/c;

    iput-object p2, p0, Lcom/fimi/soul/module/setting/newhand/c$12;->a:Lcom/fimi/soul/module/setting/newhand/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$12;->b:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/newhand/c;->d(Lcom/fimi/soul/module/setting/newhand/c;)I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4079000000000000L    # 400.0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v2

    cmpl-double v0, v0, v2

    goto :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$12;->b:Lcom/fimi/soul/module/setting/newhand/c;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c$12;->b:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/c;->d(Lcom/fimi/soul/module/setting/newhand/c;)I

    move-result v1

    int-to-double v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/fimi/soul/module/setting/newhand/c;->b(D)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$12;->a:Lcom/fimi/soul/module/setting/newhand/e;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c$12;->b:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/c;->f(Lcom/fimi/soul/module/setting/newhand/c;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/module/setting/newhand/e;->a(I)V

    goto :goto_0
.end method
