.class Lcom/fimi/soul/module/setting/newhand/c$12$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/setting/newhand/c$12;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/setting/newhand/c$12;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/setting/newhand/c$12;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/newhand/c$12$2;->a:Lcom/fimi/soul/module/setting/newhand/c$12;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$12$2;->a:Lcom/fimi/soul/module/setting/newhand/c$12;

    iget-object v0, v0, Lcom/fimi/soul/module/setting/newhand/c$12;->b:Lcom/fimi/soul/module/setting/newhand/c;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c$12$2;->a:Lcom/fimi/soul/module/setting/newhand/c$12;

    iget-object v1, v1, Lcom/fimi/soul/module/setting/newhand/c$12;->b:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/c;->d(Lcom/fimi/soul/module/setting/newhand/c;)I

    move-result v1

    int-to-double v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/fimi/soul/module/setting/newhand/c;->b(D)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$12$2;->a:Lcom/fimi/soul/module/setting/newhand/c$12;

    iget-object v0, v0, Lcom/fimi/soul/module/setting/newhand/c$12;->b:Lcom/fimi/soul/module/setting/newhand/c;

    const-string v1, "3"

    invoke-static {v0, v1}, Lcom/fimi/soul/module/setting/newhand/c;->a(Lcom/fimi/soul/module/setting/newhand/c;Ljava/lang/String;)Lcom/fimi/soul/entity/FlyModeLog;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c$12$2;->a:Lcom/fimi/soul/module/setting/newhand/c$12;

    iget-object v1, v1, Lcom/fimi/soul/module/setting/newhand/c$12;->b:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/c;->b(Lcom/fimi/soul/module/setting/newhand/c;)Lcom/fimi/soul/biz/r/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/r/a;->a(Lcom/fimi/soul/entity/FlyModeLog;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$12$2;->a:Lcom/fimi/soul/module/setting/newhand/c$12;

    iget-object v0, v0, Lcom/fimi/soul/module/setting/newhand/c$12;->a:Lcom/fimi/soul/module/setting/newhand/e;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c$12$2;->a:Lcom/fimi/soul/module/setting/newhand/c$12;

    iget-object v1, v1, Lcom/fimi/soul/module/setting/newhand/c$12;->b:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/c;->d(Lcom/fimi/soul/module/setting/newhand/c;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/module/setting/newhand/e;->a(I)V

    return-void
.end method
