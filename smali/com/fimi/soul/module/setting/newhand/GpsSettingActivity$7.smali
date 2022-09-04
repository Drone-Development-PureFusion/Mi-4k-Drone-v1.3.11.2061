.class Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;I)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$7;->b:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;

    iput p2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$7;->b:Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$7;->a:I

    add-int/2addr v1, p2

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->d(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;F)F

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
