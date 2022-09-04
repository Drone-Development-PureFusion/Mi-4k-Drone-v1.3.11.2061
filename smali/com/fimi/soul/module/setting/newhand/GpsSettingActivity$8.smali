.class Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$8;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$8;->a:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$8;->a:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)F

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$8;->a:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$8;->a:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$8;->a:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)F

    move-result v1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->d(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;F)F

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$8;->a:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/module/setting/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/setting/d;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$8;->a:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/setting/d;->a(F)V

    return-void
.end method
