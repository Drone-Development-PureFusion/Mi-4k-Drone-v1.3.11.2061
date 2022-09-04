.class Lcom/fimi/soul/module/droneFragment/e$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/droneFragment/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/e;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/e;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/e$1;->a:Lcom/fimi/soul/module/droneFragment/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e$1;->a:Lcom/fimi/soul/module/droneFragment/e;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/e;->a(Lcom/fimi/soul/module/droneFragment/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/e$1;->a:Lcom/fimi/soul/module/droneFragment/e;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/e$1;->a:Lcom/fimi/soul/module/droneFragment/e;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/e;->b(Lcom/fimi/soul/module/droneFragment/e;)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/e$1;->a:Lcom/fimi/soul/module/droneFragment/e;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/e;->c(Lcom/fimi/soul/module/droneFragment/e;)Lcom/google/android/gms/maps/model/g;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/droneFragment/e;->a(Landroid/view/View;Lcom/google/android/gms/maps/model/g;)V

    :cond_0
    return-void
.end method
